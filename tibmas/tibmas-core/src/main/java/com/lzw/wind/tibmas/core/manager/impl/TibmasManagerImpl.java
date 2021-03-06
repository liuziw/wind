package com.lzw.wind.tibmas.core.manager.impl;

import com.google.common.collect.Lists;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.dao.dto.QueryItemDTO;
import com.lzw.common.dao.enums.QueryTypeEnum2;
import com.lzw.common.dao.util.DaoUtils;
import com.lzw.wind.tibmas.core.bo.ListPermInfoByUserIdAndAppIdBO;
import com.lzw.wind.tibmas.core.daomanager.*;
import com.lzw.wind.tibmas.core.dbo.*;
import com.lzw.wind.tibmas.core.enums.IsExtendEnum;
import com.lzw.wind.tibmas.core.enums.PermTypeEnum;
import com.lzw.wind.tibmas.core.manager.TibmasManager;
import com.lzw.wind.tibmas.core.vo.PermTreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class TibmasManagerImpl implements TibmasManager {


    @Autowired
    private DeptRoleDaoManager deptRoleDaoManager;


    @Autowired
    private DeptDaoManager deptDaoManager;


    @Autowired
    private RoleDaoManager roleDaoManager;


    @Autowired
    private UserDaoManager userDaoManager;


    @Autowired
    private UserRoleDaoManager userRoleDaoManager;


    @Autowired
    private PermDaoManager permDaoManager;


    @Autowired
    private RolePermDaoManager rolePermDaoManager;


    @Autowired
    private TeamDaoManager teamDaoManager;

    @Autowired
    private TeamUserDaoManager teamUserDaoManager;


    @Autowired
    private AreaDaoManager areaDaoManager;


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 找部门对应的角色
     * <PRE>
     *      包含自己及父级部门可继承的角色
     *          1.找出自身父级的部门ID
     *          2.根据第一步找出的部门ID查询dept_role表
     *          3.数据过滤
     *                 1.自己的角色
     *                 2.父级可继承的角色
     * </PRE>
     * @param deptId
     * @return
     */
    @Override
    public Set<Long> listAllRoleIdByDeptId(Long deptId) {
        //部门ID，包含自身及父节点
        Set<Long> deptIds=new HashSet<>();
        DeptDO deptDO=this.deptDaoManager.getById(deptId);
        if(deptDO==null){
            throw CommonException.paramException("没有找到部门:"+deptId);
        }
        //找父级ID
        do{
            if(deptDO.getPid()==null || deptDO.getPid()<=0L){
                //根节点
                break;
            }
            deptIds.add(deptDO.getPid());
            deptDO=this.deptDaoManager.getById(deptDO.getPid());
        }
        while(true);

        deptIds.add(deptId);

        //从数据库里找出所有部门对应的角色
        List<DeptRoleDO> deptRoleDOS = deptRoleDaoManager.listByQueryItems(Arrays.asList(
                DaoUtils.buildIn(DeptRoleDO.DEPT_ID, deptIds),
                new QueryItemDTO(DeptRoleDO.END_TIME, QueryTypeEnum2.GREATER_THAN, new Date()),
                new QueryItemDTO(DeptRoleDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO, new Date()),
                new QueryItemDTO(DeptRoleDO.DB_IS_DELETED, QueryTypeEnum2.EQUAL_TO, 0)
        ));

        if(CommonUtils.isEmpty(deptRoleDOS)){
            return new HashSet<>();
        }

        //找出所有的角色
        Map<Long, RoleDO> roleDOMap = this.roleDaoManager.mapByIds(deptRoleDOS, DeptRoleDO::getRoleId);

        Set<DeptRoleDO> ownRoles = CommonUtils.filter2Set(deptRoleDOS, deptRoleDO -> {
            if (CommonUtils.equals(deptRoleDO.getDeptId(), deptId)) {
                //直接分配到该部门的角色
                return true;
            }

            //父节点，如果是可以继承的，也算
            RoleDO roleDO = roleDOMap.get(deptRoleDO.getRoleId());
            if (roleDO != null && CommonUtils.equals(roleDO.getIsExtend(), IsExtendEnum.YES.code)) {
                //可以继承
                return true;
            }
            return false;

        });
        return CommonUtils.collection2Set(ownRoles,DeptRoleDO::getRoleId);
    }


    /**
     * <PRE>
     *     1.找出部门的角色
     *     2.找出自身的角色
     * </PRE>
     * @param userId
     * @return
     */
    @Override
    public Set<Long> listAllRoleIdByUserId(Long userId) {
        UserDO userDO = this.userDaoManager.getById(userId);
        if(userDO==null){
            throw CommonException.paramException("没有找到用户信息:"+userId);
        }

        //部门的角色
        Set<Long> deptRoleId = this.listAllRoleIdByDeptId(userDO.getDeptId());

        //自身的角色
        List<UserRoleDO> userRoleDOS = this.userRoleDaoManager.listByQueryItems(Arrays.asList(
                DaoUtils.buildEqualTo(UserRoleDO.DB_USER_ID, userId),
                new QueryItemDTO(UserRoleDO.END_TIME, QueryTypeEnum2.GREATER_THAN, new Date()),
                new QueryItemDTO(UserRoleDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO, new Date()),
                new QueryItemDTO(UserRoleDO.DB_IS_DELETED, QueryTypeEnum2.EQUAL_TO, 0)
        ));
        //部门的和自身的加起来
        Set<Long> list = CommonUtils.collection2Set(userRoleDOS, UserRoleDO::getRoleId);
        list.addAll(deptRoleId);
        return list;
    }


    /**
     * 根据用户和应用，查询用户在该appId下对应的权限
     * <PRE>
     *     目前的规则只通过角色找权限
     * </PRE>
     * @param userId
     * @param appId
     * @return
     */
    @Override
    public List<PermDO> listPermDOByUserIdAndAppId(Long userId, Long appId) {
        //找出所有的角色
        Set<Long> roleIdSet = this.listAllRoleIdByUserId(userId);
        return this.listPermDOByRoleIdsAndAppId(roleIdSet,appId);

    }


    /**
     * 根据角色获取权限，并根据appId过滤
     * @param roleIdSet
     * @param appId
     * @return
     */
    public List<PermDO> listPermDOByRoleIdsAndAppId(Collection<Long> roleIdSet, Long appId) {
        List<PermDO> permDOS = this.listPermDOByRoleIds(roleIdSet);
        //过滤
        List<PermDO> list = CommonUtils.filter2List(permDOS, permDO -> CommonUtils.equals(permDO.getAppId(), appId));
        //排序
        CommonUtils.sortBySeq(list,true);

        return list;
    }

    public List<PermDO> listPermDOByRoleIds(Collection<Long> roleIdSet){
        Set<Long> permIds=new HashSet<>();
        if(CommonUtils.isNotEmpty(roleIdSet)){
            List<RolePermDO> rolePermDOS = this.rolePermDaoManager.listByQueryItems(Arrays.asList(
                    DaoUtils.buildIn(RolePermDO.ROLE_ID, roleIdSet),
                    new QueryItemDTO(RolePermDO.END_TIME, QueryTypeEnum2.GREATER_THAN, new Date()),
                    new QueryItemDTO(RolePermDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO, new Date()),
                    new QueryItemDTO(RolePermDO.DB_IS_DELETED, QueryTypeEnum2.EQUAL_TO, 0)
            ));

            permIds.addAll(CommonUtils.collection2Set(rolePermDOS,RolePermDO::getPermId));
        }

        if(CommonUtils.isEmpty(permIds)){
            return new ArrayList<>();
        }
        List<PermDO> permDOS = this.permDaoManager.listByIds(permIds);
        CommonUtils.sortBySeq(permDOS,true);
        return permDOS;
    }


    @Override
    public List<PermTreeVO> listPermTreeByUserIdAndAppId(Long userId, Long appId) {
        return this.listPermInfoByUserIdAndAppIdBO(userId,appId).getPermTreeVOS();
    }


    @Override
    public ListPermInfoByUserIdAndAppIdBO listPermInfoByUserIdAndAppIdBO(Long userId, Long appId) {


        //找出角色
        Set<Long> roleIdSet = this.listAllRoleIdByUserId(userId);

        //找出所有的权限
        List<PermDO> permDOS = this.listPermDOByRoleIdsAndAppId(roleIdSet,appId);

        List<PermDO> menuPerms = CommonUtils.filter2List(permDOS, permDO -> CommonUtils.equals(permDO.getPermType(), PermTypeEnum.DIRECTORY.code) || CommonUtils.equals(permDO.getPermType(), PermTypeEnum.MENU.code));

        //返回的list
        List<PermTreeVO> list=new ArrayList<>();

        Map<Long, PermTreeVO> treeVOMap = CommonUtils.mapping(CommonUtils.collection2List(permDOS, permDO -> CommonUtils.newInstance(permDO, PermTreeVO.class)), PermTreeVO::getId);


        //挂到树上的节点上去
        for(PermDO permDO:menuPerms){
            PermTreeVO permTreeVO = treeVOMap.get(permDO.getId());
            permTreeVO.setKey(permTreeVO.getId().toString());

            //找父节点
            Long pid = permTreeVO.getPid();
            if(pid==null || pid<=0L){
                //根节点
                list.add(permTreeVO);
            }
            else{
                PermTreeVO parent = treeVOMap.get(pid);
                if(parent.getChildren()==null){
                    parent.setChildren(new ArrayList<>());
                }
                parent.getChildren().add(permTreeVO);
            }

        }

        ListPermInfoByUserIdAndAppIdBO listPermInfoByUserIdAndAppIdBO=new ListPermInfoByUserIdAndAppIdBO();
        listPermInfoByUserIdAndAppIdBO.setPermTreeVOS(list);
        listPermInfoByUserIdAndAppIdBO.setOptrPermList(CommonUtils.filter2List(permDOS, permDO -> !CommonUtils.equals(permDO.getPermType(), PermTypeEnum.DIRECTORY.code) &&!CommonUtils.equals(permDO.getPermType(), PermTypeEnum.MENU.code)));
        listPermInfoByUserIdAndAppIdBO.setRoleDOList(this.roleDaoManager.listByIds(roleIdSet));
        return listPermInfoByUserIdAndAppIdBO;
    }


    @Override
    public List<UserDO> findCloseUserByUserAndUserId(Long userId, Long roleId) {

        Long resultUserId = null;
        Long tmpUserId = userId;
        do {
            UserDO userDO = this.userDaoManager.getById(tmpUserId);
            if (userDO == null || userDO.getLeaderId() == null || userDO.getLeaderId() <= 0){
                break;
            }
            Long leaderId = userDO.getLeaderId();
            UserRoleDO userRoleDO = this.userRoleDaoManager.singleResultByProperties(new String[]{"userId","roleId"}, new Object[]{leaderId, roleId});
            if (userRoleDO != null){
                resultUserId = this.userDaoManager.getById(leaderId).getId();
                return Lists.newArrayList(this.userDaoManager.getById(resultUserId));
            }

            tmpUserId = leaderId;
        }while (true);

        //找到这个角色下所有的人
        //一般情况下不会有太多
        List<UserRoleDO> userRoleDOS = this.userRoleDaoManager.listByRoleId(roleId);
        List<UserDO> userDOS = this.userDaoManager.listByIds(userRoleDOS, UserRoleDO::getUserId);

        //没有找到
        if(CommonUtils.isEmpty(userDOS)){
            return new ArrayList<>(0);
        }
        List<UserDO> list=new ArrayList<>();
        //就是从userDOS里找
        //所有的部门
        List<DeptDO> deptDOS = this.listAllDeptByUserId(userId);

        boolean found=false;
        //一层一层找
        for(DeptDO deptDO:deptDOS){ //部门
            for(UserDO userDO:userDOS) { //用户
                if(CommonUtils.equals(userId,userDO.getId())){
                    //跳过自己
                }
                if (!found) {
                    if (CommonUtils.equals(deptDO.getId(), userDO.getDeptId())) {
                        //部门相同
                        list.add(userDO);
                        found=true;
                    }
                }
            }
        }

        if(CommonUtils.isEmpty(list)){
            //没有找到
            return new ArrayList<>(0);
        }
        if(list.size()==1){
            //只有一个，不用再找了
            return list;
        }

        //如果有多个，从团队中再过滤一次，找team表中handleUserId

        //找出用户所有的团队
        List<TeamUserDO> teamUserDOList = this.teamUserDaoManager.listByUserId(userId);
        if(CommonUtils.isEmpty(teamUserDOList)){
            //用户没有加入团队
            return list;
        }
        List<TeamDO> teamDOS = this.teamDaoManager.listByIds(teamUserDOList, TeamUserDO::getTeamId);
        //所有的片长
        Set<Long> handleId = CommonUtils.collection2Set(teamDOS, TeamDO::getTeamHandleId);

        List<UserDO> handleUserDOList=new ArrayList<>(list.size());
        for(UserDO userDO:list){
            if(handleId.contains(userDO.getId())){
                handleUserDOList.add(userDO);
            }
        }
        return CommonUtils.isEmpty(handleUserDOList)?list:handleUserDOList;
    }

    /**
     * 根据用户ID找部门，包含上级部门
     * @param userId
     * @return
     */
    protected List<DeptDO> listAllDeptByUserId(Long userId){
        UserDO userDO = this.userDaoManager.getById(userId);
        List<DeptDO> list=new ArrayList<>();
        Long deptId=userDO.getDeptId();
        do{
            DeptDO deptDO = this.deptDaoManager.getById(deptId);
            if(deptDO==null){
                continue;
            }
            list.add(deptDO);
            deptId=deptDO.getPid();
        }while(deptId!=null && deptId>0);
        return list;
    }



}
