package com.lzw.wind.tibmas.core.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.google.common.collect.Lists;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.dao.dto.IdDTO;
import com.hyzs.gz.common.dao.dto.QueryItemDTO;
import com.hyzs.gz.common.dao.util.DaoUtils;
import com.hyzs.tibmas.core.bo.*;
import com.hyzs.tibmas.core.daomanager.*;
import com.hyzs.tibmas.core.dbo.*;
import com.hyzs.tibmas.core.dto.*;
import com.hyzs.tibmas.core.enums.DeptTypeEnum;
import com.hyzs.tibmas.core.manager.DeptManager;
import com.hyzs.tibmas.core.manager.Info2KafkaManager;
import com.hyzs.tibmas.core.manager.RoleManager;
import com.hyzs.tibmas.core.manager.UserManager;
import com.hyzs.tibmas.core.service.DeptService;
import com.hyzs.tibmas.core.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by kjtang on 2018/3/15 0015.
 */
@Service
public class DeptServiceImpl implements DeptService{



    @Autowired
    private Info2KafkaManager info2KafkaManager;


    @Autowired
    private DeptDaoManager deptDaoManager;

    @Autowired
    private UserDaoManager userDaoManager;

    @Autowired
    private DeptRoleDaoManager deptRoleDaoManager;

    @Autowired
    private RoleDaoManager roleDaoManager;
    @Autowired
    private AreaDaoManager areaDaoManager;
    @Autowired
    private UserManager userManager;
    @Autowired
    private RoleManager roleManager;
    @Autowired
    private DeptManager deptManager;
    @Autowired
    private DeptExpandDaoManager deptExpandDaoManager;
    @Autowired
    private AppDaoManager appDaoManager;

    @Autowired
    private TeamDaoManager teamDaoManager;

    @Autowired
    private TeamUserDaoManager teamUserDaoManager;


    @Transactional
    @Override
    public AddDeptVO insert(AddDeptDTO dto) {
        if(StringUtils.isEmpty(dto.getDeptName())){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"部门名称不能为空");
        }
        if(StringUtils.isEmpty(dto.getDeptCode())){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"部门编码不能为空");
        }
        //验证部门信息的合法性
        Integer count = deptDaoManager.countByDeptName(dto.getDeptName());
        //1.验证部门名称
        if(count>0){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该部门名称已经存在");
        }
        count = deptDaoManager.countByDeptCode(dto.getDeptCode());
        //2.验证部门编码
        if(count>0){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"部门编码已经存在");
        }
        DeptDO parentDept = deptDaoManager.getById(dto.getPid());
        //验证了上级部门，则id不可能等于pid
        if(parentDept == null && dto.getPid() != 0){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"上级部门不存在");
        }
        DeptDO deptDO = CommonUtils.newInstance(dto,DeptDO.class);
        int res = deptDaoManager.insertNotNullProperties(deptDO);

        //新增部门拓展信息
        if (!CollectionUtils.isEmpty(dto.getContext())) {
            List<DeptExpandDO> deptExpandDOList = dto.getContext().entrySet().stream().map(e -> {
                DeptExpandDO deptExpandDO = new DeptExpandDO();
                deptExpandDO.setDeptId(deptDO.getId());
                deptExpandDO.setPropertyName(e.getKey());
                deptExpandDO.setPropertyValue(e.getValue()==null?"":e.getValue().toString());
                return deptExpandDO;
            }).collect(Collectors.toList());
            deptExpandDaoManager.insertAllPropertiesList(deptExpandDOList);
        }
        if(res>0){
            info2KafkaManager.addDept(deptDO);
        }
        AddDeptVO addDeptVO = new AddDeptVO();
        addDeptVO.setId(deptDO.getId());
        addDeptVO.setUpdateCount(res);

        return addDeptVO;
    }

    @Transactional
    @Override
    public Integer updateById(UpdateDeptDTO dto) {
        //验证部门信息的合法性
        //1.验证部门名称
        DeptDO dbDeptDO = deptDaoManager.singleResultByDeptName(dto.getDeptName());
        if(dbDeptDO!=null && !dbDeptDO.getId().equals(dto.getId()))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该部门名称已经存在");
        //2.验证部门编码
        dbDeptDO = deptDaoManager.singleResultByDeptCode(dto.getDeptCode());
        if(dbDeptDO!=null && !dbDeptDO.getId().equals(dto.getId()))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"部门代码已经存在");
        //验证pid是否等于id及下级id
        //先查询出所有区域
        List<DeptDO> listAll = deptDaoManager.listAll();
        Set<DeptDO> deptDOSet = new HashSet<>();
        deptManager.getChildDept(dto.getId(),listAll,deptDOSet);
        List<Long> idList = deptDOSet.stream().map(DeptDO::getId).collect(Collectors.toList());
        idList.add(dto.getId());
        boolean flag = deptManager.checkPid(idList,dto.getPid());
        if(flag){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"上级不能是当前层级及其下级！");
        }
        DeptDO deptDO = CommonUtils.newInstance(dto,DeptDO.class);
        int res = deptDaoManager.updateNotNullProperties(deptDO);

        //先删除拓展信息
        deptExpandDaoManager.deleteByDeptId(deptDO.getId());
        //再添加拓展信息
        if (!CollectionUtils.isEmpty(dto.getContext())) {
            List<DeptExpandDO> deptExpandDOList = dto.getContext().entrySet().stream().map(e -> {
                DeptExpandDO deptExpandDO = new DeptExpandDO();
                deptExpandDO.setPropertyName(e.getKey());
                deptExpandDO.setPropertyValue(e.getValue()==null?"":e.getValue().toString());
                deptExpandDO.setDeptId(deptDO.getId());
                return deptExpandDO;
            }).collect(Collectors.toList());
            deptExpandDaoManager.insertAllPropertiesList(deptExpandDOList);
        }

        if(res>0){
            info2KafkaManager.updateDept(deptDO);
        }

        //修改上级更新时间
        Set<DeptDO> parents = new HashSet<>();
        deptManager.getParentDept(deptDO.getPid(),listAll,parents);
        updateParentGmtModified(parents);

        return res;
    }

    //修改时更新所有上级的更新时间
    private void updateParentGmtModified(Set<DeptDO> parents ){
        List<Long> idList = parents.stream().map(DeptDO::getId).collect(Collectors.toList());
        DeptDO deptDO = new DeptDO();
        deptDaoManager.updateNotNullFieldsByQueryItems(deptDO, Lists.newArrayList(
                DaoUtils.buildIn(DeptDO.ID,idList)
        ));
    }

    @Transactional
    @Override
    public Integer deleteById(Long id) {
        //递归删除
        recursionDeleteDept(Arrays.asList(id));
        return 1;
    }

    @Transactional
    @Override
    public Integer deleteByIds(List<Long> ids) {
        //递归删除
        recursionDeleteDept(ids);
        return ids.size();
    }
    
    @Override
    public List<DeptTreeVO> listDeptById(IdDTO<Long> dto){
    	List<DeptTreeVO> result = Lists.newArrayList();
    	 if(dto == null){
    	     dto = new IdDTO<>();
    	     dto.setId(0L);
         }
         List<DeptDO> depts = deptDaoManager.listByPid(dto.getId());
         if(!CollectionUtils.isEmpty(depts)){
             List<Long> deptPids = depts.stream().map(DeptDO::getPid).collect(toList());
             List<Long> deptIds = depts.stream().map(DeptDO::getId).collect(toList());
             Map<Long,List<DeptExpandDO>> listMap = deptExpandDaoManager.groupingByInDeptId(deptIds,DeptExpandDO::getDeptId);
             Map<Long,DeptDO> deptDOMap = deptDaoManager.mapByIds(deptPids);
             for(DeptDO dept:depts){
                 DeptTreeVO vo = new DeptTreeVO();
                 vo.setId(dept.getId());
                 vo.setDeptCode(dept.getDeptCode());
                 vo.setDeptName(dept.getDeptName());
                 vo.setDeptType(dept.getDeptType());
                 vo.setPid(dept.getPid());
                 vo.setAreaId(dept.getAreaId());
                 vo.setDeptDescribe(dept.getDeptDescribe());
                 List<DeptExpandDO> deptExpandDOList = listMap.get(dept.getId());
                 if(!CollectionUtils.isEmpty(deptExpandDOList)){
                     vo.setContext(deptExpandDOList.stream().collect(Collectors.toMap(DeptExpandDO::getPropertyName,
                             DeptExpandDO::getPropertyValue,(k1,k2)->k1)));
                 }
                 if(deptDOMap!= null && deptDOMap.get(dept.getPid())!= null){
                     vo.setParentName(deptDOMap.get(dept.getPid()).getDeptName());
                 }

                 result.add(vo);
             }
             CommonUtils.sortBySeq(result,true);
         }

    	return result;
    }

    @Override
    public List<DeptTreeVO> listDeptByName(ListDeptDTO dto){
        List<DeptTreeVO> result = Lists.newArrayList();
        if(dto != null){
            List<DeptDO> listAll = deptDaoManager.listAll();
            List<DeptDO> depts = new ArrayList<>();
            List<QueryItemDTO> items = new ArrayList<>();
            if(!StringUtils.isEmpty(dto.getDeptName())){
                items.add(DaoUtils.buildLike(DeptDO.DB_DEPT_NAME, "%"+dto.getDeptName()+"%"));
                depts = deptDaoManager.listByQueryItems(items);
            }else {
                depts = deptDaoManager.listByPid(0L);
            }

            Set<DeptDO> deptDOList = new HashSet<>();
            for(DeptDO deptDO:depts){
                deptDOList.add(deptDO);
                //寻找上级部门
                getParentDept(deptDO.getPid(),listAll,deptDOList);
            }
            if(!CollectionUtils.isEmpty(deptDOList)){
                List<Long> deptIds = deptDOList.stream().map(DeptDO::getId).collect(Collectors.toList());
                Map<Long,List<DeptExpandDO>> listMap = deptExpandDaoManager.groupingByInDeptId(deptIds,DeptExpandDO::getDeptId);
                Map<Long,DeptDO> deptDOMap = deptDaoManager.mapByIds(deptIds);
                //递归填充子区域
                for(DeptDO deptDO:deptDOList){
                    if(deptDO.getPid()==0L){
                        DeptTreeVO rootTreeVO = CommonUtils.newInstance(deptDO,DeptTreeVO.class);
                        rootTreeVO.setKey(deptDO.getId().toString());
                        List<DeptExpandDO> expandDOList = listMap.get(deptDO.getId());
                        if(!CollectionUtils.isEmpty(expandDOList)){
                            rootTreeVO.setContext(expandDOList.stream().collect(Collectors.toMap(DeptExpandDO::getPropertyName,
                                    DeptExpandDO::getPropertyValue,(k1,k2)->k1)));
                        }
                        result.add(rootTreeVO);
                        buildDeptTreeTable(deptDOList,rootTreeVO,listMap,deptDOMap);
                    }
                }
                CommonUtils.sortBySeqWithListTree(result,true);
            }
        }
        return result;
    }

    /**
     * 部门用户树异步请求的接口，通过id返回该部门下的用户及子部门
     * <pre>
     *     如果pid!=0，只返回一级
     *          1.根据pid找到子部门
     *          2.将部门放入返回列表
     *          3.根据部门id找到部门下人员
     *          4.将人员放入返回列表
     *          5.返回
     *     如果pid==0 则返回2级
     *          1.先找到部门pid为0的部门
     *          2.找到在这些部门下的人员和子部门
     *          3.根据人员和部门去组装部门树
     * </pre>
     * @param idDTO
     * @return
     */
    @Override
    public List<DeptUserTreeVO> listDeptUserById(IdDTO<Long> idDTO){
        List<DeptUserTreeVO> result;
        if(idDTO == null || idDTO.getId() == null){
            idDTO = new IdDTO<>();
            idDTO.setId(0L);
        }
        List<DeptDO> deptDOList = deptDaoManager.listByPid(idDTO.getId());
        result = listDeptUser(idDTO.getId(),deptDOList);

        return result;
    }

    private List<DeptUserTreeVO> listDeptUser(Long id,List<DeptDO> deptDOList){
        List<DeptUserTreeVO> deptUserTreeVOList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(deptDOList)){
            CommonUtils.sortBySeq(deptDOList,true);
            for(DeptDO deptDO:deptDOList){
                DeptUserTreeVO deptUserTreeVO = new DeptUserTreeVO();
                deptUserTreeVO.setId(deptDO.getId());
                deptUserTreeVO.setName(deptDO.getDeptName());
                deptUserTreeVO.setPid(id);
                deptUserTreeVO.setType(0);
                deptUserTreeVO.setDeptCode(deptDO.getDeptCode());
                deptUserTreeVO.setChildren(new ArrayList<>());
                deptUserTreeVOList.add(deptUserTreeVO);
            }
        }
        List<UserDO> userDOList = userDaoManager.listByDeptId(id);
        if(!CollectionUtils.isEmpty(userDOList)){
            List<Long> deptIds = userDOList.stream().map(UserDO::getDeptId).collect(toList());
            Map<Long,DeptDO> deptDOMap = deptDaoManager.mapByIds(deptIds);
            for(UserDO userDO:userDOList){
                DeptUserTreeVO deptUserTreeVO = new DeptUserTreeVO();
                deptUserTreeVO.setId(userDO.getId());
                deptUserTreeVO.setName(userDO.getUserName());
                deptUserTreeVO.setPid(id);
                deptUserTreeVO.setType(1);
                deptUserTreeVO.setChildren(new ArrayList<>());
                if(deptDOMap != null && deptDOMap.get(userDO.getDeptId()) != null){
                    DeptDO deptDO = deptDOMap.get(userDO.getDeptId());
                    deptUserTreeVO.setDeptCode(deptDO.getDeptCode());
                    deptUserTreeVO.setDeptId(deptDO.getId());
                    deptUserTreeVO.setDeptName(deptDO.getDeptName());
                }
                deptUserTreeVOList.add(deptUserTreeVO);
            }
        }
        return deptUserTreeVOList;
    }

    /**
     * 根据用户ids得到用户所在部门树
     * <pre>
     *     1.根据用户ids得到用户列表
     *     2.根据用户列表得到用户所在部门ids
     *     3.根据用户所在部门向上得到所有上级部门
     *     4.构造部门树
     *     5.将用户挂靠在对应部门下
     * </pre>
     * @param idsDTO
     * @return
     */
    @Override
    public List<DeptUserTreeVO> listDeptUserByUserIds(IdsDTO<Long> idsDTO){
        if(idsDTO == null){
            CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入用户id");
        }
        List<DeptUserTreeVO> result = new ArrayList<>();
        List<UserDO> userDOList = userDaoManager.listByIds(idsDTO.getIds());
        List<Long> deptIds = new ArrayList<>();
        if(!CollectionUtils.isEmpty(userDOList)){
            deptIds = userDOList.stream().map(UserDO::getDeptId).collect(toList());
        }
        if(!CollectionUtils.isEmpty(deptIds)){
            List<DeptDO> deptDOList = deptDaoManager.listByIds(deptIds);
            if(!CollectionUtils.isEmpty(deptDOList)){
                List<DeptUserTreeVO> deptUserTreeVOList = new ArrayList<>();
                List<DeptDO> listAll = deptDaoManager.listAll();
                Set<DeptDO> deptDOSet = new HashSet<>();
                for(DeptDO deptDO:deptDOList){
                    //寻找上级
                    deptDOSet.add(deptDO);
                    getParentDept(deptDO.getPid(),listAll,deptDOSet);
                }
                //构造树
                deptDOSet2DeptUserTreeVOList(deptDOSet,deptUserTreeVOList,result);
                //将用户挂靠在部门下面
                fullUser2Dept(result,userDOList);
            }
        }
        return result;

    }

    /**
     * 将用户挂在部门下
     * @param deptUserTreeVOList
     * @param userDOList
     */
    private void fullUser2Dept(List<DeptUserTreeVO> deptUserTreeVOList,List<UserDO> userDOList){
        for(DeptUserTreeVO deptUserTreeVO:deptUserTreeVOList){
            if(deptUserTreeVO.getType() != 1){
                List<UserDO> users = userDOList.stream().filter(e -> e.getDeptId().equals(deptUserTreeVO.getId())).collect(toList());
                if(!CollectionUtils.isEmpty(users)){
                    for(UserDO userDO:users){
                        DeptUserTreeVO vo = new DeptUserTreeVO();
                        vo.setId(userDO.getId());
                        vo.setName(userDO.getUserName());
                        vo.setPid(deptUserTreeVO.getId());
                        vo.setSeq(1000L);
                        vo.setType(1);
                        deptUserTreeVO.getChildren().add(vo);
                    }
                }
                if(!CollectionUtils.isEmpty(deptUserTreeVO.getChildren())){
                    fullUser2Dept(deptUserTreeVO.getChildren(),userDOList);
                }
            }
        }
    }

    private void deptDOSet2DeptUserTreeVOList(Set<DeptDO> deptDOSet,List<DeptUserTreeVO> deptUserTreeVOList,List<DeptUserTreeVO> result){
        //将部门都放入deptUserTreeVOList，后面构造树
        for(DeptDO deptDO:deptDOSet){
            DeptUserTreeVO deptUserTreeVO = new DeptUserTreeVO();
            deptUserTreeVO.setId(deptDO.getId());
            deptUserTreeVO.setName(deptDO.getDeptName());
            deptUserTreeVO.setPid(deptDO.getPid());
            deptUserTreeVO.setSeq(deptDO.getSeq());
            deptUserTreeVO.setDeptCode(deptDO.getDeptCode());
            deptUserTreeVO.setType(0);
            deptUserTreeVOList.add(deptUserTreeVO);
        }
        //构造树
        for(DeptUserTreeVO deptUserTreeVO:deptUserTreeVOList){
            if(deptUserTreeVO.getPid() == 0L){
                result.add(deptUserTreeVO);
                buildDeptUserTree(deptUserTreeVOList,deptUserTreeVO);
            }
        }
    }

    /**
     *为部门分配角色
     * <pre>
     *     1.清除部门与角色直接的关系
     *     2.重新建立部门与角色的关系
     *     3.找出所赋予的角色中哪些角色是可继承的
     *     4.如果存在可继承的角色，则找出该部门的所有子部门
     *       将可继承的角色分配给该部门的子部门
     * </pre>
     * @param grantRolesToDeptDTO
     * @return
     */
    @Transactional
    @Override
    public Integer grantRolesToDept(GrantRolesToDeptDTO grantRolesToDeptDTO) {
        //为部门授予角色
        //1.清除部门与角色之间的关系
        deptRoleDaoManager.deleteByDeptId(grantRolesToDeptDTO.getDeptId());
        //2.重新建立部门与角色之间的关系
        List<Long> roleIds = grantRolesToDeptDTO.getRoleIds();
        if(!CollectionUtils.isEmpty(roleIds)){
            fullDeptRoleDO(grantRolesToDeptDTO.getDeptId(),roleIds,
                    grantRolesToDeptDTO.getStartTime(),grantRolesToDeptDTO.getEndTime());
        }
        //找出这些角色中是可继承的角色
        List<RoleDO> inheritRoleList = roleDaoManager.listByIds(roleIds);
        if(!CollectionUtils.isEmpty(inheritRoleList)){
            List<Long> inheritRoleIds = inheritRoleList.stream().filter(e -> e.getIsExtend()==1).map(RoleDO::getId).collect(toList());
            //找到该部门的所有子部门
            List<DeptDO> listAll = deptDaoManager.listAll();
            Set<DeptDO> deptDOSet = new HashSet<>();
            deptManager.getChildDept(grantRolesToDeptDTO.getDeptId(),listAll,deptDOSet);
            for(DeptDO deptDO:deptDOSet){
                //先接触部门与继承角色的关系（因为如果已经存在关系的话，将会存在重复添加的问题，所有需先解除）
                List<QueryItemDTO> queryItemDTOS = new ArrayList<>();
                queryItemDTOS.add(DaoUtils.buildEqualTo(DeptRoleDO.DB_DEPT_ID,deptDO.getId()));
                queryItemDTOS.add(DaoUtils.buildIn(DeptRoleDO.DB_ROLE_ID,inheritRoleIds));
                deptRoleDaoManager.deleteByQueryItems(queryItemDTOS);
                //再赋予可继承的角色
                fullDeptRoleDO(deptDO.getId(),inheritRoleIds,grantRolesToDeptDTO.getStartTime(),grantRolesToDeptDTO.getEndTime());
            }
        }

        return roleIds.size();
    }

    private void fullDeptRoleDO(Long deptId,List<Long> roleIds,Date startTime,Date endTime){
        List<DeptRoleDO> deptRoleDOList = new ArrayList<>();
        for(Long roleId : roleIds){
            DeptRoleDO deptRoleDO = new DeptRoleDO();
            deptRoleDO.setDeptId(deptId);
            deptRoleDO.setRoleId(roleId);
            deptRoleDO.setStartTime(startTime);
            deptRoleDO.setEndTime(endTime);
            deptRoleDOList.add(deptRoleDO);
        }
        deptRoleDaoManager.insertAllPropertiesList(deptRoleDOList);
        //dept表更新时间
        DeptDO deptDO = new DeptDO();
        deptDO.setId(deptId);
        deptDO.setGmtModified(new Date());
        deptDaoManager.updateNotNullProperties(deptDO);
    }

    //封装构建树的辅助方法
    private TreeVO copyDOToTreeVO(DeptDO deptDO){

        TreeVO dataTreeVO = new TreeVO();
        dataTreeVO.setId(deptDO.getId());
        dataTreeVO.setLabel(deptDO.getDeptName());
        dataTreeVO.setValue(deptDO.getId()+"-"+deptDO.getDeptName());
        dataTreeVO.setKey(deptDO.getDeptName());
        return dataTreeVO;
    }

    private void buildDeptTree(List<? extends DeptDO> deptDOSList, TreeVO rootTreeVO){

        List<TreeVO> children = new ArrayList<TreeVO>();
        rootTreeVO.setChildren(children);
        for(DeptDO childDO : deptDOSList){
            if(childDO.getPid().equals(rootTreeVO.getId())){
                TreeVO child = copyDOToTreeVO(childDO);
                children.add(child);
                buildDeptTree(deptDOSList,child);
            }
        }
    }

    //递归删除部门
    private void recursionDeleteDept(List<Long> ids){

        if(CollectionUtils.isEmpty(ids)) throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请选择要删除的部门");
        for(Long id:ids){
            //1.判断部门与用户
            if(userDaoManager.countByDeptId(id)>0)
                throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"有人员属于该部门,禁止删除!!!");
            //判断是否有子部门
            List<DeptDO> deptDOList = deptDaoManager.listByPid(id);
            if(!CollectionUtils.isEmpty(deptDOList))
                //recursionDeleteDept(deptDOList.stream().map(DeptDO::getId).collect(Collectors.toList()));
                throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"警告，你当前删除的部门下面存在子部门");

            //2.判断部门与角色
            if(deptRoleDaoManager.countByDeptId(id)>0) {
                //throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该部门已经被使用,禁止删除!!!");
                deptRoleDaoManager.deleteByDeptId(id);
            }
        }
        //4.删除子部门
        deptDaoManager.deleteByIds(ids);
        //删除后往kafka发消息
        List<DeptDO> deptDOList = deptDaoManager.listByIds(ids);
        if(!CollectionUtils.isEmpty(deptDOList)){
            for(DeptDO deptDO:deptDOList){
                info2KafkaManager.deleteDept(deptDO);
            }
        }
    }


    @Override
    public AppRoleTreeVO listRoleForUpdate(IdDTO<Long> dto) {
        AppRoleTreeVO appRoleTreeVO = new AppRoleTreeVO();

        //应用角色树
        List<AppRoleVO> appRoleVOList = roleManager.listAppRoleVO();

        //部门对应的角色
        List<DeptRoleDO> deptRoleDOS = this.deptManager.listDeptRoleDOByDeptId(dto.getId());
        List<Long> selectIds = new ArrayList<>();
        if(!CollectionUtils.isEmpty(deptRoleDOS)){
            selectIds = deptRoleDOS.stream().map(DeptRoleDO::getRoleId).collect(toList());
        }
        appRoleTreeVO.setAppRoleVOList(appRoleVOList);
        appRoleTreeVO.setSelectIds(selectIds);

        return appRoleTreeVO;
    }

    @Override
    public DeptDetailsBO getDeptDetailsById(Long id){
        DeptDetailsBO deptDetailsBO = new DeptDetailsBO();
        //部门信息
        DeptDO deptDO = deptDaoManager.getById(id);
        if(deptDO == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"没找到部门信息！");
        }
        AreaDO area = areaDaoManager.getById(deptDO.getAreaId());
        DeptBO deptBO = CommonUtils.newInstance(deptDO,DeptBO.class);
        deptBO.setAreaName(area.getName());
        deptBO.setDeptTypeName(DeptTypeEnum.valueOfByCode(deptDO.getDeptType())!=null? DeptTypeEnum.valueOfByCode(deptDO.getDeptType()).desc:"");
        deptDetailsBO.setDeptBO(deptBO);
        //区域
        AreaDO areaDO = areaDaoManager.getById(deptDO.getAreaId());
        deptDetailsBO.setArea(areaDO);
        //上级部门
        DeptDO parentDept = deptDaoManager.getById(deptDO.getPid());
        DeptBO deptBO1 = new DeptBO();
        if(parentDept!=null){
            AreaDO areaDO1 = areaDaoManager.getById(parentDept.getAreaId());
            deptBO1= CommonUtils.newInstance(parentDept,DeptBO.class);
            deptBO1.setAreaName(areaDO1.getName());
        }
        deptDetailsBO.setParentDept(deptBO1);
        //部门下的人员
        List<UserDO> userDOList = userDaoManager.listByDeptId(id);
        List<UserBO> userBOList = userManager.ListUserDO2ListUserBO(userDOList);
        deptDetailsBO.setUserBOList(userBOList);
        //部门所拥有的角色
        List<DeptRoleDO> deptRoleDOList = deptRoleDaoManager.listByDeptId(id);
        List<RoleDO> roleDOList = roleDaoManager.listByIds(deptRoleDOList, DeptRoleDO::getRoleId);
        List<RoleBO> roleBOList = roleManager.listRoleDO2ListRoleBO(roleDOList);
        deptDetailsBO.setRoleBOList(roleBOList);
        //部门拓展信息
        Map<String,Object> context = new HashMap<>();
        List<DeptExpandDO> deptExpandDOList = deptExpandDaoManager.listByDeptId(deptDO.getId());
        if(!CollectionUtils.isEmpty(deptExpandDOList)){
            context = deptExpandDOList.stream().collect(Collectors.toMap(DeptExpandDO::getPropertyName,DeptExpandDO::getPropertyValue));
        }
        deptDetailsBO.setContext(context);

        return deptDetailsBO;

    }

    @Override
    public List<SelectTreeVO> listDeptType() {
        return deptManager.listDeptType();
    }

    //递归寻找部门的上级部门
    private void getParentDept(Long pid,List<DeptDO> listAll,Set<DeptDO> deptList){
        for(DeptDO deptDO:listAll){
            if(deptDO.getId().equals(pid)){
                deptList.add(deptDO);
                if(deptDO.getPid()!=0L){
                    getParentDept(deptDO.getPid(),listAll,deptList);
                }
            }
        }
    }

    /**
     * 根据部门id找到该部门及其子部门下所有人员
     * <pre>
     *     1.先找到该部门及其子部门
     *     2.再找这些部门下的人员
     * </pre>
     * @param dto
     * @return
     */
    @Override
    public List<UsersByDeptIdVO> listUserByDeptId(IdDTO<Long> dto){
        List<UsersByDeptIdVO> userList = new ArrayList<>();
        if(dto == null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请传入部门id");
        }
        List<DeptDO> listAll = deptDaoManager.listAll();
        DeptDO deptDO = deptDaoManager.getById(dto.getId());
        Set<DeptDO> deptDOSet = new HashSet<>();
        if(deptDO == null){
            return userList;
        }
        deptDOSet.add(deptDO);
        //查找部门下的子部门放在deptDOSet里
        deptManager.getChildDept(deptDO.getId(),listAll,deptDOSet);
        //得到所有的部门id
        List<Long> deptIds = deptDOSet.stream().map(DeptDO::getId).collect(Collectors.toList());
        List<UserDO> userDOList = userDaoManager.listByInDeptId(deptIds);
        if(!CollectionUtils.isEmpty(userDOList)){
            for(UserDO userDO:userDOList){
                UsersByDeptIdVO usersByDeptIdVO = CommonUtils.newInstance(userDO,UsersByDeptIdVO.class);
                userList.add(usersByDeptIdVO);
            }
        }

        return userList;
    }

    private void buildDeptTreeTable(Set<? extends DeptDO> deptDOSList, DeptTreeVO rootTreeVO,
                                    Map<Long,List<DeptExpandDO>> listMap,Map<Long,DeptDO> deptDOMap){

        List<DeptTreeVO> children = new ArrayList<DeptTreeVO>();
        rootTreeVO.setChildren(children);
        for(DeptDO childDO : deptDOSList){
            if(childDO.getPid().equals(rootTreeVO.getId())){
                DeptTreeVO child = CommonUtils.newInstance(childDO,DeptTreeVO.class);
                child.setKey(childDO.getId().toString());
                List<DeptExpandDO> expandDOList = listMap.get(childDO.getId());
                if(!CollectionUtils.isEmpty(expandDOList)){
                    child.setContext(expandDOList.stream().collect(Collectors.toMap(DeptExpandDO::getPropertyName,
                            DeptExpandDO::getPropertyValue,(k1,k2)->k1)));
                }
                if(deptDOMap!= null && deptDOMap.get(childDO.getPid()) != null){
                    child.setParentName(deptDOMap.get(childDO.getPid()).getDeptName());
                }

                children.add(child);
                buildDeptTreeTable(deptDOSList,child,listMap,deptDOMap);
            }
        }
    }

    private void buildDeptUserTree(List<DeptUserTreeVO> deptDOSList, DeptUserTreeVO rootTreeVO){
        List<DeptUserTreeVO> children = new ArrayList<>();
        rootTreeVO.setChildren(children);
        for(DeptUserTreeVO child : deptDOSList){
            if(child.getPid().equals(rootTreeVO.getId())){
                children.add(child);
                buildDeptUserTree(deptDOSList,child);
            }
        }
    }


    /**
     * 根据部门查询人员分组信息，目前是勤务模块中个人排班使用的接口
     * <PRE>
     *     入参两个参数：
     *          {@link ListUserByDeptAndTeamTypeDTO#deptId} 为部门ID，查询该部门下的用户信息
     *          {@link ListUserByDeptAndTeamTypeDTO#teamTypeCode} 为分组类型(团队类型),即按哪种进行分类
     *
     *     大概的业务过程如下：
     *          1.在user表根据部门找出所有的用户，接下来就是要对这些用户进行分组
     *          2.在team_user表中找出这些用户所属的分组信息
     *          3.找出没有分组的用户，分配到一个id为0的虚拟组
     * </PRE>
     * @param listUserByDeptAndTeamTypeDTO
     * @return
     */
    @Override
    public List<ListUserByDeptAndTeamTypeVO> listUserByDeptAndTeamType(ListUserByDeptAndTeamTypeDTO listUserByDeptAndTeamTypeDTO) {
        //找出用户
        List<UserDO> userDOS = this.userDaoManager.listByDeptId(listUserByDeptAndTeamTypeDTO.getDeptId());
        if(CommonUtils.isEmpty(userDOS)){
            return new ArrayList<>(0);
        }
        //找出用户对应的团队
        List<TeamUserDO> teamUserDOList = this.teamUserDaoManager.listByInUserId(CommonUtils.collection2List(userDOS, UserDO::getId));

        //以Map方式保存，方便下面的业务逻辑
        Map<Long, UserDO> userMap = CommonUtils.mapping(userDOS, UserDO::getId);

        //已经分配的用户按团队分组
        Map<Long, List<TeamUserDO>> teamUserMap = CommonUtils.grouping(teamUserDOList, TeamUserDO::getTeamId);

        //团队的Map，方便下面的业务逻辑
        Map<Long, TeamDO> tempMap = this.teamDaoManager.mapByIds(teamUserDOList, TeamUserDO::getTeamId);

        //最终返回的数据
        List<ListUserByDeptAndTeamTypeVO> list=new ArrayList<>();
        for(Long teamId:teamUserMap.keySet()){
            TeamDO teamDO = tempMap.get(teamId);

            if(teamDO==null){
                continue;
            }

            //符合条件的团体，如果入参teamTypeCode为空的，所有的团队都算
            if(CommonUtils.isNotBlank(listUserByDeptAndTeamTypeDTO.getTeamTypeCode())){
                if(!StringUtils.equals(listUserByDeptAndTeamTypeDTO.getTeamTypeCode(),teamDO.getTeamTypeCode())){
                    continue;
                }
            }

            //团队下的成员信息
            List<TeamUserDO> userList=teamUserMap.get(teamId);


            ListUserByDeptAndTeamTypeVO listUserByDeptAndTeamTypeVO=new ListUserByDeptAndTeamTypeVO();
            listUserByDeptAndTeamTypeVO.setTeamId(teamDO.getId());
            listUserByDeptAndTeamTypeVO.setTeamName(teamDO.getTeamName());
            listUserByDeptAndTeamTypeVO.setTeamTypeCode(teamDO.getTeamTypeCode());
            listUserByDeptAndTeamTypeVO.setUserList(CommonUtils.collection2List(userList, teamUserDO->{
                //成员数据转换
                ListUserByDeptAndTeamTypeUserInfoVO listUserByDeptAndTeamTypeUserInfoVO=new ListUserByDeptAndTeamTypeUserInfoVO();
                UserDO userDO=userMap.get(teamUserDO.getUserId());
                if(userDO!=null){
                    listUserByDeptAndTeamTypeUserInfoVO.setUserAccount(userDO.getUserAccount());
                    listUserByDeptAndTeamTypeUserInfoVO.setUserId(userDO.getId());
                    listUserByDeptAndTeamTypeUserInfoVO.setUserName(userDO.getUserName());
                }
                return listUserByDeptAndTeamTypeUserInfoVO;
            }));
            list.add(listUserByDeptAndTeamTypeVO);
        }


        Map<Long,TeamUserDO> teamUserDOMap= CommonUtils.mapping(teamUserDOList,TeamUserDO::getUserId);

        //该部门下没有分组的成员信息
        List<ListUserByDeptAndTeamTypeUserInfoVO> listUserByDeptAndTeamTypeUserInfoVOS = CommonUtils.collection2List(CommonUtils.filter2List(userDOS, userDO -> !teamUserDOMap.containsKey(userDO.getId())), userDO -> {
            ListUserByDeptAndTeamTypeUserInfoVO listUserByDeptAndTeamTypeUserInfoVO = new ListUserByDeptAndTeamTypeUserInfoVO();
            listUserByDeptAndTeamTypeUserInfoVO.setUserAccount(userDO.getUserAccount());
            listUserByDeptAndTeamTypeUserInfoVO.setUserId(userDO.getId());
            listUserByDeptAndTeamTypeUserInfoVO.setUserName(userDO.getUserName());
            return listUserByDeptAndTeamTypeUserInfoVO;
        });


        if(CommonUtils.isNotEmpty(listUserByDeptAndTeamTypeUserInfoVOS)){
            //建立一个id为0的虚拟组
            ListUserByDeptAndTeamTypeVO listUserByDeptAndTeamTypeVO=new ListUserByDeptAndTeamTypeVO();
            listUserByDeptAndTeamTypeVO.setTeamId(0L);
            listUserByDeptAndTeamTypeVO.setTeamName("未分组");
            listUserByDeptAndTeamTypeVO.setTeamTypeCode("NOT_TEAM");
            listUserByDeptAndTeamTypeVO.setUserList(listUserByDeptAndTeamTypeUserInfoVOS);
            list.add(listUserByDeptAndTeamTypeVO);
        }

        return list;
    }
}