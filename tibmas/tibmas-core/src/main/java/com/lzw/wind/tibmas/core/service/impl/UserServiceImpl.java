package com.lzw.wind.tibmas.core.service.impl;

import com.google.common.collect.Lists;
import com.lzw.common.core.bo.PageBO;
import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.common.dao.dto.QueryItemDTO;
import com.lzw.common.dao.util.DaoUtils;
import com.lzw.wind.tibmas.core.bo.*;
import com.lzw.wind.tibmas.core.daomanager.*;
import com.lzw.wind.tibmas.core.dbo.*;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.enums.DeptTypeEnum;
import com.lzw.wind.tibmas.core.enums.ExamineStatusEnum;
import com.lzw.wind.tibmas.core.enums.PermTypeEnum;
import com.lzw.wind.tibmas.core.manager.*;
import com.lzw.wind.tibmas.core.service.TeamAndUserService;
import com.lzw.wind.tibmas.core.service.TeamUserService;
import com.lzw.wind.tibmas.core.service.UserService;
import com.lzw.wind.tibmas.core.service.feign.UserServiceFeign;
import com.lzw.wind.tibmas.core.util.EncryptUtils;
import com.lzw.wind.tibmas.core.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author liys
 * @date 2018/3/1311:08
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserManager userManager;

    @Autowired
    private AppDaoManager appDaoManager;

    @Autowired
    private UserDaoManager userDaoManager;

    @Autowired
    private DeptDaoManager deptDaoManager;

    @Autowired
    private UserRoleDaoManager userRoleDaoManager;

    @Autowired
    private RoleDaoManager roleDaoManager;
    @Autowired
    private PermManager permManager;

    @Autowired
    private RoleManager roleManager;
    @Autowired
    private AreaDaoManager areaDaoManager;
    @Autowired
    private DeptManager deptManager;

    @Autowired
    private Info2KafkaManager info2KafkaManager;

    @Autowired
    private UserRegisterDaoManager userRegisterDaoManager;

    @Autowired
    private UserRegisterExpandDaoManager userRegisterExpandDaoManager;

    @Autowired
    private UserExpandDaoManager userExpandDaoManager;

    @Autowired
    private OpenUserDaoManager openUserDaoManager;

    @Autowired
    private UserServiceFeign userServiceFeign;

    @Autowired
    private TeamUserDaoManager teamUserDaoManager;

    @Autowired
    private TeamDaoManager teamDaoManager;

    @Autowired
    private LoginFailDaoManager loginFailDaoManager;

    @Autowired
    private TeamAndUserService teamAndUserService;


    @Autowired
    private TeamUserService teamUserService;


    @Autowired
    private TibmasManager tibmasManager;

    @Override
    public UserDO getUserDOByLoginAccountInfo(String accountInfo) {
        return userManager.getUserDOByLoginAccountInfo(accountInfo);
    }

    @Override
    public UserDetailsBO getUserDetailByUserId(Long userId) {
        //创建用户详细信息业务Bean
        UserDetailsBO userDetails = new UserDetailsBO();
        //通过用户Id查询用户信息
        UserDO userDO = userDaoManager.getById(userId);
        if (userDO == null) {
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "数据没有找到");
        }
        //清空密码
        userDO.setUserPassword(null);
        userDetails.setUserDO(userDO);
        //通过用户Id查询机构信息
        DeptDO deptDO = userManager.getDeptDOByUserId(userId);
        userDetails.setDeptDO(deptDO);
        //通过用户Id查询用户拥有的权限
        List<PermDO> permDOList = userManager.getAllPermByUserId(userId);
        userDetails.setPermDOList(permDOList);
        //通过用户已经拥有的权限Id查询用户拥有的应用
        List<AppDO> appDOList = appDaoManager.listByIds(permDOList, PermDO::getAppId);
        userDetails.setAppDOList(appDOList);
        //通过用户Id查询用户拥有的角色
        List<RoleDO> roleDOList = userManager.listRoleDOByUserId(userId);
        userDetails.setRoleDOList(roleDOList);
        return userDetails;
    }

    /**
     * 根据用户账号和密码得到用户信息(相当于微信端登录)
     * <pre>
     *     1.先从用户表验证
     *     2.如果用户表不存在该用户，则从用户注册表验证
     *     3.根据上述验证结果返回用户信息和拓展信息
     * </pre>
     * @param dto
     * @return
     */
    @Override
    public UserDetailsVO getUserByAccountAndPassword(QueryUserDTO dto){
        if(dto == null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入用户账号和密码");
        }
        UserDO userDO = userDaoManager.singleResultByUserAccount(dto.getUserAccount());
        UserRegisterDO userRegisterDO = null;
        if(userDO == null){
            userRegisterDO = userRegisterDaoManager.singleResultByUserAccount(dto.getUserAccount());
        }
        if(userDO == null && userRegisterDO == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"该用户不存在");
        }
        //验证密码
        if(userDO != null){
            if(!EncryptUtils.encryptBySha256(dto.getPassword()).equals(userDO.getUserPassword()) ){
                throw CommonException.exception(CommonErrorCode.PASSWORD_NOT_RIGHT,"用户密码错误");
            }
        }
        if(userRegisterDO != null){
            if(!EncryptUtils.encryptBySha256(dto.getPassword()).equals(userRegisterDO.getUserPassword()) ){
                throw CommonException.exception(CommonErrorCode.PASSWORD_NOT_RIGHT,"用户密码错误");
            }
        }

        UserDetailsVO userDetailsVO = new UserDetailsVO();
        if(userDO != null){
            userDetailsVO = this.getUserByUserId(userDO.getId());

        }else if(userRegisterDO != null) {
            userDetailsVO = this.getUserByUserRegisterId(userRegisterDO.getId());
        }

        return userDetailsVO;

    }

    /**
     * 小程序登录
     * <pre>
     *     1.先从用户表验证
     *     2.如果用户表不存在该用户，则从用户注册表验证
     *     3.验证通过则将openId与该用户绑定，返回1
     *       验证不通过则抛异常
     * </pre>
     * @return
     */
    @Override
    @Transactional
    public Integer miniProgremLogin(MiniProgremLoginDTO dto){
        if(dto == null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入用户账号和密码");
        }
        UserDO userDO = userDaoManager.singleResultByUserAccount(dto.getUserAccount());
        UserRegisterDO userRegisterDO = null;
        if(userDO == null){
            userRegisterDO = userRegisterDaoManager.singleResultByUserAccount(dto.getUserAccount());
        }
        if(userDO == null && userRegisterDO == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"该用户不存在");
        }
        //验证密码
        if(userDO != null){
            if(!EncryptUtils.encryptBySha256(dto.getPassword()).equals(userDO.getUserPassword()) ){
                throw CommonException.exception(CommonErrorCode.PASSWORD_NOT_RIGHT,"用户密码错误");
            }
        } else if(userRegisterDO != null){
            if(!EncryptUtils.encryptBySha256(dto.getPassword()).equals(userRegisterDO.getUserPassword()) ){
                throw CommonException.exception(CommonErrorCode.PASSWORD_NOT_RIGHT,"用户密码错误");
            }
        }

        //解除绑定
        openUserDaoManager.deleteByOpenId(dto.getOpenId());
        //重新绑定
        OpenUserDO openUserDO = CommonUtils.newInstance(dto,OpenUserDO.class);
        if(userDO != null){
            openUserDO.setUserId(userDO.getId());
            openUserDO.setExamineStatus(2);
        }else if(userRegisterDO != null){
            openUserDO.setUserId(userRegisterDO.getId());
            openUserDO.setExamineStatus(1);
        }
        openUserDaoManager.insertNotNullProperties(openUserDO);

        return 1;

    }

    /**
     * 小程序退出登录
     * <pre>
     *     根据openId和微信appId解绑用户
     * </pre>
     * @param dto
     * @return
     */
    @Override
    @Transactional
    public Integer miniProgremLogout(MiniProgremLogoutDTO dto){
        if (dto == null){
            return 0;
        }
        List<QueryItemDTO> items = new ArrayList<>();
        items.add(DaoUtils.buildEqualTo(OpenUserDO.DB_OPEN_ID,dto.getOpenId()));
        items.add(DaoUtils.buildEqualTo(OpenUserDO.DB_WX_APP_ID,dto.getWxAppId()));
        return openUserDaoManager.deleteByQueryItems(items);
    }


    @Override
    public UserDetailsVO getUserByUserId(Long userId) {
        //创建用户详细信息业务Bean
        UserDetailsVO userDetails = new UserDetailsVO();
        //通过用户Id查询用户信息
        UserDO userDO = userDaoManager.getById(userId);
        if (userDO == null) {
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "数据没有找到");
        }
        userDO.setUserPassword(null);//清空密码
        DeptDO dept = deptDaoManager.getById(userDO.getDeptId());
        UserBO userBO = CommonUtils.newInstance(userDO, UserBO.class);
        userBO.setExamineStatus(ExamineStatusEnum.PASS.code);
        if (dept != null) {
            userBO.setDeptName(dept.getDeptName());
        }
        userDetails.setUserBO(userBO);
        //通过用户Id查询机构信息
        DeptBO deptBO = getDeptBOById(userDO.getDeptId());
        userDetails.setDeptBO(deptBO);
        //通过用户Id查询用户拥有的权限
        List<PermDO> permDOList = userManager.getAllPermByUserId(userId);
        userDetails.setPermDOList(permDOList);
        List<PermTreeVO> permTreeVOList = permManager.getPermTree(permDOList);
        userDetails.setPermTreeVOList(permTreeVOList);
        //通过用户Id查询用户拥有的角色
        List<RoleDO> roleDOList = userManager.listRoleDOByUserId(userId);
        List<RoleBO> roleBOList = roleManager.listRoleDO2ListRoleBO(roleDOList);
        userDetails.setRoleBOList(roleBOList);
        if(!CollectionUtils.isEmpty(roleDOList)){
            String roleName = roleDOList.stream().map(RoleDO::getRoleName).collect(Collectors.joining(","));
            userBO.setRoleName(roleName);
        }
        //根据用户id查询用户的拓展信息
        List<UserExpandDO> userExpandDOList = userExpandDaoManager.listByUserId(userId);
        Map<String,Object> context = new HashMap<>();
        if(!CollectionUtils.isEmpty(userExpandDOList)){
            context = userExpandDOList.stream().collect(Collectors.toMap(UserExpandDO::getPropertyName,e -> e.getPropertyValue()));
        }
        userDetails.setContext(context);

        return userDetails;
    }

    private DeptBO getDeptBOById(Long id){
        DeptDO deptDO = deptDaoManager.getById(id);
        DeptBO deptBO = new DeptBO();
        if (deptDO != null) {
            AreaDO areaDO = areaDaoManager.getById(deptDO.getAreaId());
            deptBO = CommonUtils.newInstance(deptDO, DeptBO.class);
            deptBO.setAreaName(areaDO==null?"":areaDO.getName());
            String deptTypeName = "";
            DeptTypeEnum deptTypeEnum = DeptTypeEnum.valueOfByCode(deptDO.getDeptType());
            if (deptTypeEnum != null) {
                deptTypeName = deptTypeEnum.desc;
            }
            deptBO.setDeptTypeName(deptTypeName);
        }
        return deptBO;
    }

    /**
     * 根据openId得到用户信息
     * <pre>
     *     1.根据openId到open_user表查看审核状态和userId
     *          如果查不到则表示还未注册或者已经删除了得重新注册
     *          如果已审核则直接拿userId去调用getUserById()
     *          如果未审核则userId为registerId则去用户注册表查用户信息
     * </pre>
     * @param dto
     * @return
     */
    @Override
    public UserDetailsVO getUserByOpenId(OpenIdDTO dto){
        if(dto == null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入openId");
        }
        List<QueryItemDTO> items = new ArrayList<>();
        items.add(DaoUtils.buildEqualTo(OpenUserDO.DB_OPEN_ID,dto.getOpenId()));
        items.add(DaoUtils.buildEqualTo(OpenUserDO.WX_APP_ID,dto.getWxAppId()));
        List<OpenUserDO> openUserDOList = openUserDaoManager.listByQueryItems(items);
        if(CollectionUtils.isEmpty(openUserDOList)){
            return null;
        }
        OpenUserDO openUserDO = openUserDOList.get(0);
        if(openUserDO == null){
            return null;
        }

        UserDetailsVO userDetailsVO = null;
        Integer examineState = openUserDO.getExamineStatus();
        if(examineState == 2){
            userDetailsVO =  this.getUserByUserId(openUserDO.getUserId());
            //团队信息
            userDetailsVO.setTeamBO(getTeamBOByUserIdAndTeamTypeCode(openUserDO.getUserId(),dto.getTeamTypeCode()));
        }else {
            userDetailsVO =  this.getUserByUserRegisterId(openUserDO.getUserId());
            //团队信息
            userDetailsVO.setTeamBO(getTeamBOByUserRegisterIdAndTeamTypeCode(openUserDO.getUserId(),dto.getTeamTypeCode()));
        }

        return userDetailsVO;

    }

    /**
     * 根据用户id得到团队信息
     * <pre>
     *     1.得到用户所有所在团队
     *     2.根据团队ids和团队类型得所查询团队
     *     3.得到团队信息
     * </pre>
     * @param userId
     * @param teamTypeCode
     * @return
     */
    private TeamBO getTeamBOByUserIdAndTeamTypeCode(Long userId,String teamTypeCode){
        TeamBO teamBO = new TeamBO();
        List<TeamUserDO> teamUserDOList = teamUserDaoManager.listByUserId(userId);
        if(!CollectionUtils.isEmpty(teamUserDOList)){
            List<Long> teamIds = teamUserDOList.stream().map(TeamUserDO::getTeamId).collect(toList());
            List<QueryItemDTO> queryItems = new ArrayList<>();
            queryItems.add(DaoUtils.buildIn(TeamDO.DB_ID,teamIds));
            queryItems.add(DaoUtils.buildEqualTo(TeamDO.DB_TEAM_TYPE_CODE,teamTypeCode));
            List<TeamDO> teamDOList = teamDaoManager.listByQueryItems(queryItems);
            if(!CollectionUtils.isEmpty(teamDOList)){
                TeamDO teamDO = teamDOList.get(0);
                if(teamDO != null){
                    teamBO.setTeamId(teamDO.getId());
                    teamBO.setTeamName(teamDO.getTeamName());
                    UserDO userDO = userDaoManager.getById(teamDO.getTeamLeaderId());
                    if (userDO != null){
                        teamBO.setTeamLeaderUserId(userDO.getId());
                        teamBO.setTeamLeaderUserAccount(userDO.getUserAccount());
                        teamBO.setTeamLeaderUserName(userDO.getUserName());
                    }
                }
            }
        }

        return teamBO;
    }

    /**
     * 得到未审核人员团队信息
     * <pre>
     *     未审核人员其实还没有拉团队
     *     他的审核人就是他所在团队负责人
     *     1.根据审核人和团队类型得到所在团队
     *     2.返回团队信息
     * </pre>
     * @param userRegisterId
     * @param teamTypeCode
     * @return
     */
    private TeamBO getTeamBOByUserRegisterIdAndTeamTypeCode(Long userRegisterId,String teamTypeCode){
        TeamBO teamBO = new TeamBO();
        UserRegisterDO userRegisterDO = userRegisterDaoManager.getById(userRegisterId);
        if(userRegisterDO != null){
            UserDO userDO = userDaoManager.getById(userRegisterDO.getExamineUserId());
            if(userDO != null){
                teamBO.setTeamLeaderUserId(userDO.getId());
                teamBO.setTeamLeaderUserAccount(userDO.getUserAccount());
                teamBO.setTeamLeaderUserName(userDO.getUserName());
                List<TeamDO> teamDOList = teamDaoManager.listByQueryItems(Arrays.asList(DaoUtils.buildEqualTo(TeamDO.DB_TEAM_LEADER_ID,userDO.getId()),
                        DaoUtils.buildEqualTo(TeamDO.DB_TEAM_TYPE_CODE,teamTypeCode)));
                if(!CollectionUtils.isEmpty(teamDOList)){
                    TeamDO teamDO = teamDOList.get(0);
                    if(teamDO != null){
                        teamBO.setTeamId(teamDO.getId());
                        teamBO.setTeamName(teamDO.getTeamName());
                    }
                }
            }
        }

        return teamBO;
    }
    

    private UserDetailsVO getUserByUserRegisterId(Long id){
        UserRegisterDO userRegisterDO = userRegisterDaoManager.getById(id);
        UserBO userBO = CommonUtils.newInstance(userRegisterDO,UserBO.class);
        userBO.setUserPassword(null);
        List<UserRegisterExpandDO> userExpandDOList = userRegisterExpandDaoManager.listByRegisterId(id);
        Map<String,Object> context = new HashMap<>();
        if(!CollectionUtils.isEmpty(userExpandDOList)){
            context = userExpandDOList.stream().collect(Collectors.toMap(UserRegisterExpandDO::getPropertyName,e -> e.getPropertyValue()));
        }
        UserDetailsVO userDetailsVO = new UserDetailsVO();
        userDetailsVO.setUserBO(userBO);
        DeptBO deptBO = getDeptBOById(userRegisterDO.getDeptId());
        userDetailsVO.setDeptBO(deptBO);
        userDetailsVO.setContext(context);
        //如果审核状态是审核不通过则删除
        if(userRegisterDO.getExamineStatus() == ExamineStatusEnum.NO_PASS.code){
            userRegisterDaoManager.deleteById(id);
        }

        return userDetailsVO;
    }

    /**
     * 得到用户注册详细信息
     * <pre>
     *     1.得到用户注册基本信息
     *     2.得到用户注册拓展信息
     * </pre>
     * @param dto
     * @return
     */
    @Override
    public UserRegisterDetailVO getUserRegisterDetailsById(IdDTO<Long> dto){
        if(dto == null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"id不能为空");
        }
        UserRegisterDO userRegisterDO = userRegisterDaoManager.getById(dto.getId());
        UserRegisterDetailVO userRegisterDetailVO = CommonUtils.newInstance(userRegisterDO,UserRegisterDetailVO.class);
        DeptDO deptDO = deptDaoManager.getById(userRegisterDO.getDeptId());
        if(deptDO != null){
            userRegisterDetailVO.setDeptName(deptDO.getDeptName());
        }
        List<UserRegisterExpandDO> userRegisterExpandDOList = userRegisterExpandDaoManager.listByRegisterId(dto.getId());
        Map<String,Object> context = new HashMap<>();
        if(!CollectionUtils.isEmpty(userRegisterExpandDOList)){
            context = userRegisterExpandDOList.stream().collect(Collectors.toMap(UserRegisterExpandDO::getPropertyName,e -> e.getPropertyValue()));
        }
        userRegisterDetailVO.setContext(context);

        return userRegisterDetailVO;

    }

    @Override
    public List<PermTreeVO> listOwnerMenus(ListOwnerMenusDTO listOwnerMenusDTO) {
        List<PermTreeVO> rootMenus = new ArrayList<>();
        Long appId = listOwnerMenusDTO.getAppId();
        Long userId = listOwnerMenusDTO.getUserId();
        String appCode = listOwnerMenusDTO.getAppCode();
        List<PermDO> menus = new ArrayList<>();
        if (appCode != null) {
            AppDO appDO = appDaoManager.singleResultByAppCode(appCode);
            menus = userManager.getAllMenuByUserIdAndAppId(userId, appDO.getId());
        } else {
            menus = userManager.getAllMenuByUserIdAndAppId(userId, appId);
        }
        for (PermDO per : menus) {
            //if(per.getPermType().equals(PermTypeEnum.DIRECTORY.getCode())){//目录
            if (PermTypeEnum.OPERATOR.code.equals(per.getPermType())) {
                //如果是操作类的，不用加到菜单树里,liyinshan
                continue;
            }
            if (per.getPid() == 0) {//目录
                PermTreeVO child = CommonUtils.newInstance(per, PermTreeVO.class);
                rootMenus.add(child);
                fillChildrenMenu(menus, child);
            }
        }
        this.sort(rootMenus);
        return rootMenus;
    }


    //排序
    private void sort(List<PermTreeVO> list) {

        //为空，不用排
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        Collections.sort(list, (p1, p2) -> {
            if (p1 == null || p2 == null || p1.getSeq() == null || p2.getSeq() == null) {
                return 0;
            }
            return p1.getSeq().intValue() - p2.getSeq().intValue();
        });
        list.forEach(e -> {
            this.sort(e.getChildren());
        });
    }

    @Override
    public List<PermDO> listOwnerPerms(ListOwnerMenusDTO listOwnerMenusDTO) {
        String appCode = listOwnerMenusDTO.getAppCode();
        Long appId = listOwnerMenusDTO.getAppId();
        Long userId = listOwnerMenusDTO.getUserId();
        List<PermDO> menus = new ArrayList<>();
        if (appCode != null) {
            AppDO appDO = appDaoManager.singleResultByAppCode(appCode);
            menus = userManager.getAllPermByUserIdAndAppId(userId, appDO.getId());
        } else {
            menus = userManager.getAllPermByUserIdAndAppId(userId, appId);
        }
        return menus;
    }

    @Override
    public UserAppBO getMenuByUserIdAndAppId(UserAndAppIDDTO dto) {
        ListOwnerMenusDTO listOwnerMenusDTO = new ListOwnerMenusDTO();
        listOwnerMenusDTO.setAppId(dto.getAppId());
//        listOwnerMenusDTO.setUserId(userManager.getUserInfo().getOauth2UserBO().getId());
        listOwnerMenusDTO.setUserId(dto.getUserId());//暂时开发全用1
        //权限树
        List<PermTreeVO> permTreeVOS = this.listOwnerMenus(listOwnerMenusDTO);
        //权限
        List<PermDO> permDOS = this.listOwnerPerms(listOwnerMenusDTO);
        UserAppBO userAppBO = new UserAppBO();
        userAppBO.setPermTreeVOS(permTreeVOS);
        userAppBO.setPermDOS(permDOS);

        return userAppBO;
    }

    /**
     *查询用户列表
     * <pre>
     *     1.根据所属部门和关键字查询
     *     2.部门为必传
     * </pre>
     * @param listQueryUserDTO
     * @return
     */
    @Override
    public PageBO<TibmasUserBO> listQuery(ListQueryUserDTO listQueryUserDTO) {
        PageBO<UserDO> pageBO = new PageBO<>();
        List<QueryItemDTO> conditions = new ArrayList<>();
        conditions.add(DaoUtils.buildEqualTo(UserDO.DEPT_ID,listQueryUserDTO.getDeptId()));
        listQueryUserDTO.setQueryItems(conditions);
        if(StringUtils.isEmpty(listQueryUserDTO.getQueryKey())){
            pageBO = userDaoManager.pageQuery(listQueryUserDTO);
        }else {
            //先根据账号找
            conditions = Arrays.asList(DaoUtils.buildLike(UserDO.DB_USER_ACCOUNT,listQueryUserDTO.getQueryKey()+"%"),
                    DaoUtils.buildEqualTo(UserDO.DEPT_ID,listQueryUserDTO.getDeptId()));
            listQueryUserDTO.setQueryItems(conditions);
            pageBO = userDaoManager.pageQuery(listQueryUserDTO);
            if(CollectionUtils.isEmpty(pageBO.getList())){
                //姓名
                conditions =  Arrays.asList(DaoUtils.buildLike(UserDO.DB_USER_NAME,"%"+listQueryUserDTO.getQueryKey()+"%"),
                        DaoUtils.buildEqualTo(UserDO.DEPT_ID,listQueryUserDTO.getDeptId()));
                listQueryUserDTO.setQueryItems(conditions);
                pageBO = userDaoManager.pageQuery(listQueryUserDTO);
                if(CollectionUtils.isEmpty(pageBO.getList())){
                    //手机号
                    conditions = Arrays.asList(DaoUtils.buildEqualTo(UserDO.DB_MOBILE_NO,listQueryUserDTO.getQueryKey()),
                            DaoUtils.buildEqualTo(UserDO.DEPT_ID,listQueryUserDTO.getDeptId()));
                    listQueryUserDTO.setQueryItems(conditions);
                    pageBO = userDaoManager.pageQuery(listQueryUserDTO);
                    if(CollectionUtils.isEmpty(pageBO.getList())){
                        //邮箱
                        conditions = Arrays.asList(DaoUtils.buildEqualTo(UserDO.DB_EMAIL,listQueryUserDTO.getQueryKey()),
                                DaoUtils.buildEqualTo(UserDO.DEPT_ID,listQueryUserDTO.getDeptId()));
                        listQueryUserDTO.setQueryItems(conditions);
                        pageBO = userDaoManager.pageQuery(listQueryUserDTO);
                    }
                }
            }
        }

        List<UserDO> userDOList = pageBO.getList();

        List<TibmasUserBO> userBOList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(userDOList)){
            Map<Long, DeptDO> longDeptDOMap = this.deptDaoManager.mapByIds(userDOList, UserDO::getDeptId);
            List<Long> userIds = userDOList.stream().map(UserDO::getId).collect(Collectors.toList());
            Map<Long,List<UserExpandDO>> userExpandDOMap = userExpandDaoManager.groupingByInUserId(userIds,UserExpandDO::getUserId);
            for(UserDO userDO:userDOList){
                List<RoleDO> roleDOList = userManager.listRoleDOByUserId(userDO.getId());
                String roleName = roleDOList.stream().map(RoleDO::getRoleName).collect(Collectors.joining("，"));
                TibmasUserBO userBO = CommonUtils.newInstance(userDO, TibmasUserBO.class);
                userBO.setDeptDO(longDeptDOMap.get(userDO.getDeptId()));
                List<UserExpandDO> userExpandDOList = userExpandDOMap.get(userDO.getId());
                if(!CollectionUtils.isEmpty(userExpandDOList)){
                    userBO.setContext(userExpandDOList.stream().collect(Collectors.toMap(UserExpandDO::getPropertyName,
                            UserExpandDO::getPropertyValue,(k1,k2)->k1)));
                }

                userBO.setRoleName(roleName);
                userBOList.add(userBO);
            }
        }
        //排序
        CommonUtils.sortByModifyTime(userBOList,false);
        PageBO<TibmasUserBO> userBOPageBO = CommonUtils.newInstance(pageBO,PageBO.class);
        userBOPageBO.setList(userBOList);

        return userBOPageBO;
    }

    /**
     * 根据关键字查询用户
     * <pre>
     *     1.如果dto没值则返回空数组
     *     2.先根据用户名模糊查询，没查到则根据账号查询，没查到则根据电话号码查询
     *     3.类型转换
     *     4.返回
     * </pre>
     * @param dto
     * @return
     */
    @Override
    public List<UserDeptBO> listUserByKeyWords(UserByKeyWordsDTO dto){
        List<UserDeptBO> userDeptBOList = new ArrayList<>();
        if(dto == null || StringUtils.isEmpty(dto.getKeyWords())){
            return userDeptBOList;
        }

        List<UserDO> userDOList;
        userDOList = userDaoManager.listByQueryItems(DaoUtils.buildLike(UserDO.DB_USER_NAME,"%"+dto.getKeyWords()+"%"));
        if(CollectionUtils.isEmpty(userDOList)){
            userDOList = userDaoManager.listByQueryItems(DaoUtils.buildLike(UserDO.DB_USER_ACCOUNT,"%"+dto.getKeyWords()+"%"));
            if(CollectionUtils.isEmpty(userDOList)){
                userDOList = userDaoManager.listByQueryItems(DaoUtils.buildLike(UserDO.DB_MOBILE_NO,"%"+dto.getKeyWords()+"%"));
            }
        }
        if(CollectionUtils.isEmpty(userDOList)){
            return userDeptBOList;
        }

        List<Long> deptIds = userDOList.stream().map(UserDO::getDeptId).collect(Collectors.toList());
        Map<Long,DeptDO> deptDOMap = deptDaoManager.mapByIds(deptIds);
        for(UserDO userDO:userDOList){
            UserDeptBO userDeptBO = CommonUtils.newInstance(userDO,UserDeptBO.class);
            if(deptDOMap != null && deptDOMap.get(userDO.getDeptId()) != null){
                DeptDO deptDO = deptDOMap.get(userDO.getDeptId());
                userDeptBO.setDeptId(deptDO.getId());
                userDeptBO.setDeptCode(deptDO.getDeptCode());
                userDeptBO.setDeptName(deptDO.getDeptName());
            }
            userDeptBOList.add(userDeptBO);
        }

        return userDeptBOList;
    }

    /**
     *查询注册用户列表
     * <pre>
     *     1.根据所属部门或关键字查询
     *     2.部门为非必传
     * </pre>
     * @param listQueryUserDTO
     * @return
     */
    @Override
    public PageBO<UserRegisterVO> listQueryUserRegister(ListQueryUserDTO listQueryUserDTO) {
        PageBO<UserRegisterDO> pageBO = new PageBO<>();
        List<QueryItemDTO> conditions = new ArrayList<>();
        if(listQueryUserDTO.getDeptId() != null){
            conditions.add(DaoUtils.buildEqualTo(UserDO.DEPT_ID,listQueryUserDTO.getDeptId()));
        }
        listQueryUserDTO.setQueryItems(conditions);
        if(StringUtils.isEmpty(listQueryUserDTO.getQueryKey())){
            pageBO = userRegisterDaoManager.pageQuery(listQueryUserDTO);
        }else {
            //先根据账号找
            conditions = Arrays.asList(DaoUtils.buildLike(UserRegisterDO.DB_USER_ACCOUNT,listQueryUserDTO.getQueryKey()+"%"));
            if(listQueryUserDTO.getDeptId() != null){
                conditions.add(DaoUtils.buildEqualTo(UserDO.DEPT_ID,listQueryUserDTO.getDeptId()));
            }
            pageBO = userRegisterDaoManager.pageQuery(listQueryUserDTO);
            if(CollectionUtils.isEmpty(pageBO.getList())){
                //姓名
                conditions =  Arrays.asList(DaoUtils.buildLike(UserRegisterDO.DB_USER_NAME,"%"+listQueryUserDTO.getQueryKey()+"%"));
                if(listQueryUserDTO.getDeptId() != null){
                    conditions.add(DaoUtils.buildEqualTo(UserDO.DEPT_ID,listQueryUserDTO.getDeptId()));
                }
                pageBO = userRegisterDaoManager.pageQuery(listQueryUserDTO);
                if(CollectionUtils.isEmpty(pageBO.getList())){
                    //手机号
                    conditions = Arrays.asList(DaoUtils.buildEqualTo(UserRegisterDO.DB_MOBILE_NO,listQueryUserDTO.getQueryKey()));
                    if(listQueryUserDTO.getDeptId() != null){
                        conditions.add(DaoUtils.buildEqualTo(UserDO.DEPT_ID,listQueryUserDTO.getDeptId()));
                    }
                    pageBO = userRegisterDaoManager.pageQuery(listQueryUserDTO);
                    if(CollectionUtils.isEmpty(pageBO.getList())){
                        //邮箱
                        conditions = Arrays.asList(DaoUtils.buildEqualTo(UserRegisterDO.DB_EMAIL,listQueryUserDTO.getQueryKey()));
                        if(listQueryUserDTO.getDeptId() != null){
                            conditions.add(DaoUtils.buildEqualTo(UserDO.DEPT_ID,listQueryUserDTO.getDeptId()));
                        }
                        pageBO = userRegisterDaoManager.pageQuery(listQueryUserDTO);
                    }
                }
            }
        }

        List<UserRegisterDO> userRegisterDOList = pageBO.getList();

        List<UserRegisterVO> userRegisterVOList = new ArrayList<>();
        Map<Long, DeptDO> longDeptDOMap = this.deptDaoManager.mapByIds(userRegisterDOList, UserRegisterDO::getDeptId);
        if(!CollectionUtils.isEmpty(userRegisterDOList)){
            List<Long> registerIds = userRegisterDOList.stream().map(UserRegisterDO::getId).collect(Collectors.toList());
            Map<Long,List<UserRegisterExpandDO>> listMap = userRegisterExpandDaoManager.groupingByInRegisterId(registerIds,UserRegisterExpandDO::getRegisterId);
            for(UserRegisterDO userRegisterDO:userRegisterDOList){
                UserRegisterVO userRegisterVO = CommonUtils.newInstance(userRegisterDO, UserRegisterVO.class);
                if(longDeptDOMap!= null && longDeptDOMap.get(userRegisterDO.getDeptId())!=null){
                    userRegisterVO.setDeptName(longDeptDOMap.get(userRegisterDO.getDeptId()).getDeptName());
                }
                List<UserRegisterExpandDO> userRegisterExpandDOList = listMap.get(userRegisterDO.getId());
                if(!CollectionUtils.isEmpty(userRegisterExpandDOList)){
                    userRegisterVO.setContext(userRegisterExpandDOList.stream().collect(Collectors.toMap(UserRegisterExpandDO::getPropertyName,
                            UserRegisterExpandDO::getPropertyValue,(k1,k2)->k1)));
                }
                userRegisterVOList.add(userRegisterVO);
            }
        }
        //排序
        CommonUtils.sortByModifyTime(userRegisterVOList,false);
        PageBO<UserRegisterVO> userBOPageBO = CommonUtils.newInstance(pageBO,PageBO.class);
        userBOPageBO.setList(userRegisterVOList);

        return userBOPageBO;
    }

    /**
     * 新增用户
     * <pre>
     *     1.新增用户基本信息
     *           验证用户信息
     *           插入用户信息
     *           向kafka发送用户信息
     *     2.新增用户拓展信息
     * </pre>
     *
     * @param dto 用户信息传输对象
     * @return
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Integer insert(AddUserDTO dto) {
        //1.新增用户基本信息
        UserDO userDO = CommonUtils.newInstance(dto, UserDO.class);
        List<UserDO> userDOListMobileNo = userDaoManager.listByUserAccount(userDO.getMobileNo());
        //验证手机号信息的合法性
        if (!CollectionUtils.isEmpty(userDOListMobileNo))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该手机号已经被注册！");
        //验证用户信息的合法性
        List<UserDO> userDOList = userDaoManager.listByUserAccount(userDO.getUserAccount());
        //验证用户信息的合法性
        if (!CollectionUtils.isEmpty(userDOList))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该用户账号已经存在！");
        List<UserDO> userDOListEmail = userDaoManager.listByUserAccount(userDO.getEmail());
        if (!CollectionUtils.isEmpty(userDOListEmail))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该邮箱已经被注册！");
        String password = userDO.getUserPassword();
        userDO.setUserPassword(EncryptUtils.encryptBySha256(password));
        //创建人id
        userDO.setUserIdCreate(dto.getUserId());
        userDO.setUserIdModified(dto.getUserId());
        userDO.setUpdatePasswordTime(new Date());
        if (dto.getLeaderId() != null){
            userDO.setLeaderId(dto.getLeaderId());
        }
        int res = userDaoManager.insertNotNullProperties(userDO);
        if (res > 0) {
            //新增后往kafka发消息
            userDO.setUserPassword(password);
            info2KafkaManager.addUser(userDO);
        }

        //新增用户拓展信息
        if (!CollectionUtils.isEmpty(dto.getContext())) {
            List<UserExpandDO> userExpandDOList = dto.getContext().entrySet().stream().map(e -> {
                UserExpandDO userExpandDO = new UserExpandDO();
                userExpandDO.setUserId(userDO.getId());
                userExpandDO.setPropertyName(e.getKey());
                userExpandDO.setPropertyValue(e.getValue()==null?"":e.getValue().toString());
                return userExpandDO;
            }).collect(Collectors.toList());
            userExpandDaoManager.insertAllPropertiesList(userExpandDOList);
        }

        return res;
    }

    /**
     * 用户注册
     * <pre>
     *     1.新增注册用户基本信息
     *           验证用户信息
     *           插入用户信息
     *     2.新增注册用户拓展信息
     *     3.如果拓展信息中有openId则是微信那边过来的
     *       要将openId存起来
     *     4.调用流程接口发起审核流程
     * </pre>
     *
     * @param dto 用户信息传输对象
     * @return
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Integer register(AddUserDTO dto) {
        //1.新增用户基本信息
        UserRegisterDO userRegisterDO = CommonUtils.newInstance(dto, UserRegisterDO.class);
        List<UserRegisterDO> userDOListMobileNo = userRegisterDaoManager.listByQueryItems(Arrays.asList(DaoUtils.buildNotEqualTo(UserRegisterDO.DB_EXAMINE_STATUS, ExamineStatusEnum.NO_PASS.code),
                DaoUtils.buildEqualTo(UserRegisterDO.DB_MOBILE_NO, dto.getMobileNo())));
        //验证手机号信息的合法性
        if (!CollectionUtils.isEmpty(userDOListMobileNo))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该手机号已经被注册！");
        //验证用户信息的合法性
        List<UserRegisterDO> userDOList = userRegisterDaoManager.listByQueryItems(Arrays.asList(DaoUtils.buildNotEqualTo(UserRegisterDO.DB_EXAMINE_STATUS, ExamineStatusEnum.NO_PASS.code),
                DaoUtils.buildEqualTo(UserRegisterDO.DB_USER_ACCOUNT, userRegisterDO.getUserAccount())));
        //验证用户信息的合法性
        if (!CollectionUtils.isEmpty(userDOList))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该用户账号已经存在！");
        List<UserRegisterDO> userDOListEmail = userRegisterDaoManager.listByQueryItems(Arrays.asList(DaoUtils.buildNotEqualTo(UserRegisterDO.DB_EXAMINE_STATUS, ExamineStatusEnum.NO_PASS.code),
                DaoUtils.buildEqualTo(UserRegisterDO.DB_EMAIL, userRegisterDO.getEmail())));
        if (!CollectionUtils.isEmpty(userDOListEmail))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该邮箱已经被注册！");

        String password = userRegisterDO.getUserPassword();
        userRegisterDO.setUserPassword(EncryptUtils.encryptBySha256(password));
        String busId = UUID.randomUUID().toString().replace("-","");
        userRegisterDO.setBusId(busId);
        int res = userRegisterDaoManager.insertNotNullProperties(userRegisterDO);

        //新增用户拓展信息
        Map<String,Object> expendMap = dto.getContext();
        if (!CollectionUtils.isEmpty(expendMap)) {
            List<UserRegisterExpandDO> userRegisterExpandDOList = expendMap.entrySet().stream().map(e -> {
                UserRegisterExpandDO userRegisterExpandDO = new UserRegisterExpandDO();
                userRegisterExpandDO.setRegisterId(userRegisterDO.getId());
                userRegisterExpandDO.setPropertyName(e.getKey());
                userRegisterExpandDO.setPropertyValue(e.getValue()==null?"":e.getValue().toString());
                return userRegisterExpandDO;
            }).collect(Collectors.toList());

            userRegisterExpandDaoManager.insertAllPropertiesList(userRegisterExpandDOList);

            //如果有openId则将openId保存起来
            if(!StringUtils.isEmpty(expendMap.get("openId"))){
                //先删除之前账号与openId的绑定
                openUserDaoManager.deleteByOpenId(expendMap.get("openId").toString());
                //绑定新的
                OpenUserDO openUserDO = new OpenUserDO();
                openUserDO.setOpenId(expendMap.get("openId").toString());
                openUserDO.setWxAppId(expendMap.get("wxAppId")==null?"":expendMap.get("wxAppId").toString());
                openUserDO.setNickName(expendMap.get("nickName")==null?"":expendMap.get("nickName").toString());
                openUserDO.setUnionId(expendMap.get("unionId")==null?"":expendMap.get("unionId").toString());
                openUserDO.setWxHeadImg(expendMap.get("wxHeadImg")==null?"":expendMap.get("wxHeadImg").toString());
                openUserDO.setWxGender(expendMap.get("wxGender")==null?null:Integer.parseInt(expendMap.get("wxGender").toString()));
                openUserDO.setWxPhoneNum(expendMap.get("wxPhoneNum")==null?"":expendMap.get("wxPhoneNum").toString());
                openUserDO.setUserId(userRegisterDO.getId());
                openUserDO.setExamineStatus(ExamineStatusEnum.WAIT.code);
                openUserDaoManager.insertNotNullProperties(openUserDO);
            }
        }

        //调用流程引擎服务生成用户审核任务
        startRegisterIst(dto,expendMap,busId);


        return res;
    }

    /**
     * 调用流程引擎服务生成用户审核任务
     * @param dto
     * @param expendMap
     * @param busId
     */
    private void startRegisterIst(AddUserDTO dto,Map<String,Object> expendMap,String busId){
        //dto字段封装成Map
        Field[] fields = dto.getClass().getDeclaredFields();
        Map<String,Object> context = Arrays.stream(fields).filter(e -> e.getName() != "context").collect(Collectors.toMap( k -> k.getName(), e -> {
            try {
                Field field = dto.getClass().getDeclaredField(e.getName());
                field.setAccessible(true);
                //这里返回null会报空指针
                return field.get(dto) == null?"":field.get(dto);
            } catch (IllegalAccessException e1) {

            } catch (NoSuchFieldException e1) {

            }
            return "";
        }));
        if(!CollectionUtils.isEmpty(expendMap)){
            context.put("_nextTaskUserName",expendMap.get("teamLeaderName"));
            context.put("_nextTaskUserId",expendMap.get("teamLeaderAccount"));
            context.forEach((k,v) -> {
                if("".equals(v)){
                    v = null;
                    context.put(k,v);
                }
            });
        }

        StartIstByDefKeyDTO startIstByDefKeyDTO = new StartIstByDefKeyDTO();
        startIstByDefKeyDTO.setBusId(busId);
        startIstByDefKeyDTO.setContext(context);
        startIstByDefKeyDTO.setDefKey("tibmas_user_register");
        startIstByDefKeyDTO.setInitiatorId(dto.getUserAccount());
        startIstByDefKeyDTO.setInitiatorName(dto.getUserName());
        startIstByDefKeyDTO.setIstName("注册用户审批");

        userServiceFeign.startIstByDefKey(startIstByDefKeyDTO);
    }

    /**
     * 审核用户注册
     * <pre>
     *     先判断该任务是否已审核过
     *     1.修改注册审核状态
     *     2.将用户基本信息插入用户表
     *     3.查询用户拓展信息，插入用户信息拓展表
     *     4.如果根据注册id在open_user表能查到数据,且状态审核状态为未审核
     *          如果审核通过则将open_user表审核状态改为2，并将userId字段改为新插入用户的userId
     *          如果审核不通过则删除open_user表该条纪录
     *     5.如果审核通过，将用户拉入审核人所在团队，如果是小程序则将job赋成角色
     * </pre>
     *
     * @param examineDTO
     * @return
     */
    @Override
    @Transactional
    public Integer examine(ExamineDTO examineDTO) {
        if (examineDTO == null || examineDTO.getBusStatus() == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "审核状态不能为空");
        }
        List<QueryItemDTO> queryItemDTOList = Arrays.asList(DaoUtils.buildEqualTo(UserRegisterDO.DB_BUS_ID,examineDTO.getBusId()),
                DaoUtils.buildNotEqualTo(UserRegisterDO.DB_EXAMINE_STATUS,ExamineStatusEnum.WAIT.code));
        List<UserRegisterDO> userRegisterDOList = userRegisterDaoManager.listByQueryItems(queryItemDTOList);
        if(!CollectionUtils.isEmpty(userRegisterDOList)){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该任务已审核过");
        }

        UserRegisterDO userRegisterDO = new UserRegisterDO();
        userRegisterDO.setBusId(examineDTO.getBusId());
        if(examineDTO.getBusStatus().startsWith("02")){
            userRegisterDO.setExamineStatus(ExamineStatusEnum.PASS.code);
        }else if("999".equals(examineDTO.getBusStatus())) {
            //不同意
            refuseUser(userRegisterDO,examineDTO.getBusId());

            return 1;
        }else {
            return 0;
        }

        userRegisterDaoManager.updateNotNullFieldsByBusId(userRegisterDO,examineDTO.getBusId());

        userRegisterDO = userRegisterDaoManager.singleResultByBusId(examineDTO.getBusId());
        if (userRegisterDO == null){
            return 0;
        }
        UserDO userDO = CommonUtils.newInstance(userRegisterDO, UserDO.class);
        userDO.setId(null);
        userDaoManager.insertNotNullProperties(userDO);

        List<UserRegisterExpandDO> userRegisterExpandDOList = userRegisterExpandDaoManager.listByRegisterId(userRegisterDO.getId());
        if (!CollectionUtils.isEmpty(userRegisterExpandDOList)) {
            List<UserExpandDO> userExpandDOList = userRegisterExpandDOList.stream().map(e -> {
                UserExpandDO userExpandDO = CommonUtils.newInstance(e, UserExpandDO.class);
                userExpandDO.setUserId(userDO.getId());
                return userExpandDO;
            }).collect(Collectors.toList());
            userExpandDaoManager.insertAllPropertiesList(userExpandDOList);
        }

        OpenUserDO openUserDO = openUserDaoManager.singleResultByUserId(userRegisterDO.getId());
        if(openUserDO != null && openUserDO.getExamineStatus() == ExamineStatusEnum.WAIT.code){
            if(userRegisterDO.getExamineStatus() == ExamineStatusEnum.PASS.code){
                openUserDO.setUserId(userDO.getId());
                openUserDO.setExamineStatus(ExamineStatusEnum.PASS.code);
                openUserDaoManager.updateNotNullProperties(openUserDO);
            }
        }
        //赋团队和角色
        grantTeamAndRole(userRegisterDO,userDO.getId());

        return 1;

    }

    /**
     * 赋予团队和角色
     * @param userRegisterDO
     */
    private void grantTeamAndRole(UserRegisterDO userRegisterDO,Long userId){
        //赋予团队
        List<TeamDO> teamDOList = teamDaoManager.listByQueryItems(Arrays.asList(DaoUtils.buildEqualTo(TeamDO.DB_TEAM_LEADER_ID,userRegisterDO.getExamineUserId()),
                DaoUtils.buildEqualTo(TeamDO.DB_TEAM_TYPE_CODE,userRegisterDO.getTeamTypeCode())));
        if(!CollectionUtils.isEmpty(teamDOList) && teamDOList.get(0) != null){
            TeamAndUserDTO teamAndUserDTO = new TeamAndUserDTO();
            teamAndUserDTO.setTeamId(teamDOList.get(0).getId());
            teamAndUserDTO.setUserId(userId);
            teamAndUserDTO.setUserType(2);
            teamAndUserService.addUserToTeam(teamAndUserDTO);
        }
        //赋予角色
        String roleCode = userRegisterDO.getJob();
        RoleDO roleDO = roleDaoManager.singleResultByRoleCode(roleCode);
        if(roleDO != null){
            UserRoleDO userRoleDO = new UserRoleDO();
            userRoleDO.setUserId(userId);
            userRoleDO.setRoleId(roleDO.getId());
            userRoleDO.setStartTime(new Date());
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                userRoleDO.setEndTime(simpleDateFormat.parse("2030-01-01 00:00:00"));
            } catch (ParseException e) {
                throw CommonException.exception("设置角色有效期失败");
            }
            userRoleDaoManager.insertNotNullProperties(userRoleDO);
        }
    }

    private void refuseUser(UserRegisterDO userRegisterDO,String busId){
        userRegisterDO.setExamineStatus(ExamineStatusEnum.NO_PASS.code);
        userRegisterDaoManager.updateNotNullFieldsByBusId(userRegisterDO,busId);
        userRegisterDO = userRegisterDaoManager.singleResultByBusId(busId);
        OpenUserDO openUserDO = openUserDaoManager.singleResultByUserId(userRegisterDO.getId());
        if(openUserDO != null){
            openUserDO.setExamineStatus(ExamineStatusEnum.NO_PASS.code);
            openUserDaoManager.updateNotNullProperties(openUserDO);
        }
    }


    //递归填充子菜单，得到层级的菜单列表
    private void fillChildrenMenu(List<? extends PermDO> menus, PermTreeVO menu) {
        List<PermTreeVO> children = new ArrayList<PermTreeVO>();
        menu.setChildren(children);
        if (!CollectionUtils.isEmpty(menus)) {
            for (PermDO permDO : menus) {
                if (permDO.getPid().equals(menu.getId())) {
                    PermTreeVO child = CommonUtils.newInstance(permDO, PermTreeVO.class);
                    children.add(child);
                    fillChildrenMenu(menus, child);
                }
            }
        }
    }

    /**
     * 删除用户
     * <pre>
     *     1.删除用户与其他表的关联关系
     *     2.删除用户
     *     3.删除用户拓展信息
     * </pre>
     *
     * @param id
     * @return
     */
    @Transactional
    @Override
    public Integer deleteById(Long id) {
        if (id == null) {
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "请选择需要删除的用户！");
        }
        UserDO userDO = userDaoManager.getById(id);
        //验证是否为admin
        if (userDO != null) {
            if ("admin".equals(userDO.getUserName())) {
                throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "超级管理员admin不可删除！");
            }
        }
        //先删除用户表与其他表的关系
        //1.删除用户与角色的关系
        userRoleDaoManager.deleteByUserId(id);
        int res = userDaoManager.deleteById(id);
        userExpandDaoManager.deleteByUserId(id);
        //删除成功往kafka发消息
        if (res > 0) {
            info2KafkaManager.deleteUser(userDO);
        }

        return res;
    }

    @Override
    @Transactional
    public Integer deleteByIds(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "没有要删除的用户Id");
        List<UserDO> userDOList = userDaoManager.listByIds(ids);
        if (userDOList == null) {
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "没有要删除的用户Id");
        }
        List<String> nameList = userDOList.stream().map(UserDO::getUserName).collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(nameList)) {
            //验证超级管理员
            if (nameList.contains("admin")) {
                throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "超级管理员admin不可删除！");
            }
        }
        int res = userDaoManager.deleteByIds(ids);
        //删除后往kafka发消息
        for (UserDO userDO : userDOList) {
            info2KafkaManager.deleteUser(userDO);
        }

        return res;
    }

    /**
     * 更新用户
     * <pre>
     *     1.验证用户信息
     *     2.更新用户信息
     *     3.向kafka发送用户信息
     *     4.更新用户拓展信息
     * </pre>
     *
     * @param dto 用户信息传输对象
     * @return
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public Integer updateById(UpdateUserDTO dto) {

        UserDO userDO = userDaoManager.getById(dto.getId());
        CommonUtils.copyProperties(userDO,dto);

        UserDO dbUserDO = new UserDO();
        try {
            dbUserDO = userDaoManager.getById(userDO.getId());
        } catch (Exception e) {
            throw CommonException.exception(1006, "该账户数据不存在，或已被删除。");
        }
        dbUserDO = userDaoManager.singleResultByMobileNo(userDO.getMobileNo());
        if (dbUserDO != null && !dbUserDO.getId().equals(userDO.getId()))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该手机号已经被注册！");
        dbUserDO = userDaoManager.singleResultByEmail(userDO.getEmail());
        if (dbUserDO != null && !dbUserDO.getId().equals(userDO.getId()))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该邮箱已经被注册！");
        dbUserDO = userDaoManager.singleResultByUserAccount(userDO.getUserAccount());
        if (dbUserDO != null && !dbUserDO.getId().equals(userDO.getId()))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该账号已经被注册！");
        //修改人id
        userDO.setUserIdModified(dto.getUserId());
        if (dto.getLeaderId() != null){
            userDO.setLeaderId(dto.getLeaderId());
        }
        int res = userDaoManager.updateNotNullProperties(userDO);
        if (dbUserDO != null) {
            userDO.setUserAccount(dbUserDO.getUserAccount());
        }
        if (res > 0) {
            //修改后往kafka发消息
            info2KafkaManager.updateUser(userDO);
        }

        //先删除拓展信息
        userExpandDaoManager.deleteByUserId(userDO.getId());
        //再添加拓展信息
        if (!CollectionUtils.isEmpty(dto.getContext())) {
            List<UserExpandDO> userExpandDOList = dto.getContext().entrySet().stream().map(e -> {
                UserExpandDO userExpandDO = new UserExpandDO();
                userExpandDO.setUserId(userDO.getId());
                userExpandDO.setPropertyName(e.getKey());
                userExpandDO.setPropertyValue(e.getValue()==null?"":e.getValue().toString());
                return userExpandDO;
            }).collect(Collectors.toList());
            userExpandDaoManager.insertAllPropertiesList(userExpandDOList);
        }
        return res;
    }

    @Transactional
    @Override
    public Integer resetPassword(ResetPasswordDTO resetPasswordDTO) {
        if (resetPasswordDTO == null) {
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "请输入密码！");
        }
        UserDO userDO = CommonUtils.newInstance(resetPasswordDTO, UserDO.class);
        userDO.setUserPassword(EncryptUtils.encryptBySha256(userDO.getUserPassword()));
        userDO.setUpdatePasswordTime(new Date());
        return userDaoManager.updateNotNullProperties(userDO);
    }

    @Override
    @Transactional
    public Integer grantRolesToUser(GrantRolesToUserDTO grantRolesToUserDTO) {
        //1.清除原来的关系
        userRoleDaoManager.deleteByUserId(grantRolesToUserDTO.getUserId());
        //2.重新建立用户与角色之间的关系
        List<Long> roleIds = grantRolesToUserDTO.getRoleIds();
        List<UserRoleDO> userRoleDOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(roleIds)) {
            for (Long roleId : roleIds) {
                UserRoleDO userRoleDO = new UserRoleDO();
                userRoleDO.setUserId(grantRolesToUserDTO.getUserId());
                userRoleDO.setRoleId(roleId);
                userRoleDO.setStartTime(grantRolesToUserDTO.getStartTime());
                userRoleDO.setEndTime(grantRolesToUserDTO.getEndTime());
                userRoleDOList.add(userRoleDO);
            }
            userRoleDaoManager.insertAllPropertiesList(userRoleDOList);
            //更新user表修改时间
            UserDO userDO = new UserDO();
            userDO.setId(grantRolesToUserDTO.getUserId());
            userDO.setGmtModified(new Date());
            userDaoManager.updateNotNullProperties(userDO);
        }
        return userRoleDOList.size();
    }

    @Override
    public AppRoleTreeVO listRoleTreeWithSelectForRoleUpdate(IdDTO<Long> dto) {

        AppRoleTreeVO appRoleTreeVO = new AppRoleTreeVO();

        //应用角色树
        List<AppRoleVO> appRoleVOList = roleManager.listAppRoleVO();

        //用户对应的角色
        List<UserRoleDO> userRoleDOS = userManager.listUserRoleDOByUserId(dto.getId());
        List<Long> selectIds = new ArrayList<>();
        if(!CollectionUtils.isEmpty(userRoleDOS)){
            selectIds = userRoleDOS.stream().map(UserRoleDO::getRoleId).collect(toList());
        }
        appRoleTreeVO.setAppRoleVOList(appRoleVOList);
        appRoleTreeVO.setSelectIds(selectIds);

        return appRoleTreeVO;
    }

    @Override
    public List<AppDTO> listAppByUserAccount(ListAppByUserAccountDTO dto) {
        UserDO userDO = userDaoManager.singleResultByUserAccount(dto.getUserAccount());
        if (userDO == null) {
            return Collections.emptyList();
        }
        //获取用户所拥有的权限
        List<PermDO> permDOList = userManager.getAllPermByUserId(userDO.getId());
        if (CollectionUtils.isEmpty(permDOList)) {
            return Collections.emptyList();
        }
        //获取用户所能访问的应用的id列表
        List<Long> appList = permDOList.stream().map(PermDO::getAppId).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(appList)) {
            return Collections.emptyList();
        }
        //获取用户所能访问的应用
        List<AppDO> appDOList = appDaoManager.listByIds(appList);
        if (CollectionUtils.isEmpty(appDOList)) {
            return Collections.emptyList();
        }
        List<AppDTO> listAppDTOList = new ArrayList<>();
        for (AppDO appDO : appDOList) {
            AppDTO appDTO = CommonUtils.newInstance(appDO, AppDTO.class);
            listAppDTOList.add(appDTO);
        }
        return listAppDTOList;
    }

    @Override
    public UserDO getUserDOById(Long id) {
        return userDaoManager.getById(id);
    }

    @Override
    public List<UserVO> listClosestUserByRoles(ClosestUserByRolesDTO dto) {
        //如果没有找到人则返回admin
        UserDO userAdminDO = userDaoManager.singleResultByUserAccount("admin");
        UserVO userAdminVO = CommonUtils.newInstance(userAdminDO, UserVO.class);
        if (dto == null) {
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "请传入角色编码。");
        }
        List<UserVO> userVOList = findUserByRoles(dto.getRoleCodes(), dto.getUserAccount());
        if (CollectionUtils.isEmpty(userVOList)) {
            userVOList.add(userAdminVO);
        }
        return userVOList;

    }

    @Override
    public List<String> listTaskProcessingUsers(ListTaskProcessingUsersDTO listTaskProcessingUsersDTO) {
        if (listTaskProcessingUsersDTO == null) {
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "请传入角色编码或部门编码。");
        }
        List<String> userList = new ArrayList<>();
        //传入的编码列表
        List<String> codeList = listTaskProcessingUsersDTO.getTaskProcessingGroups();
        //如果传入的编码为空则返回admin
        if (CollectionUtils.isEmpty(codeList)) {
            userList.add("admin");
            return userList;
        }
        List<String> roleList = new ArrayList<>();
        List<String> deptList = new ArrayList<>();
        for (String code : codeList) {
            if (code.contains("ROLE")) {
                String roleCode = code.substring(code.indexOf("_") + 1, code.length());
                roleList.add(roleCode);
            }
            if (code.contains("DEPT")) {
                String deptCode = code.substring(code.indexOf("_") + 1, code.length());
                deptList.add(deptCode);
            }
        }
        //1.根据角色找最近的人员
        List<UserVO> usersByRole = new ArrayList<>();
        if (!CollectionUtils.isEmpty(roleList)) {
            usersByRole = findUserByRoles(roleList, listTaskProcessingUsersDTO.getPrcInitiator());
        }
        if (!CollectionUtils.isEmpty(usersByRole)) {
            userList.addAll(usersByRole.stream().map(UserVO::getUserAccount).collect(Collectors.toList()));
        }
        //2.根据部门找最近的人员
        List<UserVO> usersByDept = new ArrayList<>();
        if (!CollectionUtils.isEmpty(deptList)) {
            usersByDept = findUserByDepts(deptList, listTaskProcessingUsersDTO.getPrcInitiator());
        }
        if (!CollectionUtils.isEmpty(usersByDept)) {
            userList.addAll(usersByDept.stream().map(UserVO::getUserAccount).collect(Collectors.toList()));
        }
        if (CollectionUtils.isEmpty(userList)) {
            userList.add("admin");
        }
        //去重
        HashSet h = new HashSet(userList);
        userList.clear();
        userList.addAll(h);

        return userList;

    }

    /**
     * @param listCanDoTaskUsersDTO
     * @return
     */
    @Override
    public List<UserBO> listCanDoTaskUsers(ListCanDoTaskUsersDTO listCanDoTaskUsersDTO) {
        if (listCanDoTaskUsersDTO == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "请求体不能为空");
        }

        if(CommonUtils.isNotEmpty(listCanDoTaskUsersDTO.getTeamIds())){
            //直接找团队的成员
            TeamIdDTO teamIdDTO=new TeamIdDTO();
            teamIdDTO.setTeamId(Long.valueOf(listCanDoTaskUsersDTO.getTeamIds().get(0)));
            List<UserBasicInfoVO> userBasicInfoVOS = this.teamUserService.listUserByTeamId(teamIdDTO);
            return CommonUtils.collection2List(userBasicInfoVOS, userBasicInfoVO -> {
                UserBO userBO= CommonUtils.newInstance(userBasicInfoVO,UserBO.class);
                userBO.setId(userBasicInfoVO.getUserId());
                return userBO;
            });
        }


        List<UserBO> userBOList = this.listUsersByUserAndRoleAndDept(listCanDoTaskUsersDTO.getInitiatorId(), listCanDoTaskUsersDTO.getUserIds(),
                listCanDoTaskUsersDTO.getRoleIds(), listCanDoTaskUsersDTO.getDeptIds());

        return userBOList;
    }




    @Override
    public List<UserBO> listUserInfoByIds(ListUserInfoByIdsDTO listUserInfoByIdsDTO) {
        if (listUserInfoByIdsDTO == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "用户ids不能为空");
        }
        List<UserBO> userBOList = new ArrayList<>();
        List<UserDO> userDOList = userDaoManager.listByInUserAccount(listUserInfoByIdsDTO.getIds());
        if (!CollectionUtils.isEmpty(userDOList)) {
            for (UserDO userDO : userDOList) {
                UserBO userBO = CommonUtils.newInstance(userDO, UserBO.class);
                userBOList.add(userBO);
            }
        }

        return userBOList;
    }

    @Override
    public List<UserBO> listCopyForUsers(ListCopyForUsersDTO listCopyForUsersDTO) {
        if (listCopyForUsersDTO == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "请求体不能为空");
        }
        List<UserBO> userBOList = this.listUsersByUserAndRoleAndDept(listCopyForUsersDTO.getInitiatorId(), listCopyForUsersDTO.getUserIds(),
                listCopyForUsersDTO.getRoleIds(), listCopyForUsersDTO.getDeptIds());

        return userBOList;
    }

    /**
     * <pre>
     *     1.先找到拥有角色的人员
     *     2.再找到属于组织下的人
     *     这个是取交集
     * </pre>
     *
     * @param listUsersByDeptAndRoleDTO
     * @return
     */
    @Override
    public List<UserBO> listUsersByDeptAndRoleDTO(ListUsersByDeptAndRoleDTO listUsersByDeptAndRoleDTO) {
        if (listUsersByDeptAndRoleDTO == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "请求体不能为空");
        }
        List<UserBO> userBOList = new ArrayList<>();
        List<Long> userIds = new ArrayList<>();
        //1.找到拥有角色的用户
        RoleDO roleDO = roleDaoManager.singleResultByRoleCode(listUsersByDeptAndRoleDTO.getRoleCode());
        if (roleDO != null) {
            List<UserRoleDO> userRoleDOList = userRoleDaoManager.listByRoleId(roleDO.getId());
            if (!CollectionUtils.isEmpty(userRoleDOList)) {
                userIds = userRoleDOList.stream().map(UserRoleDO::getUserId).collect(Collectors.toList());
            }
        }
        //2.找到属于部门下的用户
        DeptDO deptDO = deptDaoManager.singleResultByDeptCode(listUsersByDeptAndRoleDTO.getDeptCode());
        List<QueryItemDTO> conditions = new ArrayList<>();
        QueryItemDTO userIdsItem = DaoUtils.buildIn(UserDO.DB_ID, userIds);
        QueryItemDTO deptIdItem = new QueryItemDTO();
        if (deptDO != null) {
            deptIdItem = DaoUtils.buildEqualTo(UserDO.DB_DEPT_ID, deptDO.getId());
        }
        conditions.add(userIdsItem);
        conditions.add(deptIdItem);

        List<UserDO> userDOList = userDaoManager.listByQueryItems(conditions);
        if (!CollectionUtils.isEmpty(userDOList)) {
            for (UserDO userDO : userDOList) {
                UserBO userBO = CommonUtils.newInstance(userDO, UserBO.class);
                userBOList.add(userBO);
            }
        }

        return userBOList;
    }

    /**
     * <pre>
     *     1.根据角色找最近的人员
     *     2.根据可执行者ids(id即account)找人员
     *     3.根据可执行部门找人员
     *     取以上三条的并集
     * </pre>
     *
     * @param initiatorId 流程启动者
     * @param userIds     可执行用户
     * @param roleIds     可执行的角色
     * @param deptIds     可执行的组织
     * @return
     */
    private List<UserBO> listUsersByUserAndRoleAndDept(String initiatorId, List<String> userIds, List<String> roleIds, List<String> deptIds) {
        List<UserBO> userBOList = new ArrayList<>();
        //1.根据角色找最近的人员

        // modify by liyinshan 20190709
        UserDO initiatorDO = this.userDaoManager.singleResultByUserAccount(initiatorId);
        if(CommonUtils.isNotEmpty(roleIds)){
            //角色
            List<RoleDO> roleDOS = this.roleDaoManager.listByInRoleCode(roleIds);
            if(CommonUtils.isNotEmpty(roleDOS)){
                if(roleDOS.size()>1){
                    throw CommonException.paramException("暂时不支持多个角色");
                }
                List<UserDO> tmpUsers = this.tibmasManager.findCloseUserByUserAndUserId(initiatorDO.getId(), roleDOS.get(0).getId());
                userBOList.addAll(CommonUtils.collection2List(tmpUsers, userDO1 -> CommonUtils.newInstance(userDO1,UserBO.class)));
            }
        }

        /**
        List<UserVO> usersByRole = new ArrayList<>();
        if (!CollectionUtils.isEmpty(roleIds)) {
            usersByRole = findUserByRoles(roleIds, initiatorId);
        }
        if (!CollectionUtils.isEmpty(usersByRole)) {
            for (UserVO userVO : usersByRole) {
                UserBO userBO = CommonUtils.newInstance(userVO, UserBO.class);
                userBOList.add(userBO);
            }
        }
         */
        //2.根据可执行者ids找人员
        if (CommonUtils.isNotEmpty(userIds)) {
            List<UserDO> userDOList = userDaoManager.listByInUserAccount(userIds);
            if (!CollectionUtils.isEmpty(userDOList)) {
                for (UserDO userDO : userDOList) {
                    UserBO userBO = CommonUtils.newInstance(userDO, UserBO.class);
                    userBOList.add(userBO);
                }
            }
        }
        //3.根据可执行部门找人员
        List<Long> deptIdList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(deptIds)) {
            List<DeptDO> deptDOList = deptDaoManager.listByInDeptCode(deptIds);
            if (!CollectionUtils.isEmpty(deptDOList)) {
                deptIdList = deptDOList.stream().map(DeptDO::getId).collect(Collectors.toList());
            }
        }
        if (CommonUtils.isNotEmpty(deptIdList)) {
            List<UserDO> userDOList1 = userDaoManager.listByInDeptId(deptIdList);
            if (!CollectionUtils.isEmpty(userDOList1)) {
                for (UserDO userDO : userDOList1) {
                    UserBO userBO = CommonUtils.newInstance(userDO, UserBO.class);
                    userBOList.add(userBO);
                }
            }
        }
        //去重
        Set<UserBO> set = new HashSet<>(userBOList);
        userBOList.clear();
        userBOList.addAll(set);

        return userBOList;
    }

    //通过角色编码找最近的相关人员
    private List<UserVO> findUserByRoles(List<String> codeList, String userAccount) {
        List<UserVO> userVOList = new ArrayList<>();
        if (CollectionUtils.isEmpty(codeList)) {
            return userVOList;
        }
        //1.找到所有符合角色的人员
        Set<UserDO> userDOList = userManager.listUserByRole(codeList);
        if (CollectionUtils.isEmpty(userDOList)) {
            return userVOList;
        }

        return this.listUserByUsers(userDOList, userAccount);

    }

    //通过角色编码找最近的相关人员
    private List<UserVO> findUserByDepts(List<String> deptList, String userAccount) {
        List<UserVO> userVOList = new ArrayList<>();
        if (CollectionUtils.isEmpty(deptList)) {
            return userVOList;
        }
        //1.找到所有符合部门的人员
        //a.根据deptCode找dept
        List<DeptDO> deptDOLst = deptDaoManager.listByInDeptCode(deptList);
        if (CollectionUtils.isEmpty(deptDOLst)) {
            return userVOList;
        }
        List<UserDO> userDOList = userDaoManager.listByInDeptId(deptDOLst.stream().map(DeptDO::getId).collect(Collectors.toList()));
        if (CollectionUtils.isEmpty(userDOList)) {
            return userVOList;
        }

        Set<UserDO> userDOSet = new HashSet<>(userDOList);

        return this.listUserByUsers(userDOSet, userAccount);
    }

    //传入人员和人员列表返回最近的相关人员
    private List<UserVO> listUserByUsers(Set<UserDO> userDOList, String userAccount) {
        List<UserVO> userVOList = new ArrayList<>();
        //2.得到传入人员信息
        UserDO user = userDaoManager.singleResultByUserAccount(userAccount);
        //如果在用户表没查到，就去注册表查一下
        if(user == null){
            UserRegisterDO userRegisterDO = userRegisterDaoManager.singleResultByUserAccount(userAccount);
            if(userRegisterDO != null){
                user = CommonUtils.newInstance(userRegisterDO,UserDO.class);
            }
        }
        //如果找不到传入人员信息,或者没传userAccount则返回所有符合角色的人员
        if (StringUtils.isEmpty(userAccount) || user == null || user.getDeptId() == null) {
            for (UserDO userDO : userDOList) {
                UserVO userVO = CommonUtils.newInstance(userDO, UserVO.class);
                userVOList.add(userVO);
            }
            return userVOList;
        }
        //3.根据角色找到的人员若属于传入人员所在的机构，则就是最近的人员
        for (UserDO u : userDOList) {
            if (u.getDeptId().equals(user.getDeptId())) {
                UserVO vo = CommonUtils.newInstance(u, UserVO.class);
                userVOList.add(vo);
            }
        }
        if (!CollectionUtils.isEmpty(userVOList)) {
            return userVOList;
        }
        //4.若没有找到传入人员所在机构没有对应的角色的人员，则继续往上级机构找
        //找到传入人员所在机构,若找不到传入人员机构信息则返回所有符合角色人员
        DeptDO deptDO = deptDaoManager.getById(user.getDeptId());
        if (deptDO == null) {
            for (UserDO userDO : userDOList) {
                UserVO userVO = CommonUtils.newInstance(userDO, UserVO.class);
                userVOList.add(userVO);
            }
            return userVOList;
        }
        //找到传入人员所在机构的上级机构
        List<DeptDO> listAllDept = deptDaoManager.listAll();
        //装载匹配后的机构
        Set<DeptDO> deptList = new HashSet<>();
        //递归寻找机构的上级机构
        deptManager.getParentDept(deptDO.getPid(), listAllDept, deptList);
        //将机构按上下级排序放在rootDeptList里
        List<DeptTreeVO> rootDeptList = new ArrayList<DeptTreeVO>();
        for (DeptDO dept : deptList) {
            if (deptDO.getPid() == 0L) {
                DeptTreeVO rootTreeVO = CommonUtils.newInstance(dept, DeptTreeVO.class);
                rootTreeVO.setKey(dept.getId().toString());
                rootDeptList.add(rootTreeVO);
                deptManager.buildDeptTreeTable(deptList, rootTreeVO);
            }
        }
        if (CollectionUtils.isEmpty(rootDeptList)) {
            for (UserDO userDO : userDOList) {
                UserVO userVO = CommonUtils.newInstance(userDO, UserVO.class);
                userVOList.add(userVO);
            }
            return userVOList;
        }
        //找到最下级机构
        DeptTreeVO deptTree = new DeptTreeVO();
        for (DeptTreeVO deptTreeVO : rootDeptList) {
            if (!CollectionUtils.isEmpty(deptTreeVO.getChildren())) {
                findChildren(deptTree, deptTreeVO.getChildren());
            } else {
                deptTree = deptTreeVO;
            }
        }
        //deptTree不可能为null,将在最下级机构里的人员返回
        for (UserDO userDO : userDOList) {
            if (deptTree.getId().equals(userDO.getDeptId())) {
                UserVO userVO = CommonUtils.newInstance(userDO, UserVO.class);
                userVOList.add(userVO);
            }
        }

        return userVOList;
    }

    //找到最下级的机构
    private void findChildren(DeptTreeVO deptTree, List<DeptTreeVO> children) {
        for (DeptTreeVO deptTreeVO : children) {
            if (!CollectionUtils.isEmpty(deptTreeVO.getChildren())) {
                findChildren(deptTree, deptTreeVO.getChildren());
            } else {
                deptTree = deptTreeVO;
            }
        }
    }

    //封装构建树的辅助方法
    private TreeVO copyDOToTreeVO(RoleDO roleDO) {

        TreeVO dataTreeVO = new TreeVO();
        dataTreeVO.setId(roleDO.getId());
        dataTreeVO.setLabel(roleDO.getRoleName());
        dataTreeVO.setValue(roleDO.getId() + "-" + roleDO.getRoleName());
        dataTreeVO.setKey(roleDO.getRoleName());
        return dataTreeVO;
    }


    /**
     * 禁用/启用用户
     * <pre>
     *     1.查出用户
     *          如果用户状态为启用则改为禁用
     *          如果用户状态为禁用则改为启用
     * </pre>
     * @param dto
     * @return
     */
    @Override
    @Transactional
    public Boolean disabledUser(IdDTO<Long> dto) {
        UserDO userDO = userDaoManager.getById(dto.getId());
        if(userDO == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"改用户不存在");
        }
        if(userDO.getEnabled() == 0){
            userDO.setEnabled(1);
        }else {
            userDO.setEnabled(0);
        }
        userDaoManager.updateNotNullFieldsByProperty(userDO, UserDO.ID, dto.getId());
        return true;
    }

    /**
     * 解锁用户（包括登录失败多次后的锁定和账号过期）
     * <pre>
     *     1.查出用户
     *          设置用户锁定状态为未锁定，清除登录失败记录
     *          修改用户修改密码时间为当前时间
     * </pre>
     * @param userId
     * @return
     */
    @Override
    @Transactional
    public Integer unlock(Long userId){
        UserDO userDO = userDaoManager.getById(userId);
        if(userDO == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"改用户不存在");
        }
        userDO.setLocked(0);
        //清除失败记录
        loginFailDaoManager.deleteByUserAccount(userDO.getUserAccount());
        userDO.setUpdatePasswordTime(new Date());

        return userDaoManager.updateNotNullProperties(userDO);

    }


    /**
     * 根据用户账号和姓名询用户信息
     * <PRE>
     *     如果账号和姓名为空，查询所有用户
     *     模糊查询
     * </PRE>
     * @param pageListUserInfoForComponentDTO
     * @return
     */
    @Override
    public PageBO<PageListUserInfoForComponentVO> pageListUserInfoForComponent(PageListUserInfoForComponentDTO pageListUserInfoForComponentDTO) {

        //分页查询
        PageBO<UserDO> userDOPageBO = DaoUtils.listDOByPage(() -> {

            //组装查询条件
            List<QueryItemDTO> list = new ArrayList<>(2);

            //用户账号
            if (CommonUtils.isNotBlank(pageListUserInfoForComponentDTO.getUserAccount())) {
                list.add(DaoUtils.buildLike(UserDO.USER_ACCOUNT, "%" + pageListUserInfoForComponentDTO.getUserAccount()+"%"));
            }

            //姓名
            if (CommonUtils.isNotBlank(pageListUserInfoForComponentDTO.getUserName())) {
                list.add(DaoUtils.buildLike(UserDO.USER_NAME, "%" + pageListUserInfoForComponentDTO.getUserName()+"%"));
            }
            return this.userDaoManager.listByQueryItems(list);
        }, pageListUserInfoForComponentDTO);

        //查找部门信息
        Map<Long, DeptDO> deptDOmap = this.deptDaoManager.mapByIds(userDOPageBO.getList(), UserDO::getDeptId);

        //生成VO
        return CommonUtils.convertPageBO(userDOPageBO, userDO -> {
            PageListUserInfoForComponentVO pageListUserInfoForComponentVO = CommonUtils.newInstance(userDO, PageListUserInfoForComponentVO.class);
            //设置部门
            DeptDO deptDO=deptDOmap.get(userDO.getDeptId());
            if(deptDO!=null){
                pageListUserInfoForComponentVO.setDeptCode(deptDO.getDeptCode());
                pageListUserInfoForComponentVO.setDeptName(deptDO.getDeptName());
            }
            return pageListUserInfoForComponentVO;
        });
    }

    @Override
    public List<AreaUserVO> listAreaUserByDeptIdAndRoleCode(ListAreaUserByDeptIdAndRoleCodeDTO listAreaUserByDeptIdAndRoleCodeDTO) {
        List<RoleDO> roleDOList = roleDaoManager.listByInRoleCode(listAreaUserByDeptIdAndRoleCodeDTO.getRoleCodes());

        if (CommonUtils.isEmpty(roleDOList)){
            return new ArrayList<>(0);
        }

        List<UserDO> userDOList = userDaoManager.listByDeptId(listAreaUserByDeptIdAndRoleCodeDTO.getDeptId());

        if (CommonUtils.isEmpty(userDOList)){
            return new ArrayList<>(0);
        }

        List<UserRoleDO> userRoleDOS = this.userRoleDaoManager.listByQueryItems(Lists.newArrayList(
                DaoUtils.buildIn(UserRoleDO.USER_ID, CommonUtils.collection2Set(userDOList, UserDO::getId)),
                DaoUtils.buildIn(UserRoleDO.ROLE_ID, CommonUtils.collection2Set(roleDOList, RoleDO::getId))
        ));

        if (CommonUtils.isEmpty(userRoleDOS)){
            return new ArrayList<>(0);
        }

        Set<Long> userIdSet = CommonUtils.collection2Set(userRoleDOS, UserRoleDO::getUserId);

        return CommonUtils.collection2List(CommonUtils.filter2List(userDOList, userDO -> userIdSet.contains(userDO.getId())), userDO -> {
            AreaUserVO areaUserVO = CommonUtils.newInstance(userDO, AreaUserVO.class);
            areaUserVO.setUserId(userDO.getId());
            return areaUserVO;
        });

    }

}
