package com.lzw.wind.tibmas.webapi.web.controller;


import com.hyzs.gz.common.core.web.controller.BaseController;
import com.hyzs.tibmas.core.dbo.PermDO;
import com.hyzs.tibmas.core.manager.TibmasManager;
import com.hyzs.tibmas.core.vo.PermTreeVO;
import com.hyzs.tibmas2reids.core.bo.Tibmas2RedisUserInfoBO;
import com.hyzs.tibmas2reids.core.manager.Tibmas2RedisManager;
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



    @Autowired
    private Tibmas2RedisManager tibmas2RedisManager;

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


    @RequestMapping("push2Redis")
    public void push2Redis(@RequestBody List<Long> userIds){
        userIds.forEach(id->this.tibmasManager.push2Redis(id));
    }


    @RequestMapping("getUserInfoById")
    public Tibmas2RedisUserInfoBO getUserInfoById(Long userId){
        return this.tibmas2RedisManager.getUserInfo(userId);
    }

    @RequestMapping("getUserInfoByAccount")
    public Tibmas2RedisUserInfoBO getUserInfoByAccount(String account){
        return this.tibmas2RedisManager.getUserInfo(account);
    }

}
