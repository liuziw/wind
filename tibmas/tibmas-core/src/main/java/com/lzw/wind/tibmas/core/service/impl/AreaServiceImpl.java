package com.lzw.wind.tibmas.core.service.impl;

import com.google.common.collect.Lists;
import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.common.dao.dto.QueryItemDTO;
import com.lzw.common.dao.util.DaoUtils;
import com.lzw.wind.tibmas.core.bo.AreaBO;
import com.lzw.wind.tibmas.core.bo.AreaDetailsBO;
import com.lzw.wind.tibmas.core.bo.DeptBO;
import com.lzw.wind.tibmas.core.daomanager.AreaDaoManager;
import com.lzw.wind.tibmas.core.daomanager.DeptDaoManager;
import com.lzw.wind.tibmas.core.daomanager.SysConfigDaoManager;
import com.lzw.wind.tibmas.core.dbo.AreaDO;
import com.lzw.wind.tibmas.core.dbo.DeptDO;
import com.lzw.wind.tibmas.core.dbo.SysConfigDO;
import com.lzw.wind.tibmas.core.dto.AreaTreeDTO;
import com.lzw.wind.tibmas.core.dto.ListQueryAreaDTO;
import com.lzw.wind.tibmas.core.manager.DeptManager;
import com.lzw.wind.tibmas.core.service.AreaService;
import com.lzw.wind.tibmas.core.util.ConfigConstantUtil;
import com.lzw.wind.tibmas.core.vo.AreaTreeTableVO;
import com.lzw.wind.tibmas.core.vo.AreaTreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by kjtang on 2018/3/16 0016.
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDaoManager areaDaoManager;

    @Autowired
    private DeptDaoManager deptDaoManager;

    @Autowired
    private DeptManager deptManager;

    @Autowired
    private SysConfigDaoManager sysConfigDaoManager;

    private final static String DEFAULT_AREA = ConfigConstantUtil.DEFAULT_AREA;

    @Transactional
    @Override
    public Integer insert(AreaDO areaDO) {
        //验证合法性
        //1.验证区域名称
        Integer count = areaDaoManager.countByName(areaDO.getName());
        if(count>0)
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该区域名称已经存在");

        //2.验证区域编码
        count = areaDaoManager.countByCode(areaDO.getCode());
        if(count>0)
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该区域编码已经存在");

        //3.插入区域信息
        int res = areaDaoManager.insertNotNullProperties(areaDO);
        AreaDO parentAreaDO = areaDaoManager.getById(areaDO.getPid());
        areaDO.setLevelPath(parentAreaDO.getLevelPath()+areaDO.getId()+"/");
        areaDaoManager.updateNotNullProperties(areaDO);
        return res;
    }

    @Transactional
    @Override
    public Integer updateById(AreaDO areaDO) {
        //1.验证区域名称合法性
        AreaDO dbAreaDO = areaDaoManager.singleResultByName(areaDO.getName());
        if(dbAreaDO!=null && !dbAreaDO.getId().equals(areaDO.getId()))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该区域名称已经存在");

        //2.验证区域编码的合法性
        dbAreaDO = areaDaoManager.singleResultByCode(areaDO.getCode());
        if(dbAreaDO!=null && !dbAreaDO.getId().equals(areaDO.getId()))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该区域编码已经存在");
        //验证pid是否等于id及下级id
        //根据配置得到默认地区
        List<AreaDO> listAll = new ArrayList<>();
        SysConfigDO sysConfigDO = sysConfigDaoManager.singleResultByConfigKey(DEFAULT_AREA);
        AreaDO topArea = new AreaDO();
        if (sysConfigDO != null) {
            topArea = areaDaoManager.getById(Long.parseLong(sysConfigDO.getConfigValue()));
        }
        if(topArea!=null){
            listAll = areaDaoManager.listByQueryItems(DaoUtils.buildLike(AreaDO.DB_LEVEL_PATH,topArea.getLevelPath()+"%"));
        }

        //3.更新区域信息
        AreaDO parentAreaDO = areaDaoManager.getById(areaDO.getPid());
        areaDO.setLevelPath(parentAreaDO.getLevelPath()+areaDO.getId()+"/");
        Set<AreaDO> areaDOSet = new HashSet<>();
        getChildArea(areaDO.getId(),listAll,areaDOSet);
        List<Long> idList = areaDOSet.stream().map(AreaDO::getId).collect(Collectors.toList());
        idList.add(areaDO.getId());
        if(deptManager.checkPid(idList,areaDO.getPid())){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"上级不能是当前层级及其下级！");
        }


        Integer res = areaDaoManager.updateNotNullProperties(areaDO);

        //修改上级的更新时间
        Set<AreaDO> listParentArea = new HashSet<>();
        getParentArea(topArea.getPid(),areaDO.getPid(),listAll,listParentArea);
        updateParentGmtModified(listParentArea);

        return res;
    }

    //修改时更新所有上级的更新时间
    private void updateParentGmtModified(Set<AreaDO> areaDOList ){
        List<Long> idList = areaDOList.stream().map(AreaDO::getId).collect(Collectors.toList());
        AreaDO areaDO = new AreaDO();
        areaDaoManager.updateNotNullFieldsByQueryItems(areaDO, Lists.newArrayList(
                DaoUtils.buildIn(AreaDO.ID,idList)
        ));
    }

    @Transactional
    @Override
    public Integer deleteById(Long id) {

        //1.判断该区域是否被使用
        if(deptDaoManager.countByAreaId(id)>0)
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"有组织机构属于该地区，不能被删除！");
        if(areaDaoManager.countByPid(id)>0)
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该地区下存在下级地区，不能被删除！");


        //2.删除区域
        return areaDaoManager.deleteById(id);
    }

    @Transactional
    @Override
    public Integer deleteByIds(List<Long> ids) {

        //1.验证区域是否被使用
        if(CollectionUtils.isEmpty(ids))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请选择要删除的区域");

        for(Long id:ids){
            if(deptDaoManager.countByAreaId(id)>0)
                throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"有区域被使用不能删除");
            if(areaDaoManager.countByPid(id)>0)
                throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该地区下存在下级地区，不能被删除！");

        }

        //2.批量删除区域
        return areaDaoManager.deleteByIds(ids);
    }

    @Override
    public AreaBO getById(Long id) {
        AreaDO areaDO = areaDaoManager.getById(id);
        if(areaDO == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"没有找到信息！");
        }
        AreaBO areaBO = CommonUtils.newInstance(areaDO,AreaBO.class);
        return areaBO;
    }

    @Override
    public List<AreaBO> listQuery(ListQueryAreaDTO listQueryAreaDTO) {

        //查询条件
        List<QueryItemDTO> conditions = new ArrayList<>();
        //1.名称
        if(!StringUtils.isEmpty(listQueryAreaDTO.getName())){
            conditions.add(DaoUtils.buildLike(AreaDO.DB_NAME,"%"+listQueryAreaDTO.getName()+"%"));
        }
        //2.pid
        if(listQueryAreaDTO.getPid()!=null){
            conditions.add(DaoUtils.buildEqualTo(AreaDO.DB_PID,listQueryAreaDTO.getPid()));
        }
        //3.查询
        List<AreaDO>  areaDOList = areaDaoManager.listByQueryItems(conditions);
        //2.将查询出的DO转换成BO对象
        List<AreaBO> rootAreaList = new ArrayList<>();
        for(AreaDO areaDO:areaDOList){
            AreaBO areaBO = CommonUtils.newInstance(areaDO, AreaBO.class);
            rootAreaList.add(areaBO);
        }
        //排序
        CommonUtils.sortByModifyTimeWithListTree(rootAreaList,false);
        return rootAreaList;
    }

    @Override
    public List<AreaTreeVO> listAllAreaTree() {

        //1.查询所有区域信息
        List<AreaDO> areaDOList = Collections.EMPTY_LIST;
        areaDOList = areaDaoManager.listAll();

        //递归填充子区域
        List<AreaTreeVO> rootAreaList = new ArrayList<AreaTreeVO>();
        for(AreaDO areaDO:areaDOList){
            if(areaDO.getPid()==0L){
                AreaTreeVO rootTreeVO =copyDOToTreeVO(areaDO);
                rootAreaList.add(rootTreeVO);
                fillChildrenArea(areaDOList,rootTreeVO);
            }
        }
        return rootAreaList;
    }

    @Override
    public List<AreaTreeVO> listAreaTreeById(IdDTO<Long> dto){
        if(dto.getId()==null){
            return Collections.emptyList();
        }
        AreaDO areaDO = areaDaoManager.getById(dto.getId());
        List<AreaDO> areaDOS = areaDaoManager.listByQueryItems(DaoUtils.buildLike(AreaDO.DB_LEVEL_PATH,areaDO.getLevelPath()+"%"));
        List<AreaTreeVO> treeVOS =new ArrayList<>();
        for(AreaDO area:areaDOS){
            if(area.getId().equals(dto.getId())){//所查询的地区作为顶级
                AreaTreeVO treeVO = copyDOToTreeVO(area);
                treeVOS.add(treeVO);
                fillChildrenArea(areaDOS,treeVO);
            }
        }
        return treeVOS;
    }

    @Override
    public List<AreaTreeVO> listAreaTree(){
        //根据配置得到默认地区
        SysConfigDO sysConfigDO = sysConfigDaoManager.singleResultByConfigKey(DEFAULT_AREA);
        AreaDO areaDO = new AreaDO();
        if (sysConfigDO != null) {
            areaDO = areaDaoManager.getById(Long.parseLong(sysConfigDO.getConfigValue()));
        }

        List<AreaTreeVO> treeVOS =new ArrayList<>();
        if(areaDO!=null){
            List<AreaDO> areaDOS = areaDaoManager.listByQueryItems(DaoUtils.buildLike(AreaDO.DB_LEVEL_PATH,areaDO.getLevelPath()+"%"));
            for(AreaDO area:areaDOS){
                if(area.getId().equals(areaDO.getId())){//所查询的地区作为顶级
                    AreaTreeVO treeVO = copyDOToTreeVO(area);
                    treeVOS.add(treeVO);
                    fillChildrenArea(areaDOS,treeVO);
                }
            }
        }

        return treeVOS;
    }

    @Override
    public List<AreaTreeVO> listStreetAreaTree(){
        //根据配置得到默认地区
        SysConfigDO sysConfigDO = sysConfigDaoManager.singleResultByConfigKey(DEFAULT_AREA);
        AreaDO areaDO = new AreaDO();
        if (sysConfigDO != null) {
            areaDO = areaDaoManager.getById(Long.parseLong(sysConfigDO.getConfigValue()));
        }

        List<AreaTreeVO> treeVOS =new ArrayList<>();
        if(areaDO!=null){
            List<AreaDO> areaDOS = areaDaoManager.listByQueryItems(DaoUtils.buildLike(AreaDO.DB_LEVEL_PATH,areaDO.getLevelPath()+"%"));
            for(AreaDO area:areaDOS){
                if(area.getId().equals(areaDO.getId())){//所查询的地区作为顶级
                    AreaTreeVO treeVO = copyDOToTreeVO(area);
                    treeVOS.add(treeVO);
                    fillChildrenStreetArea(areaDOS,treeVO);
                }
            }
        }

        return treeVOS;
    }

    @Override
    public List<AreaTreeTableVO> listAreaTreeTable(AreaTreeDTO areaTreeDTO){
        //根据配置得到默认地区
        SysConfigDO sysConfigDO = sysConfigDaoManager.singleResultByConfigKey(DEFAULT_AREA);
        AreaDO areaDO = new AreaDO();
        if (sysConfigDO != null) {
            areaDO = areaDaoManager.getById(Long.parseLong(sysConfigDO.getConfigValue()));
        }
        List<AreaTreeTableVO> treeVOS =new ArrayList<>();
        if(areaDO!=null){
            //得到默认地区下所有地区
            List<AreaDO> listAll = areaDaoManager.listByQueryItems(DaoUtils.buildLike(AreaDO.DB_LEVEL_PATH,areaDO.getLevelPath()+"%"));
            List<QueryItemDTO> conditions = new ArrayList<>();
            if(!StringUtils.isEmpty(areaTreeDTO.getCode())){
                conditions.add(DaoUtils.buildLike(AreaDO.DB_CODE,"%"+areaTreeDTO.getCode()+"%"));
            }
            if(!StringUtils.isEmpty(areaTreeDTO.getName())){
                conditions.add(DaoUtils.buildLike(AreaDO.DB_NAME,"%"+areaTreeDTO.getName()+"%"));
            }
            List<AreaDO> areaDOList = areaDaoManager.listByQueryItems(conditions);
            //装载匹配后的区域
            Set<AreaDO> areaDOSet = new HashSet<>();
            for(AreaDO area:areaDOList){
                areaDOSet.add(area);
                getParentArea(areaDO.getPid(),area.getPid(),listAll,areaDOSet);
                //getChildArea(area.getId(),listAll,areaDOSet); 4.19号去掉下级区域
            }
            for(AreaDO area:areaDOSet){
                if(area.getId().equals(areaDO.getId())){//所查询的地区作为顶级
                    AreaTreeTableVO treeVO = CommonUtils.newInstance(area,AreaTreeTableVO.class);
                    treeVO.setRoot(true);
                    treeVO.setKey(area.getId().toString());
                    treeVOS.add(treeVO);
                    fillChildrenArea2(areaDOSet,treeVO);
                }
            }
        }
        //排序
        CommonUtils.sortByModifyTimeWithListTree(treeVOS,false);
        return treeVOS;

    }

    /**
     * 递归寻找上级区域
     * @param topId
     * @param pid
     * @param listAll
     * @param areaDOSet
     */
    private void getParentArea(Long topId, Long pid, List<AreaDO> listAll, Set<AreaDO> areaDOSet){
        for(AreaDO areaDO:listAll){
            if(areaDO.getId().equals(pid)){
                areaDOSet.add(areaDO);
                if(areaDO.getPid()!=topId){
                    getParentArea(topId,areaDO.getPid(),listAll,areaDOSet);
                }
            }
        }
    }
    //递归寻找下级区域
    private void getChildArea(Long id, List<AreaDO> listAll, Set<AreaDO> areaDOSet){
        for(AreaDO areaDO:listAll){
            if(areaDO.getPid().equals(id)){
                areaDOSet.add(areaDO);
                getChildArea(areaDO.getId(),listAll,areaDOSet);
            }
        }
    }

    private AreaTreeVO copyDOToTreeVO(AreaDO areaDO){

        AreaTreeVO dataTreeVO = new AreaTreeVO();
        dataTreeVO.setId(areaDO.getId());
        dataTreeVO.setLabel(areaDO.getName());
        dataTreeVO.setValue(areaDO.getId()+"-"+areaDO.getName());
        dataTreeVO.setKey(areaDO.getCode().toString());
        dataTreeVO.setLevelPath(areaDO.getLevelPath());
        return dataTreeVO;
    }

    private void fillChildrenArea(List<AreaDO> areaDOSList, AreaTreeVO rootTreeVO){
        List<AreaTreeVO> children = new ArrayList<>();
        rootTreeVO.setChildren(children);
        for(AreaDO childDO : areaDOSList){
            if(childDO.getPid().equals(rootTreeVO.getId())){
                AreaTreeVO child = copyDOToTreeVO(childDO);
                children.add(child);
                fillChildrenArea(areaDOSList,child);
            }
        }
    }

    private void fillChildrenStreetArea(List<AreaDO> areaDOSList, AreaTreeVO rootTreeVO){
        List<AreaTreeVO> children = new ArrayList<>();
        rootTreeVO.setChildren(children);
        for(AreaDO childDO : areaDOSList){
            if(childDO.getPid().equals(rootTreeVO.getId()) && childDO.getCode().toString().length()<10){
                AreaTreeVO child = copyDOToTreeVO(childDO);
                children.add(child);
                fillChildrenStreetArea(areaDOSList,child);
            }
        }
    }

    private void fillChildrenArea2(Set<? extends AreaDO> areaDOSList, AreaTreeTableVO rootTreeVO){
        List<AreaTreeTableVO> children = new ArrayList<AreaTreeTableVO>();
        rootTreeVO.setChildren(children);
        for(AreaDO childDO : areaDOSList){
            if(childDO.getPid().equals(rootTreeVO.getId())){
                AreaTreeTableVO child = CommonUtils.newInstance(childDO,AreaTreeTableVO.class);
                child.setRoot(false);
                child.setKey(childDO.getId().toString());
                children.add(child);
                fillChildrenArea2(areaDOSList,child);
            }
        }
    }

    @Override
    public AreaDetailsBO getAreaDetailsById(Long id){
        AreaDetailsBO areaDetailsBO = new AreaDetailsBO();
        //区域信息
        AreaDO areaDO = areaDaoManager.getById(id);
        if(areaDO == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"没有找到地区！");
        }
        areaDetailsBO.setAreaDO(areaDO);
        //属于该地区的机构
        List<DeptDO> deptDOList = deptDaoManager.listByAreaId(id);
        List<DeptBO> deptBOList = deptManager.listDeptDO2ListUserBO(deptDOList);
        areaDetailsBO.setDeptBOList(deptBOList);
        return areaDetailsBO;

    }

    @Override
    public String getFullAreaNameById(Long id){
        if (id==null){
            return "";
        }
        List<AreaDO> listAll = areaDaoManager.listAll();
        List<AreaDO> parents = new ArrayList<>();
        AreaDO areaDO = areaDaoManager.getById(id);
        String fullName = "";
        if(areaDO!=null){
            //找到上级区域
            getParentArea(areaDO.getPid(),listAll,parents);
            Collections.reverse(parents);
            //拼接区域全名
            fullName = parents.stream().map(AreaDO::getName).collect(Collectors.joining(""))+areaDO.getName();
        }
        return fullName;
    }

    /**
     * 递归寻找上级区域一直找到省级
     * @param pid
     * @param listAll
     * @param areaDOSet
     */
    private void getParentArea(Long pid, List<AreaDO> listAll, List<AreaDO> areaDOSet){
        for(AreaDO areaDO:listAll){
            if(areaDO.getId().equals(pid)){
                areaDOSet.add(areaDO);
                if(areaDO.getPid()!=1L){
                    getParentArea(areaDO.getPid(),listAll,areaDOSet);
                }
            }
        }
    }

    /**
     * 根据区划ID 返回区划ID和名称字符串数组 eg.[35-城区, 39-新港街道, 213-立新社区居委会]
     * 主要用于前端所属区划字段回显
     * @param areaId
     * @return
     */
    @Override
    public String[] getAreaNameByAreaId(Long areaId) {
        AreaDO areaDO = this.areaDaoManager.getById(areaId, "id", "code", "name", "pid");

        String[] areaName = null;

        if (areaDO != null) {
            String code = areaDO.getCode().toString();
            switch (code.length()) {
                case 12: // 社区
                    AreaDO areaDO1 = this.areaDaoManager.getById(areaDO.getPid(), "id", "name", "pid"); // 街道
                    AreaDO areaDO2 = this.areaDaoManager.getById(areaDO1.getPid(), "id", "name", "pid"); // 城区

                    areaName = new String[]{
                            new String(areaDO2.getId() + "-" + areaDO2.getName()),
                            new String(areaDO1.getId() + "-" + areaDO1.getName()),
                            new String(areaDO.getId() + "-" + areaDO.getName())
                    };
                    break;
                case 9: // 街道
                    AreaDO areaDO3 = this.areaDaoManager.getById(areaDO.getPid(), "id", "name"); // 城区

                    areaName = new String[]{
                            new String(areaDO3.getId() + "-" + areaDO3.getName()),
                            new String(areaDO.getId() + "-" + areaDO.getName())
                    };
                    break;
                case 6: // 城区
                    areaName = new String[]{
                            new String(areaDO.getId() + "-" + areaDO.getName())
                    };
                    break;
            }
        }

        return areaName;
    }
}