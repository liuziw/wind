package com.lzw.wind.tibmas.config;

import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.dao.dto.QueryItemDTO;
import com.lzw.common.dao.util.DaoUtils;
import com.lzw.wind.tibmas.core.daomanager.LoginFailDaoManager;
import com.lzw.wind.tibmas.core.daomanager.UserDaoManager;
import com.lzw.wind.tibmas.core.dbo.LoginFailDO;
import com.lzw.wind.tibmas.core.dbo.UserDO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/12/26 20:03
 */
public class LoginFailTimesFilter implements Filter {

    @Autowired
    private UserDaoManager userDaoManager;

    @Autowired
    private LoginFailDaoManager loginFailDaoManager;

    //密码过期
    private static final Integer PASSWORD_EXPIRED=40007;

    //用户被锁定
    private static final Integer ACCOUNT_LOCKED=40005;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 用户登录失败次数验证
     * 需求：在T1时间内输入的账号和密码错误N次，进行账号锁定，T2后自己解锁
     *       加入在N天内修改密码逻辑
     * <pre>
     *     一、验证修改密码时间
     *     1.得到用户修改密码的时间
     *     2.判断密码修改时间与当前时间的差值，如果差值大于规则天数则提示修改密码，否则继续执行登录
     *     二、验证登录失败次数
     *     1.先判断用户账号是否锁定
     *     2.如果已锁定则判断是否超过锁定期T2，如果超过锁定期则清除登录失败记录，解锁并继续执行登录
     *       如果未超过锁定期则返回账号已锁定
     *     3.如果未锁定则判断从当前时间到T1这段时间用户登录失败的次数
     *       如果次数大于或等于N则对账号锁定，否则继续执行登录
     * </pre>
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String requestURI = httpServletRequest.getRequestURI();
        String method=httpServletRequest.getMethod();
        if(!(StringUtils.equals("/loginProcessing",requestURI)&&StringUtils.equalsIgnoreCase(method,"post")))
        {
            chain.doFilter(request,response);
            return;
        }
        String userAccount = httpServletRequest.getParameter("username");
        UserDO userDO = userDaoManager.singleResultByUserAccount(userAccount);
        //如果userDO为空则放掉让loadUserByUserName去处理
        if(userDO == null){
            chain.doFilter(request,response);
            return;
        }
        /**
         * 验证修改密码
         */
        Date updatePasswordTime = userDO.getUpdatePasswordTime();
        if(updatePasswordTime == null){
            updatePasswordTime = new Date();
        }
        Instant updateInstant = updatePasswordTime.toInstant();
        Instant nowInstant = Instant.now();
        Long days = Duration.between(updateInstant,nowInstant).toDays();
        if(days > 24 && days <= 30){
            CommonUtils.responseMsg(response,PASSWORD_EXPIRED,"密码即将过期，请修改密码");
            chain.doFilter(request,response);
            return;
        }
        if(days >30){
            CommonUtils.responseMsg(response,PASSWORD_EXPIRED,"密码已过期");
            return;
        }

        /**
         * 验证登录失败次数
         */
        Integer locked = userDO.getLocked();
        if(locked == 1){
            Date lockedTime = userDO.getLockedTime();
            Instant instant1 = lockedTime.toInstant();
            Instant instant2 = Instant.now();
            Long diffenrence = Duration.between(instant1,instant2).getSeconds();
            //如果超过了锁定期
            if(diffenrence > 3600){
                //解锁
                userDO.setLocked(0);
                userDaoManager.updateAllProperties(userDO);
                //清除失败记录
                loginFailDaoManager.deleteByUserAccount(userAccount);
                chain.doFilter(request,response);
                return;
            }else {
                CommonUtils.responseMsg(response,ACCOUNT_LOCKED,"用户被锁定，请一段时间后重试");
                return;
            }
        }else {
            //得到T1之前的时间
            Calendar time = Calendar.getInstance();
            time.setTime(new Date());
            time.add(Calendar.SECOND,-3600);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timeStr = dateFormat.format(time.getTime());
            //得到T1这段时间的登录失败次数
            QueryItemDTO queryItemDTO = DaoUtils.buildGreaterThenOrEqualTo(LoginFailDO.DB_GMT_CREATE,timeStr);
            QueryItemDTO queryItemDTO1 = DaoUtils.buildEqualTo(LoginFailDO.DB_USER_ACCOUNT,userAccount);
            List<QueryItemDTO> conditions = new ArrayList<>();
            conditions.add(queryItemDTO);
            conditions.add(queryItemDTO1);
            int failNumber = loginFailDaoManager.countByQueryItems(conditions);
            if(failNumber == 5){
                userDO.setLocked(1);
                userDO.setLockedTime(new Date());
                userDaoManager.updateNotNullProperties(userDO);
            }
            if(failNumber>5){
                CommonUtils.responseMsg(response,ACCOUNT_LOCKED,"用户被锁定，请一段时间后重试");
                return;
            }else {
                chain.doFilter(request,response);
                return;
            }
        }
    }

    @Override
    public void destroy() {

    }
}
