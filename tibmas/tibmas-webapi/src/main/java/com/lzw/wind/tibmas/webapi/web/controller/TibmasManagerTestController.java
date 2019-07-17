package com.lzw.wind.tibmas.webapi.web.controller;


import com.lzw.common.core.web.controller.BaseController;
import com.lzw.wind.tibmas.core.dbo.PermDO;
import com.lzw.wind.tibmas.core.manager.TibmasManager;
import com.lzw.wind.tibmas.core.vo.PermTreeVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/tibmas-manager/test",method = RequestMethod.POST)
@Api("测试用的，liyinshan")
public class TibmasManagerTestController extends BaseController {


    @Autowired
    private TibmasManager tibmasManager;


    /**
     * 根据部门id获取部门的角色信息
     * @param deptId
     * @return
     */
    @RequestMapping("listAllRoleIdByDeptId")
    public Set<Long> listAllRoleIdByDeptId(Long deptId){
        return this.tibmasManager.listAllRoleIdByDeptId(deptId);
    }


    /**
     * 根据用户id获取用户角色信息
     * @param userId
     * @return
     */
    @RequestMapping("listAllRoleIdByUserId")
    public Set<Long> listAllRoleIdByUserId(Long userId){
        return this.tibmasManager.listAllRoleIdByUserId(userId);
    }


    /**
     * 找到角色所有的权限
     * @param userId
     * @param appId
     * @return
     */
    @RequestMapping("listPermDOByUserIdAndAppId")
    public List<PermDO> listPermDOByUserIdAndAppId(Long userId, Long appId){
        return this.tibmasManager.listPermDOByUserIdAndAppId(userId,appId);
    }


    /**
     * 根据用户和应用找菜单树
     * @param userId
     * @param appId
     * @return
     */
    @RequestMapping("listPermTreeByUserIdAndAppId")
    public List<PermTreeVO> listPermTreeByUserIdAndAppId(Long userId, Long appId){
        return this.tibmasManager.listPermTreeByUserIdAndAppId(userId,appId);
    }


}
