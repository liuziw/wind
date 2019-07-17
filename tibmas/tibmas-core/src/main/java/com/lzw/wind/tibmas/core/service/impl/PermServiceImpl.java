package com.lzw.wind.tibmas.core.service.impl;

import com.google.common.collect.Lists;
import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.common.dao.dto.QueryItemDTO;
import com.lzw.common.dao.util.DaoUtils;
import com.lzw.wind.tibmas.core.bo.PermBO;
import com.lzw.wind.tibmas.core.bo.PermDetailsBO;
import com.lzw.wind.tibmas.core.bo.RoleBO;
import com.lzw.wind.tibmas.core.daomanager.AppDaoManager;
import com.lzw.wind.tibmas.core.daomanager.PermDaoManager;
import com.lzw.wind.tibmas.core.daomanager.RoleDaoManager;
import com.lzw.wind.tibmas.core.daomanager.RolePermDaoManager;
import com.lzw.wind.tibmas.core.dbo.AppDO;
import com.lzw.wind.tibmas.core.dbo.PermDO;
import com.lzw.wind.tibmas.core.dbo.RoleDO;
import com.lzw.wind.tibmas.core.dbo.RolePermDO;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.enums.PermTypeEnum;
import com.lzw.wind.tibmas.core.enums.RelTypeEnum;
import com.lzw.wind.tibmas.core.manager.DeptManager;
import com.lzw.wind.tibmas.core.manager.RoleManager;
import com.lzw.wind.tibmas.core.service.PermService;
import com.lzw.wind.tibmas.core.vo.PermTreeVO;
import com.lzw.wind.tibmas.core.vo.TreeVO;
import com.lzw.wind.tibmas.core.vo.TreeWithSelectedVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by kjtang on 2018/3/15 0015.
 */
@Service
public class PermServiceImpl implements PermService {


    @Autowired
    private DeptManager deptManager;

    @Autowired
    private RoleManager roleManager;

    @Autowired
    private PermDaoManager permDaoManager;

    @Autowired
    private RolePermDaoManager rolePermDaoManager;

    @Autowired
    private AppDaoManager appDaoManager;

    @Autowired
    private RoleDaoManager roleDaoManager;

    @Override
    public List<PermTreeVO> getPermTreeByAppId(Long appId) {
        List<PermTreeVO> rootMenus = new ArrayList<>();
        List<PermDO> permDOList = permDaoManager.listByAppId(appId);
        for (PermDO permDO : permDOList) {
            if (permDO.getPermType().equals(PermTypeEnum.DIRECTORY)) {//目录
                PermTreeVO root = CommonUtils.newInstance(permDO, PermTreeVO.class);
                rootMenus.add(root);
                fillChildrenMenu(permDOList, root);
            }
        }
        return rootMenus;
    }

    @Override
    public List<TreeVO> listAllPermTree() {
        List<PermDO> permDOList = permDaoManager.listAll();
        List<TreeVO> rootPermList = new ArrayList<>();
        for (PermDO permDO : permDOList) {
            if (permDO.getPid() == 0L) {
                TreeVO rootTreeVO = copyDOToTreeVO(permDO);
                rootPermList.add(rootTreeVO);
                buildPermTree(permDOList, rootTreeVO);
            }
        }
        return rootPermList;
    }

    private TreeVO copyDOToTreeVO(PermDO permDO) {
        TreeVO dataTreeVO = new TreeVO();
        dataTreeVO.setId(permDO.getId());
        dataTreeVO.setLabel(permDO.getPermName());
        dataTreeVO.setValue(permDO.getId() + "-" + permDO.getPermName());
        dataTreeVO.setKey(permDO.getId().toString());
        dataTreeVO.setSeq(permDO.getSeq());
        dataTreeVO.setPid(permDO.getPid());
        return dataTreeVO;
    }

    private void buildPermTree(List<PermDO> permDOList, TreeVO rootTreeVO) {
        List<TreeVO> children = new ArrayList<TreeVO>();
        rootTreeVO.setChildren(children);
        for (PermDO childDO : permDOList) {
            if (childDO.getPid().equals(rootTreeVO.getId())) {
                TreeVO child = copyDOToTreeVO(childDO);
                children.add(child);
                buildPermTree(permDOList, child);
            }
        }
    }

    private void buildPermTree2(Set<PermDO> permDOList, PermTreeVO rootTreeVO) {
        List<PermTreeVO> children = new ArrayList<PermTreeVO>();
        rootTreeVO.setChildren(children);
        for (PermDO childDO : permDOList) {
            if (childDO.getPid().equals(rootTreeVO.getId())) {
                PermTreeVO child = CommonUtils.newInstance(childDO, PermTreeVO.class);
                child.setKey(childDO.getId().toString());
                child.setPermTypeName(PermTypeEnum.valueOfByCode(childDO.getPermType())==null?"":PermTypeEnum.valueOfByCode(childDO.getPermType()).getDesc());
                children.add(child);
                buildPermTree2(permDOList, child);
            }
        }
    }

    @Override
    public List<TreeVO> listPermTree(ListQueryPermDTO listQueryPermDTO) {
        List<QueryItemDTO> conditions = new ArrayList<>();
        //1.应用Id
        if (listQueryPermDTO.getAppId() != null) {
            conditions.add(DaoUtils.buildEqualTo(PermDO.DB_APP_ID, listQueryPermDTO.getAppId()));
        }
        //2......
        List<PermDO> permDOList = permDaoManager.listByQueryItems(conditions);
        List<TreeVO> rootPermList = new ArrayList<>();
        for (PermDO permDO : permDOList) {
            if (permDO.getPid() == 0L) {
                TreeVO rootTreeVO = copyDOToTreeVO(permDO);
                rootPermList.add(rootTreeVO);
                buildPermTree(permDOList, rootTreeVO);
            }
        }
        this.sort(rootPermList);
        return rootPermList;
    }

    @Override
    public List<PermTreeVO> listPermTreeTable(PermTreeDTO permTreeDTO) {
        //先查询对应应用的所有权限
        List<PermDO> listAll = permDaoManager.listByAppId(permTreeDTO.getAppId());
        List<QueryItemDTO> conditions = new ArrayList<>();
        //拼入appId,如果不选择app则返回结果为空
        if (permTreeDTO.getAppId() == null) {
            return Collections.emptyList();
        }
        conditions.add(DaoUtils.buildEqualTo(PermDO.DB_APP_ID, permTreeDTO.getAppId()));
        if (!StringUtils.isEmpty(permTreeDTO.getPermCode())) {
            conditions.add(DaoUtils.buildLike(PermDO.DB_PERM_CODE, "%" + permTreeDTO.getPermCode() + "%"));
        }
        if (!StringUtils.isEmpty(permTreeDTO.getPermName())) {
            conditions.add(DaoUtils.buildLike(PermDO.DB_PERM_NAME, "%" + permTreeDTO.getPermName() + "%"));
        }
        if (!StringUtils.isEmpty(permTreeDTO.getPermType())) {
            conditions.add(DaoUtils.buildEqualTo(PermDO.DB_PERM_TYPE, permTreeDTO.getPermType()));
        }
        List<PermDO> permDOList = permDaoManager.listByQueryItems(conditions);
        //装载匹配后的权限
        Set<PermDO> permDOSet = new HashSet<>();
        for (PermDO permDO : permDOList) {
            permDOSet.add(permDO);
            getParentPerm(permDO.getPid(), listAll, permDOSet);
            //getChildPerm(permDO.getId(),listAll,permDOSet); //子节点不要了
        }
        List<PermTreeVO> rootPermList = new ArrayList<>();
        for (PermDO permDO : permDOSet) {
            if (permDO.getPid() == 0L) {
                PermTreeVO rootTreeVO = CommonUtils.newInstance(permDO, PermTreeVO.class);
                rootTreeVO.setKey(permDO.getId().toString());
                rootTreeVO.setPermTypeName(PermTypeEnum.valueOfByCode(permDO.getPermType())==null?"":PermTypeEnum.valueOfByCode(permDO.getPermType()).getDesc());
                rootPermList.add(rootTreeVO);
                buildPermTree2(permDOSet, rootTreeVO);
            }
        }
        CommonUtils.sortBySeqWithListTree(rootPermList, true);
        //this.sort2(rootPermList);
        return rootPermList;
    }

    //递归寻找机构的上级权限
    private void getParentPerm(Long pid, List<PermDO> listAll, Set<PermDO> permDOSet) {
        for (PermDO permDO : listAll) {
            if (permDO.getId().equals(pid)) {
                permDOSet.add(permDO);
                if (permDO.getPid() != 0L) {
                    getParentPerm(permDO.getPid(), listAll, permDOSet);
                }
            }
        }
    }

    //递归寻找机构的下级权限
    private void getChildPerm(Long id, List<PermDO> listAll, Set<PermDO> permDOSet) {
        for (PermDO permDO : listAll) {
            if (permDO.getPid().equals(id)) {
                permDOSet.add(permDO);
                getChildPerm(permDO.getId(), listAll, permDOSet);
            }
        }
    }


    //排序
    private void sort(List<TreeVO> list) {

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

    private void sort2(List<PermTreeVO> list) {

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
            this.sort2(e.getChildren());
        });
    }

    @Override
    public List<String> listPermCodeByApp(ListPermCodeDTO listPermCodeDTO) {

        List<String> permCodes = new ArrayList<>();
        if (listPermCodeDTO.getAppId() != null) {
            //首先通过应用Id查询
            List<PermDO> permDOList = permDaoManager.listByAppId(listPermCodeDTO.getAppId());
            permCodes = permDOList.stream().map(PermDO::getPermCode).collect(Collectors.toList());
        } else if (listPermCodeDTO.getAppCode() != null) {
            //通过应用码查询
            AppDO appDO = appDaoManager.singleResultByAppCode(listPermCodeDTO.getAppCode());
            if (appDO == null)
                throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "不存在该应用！！！");
            List<PermDO> permDOList = permDaoManager.listByAppId(appDO.getId());
            permCodes = permDOList.stream().map(PermDO::getPermCode).collect(Collectors.toList());
        }
        return permCodes;
    }

    @Transactional
    @Override
    public Integer insert(AddPermDTO dto) {
        PermDO permDO = CommonUtils.newInstance(dto,PermDO.class);
        //判断同一应用中权限吗和code的为唯一性
        judgeNameAndCodeWhenInsert(permDO);
        return permDaoManager.insertNotNullProperties(permDO);
    }

    private void judgeNameAndCodeWhenInsert(PermDO permDO) {
        //1.验证权限名的唯一性
        List<PermDO> permDOList = Collections.EMPTY_LIST;
        List<QueryItemDTO> queryItemDTOList = new ArrayList<>();
        queryItemDTOList.add(DaoUtils.buildEqualTo(PermDO.DB_APP_ID, permDO.getAppId()));
        queryItemDTOList.add(DaoUtils.buildEqualTo(PermDO.DB_PERM_NAME, permDO.getPermName()));
        permDOList = permDaoManager.listByQueryItems(queryItemDTOList);
        if (!CollectionUtils.isEmpty(permDOList))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "所选应用中该权限名已经存在");

        //2.验证权限码的唯一性
        List<QueryItemDTO> queryItemDTOList2 = new ArrayList<>();
        queryItemDTOList2.add(DaoUtils.buildEqualTo(PermDO.DB_APP_ID, permDO.getAppId()));
        queryItemDTOList2.add(DaoUtils.buildEqualTo(PermDO.DB_PERM_CODE, permDO.getPermCode()));
        permDOList = permDaoManager.listByQueryItems(queryItemDTOList2);
        if (!CollectionUtils.isEmpty(permDOList))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "所选应用中该权限码已经存在");
    }

    private void judgeNameAndCodeWhenUpdate(PermDO permDO) {
        //1.验证权限名的唯一性
        List<PermDO> permDOList = Collections.EMPTY_LIST;
        List<QueryItemDTO> queryItemDTOList = new ArrayList<>();
        queryItemDTOList.add(DaoUtils.buildEqualTo(PermDO.DB_APP_ID, permDO.getAppId()));
        queryItemDTOList.add(DaoUtils.buildEqualTo(PermDO.DB_PERM_NAME, permDO.getPermName()));
        permDOList = permDaoManager.listByQueryItems(queryItemDTOList);
        if (!CollectionUtils.isEmpty(permDOList)) {
            for (PermDO perm : permDOList) {
                if (perm != null && !perm.getPermName().equals(permDO.getPermName())) {
                    throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该权限名已经存在");
                }
            }
        }

        //2.验证权限码的唯一性
        List<QueryItemDTO> queryItemDTOList2 = new ArrayList<>();
        queryItemDTOList2.add(DaoUtils.buildEqualTo(PermDO.DB_APP_ID, permDO.getAppId()));
        queryItemDTOList2.add(DaoUtils.buildEqualTo(PermDO.DB_PERM_CODE, permDO.getPermCode()));
        permDOList = permDaoManager.listByQueryItems(queryItemDTOList2);
        if (!CollectionUtils.isEmpty(permDOList)) {
            for (PermDO perm : permDOList) {
                if (perm != null && !perm.getPermCode().equals(permDO.getPermCode())) {
                    throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该权限码已经存在");
                }
            }
        }
    }

    @Transactional
    @Override
    public Integer updateById(UpdatePermDTO dto) {
        PermDO permDO = CommonUtils.newInstance(dto,PermDO.class);
        //判断同一应用中权限名和code的唯一性
        judgeNameAndCodeWhenUpdate(permDO);
        //验证pid是否等于id及下级id
        //先查询全部（只查appid为1的，因为没有应用之分了）
        List<PermDO> listAll = permDaoManager.listByAppId(1L);
        Set<PermDO> permDOSet = new HashSet<>();
        getChildPerm(permDO.getId(), listAll, permDOSet);
        List<Long> idList = permDOSet.stream().map(PermDO::getId).collect(Collectors.toList());
        idList.add(permDO.getId());
        if (deptManager.checkPid(idList, permDO.getPid())) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "上级不能是当前层级及其下级！");
        }

        //修改上级更新时间
        Set<PermDO> parents = new HashSet<>();
        getParentPerm(permDO.getPid(), listAll, parents);
        updateParentGmtModified(parents);

        return permDaoManager.updateNotNullProperties(permDO);
    }


    //修改时更新所有上级的更新时间
    private void updateParentGmtModified(Set<PermDO> parents) {
        List<Long> idList = parents.stream().map(PermDO::getId).collect(Collectors.toList());
        PermDO permDO = new PermDO();
        permDaoManager.updateNotNullFieldsByQueryItems(permDO, Lists.newArrayList(
                DaoUtils.buildIn(PermDO.ID, idList)
        ));
    }

    @Transactional
    @Override
    public Integer deleteById(Long id) {
        //递归删除权限信息
        recursionDeletePerm(Arrays.asList(id));
        return 1;
    }

    @Transactional
    @Override
    public Integer deleteByIds(List<Long> ids) {
        //递归删除权限信息
        recursionDeletePerm(ids);
        return ids.size();
    }

    @Override
    public PermDO getById(Long id) {
        PermDO permDO = permDaoManager.getById(id);
        return permDO;
    }

    //递归填充子权限，得到层级的权限列表
    private void fillChildrenMenu(List<? extends PermDO> perms, PermTreeVO menu) {
        List<PermTreeVO> children = new ArrayList<PermTreeVO>();
        menu.setChildren(children);
        for (PermDO permDO : perms) {
            if (permDO.getPid().equals(menu.getId())) {
                PermTreeVO child = CommonUtils.newInstance(permDO, PermTreeVO.class);
                children.add(child);
                if (!child.getPermType().equals(3)) {
                    fillChildrenMenu(perms, child);
                }
            }
        }
    }

    //递归删除权限信息
    private void recursionDeletePerm(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "请选择要删除的权限!!!");
        for (Long id : ids) {
            //递归子权限
            List<PermDO> permDOList = permDaoManager.listByPid(id);
            if (!CollectionUtils.isEmpty(permDOList)) {
                throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "警告，你当前删除的权限下面存在子权限");
            }
            //判断该权限是否使用
            //1.判断角色与权限
            if (rolePermDaoManager.countByPermId(id) > 0) {
                //throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该权限已经被使用!!!");
                rolePermDaoManager.deleteByPermId(id);
            }
        }
        //删除权限
        permDaoManager.deleteByIds(ids);
    }

    @Override
    public TreeWithSelectedVO listPermTreeWithSelectForRoleUpdate(RoleAndAppIDDTO dto) {
        ListQueryPermDTO listQueryPermDTO = new ListQueryPermDTO();
        listQueryPermDTO.setAppId(dto.getAppId());
        List<TreeVO> treeVOList = this.listPermTree(listQueryPermDTO);
        List<RolePermDO> rolePermDOS = roleManager.listRolePermDOByRoleId(dto.getRoleId());
        TreeWithSelectedVO treeWithSelectedVO = new TreeWithSelectedVO();
        treeWithSelectedVO.setTreeNodes(treeVOList);
        if(CollectionUtils.isEmpty(rolePermDOS)){
            treeWithSelectedVO.setSelectIds(new ArrayList<>());
        }else {
            treeWithSelectedVO.setSelectIds(rolePermDOS.stream().map(RolePermDO::getPermId).collect(Collectors.toList()));
        }

        return treeWithSelectedVO;
    }

    @Override
    public PermDetailsBO getPermDetailsById(Long id) {
        PermDetailsBO permDetailsBO = new PermDetailsBO();
        //权限信息
        PermDO permDO = permDaoManager.getById(id);
        if (permDO == null) {
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "没有找到权限信息！");
        }
        PermBO permBO = CommonUtils.newInstance(permDO, PermBO.class);
        if (permDO.getPermType() != null) {
            permBO.setPermTypeName(PermTypeEnum.valueOfByCode(permDO.getPermType()) != null ? PermTypeEnum.valueOfByCode(permDO.getPermType()).desc : "");
        }
        AppDO appDO = appDaoManager.getById(permDO.getAppId());
        if(appDO != null){
            permBO.setAppName(appDO.getAppName());
        }
        permDetailsBO.setPermBO(permBO);
        //拥有该权限的角色
        List<RolePermDO> rolePermDOList = rolePermDaoManager.listByPermId(id);
        List<RoleDO> roleDOList = roleDaoManager.listByIds(rolePermDOList, RolePermDO::getRoleId);
        List<RoleBO> roleBOList = roleManager.listRoleDO2ListRoleBO(roleDOList);
        permDetailsBO.setRoleBOList(roleBOList);
        return permDetailsBO;
    }

    @Transactional
    @Override
    public Integer disablePerm(IdDTO<Long> dto) {
        if (dto == null) {
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "请选择权限！");
        }
        PermDO permDO = permDaoManager.getById(dto.getId());
        if (permDO == null) {
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "该权限不存在！");
        }
        int enable = 0;
        //如果权限为启用状态则设置enable为1禁用状态，否则enable为0启用状态
        if (permDO.getEnableStatus() == 0) {
            enable = 1;
        }
        //设置权限是否启用状态为enable
        permDO.setEnableStatus(enable);
        return permDaoManager.updateNotNullProperties(permDO);

    }


    /**
     * 给权限分配角色
     *
     * @param grantRolesToPermDTO
     * @return
     */
    @Override
    public Integer grantRolesToPerm(GrantRolesToPermDTO grantRolesToPermDTO) {
        //先根据权限id把权限对应的角色信息删掉
        this.rolePermDaoManager.deleteByPermId(grantRolesToPermDTO.getPermId());

        List<Long> roleIds = grantRolesToPermDTO.getRoleIds();
        if (!CollectionUtils.isEmpty(roleIds)) {
            List<RolePermDO> rolePermDOList = new ArrayList<>();
            for (Long roleId : roleIds) {
                RolePermDO rolePermDO = new RolePermDO();
                rolePermDO.setPermId(grantRolesToPermDTO.getPermId());
                rolePermDO.setRoleId(roleId);
                rolePermDO.setStartTime(grantRolesToPermDTO.getStartTime());
                rolePermDO.setEndTime(grantRolesToPermDTO.getEndTime());
                rolePermDO.setRelType(RelTypeEnum.PERM_YES.getCode());
                rolePermDOList.add(rolePermDO);
            }
            this.rolePermDaoManager.insertAllPropertiesList(rolePermDOList);
        }
        return roleIds.size();
    }

}