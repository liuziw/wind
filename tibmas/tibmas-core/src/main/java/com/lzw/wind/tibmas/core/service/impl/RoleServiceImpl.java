package com.lzw.wind.tibmas.core.service.impl;

import com.google.common.collect.Lists;
import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.dao.dto.QueryItemDTO;
import com.hyzs.gz.common.dao.util.DaoUtils;
import com.hyzs.tibmas.core.bo.*;
import com.hyzs.tibmas.core.daomanager.*;
import com.hyzs.tibmas.core.dbo.*;
import com.hyzs.tibmas.core.dto.*;
import com.hyzs.tibmas.core.enums.RelTypeEnum;
import com.hyzs.tibmas.core.enums.RoleTypeEnum;
import com.hyzs.tibmas.core.manager.DeptManager;
import com.hyzs.tibmas.core.manager.Info2KafkaManager;
import com.hyzs.tibmas.core.manager.PermManager;
import com.hyzs.tibmas.core.manager.UserManager;
import com.hyzs.tibmas.core.service.RoleService;
import com.hyzs.tibmas.core.vo.PageListRoleInfoForComponentVO;
import com.hyzs.tibmas.core.vo.PermTreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by kjtang on 2018/3/16 0016.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDaoManager roleDaoManager;
    @Autowired
    private RolePermDaoManager rolePermDaoManager;
    @Autowired
    private DeptRoleDaoManager deptRoleDaoManager;
    @Autowired
    private PermDaoManager permDaoManager;
    @Autowired
    private UserRoleDaoManager userRoleDaoManager;
    @Autowired
    DeptDaoManager deptDaoManager;
    @Autowired
    private PermManager permManager;
    @Autowired
    private UserManager userManager;
    @Autowired
    private DeptManager deptManager;
    @Autowired
    private Info2KafkaManager info2KafkaManager;
    @Autowired
    private AppDaoManager appDaoManager;


    @Transactional
    @Override
    public Integer insert(AddRoleDTO dto) {
        RoleDO roleDO = CommonUtils.newInstance(dto,RoleDO.class);
        //1.验证角色名称是否合法
        Integer count = roleDaoManager.countByRoleName(roleDO.getRoleName());
        if (count > 0)
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该角色名称已经存在");
        //2.验证角色编码是否合法
        count = roleDaoManager.countByRoleCode(roleDO.getRoleCode());
        if (count > 0)
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该角色编码已经存在");
        int res = roleDaoManager.insertNotNullProperties(roleDO);
        if (res > 0) {
            //新增后，往kafka发消息
            info2KafkaManager.addRole(roleDO);
        }

        return res;
    }

    @Transactional
    @Override
    public Integer updateById(UpdateRoleDTO dto) {
        RoleDO roleDO = CommonUtils.newInstance(dto,RoleDO.class);
        //1.验证角色名称的合法性

        RoleDO dbRoleDO = roleDaoManager.singleResultByRoleName(roleDO.getRoleName());
        if (dbRoleDO != null && !dbRoleDO.getId().equals(roleDO.getId()))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该角色名称已经存在");
        //2.验证角色编码是否合法
        dbRoleDO = roleDaoManager.singleResultByRoleCode(roleDO.getRoleCode());
        if (dbRoleDO != null && !dbRoleDO.getId().equals(roleDO.getId()))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该角色编码已经存在");
        int res = roleDaoManager.updateNotNullProperties(roleDO);
        if (res > 0) {
            info2KafkaManager.updateRole(roleDO);
        }
        return res;
    }

    @Transactional
    @Override
    public Integer deleteById(Long id) {
        //验证该角色是否已经被用户使用
        if (userRoleDaoManager.countByRoleId(id) > 0) {
            //throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该角色已经使用不能删除");
            userRoleDaoManager.deleteByRoleId(id);
        }
        //验证机构角色
        if (deptRoleDaoManager.countByRoleId(id) > 0) {
            deptRoleDaoManager.deleteByRoleId(id);
        }
        //验证角色权限
        if (rolePermDaoManager.countByRoleId(id) > 0) {
            rolePermDaoManager.deleteByRoleId(id);
        }
        int res = roleDaoManager.deleteById(id);
        if (res > 0) {
            RoleDO roleDO = roleDaoManager.getById(id);
            info2KafkaManager.deleteRole(roleDO);
        }
        return res;
    }

    @Transactional
    @Override
    public Integer deleteByIds(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids))
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "没有要删除的角色Id");
        for (Long id : ids) {
            //验证该角色是否已经被用户使用
            if (userRoleDaoManager.countByRoleId(id) > 0) {
                //throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该角色已经使用不能删除");
                userRoleDaoManager.deleteByRoleId(id);
            }
            //验证机构角色
            if (deptRoleDaoManager.countByRoleId(id) > 0) {
                deptRoleDaoManager.deleteByRoleId(id);
            }
            //验证角色权限
            if (rolePermDaoManager.countByRoleId(id) > 0) {
                rolePermDaoManager.deleteByRoleId(id);
            }
        }
        int res = roleDaoManager.deleteByIds(ids);
        if (res > 0) {
            List<RoleDO> roleDOS = roleDaoManager.listByIds(ids);
            for (RoleDO roleDO : roleDOS) {
                info2KafkaManager.deleteRole(roleDO);
            }
        }

        return res;
    }

    @Override
    public TibmasRoleBO getById(Long id) {
        RoleDO roleDO = roleDaoManager.getById(id);
        if (roleDO == null)
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该角色信息不存在");
        TibmasRoleBO tibmasRoleBO = CommonUtils.newInstance(roleDO, TibmasRoleBO.class);
        return tibmasRoleBO;
    }

    @Override
    public PageBO<RoleBO> listQuery(ListQueryRoleDTO listQueryRoleDTO) {
        //通过角色名称模糊查询
        PageBO<RoleDO> pageRoleDO;
        List<QueryItemDTO> conditions = new ArrayList<>();
        if (listQueryRoleDTO.getRoleName() != null) {
            conditions.add(DaoUtils.buildLike(RoleDO.DB_ROLE_NAME, "%" + listQueryRoleDTO.getRoleName() + "%"));
        }
        if(listQueryRoleDTO.getAppId() != null){
            conditions.add(DaoUtils.buildEqualTo(RoleDO.DB_APP_ID,listQueryRoleDTO.getAppId()));
        }
        listQueryRoleDTO.setQueryItems(conditions);
        pageRoleDO = roleDaoManager.pageQuery(listQueryRoleDTO);
        PageBO<RoleBO> pageRoleBO = CommonUtils.newInstance(pageRoleDO,PageBO.class);
        if (pageRoleDO != null && !CollectionUtils.isEmpty(pageRoleDO.getList())) {
            List<RoleBO> roleBOList = new ArrayList<>();
            List<Long> ids = pageRoleDO.getList().stream().map(RoleDO::getAppId).collect(Collectors.toList());
            Map<Long,AppDO> appDOMap = appDaoManager.mapByIds(ids);
            for (RoleDO roleDO : pageRoleDO.getList()) {
                RoleBO roleBO = CommonUtils.newInstance(roleDO, RoleBO.class);
                if(appDOMap != null && appDOMap.get(roleBO.getAppId()) != null){
                    roleBO.setAppName(appDOMap.get(roleBO.getAppId()).getAppName());
                }
                roleBOList.add(roleBO);
            }
            //排序
            CommonUtils.sortByModifyTime(roleBOList, false);
            pageRoleBO.setList(roleBOList);
        }

        return pageRoleBO;
    }

    @Override
    @Transactional
    public Integer grantPermsToRole(GrantPermsToRoleDTO grantPermsToRoleDTO) {
        //清空角色与权限原来的关联
        //rolePermMapper.deleteByRoleId(grantPermsToRoleDTO.getRoleId());
        //先找到角色应用程序下的权限
        List<RolePermDO> rolePermDOS = rolePermDaoManager.listByRoleId(grantPermsToRoleDTO.getRoleId());
        List<Long> permList = permDaoManager.listByIds(rolePermDOS, RolePermDO::getPermId).stream()
                .filter(e -> grantPermsToRoleDTO.getAppId().equals(e.getAppId()))
                .map(PermDO::getId).collect(Collectors.toList());
        //清空之前的权限
        if (!CollectionUtils.isEmpty(permList)) {
            rolePermDaoManager.deleteByQueryItems(Lists.newArrayList(
                    DaoUtils.buildEqualTo(RolePermDO.DB_ROLE_ID, grantPermsToRoleDTO.getRoleId()),
                    DaoUtils.buildIn(RolePermDO.DB_PERM_ID, permList)
            ));
        }

        //重新建立角色与权限之间的关联
        List<RolePermDO> rolePermDOList = new ArrayList<>();
        List<Long> permIds = grantPermsToRoleDTO.getPermIds();
        //填充父节点
        //后來又改回为前台传了permManager.fullPermPid(permIds);
        if (!CollectionUtils.isEmpty(permIds)) {
            for (Long perId : permIds) {
                RolePermDO rolePermDO = new RolePermDO();
                rolePermDO.setRoleId(grantPermsToRoleDTO.getRoleId());
                rolePermDO.setPermId(perId);
                rolePermDO.setStartTime(grantPermsToRoleDTO.getStartTime());
                rolePermDO.setEndTime(grantPermsToRoleDTO.getEndTime());
                rolePermDO.setRelType(RelTypeEnum.PERM_YES.code);
                rolePermDOList.add(rolePermDO);
            }
            rolePermDaoManager.insertAllPropertiesList(rolePermDOList);
            //更新role表修改时间
            RoleDO roleDO = new RoleDO();
            roleDO.setId(grantPermsToRoleDTO.getRoleId());
            roleDO.setGmtModified(new Date());
            roleDaoManager.updateNotNullProperties(roleDO);
        }
        return rolePermDOList.size();
    }

    @Override
    public RoleDetailsBO getRoleDetailsById(Long id) {
        RoleDetailsBO roleDetailsBO = new RoleDetailsBO();
        //角色信息
        RoleDO roleDO = roleDaoManager.singleResultById(id);
        if (roleDO == null) {
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "没找到角色信息！");
        }
        RoleBO roleBO = CommonUtils.newInstance(roleDO, RoleBO.class);
        if (roleDO.getRoleType() != null) {
            roleBO.setRoleTypeName(RoleTypeEnum.valueOfByCode(roleDO.getRoleType()) != null ? RoleTypeEnum.valueOfByCode(roleDO.getRoleType()).desc : "");
        }
        //所属应用
        AppDO appDO = appDaoManager.getById(roleDO.getAppId());
        if(appDO!= null){
            roleBO.setAppName(appDO.getAppName());
        }
        roleDetailsBO.setRoleBO(roleBO);
        //拥有该角色的人员
        List<UserBO> userBOList = userManager.listUserByRoleId(id);
        roleDetailsBO.setUserBOList(userBOList);
        //拥有该角色的机构
        List<DeptRoleDO> deptRoleDOList = deptRoleDaoManager.listByRoleId(id);
        List<DeptDO> deptDOList = deptDaoManager.listByIds(deptRoleDOList, DeptRoleDO::getDeptId);
        List<DeptBO> deptBOList = deptManager.listDeptDO2ListUserBO(deptDOList);
        roleDetailsBO.setDeptBOList(deptBOList);
        //该角色能访问的权限
        List<RolePermDO> rolePermDOList = rolePermDaoManager.listByRoleId(id);
        List<PermDO> permDOList = permDaoManager.listByIds(rolePermDOList, RolePermDO::getPermId);
        List<PermTreeVO> permTreeVOList = permManager.getPermTree(permDOList);
        roleDetailsBO.setPermTreeVOList(permTreeVOList);

        return roleDetailsBO;

    }

    @Override
    public PageBO<PageListRoleInfoForComponentVO> pageListRoleInfoForComponent(PageListRoleInfoForComponentDTO pageListRoleInfoForComponentDTO) {
        List<QueryItemDTO> queryItemList = new ArrayList<>(2);
        if (CommonUtils.isNotBlank(pageListRoleInfoForComponentDTO.getRoleCode())) {
            queryItemList.add(DaoUtils.buildLike(RoleDO.ROLE_CODE, "%" + pageListRoleInfoForComponentDTO.getRoleCode() + "%"));
        }
        if (CommonUtils.isNotBlank(pageListRoleInfoForComponentDTO.getRoleName())) {
            queryItemList.add(DaoUtils.buildLike(RoleDO.ROLE_NAME, "%" + pageListRoleInfoForComponentDTO.getRoleName() + "%"));
        }
        PageBO<RoleDO> roleDOPageBO = DaoUtils.listDOByPage(() -> this.roleDaoManager.listByQueryItems(queryItemList), pageListRoleInfoForComponentDTO);
        return CommonUtils.convertPageBO(roleDOPageBO, PageListRoleInfoForComponentVO.class);
    }

}
