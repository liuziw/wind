package com.lzw.wind.tibmas.server.impl;

import com.google.common.collect.Lists;
import com.lzw.wind.tibmas.core.bo.UserDetailsBO;
import com.lzw.wind.tibmas.core.dbo.UserDO;
import com.lzw.wind.tibmas.core.enums.ExpiredEnum;
import com.lzw.wind.tibmas.core.enums.LockedEnum;
import com.lzw.wind.tibmas.core.service.AppTokenService;
import com.lzw.wind.tibmas.core.service.UserService;
import com.lzw.wind.tibmas.core.util.EncryptUtils;
import com.lzw.wind.tibmas.manage.PasswordManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liys
 * @date 2018/6/89:15
 */
@Service
public class TibmasUserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;
    @Autowired
    private AppTokenService appTokenService;
    @Autowired
    private PasswordManager passwordManager;




    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username == null){
            throw new UsernameNotFoundException(username);
        }
        UserDO userDO = new UserDO();
        //如果username中包含token则是app端扫描登录，根据token找userId
        if(username.contains("token:")){
            String appToken = username.split(":")[1];
            Long userId = appTokenService.getUserIdByToken(appToken);
            userDO = userService.getUserDOById(userId);
        }else {
            userDO = this.userService.getUserDOByLoginAccountInfo(username);
        }

        if (userDO==null){
            throw new UsernameNotFoundException(username);
        }

        UserDetailsBO userDetailsBO = this.userService.getUserDetailByUserId(userDO.getId());
        List<String> permList = Lists.newArrayList();
        if (userDetailsBO.getRoleDOList()!=null || userDetailsBO.getRoleDOList().size()>0){
            userDetailsBO.getRoleDOList().forEach(e ->{
                permList.add("ROLE_"+e.getRoleCode());
            });
        }
        if (userDetailsBO.getPermDOList()!=null|| userDetailsBO.getPermDOList().size()>0){
            userDetailsBO.getPermDOList().forEach(permDO -> {
                permList.add(permDO.getPermCode());
            });
        }



        //设置密码
        String password;
        if(username.contains("token")){
            //前端的md5加密后字母是小写，所以这里MD5加密字母转成小写
            password = passwordManager.encrypt(EncryptUtils.encryptByMD5(username.split(":")[1]).toLowerCase());
        }else {
            password = userDO.getUserPassword();
        }
        //List<String> allPerms= permDOList.addAll(li)
        UserDetails userDetails = User.withUsername(userDO.getUserAccount())
                .password(password)
                //组成list
                //.roles(rolesList.toArray(new String[rolesList.size()]))
                .authorities(permList.toArray(new String[permList.size()]))
                .accountLocked(LockedEnum.LOCKED== LockedEnum.valueOfByCode(userDO.getLocked()))
                .accountExpired(ExpiredEnum.EXPIRED_YES== ExpiredEnum.valueOfByCode(userDO.getExpired()))
                .build();

       /* Oauth2UserBO oauth2UserBO = CommonUtils.newInstance(userDetailsBO.getUserDO(), Oauth2UserBO.class);
        oauth2UserBO.setRoles(new HashSet<>(rolesList));
        oauth2UserBO.setPerms(new HashSet<>(permDOList));
        oauth2UserBO.setApps(new HashSet<>());*/
        /*Map<String,String> userInfo = new HashMap<>();
        userInfo.put("userId",String.valueOf(userDO.getId()));
        userInfo.put("name",userDO.getUserName());

        return new TibmasUserDetails(userDetails, userInfo);*/
        return userDetails;
    }
}
