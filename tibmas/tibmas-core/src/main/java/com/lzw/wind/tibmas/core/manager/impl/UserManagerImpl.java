package com.lzw.wind.tibmas.core.manager.impl;

import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.dao.dto.QueryItemDTO;
import com.lzw.common.dao.enums.QueryTypeEnum2;
import com.lzw.common.dao.util.DaoUtils;
import com.lzw.wind.tibmas.core.bo.UserBO;
import com.lzw.wind.tibmas.core.daomanager.*;
import com.lzw.wind.tibmas.core.dbo.*;
import com.lzw.wind.tibmas.core.enums.PermTypeEnum;
import com.lzw.wind.tibmas.core.manager.UserManager;
import com.lzw.wind.tibmas.core.util.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * @author liys
 * @date 2018/3/1311:07
 */
@Component
public class UserManagerImpl implements UserManager {

    @Autowired
    private DeptDaoManager deptDaoManager;

    @Autowired
    private UserRoleDaoManager userRoleDaoManager;

    @Autowired
    private UserDaoManager userDaoManager;

    @Autowired
    private DeptRoleDaoManager deptRoleDaoManager;

    @Autowired
    private RolePermDaoManager rolePermDaoManager;

    @Autowired
    private PermDaoManager permDaoManager;

    @Autowired
    private RoleDaoManager roleDaoManager;


    @Override
    public DeptDO getDeptDOByUserId(Long userId) {
        //通过用户Id查询对应的部门Id
        UserDO userDO = userDaoManager.getById(userId);
        //通过部门Id查询部门信息
        if (userDO == null) return new DeptDO();
        DeptDO deptDO = deptDaoManager.getById(userDO.getDeptId());
        if (deptDO == null) return new DeptDO();
        return deptDO;
    }

    @Override
    public List<RoleDO> listRoleDOByUserId(Long userId) {
        //第一分类：用户直接和角色关联
        List<RoleDO> ownerRole = new ArrayList<>();
        List<UserRoleDO> userRoleDOList = userRoleDaoManager.listByUserId(userId);
        List<RoleDO> roleDOList = roleDaoManager.listByIds(userRoleDOList, UserRoleDO::getRoleId);
        ownerRole.addAll(roleDOList);
        //第二分类：用户和部门角色关联
        DeptDO deptDO = getDeptDOByUserId(userId);
        List<DeptRoleDO> deptRoleDOList = deptRoleDaoManager.listByDeptId(deptDO.getId());
        List<RoleDO> deptRDOList = roleDaoManager.listByIds(deptRoleDOList, DeptRoleDO::getRoleId);
        ownerRole.addAll(deptRDOList);
        return ownerRole;
    }

    @Override
    public List<UserRoleDO> listUserRoleDOByUserId(Long userId) {
        //查询用户拥有的角色信息
        return userRoleDaoManager.listByUserId(userId);
    }

    @Override
    public UserDO getUserDOByLoginAccountInfo(String accountInfo) {
        //默认账号登录
        UserDO userDOAccount = userDaoManager.singleResultByUserAccount(accountInfo);
        if (userDOAccount != null) {
            return userDOAccount;
        }
        //使用邮箱登录
        UserDO userDOEmail = userDaoManager.singleResultByEmail(accountInfo);
        if (userDOEmail != null) {
            return userDOEmail;
        }
        //使用手机号登录
        UserDO userDOPhone = userDaoManager.singleResultByMobileNo(accountInfo);
        if (userDOPhone != null) {
            return userDOPhone;
        }
        //用户不存在
        throw CommonException.exception("用户不存在！", ErrorCode.USER_NOT_FOUND);
    }

    @Override
    public List<PermDO> getAllPermByUserId(Long userId) {
        Date date = new Date();

        //用户权限第一分类：用户从角色关联
        List<UserRoleDO> userRoles = userRoleDaoManager.listByQueryItems(Arrays.asList(
                new QueryItemDTO(UserRoleDO.DB_USER_ID, QueryTypeEnum2.EQUAL_TO, userId),
                new QueryItemDTO(UserRoleDO.DB_END_TIME, QueryTypeEnum2.GREATER_THAN, new Date()),
                new QueryItemDTO(UserRoleDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO, date)));
        Set<Long> userRids = userRoles.stream().map(UserRoleDO::getRoleId).collect(toSet());

        List<RolePermDO> rolePerms = rolePermDaoManager.listByQueryItems(
                Arrays.asList(DaoUtils.buildIn(RolePermDO.DB_ROLE_ID, userRids),
                        new QueryItemDTO(RolePermDO.DB_REL_TYPE, QueryTypeEnum2.EQUAL_TO, 1),
                        new QueryItemDTO(RolePermDO.DB_END_TIME, QueryTypeEnum2.GREATER_THAN, date),
                        new QueryItemDTO(RolePermDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO, date)));
        Set<Long> rolePerIds = rolePerms.stream().map(RolePermDO::getPermId).collect(toSet());

        //用户权限第二分类:用户从部门的角色关联
        DeptDO deptDO = getDeptDOByUserId(userId);
        List<DeptRoleDO> deptRoles = deptRoleDaoManager.listByDeptId(deptDO.getId());
        Set<Long> deptRids = deptRoles.stream().map(DeptRoleDO::getRoleId).collect(toSet());

        List<RolePermDO> deptRolePerms = rolePermDaoManager.listByQueryItems(Arrays.asList(DaoUtils.buildIn(RolePermDO.DB_ROLE_ID, deptRids),
                new QueryItemDTO(RolePermDO.DB_REL_TYPE, QueryTypeEnum2.EQUAL_TO, 1),
                new QueryItemDTO(RolePermDO.DB_END_TIME, QueryTypeEnum2.GREATER_THAN, date),
                new QueryItemDTO(RolePermDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO, date)));
        Set<Long> deptRolePids = deptRolePerms.stream().map(RolePermDO::getPermId).collect(toSet());

        //两类中分类权限ID去重
        Set<Long> perIds = new HashSet<>();
        perIds.addAll(rolePerIds);
        perIds.addAll(deptRolePids);

        //根据用户拥有的权限ID查询权限信息
        return permDaoManager.listByQueryItems(Arrays.asList(DaoUtils.buildIn(PermDO.DB_ID, perIds),
                new QueryItemDTO(PermDO.DB_ENABLE_STATUS, QueryTypeEnum2.EQUAL_TO, 0)));
    }

    /**
     * 用户从角色关联权限
     *
     * @param userId
     * @return
     */
    @Override
    public Set<Long> getRolePerms(Long userId) {
        Date date = new Date();
        List<UserRoleDO> userRoles = userRoleDaoManager.listByQueryItems(Arrays.asList(
                new QueryItemDTO(UserRoleDO.DB_USER_ID, QueryTypeEnum2.EQUAL_TO, userId),
                new QueryItemDTO(UserRoleDO.DB_END_TIME, QueryTypeEnum2.GREATER_THAN, new Date()),
                new QueryItemDTO(UserRoleDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO, date)));
        Set<Long> userRids = userRoles.stream().map(UserRoleDO::getRoleId).collect(toSet());

        List<RolePermDO> rolePerms = rolePermDaoManager.listByQueryItems(
                Arrays.asList(DaoUtils.buildIn(RolePermDO.DB_ROLE_ID, userRids),
                        new QueryItemDTO(RolePermDO.DB_REL_TYPE, QueryTypeEnum2.EQUAL_TO, 1),
                        new QueryItemDTO(RolePermDO.DB_END_TIME, QueryTypeEnum2.GREATER_THAN, date),
                        new QueryItemDTO(RolePermDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO, date)));
        Set<Long> rolePerIds = rolePerms.stream().map(RolePermDO::getPermId).collect(toSet());
        return rolePerIds;
    }

    @Override
    public List<PermDO> getAllPermByUserIdAndAppId(Long userId, Long appId) {
        List<PermDO> ownerPerms;
        /*TibmasUserDetails userDetails = this.getUserInfo();
        //如果是admin则返回所有权限
        if("admin".equals(userDetails.getOauth2UserBO().getUserAccount())){
        //if(true){//暂时全放开
            ownerPerms = permDaoManager.listAll().stream()
                    .filter(e-> appId.equals(e.getAppId()))
                    .collect(toList());
            return ownerPerms;
        }*/
        //通过用户id和应用id查询权限
        List<PermDO> perms = getAllPermByUserId(userId);
        ownerPerms = perms.stream().filter(e -> appId.equals(e.getAppId())).collect(toList());
        return ownerPerms;
    }

    @Override
    public List<PermDO> getAllMenuByUserIdAndAppId(Long userId, Long appId) {
        List<PermDO> ownerMenus;

        //如果是admin则返回所有权限
        UserDO userDO = userDaoManager.getById(userId);
        if(userDO != null && "admin".equals(userDO.getUserAccount())){
            ownerMenus = permDaoManager.listAll().stream()
                    .filter(e->appId.equals(e.getAppId()))
                    .collect(Collectors.toList());
            return ownerMenus;
        }
        //通过用户id和应用id查询权限
        List<PermDO> perms = getAllPermByUserId(userId);
        ownerMenus = perms.stream().filter(e -> appId.equals(e.getAppId()) && (!PermTypeEnum.OPERATOR.code.equals(e.getPermType()))).collect(toList());
        return ownerMenus;
    }

    @Override
    public List<UserBO> listUserByRoleId(Long roleId) {

        //拥有该角色的人员
        List<UserRoleDO> userRoleDOList = userRoleDaoManager.listByRoleId(roleId);
        List<UserDO> userDOList = userDaoManager.listByIds(userRoleDOList, UserRoleDO::getUserId);

        List<UserBO> userBOList = ListUserDO2ListUserBO(userDOList);
        return userBOList;
    }

    @Override
    public List<UserBO> ListUserDO2ListUserBO(List<UserDO> userDOList) {
        List<UserBO> userBOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(userDOList)) {
            Map<Long, DeptDO> longDeptDOMap = this.deptDaoManager.mapByIds(userDOList, UserDO::getDeptId);
            for (UserDO userDO : userDOList) {
                UserBO userBO = CommonUtils.newInstance(userDO, UserBO.class);
                userBO.setDeptName(longDeptDOMap.get(userDO.getDeptId()).getDeptName());
                userBOList.add(userBO);
            }
        }
        return userBOList;
    }

    @Override
    public Set<UserDO> listUserByRole(List<String> codeList) {
        Set<UserDO> userDOList = new HashSet<>();
        if (CollectionUtils.isEmpty(codeList)) {
            return userDOList;
        }
        //得到角色
        List<RoleDO> roleDOLst = roleDaoManager.listByInRoleCode(codeList);
        if (CollectionUtils.isEmpty(roleDOLst)) {
            return userDOList;
        }
        //得到直接拥有该角色的用户
        List<UserRoleDO> userRoleDOList = userRoleDaoManager.listByInRoleId(roleDOLst.stream().map(RoleDO::getId).collect(toList()));
        if (!CollectionUtils.isEmpty(userRoleDOList)) {
            List<UserDO> users = userDaoManager.listByIds(userRoleDOList.stream().map(UserRoleDO::getUserId).collect(toList()));
            if (!CollectionUtils.isEmpty(users)) {
                for (UserDO user : users) {
                    userDOList.add(user);
                }
            }
        }

        //得到通过部门关联该角色的用户
        List<DeptRoleDO> deptRoleDOList = deptRoleDaoManager.listByInRoleId(roleDOLst.stream().map(RoleDO::getId).collect(toList()));
        if (!CollectionUtils.isEmpty(deptRoleDOList)) {
            List<UserDO> users = userDaoManager.listByInDeptId(deptRoleDOList.stream().map(DeptRoleDO::getDeptId).collect(toList()));
            if (!CollectionUtils.isEmpty(users)) {
                for (UserDO user : users) {
                    userDOList.add(user);
                }
            }
        }

        return userDOList;
    }

}
