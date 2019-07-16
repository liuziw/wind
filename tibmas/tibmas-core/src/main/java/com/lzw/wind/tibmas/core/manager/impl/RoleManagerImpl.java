package com.lzw.wind.tibmas.core.manager.impl;

import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.dao.dto.QueryItemDTO;
import com.hyzs.gz.common.dao.enums.QueryTypeEnum2;
import com.hyzs.gz.common.dao.util.DaoUtils;
import com.hyzs.tibmas.core.bo.RoleBO;
import com.hyzs.tibmas.core.daomanager.AppDaoManager;
import com.hyzs.tibmas.core.daomanager.RoleDaoManager;
import com.hyzs.tibmas.core.daomanager.RolePermDaoManager;
import com.hyzs.tibmas.core.dbo.AppDO;
import com.hyzs.tibmas.core.dbo.RoleDO;
import com.hyzs.tibmas.core.dbo.RolePermDO;
import com.hyzs.tibmas.core.enums.RoleTypeEnum;
import com.hyzs.tibmas.core.manager.RoleManager;
import com.hyzs.tibmas.core.vo.AppRoleVO;
import com.hyzs.tibmas.core.vo.RoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author liys
 * @date 2018/3/1311:06
 */
@Component
public class RoleManagerImpl implements RoleManager {

    @Autowired
    private RolePermDaoManager rolePermDaoManager;

    @Autowired
    private RoleDaoManager roleDaoManager;

    @Autowired
    private AppDaoManager appDaoManager;

    @Override
    public List<RolePermDO> listRolePermDOByRoleId(Long... roleId) {
        return rolePermDaoManager.listByQueryItems(Arrays.asList(DaoUtils.buildIn(RolePermDO.DB_ROLE_ID,roleId),
                new QueryItemDTO(RolePermDO.DB_REL_TYPE, QueryTypeEnum2.EQUAL_TO,1),
                new QueryItemDTO(RolePermDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO,new Date()),
                new QueryItemDTO(RolePermDO.DB_END_TIME, QueryTypeEnum2.GREATER_THAN,new Date()),
                new QueryItemDTO(RolePermDO.DB_IS_DELETED, QueryTypeEnum2.EQUAL_TO,0)));
    }

    @Override
    public List<RolePermDO> listRolePermDOByRoleId(Collection<Long> roleIds) {
        return rolePermDaoManager.listByQueryItems(Arrays.asList(DaoUtils.buildIn(RolePermDO.DB_ROLE_ID,roleIds),
                new QueryItemDTO(RolePermDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO,new Date()),
                new QueryItemDTO(RolePermDO.DB_END_TIME, QueryTypeEnum2.GREATER_THAN,new Date()),
                new QueryItemDTO(RolePermDO.DB_REL_TYPE, QueryTypeEnum2.EQUAL_TO,1),
                new QueryItemDTO(RolePermDO.DB_IS_DELETED, QueryTypeEnum2.EQUAL_TO,0)));
    }

    @Override
    public <T> List<RolePermDO> listRolePermDOByRoleId(Collection<T> roleIds, Function<T, Long> mapper) {
        return listRolePermDOByRoleId(roleIds.stream().map(mapper).collect(Collectors.toList()));
    }

    @Override
    public List<RoleBO> listRoleDO2ListRoleBO(List<RoleDO> roleDOList){
        List<RoleBO> roleBOList  = new ArrayList<>();
        if(!CollectionUtils.isEmpty(roleDOList)){
            for(RoleDO roleDO:roleDOList){
                RoleBO roleBO = CommonUtils.newInstance(roleDO,RoleBO.class);
                if(roleDO.getRoleType()!=null){
                    roleBO.setRoleTypeName(RoleTypeEnum.valueOfByCode(roleDO.getRoleType())!=null? RoleTypeEnum.valueOfByCode(roleDO.getRoleType()).desc:"");
                }
                roleBOList.add(roleBO);
            }
        }
        return roleBOList;
    }

    @Override
    public List<AppRoleVO> listAppRoleVO() {
        //所有的角色
        List<RoleDO> list=this.roleDaoManager.listAll();
        if(CollectionUtils.isEmpty(list)){
            return new ArrayList<>();
        }

        List<Long> appIds = list.stream().map(RoleDO::getAppId).collect(toList());
        Map<Long,AppDO> appDOMap = appDaoManager.mapByIds(appIds);
        //将role根据appId分组
        Map<Long,List<RoleDO>> appRoleMap = list.stream().collect(Collectors.groupingBy(roleDO->roleDO.getAppId()==null?0L:roleDO.getAppId()));
        if(CollectionUtils.isEmpty(appDOMap) || CollectionUtils.isEmpty(appRoleMap)){
            return new ArrayList<>();
        }

        List<AppRoleVO> appRoleVOList = new ArrayList<>();
        appRoleMap.forEach((k,v) -> {
            AppRoleVO appRoleVO=new AppRoleVO();
            AppDO appDO = appDOMap.get(k);
            if(appDO==null){
                appRoleVO.setId(0L);
                appRoleVO.setAppName("未分配应用角色");
            }
            else{
                appRoleVO.setId(appDO.getId());
                appRoleVO.setAppName(appDO.getAppName());
            }

            appRoleVO.setRoleVOList(CommonUtils.collection2List(v, roleDO-> CommonUtils.newInstance(roleDO,RoleVO.class)));
            appRoleVOList.add(appRoleVO);
        });

        return appRoleVOList;
    }
}
