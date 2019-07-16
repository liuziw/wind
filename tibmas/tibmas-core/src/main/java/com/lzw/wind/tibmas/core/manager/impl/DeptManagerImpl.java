package com.lzw.wind.tibmas.core.manager.impl;

import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.dao.dto.QueryItemDTO;
import com.hyzs.gz.common.dao.enums.QueryTypeEnum2;
import com.hyzs.gz.common.dao.util.DaoUtils;
import com.hyzs.tibmas.core.bo.DeptBO;
import com.hyzs.tibmas.core.daomanager.AreaDaoManager;
import com.hyzs.tibmas.core.daomanager.DeptRoleDaoManager;
import com.hyzs.tibmas.core.daomanager.UserDaoManager;
import com.hyzs.tibmas.core.dbo.*;
import com.hyzs.tibmas.core.enums.DeptTypeEnum;
import com.hyzs.tibmas.core.manager.DeptManager;
import com.hyzs.tibmas.core.vo.DeptTreeVO;
import com.hyzs.tibmas.core.vo.SelectTreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author liys
 * @date 2018/3/1311:05
 */
@Component
public class DeptManagerImpl implements DeptManager {


    @Autowired
    private UserDaoManager userDaoManager;

    @Autowired
    private DeptRoleDaoManager deptRoleDaoManager;
    @Autowired
    private AreaDaoManager areaDaoManager;


    /**
     * 根据部门ID查询用户
     * @param deptId
     * @return
     */
    @Override
    public List<UserDO> listUserByDeptId(Long deptId) {
        return this.userDaoManager.listByDeptId(deptId);
    }


    /**
     * 根据部门查询dept_role表里的数据
     * @param deptIds
     * @return
     */
    @Override
    public List<DeptRoleDO> listDeptRoleDOByDeptId(Long... deptIds) {
       return   deptRoleDaoManager.listByQueryItems(Arrays.asList(
                DaoUtils.buildIn(DeptRoleDO.DEPT_ID,deptIds),
               new QueryItemDTO(DeptRoleDO.END_TIME, QueryTypeEnum2.GREATER_THAN,new Date()),
               new QueryItemDTO(DeptRoleDO.DB_START_TIME, QueryTypeEnum2.LESS_THAN_OR_EQUAL_TO,new Date()),
               new QueryItemDTO(DeptRoleDO.DB_IS_DELETED, QueryTypeEnum2.EQUAL_TO,0)
       ));
    }

    @Override
    public <T> List<DeptRoleDO> listDeptRoleDOByDeptId(Collection<T> deptIds, Function<T, Long> mapper) {
        return listDeptRoleDOByDeptId(deptIds.stream().map(mapper).collect(Collectors.toList()).toArray(new Long[deptIds.size()]));
    }


    /**
     * 转换部门BO
     * @param deptDOList
     * @return
     */
    @Override
    public List<DeptBO> listDeptDO2ListUserBO(List<DeptDO> deptDOList){
        List<DeptBO> deptBOList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(deptDOList)){
            //TODO liys 后续要补充上区域相关的数据
//            Map<Long,AreaDO> areaDOMap = areaDaoManager.mapByIds(deptDOList, DeptDO::getAreaId);
            for(DeptDO deptDO:deptDOList){
                DeptBO deptBO = CommonUtils.newInstance(deptDO,DeptBO.class);
//                deptBO.setAreaName(areaDOMap.get(deptDO.getAreaId()).getName());
                deptBO.setDeptTypeName(DeptTypeEnum.valueOfByCode(deptDO.getDeptType())!=null? DeptTypeEnum.valueOfByCode(deptDO.getDeptType()).desc:"");
                deptBOList.add(deptBO);
            }
        }
        return deptBOList;
    }

    @Override
    public List<SelectTreeVO> listDeptType(){
        List<SelectTreeVO> selectTreeVOList = new ArrayList<>();
        for(DeptTypeEnum deptTypeEnum: DeptTypeEnum.values()){
            SelectTreeVO selectTreeVO = new SelectTreeVO();
            selectTreeVO.setKey(Long.valueOf(deptTypeEnum.code));
            selectTreeVO.setValue(deptTypeEnum.code+"-"+deptTypeEnum.desc);
            selectTreeVO.setLabel(deptTypeEnum.desc);
            selectTreeVOList.add(selectTreeVO);
        }
        return selectTreeVOList;
    }

    @Override
    public boolean checkPid(List<Long> idList,Long pid){
        if(idList==null || pid==null){
            return false;
        }
        return idList.contains(pid);
    }

    //递归寻找机构的上级机构
    @Override
    public void getParentDept(Long pid, List<DeptDO> listAll, Set<DeptDO> deptList){
        for(DeptDO deptDO:listAll){
            if(deptDO.getId().equals(pid)){
                deptList.add(deptDO);
                if(deptDO.getPid()!=0L){
                    getParentDept(deptDO.getPid(),listAll,deptList);
                }
            }
        }
    }
    //递归寻找机构的下级机构
    @Override
    public void getChildDept(Long id, List<DeptDO> listAll, Set<DeptDO> deptList){
        for(DeptDO deptDO:listAll){
            if(deptDO.getPid().equals(id)){
                deptList.add(deptDO);
                getChildDept(deptDO.getId(),listAll,deptList);
            }
        }
    }

    @Override
    public void buildDeptTreeTable(Set<? extends DeptDO> deptDOSList, DeptTreeVO rootTreeVO){
        List<DeptTreeVO> children = new ArrayList<DeptTreeVO>();
        rootTreeVO.setChildren(children);
        for(DeptDO childDO : deptDOSList){
            if(childDO.getPid().equals(rootTreeVO.getId())){
                DeptTreeVO child = CommonUtils.newInstance(childDO,DeptTreeVO.class);
                child.setKey(childDO.getId().toString());
                children.add(child);
                buildDeptTreeTable(deptDOSList,child);
            }
        }
    }
}
