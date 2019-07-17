package com.lzw.wind.tibmas.core.manager;

import com.lzw.common.core.exception.CommonException;
import com.lzw.wind.tibmas.core.bo.UserBO;
import com.lzw.wind.tibmas.core.dbo.*;

import java.util.List;
import java.util.Set;

/**
 * @author liys
 * @date 2018/3/139:16
 */
public interface UserManager {

    /**
     * 获取用户对应的部门
     *
     * @param userId
     * @return
     */
    public DeptDO getDeptDOByUserId(Long userId);


    /**
     * 获取用户拥有的角色
     *
     * @param userId
     * @return
     */
    public List<RoleDO> listRoleDOByUserId(Long userId);


    /**
     * 获取用户对应的角色
     *
     * @param userId
     * @return
     */
    public List<UserRoleDO> listUserRoleDOByUserId(Long userId);


    /**
     * 登陆信息查询
     *
     * @param accountInfo 账号、手机、email等
     * @return
     */
    public UserDO getUserDOByLoginAccountInfo(String accountInfo) throws CommonException;


    /**
     * 获取用户所有的权限
     *
     * @param userId
     * @return
     */
    public List<PermDO> getAllPermByUserId(Long userId);

    /**
     * 获取用户对应的当前应用程序的所有权限
     *
     * @param userId
     * @param appId
     * @return
     */
    public List<PermDO> getAllPermByUserIdAndAppId(Long userId, Long appId);


    /**
     * 获取用户对应应用的所用菜单
     *
     * @param userId
     * @param appId
     * @return
     */
    public List<PermDO> getAllMenuByUserIdAndAppId(Long userId, Long appId);

    /**
     * 根据角色id获取拥有该角色的人员
     *
     * @param roleId
     * @return
     */
    public List<UserBO> listUserByRoleId(Long roleId);

    public List<UserBO> ListUserDO2ListUserBO(List<UserDO> userDOList);

    /**
     * 用户从角色关联权限
     *
     * @param userId
     * @return
     */
    Set<Long> getRolePerms(Long userId);

    /**
     * 通过角色编码得到拥有该角色的用户
     *
     * @param codeList
     * @return
     */
    Set<UserDO> listUserByRole(List<String> codeList);

}
