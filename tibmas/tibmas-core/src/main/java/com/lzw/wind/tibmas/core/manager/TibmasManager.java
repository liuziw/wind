package com.lzw.wind.tibmas.core.manager;


import com.lzw.wind.tibmas.core.bo.ListPermInfoByUserIdAndAppIdBO;
import com.lzw.wind.tibmas.core.dbo.PermDO;
import com.lzw.wind.tibmas.core.dbo.UserDO;
import com.lzw.wind.tibmas.core.vo.PermTreeVO;

import java.util.List;
import java.util.Set;

/**
 * 定义了一些经常使用的核心方法
 */
public interface TibmasManager {


    /**
     * 根据部门id获取部门的角色信息
     * @param deptId
     * @return
     */
    public Set<Long> listAllRoleIdByDeptId(Long deptId);


    /**
     * 根据用户id获取用户角色信息
     * @param userId
     * @return
     */
    public Set<Long> listAllRoleIdByUserId(Long userId);


    /**
     * 找到角色所有的权限
     * @param userId
     * @param appId
     * @return
     */
    public List<PermDO> listPermDOByUserIdAndAppId(Long userId, Long appId);


    /**
     * 根据用户和应用找菜单树
     * @param userId
     * @param appId
     * @return
     */
    public List<PermTreeVO> listPermTreeByUserIdAndAppId(Long userId, Long appId);



    public ListPermInfoByUserIdAndAppIdBO listPermInfoByUserIdAndAppIdBO(Long userId, Long appId);


    /**
     * 根据用户ID和角色找最亲的人
     * @param userId
     * @param roleId
     * @return
     */
    public List<UserDO> findCloseUserByUserAndUserId(Long userId, Long roleId);




}
