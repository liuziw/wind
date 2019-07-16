package com.lzw.wind.tibmas.core.manager.impl;

import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.tibmas.core.daomanager.PermDaoManager;
import com.hyzs.tibmas.core.dbo.PermDO;
import com.hyzs.tibmas.core.enums.PermTypeEnum;
import com.hyzs.tibmas.core.manager.PermManager;
import com.hyzs.tibmas.core.vo.PermTreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;


/**
 * @author liys
 * @date 2018/3/1311:07
 */
@Component
public class PermManagerImpl implements PermManager {


    @Autowired
    private PermDaoManager permDaoManager;

    @Override
    public List<PermTreeVO> getPermTree(List<PermDO> permDOList){
        List<PermTreeVO> rootPermList = new ArrayList<>();
        for(PermDO permDO:permDOList){
            if(permDO.getPid()==0L){
                PermTreeVO rootTreeVO = CommonUtils.newInstance(permDO,PermTreeVO.class);
                rootTreeVO.setKey(permDO.getId().toString());
                rootTreeVO.setPermTypeName(PermTypeEnum.valueOfByCode(permDO.getPermType())==null?"":PermTypeEnum.valueOfByCode(permDO.getPermType()).getDesc());
                rootPermList.add(rootTreeVO);
                buildPermTree(permDOList,rootTreeVO);
            }
        }
        CommonUtils.sortBySeqWithListTree(rootPermList,false);
        return rootPermList;
    }

    @Override
    public List<PermTreeVO> getPermTreeTable(List<PermDO> permDOList){
        //先查询全部（只查appid为1的，因为没有应用之分了）
        List<PermDO> listAll = permDaoManager.listByAppId(1L);
        //装载匹配后的权限
        Set<PermDO> permDOSet = new HashSet<>();
        for(PermDO permDO:permDOList){
            permDOSet.add(permDO);
            getParentPerm(permDO.getPid(),listAll,permDOSet);
            //getChildPerm(permDO.getId(),listAll,permDOSet);  4.19号去掉下级权限
        }
        List<PermTreeVO> rootPermList = new ArrayList<>();
        for(PermDO permDO:permDOSet){
            if(permDO.getPid()==0L){
                PermTreeVO rootTreeVO = CommonUtils.newInstance(permDO,PermTreeVO.class);
                rootTreeVO.setKey(permDO.getId().toString());
                rootTreeVO.setPermTypeName(PermTypeEnum.valueOfByCode(permDO.getPermType())==null?"":PermTypeEnum.valueOfByCode(permDO.getPermType()).getDesc());
                rootPermList.add(rootTreeVO);
                buildPermTree2(permDOSet,rootTreeVO);
            }
        }
        this.sort2(rootPermList);
        return rootPermList;
    }

    //递归寻找上级权限
    private void getParentPerm(Long pid, List<PermDO> listAll, Set<PermDO> permDOSet){
        for(PermDO permDO:listAll){
            if(permDO.getId().equals(pid)){
                permDOSet.add(permDO);
                if(permDO.getPid()!=0L){
                    getParentPerm(permDO.getPid(),listAll,permDOSet);
                }
            }
        }
    }
    //递归寻找下级权限
    private void getChildPerm(Long id, List<PermDO> listAll, Set<PermDO> permDOSet){
        for(PermDO permDO:listAll){
            if(permDO.getPid().equals(id)){
                permDOSet.add(permDO);
                getChildPerm(permDO.getId(),listAll,permDOSet);
            }
        }
    }


    private void sort2(List<PermTreeVO> list){

        //为空，不用排
        if(CollectionUtils.isEmpty(list)){
            return;
        }
        Collections.sort(list,(p1,p2)->{
            if(p1==null || p2==null || p1.getSeq()==null || p2.getSeq()==null){
                return 0;
            }
            return p1.getSeq().intValue()-p2.getSeq().intValue();
        });
        list.forEach(e->{
            this.sort2(e.getChildren());
        });
    }

    private void buildPermTree(List<PermDO> permDOList, PermTreeVO rootTreeVO){
        List<PermTreeVO> children = new ArrayList<>();
        rootTreeVO.setChildren(children);
        for(PermDO childDO : permDOList){
            if(childDO.getPid().equals(rootTreeVO.getId())){
                PermTreeVO child = CommonUtils.newInstance(childDO,PermTreeVO.class);
                child.setKey(childDO.getId().toString());
                child.setPermTypeName(PermTypeEnum.valueOfByCode(childDO.getPermType())==null?"":PermTypeEnum.valueOfByCode(childDO.getPermType()).getDesc());
                children.add(child);
                buildPermTree(permDOList,child);
            }
        }
    }

    private void buildPermTree2(Set<PermDO> permDOList, PermTreeVO rootTreeVO){
        List<PermTreeVO> children = new ArrayList<PermTreeVO>();
        rootTreeVO.setChildren(children);
        for(PermDO childDO : permDOList){
            if(childDO.getPid().equals(rootTreeVO.getId())){
                PermTreeVO child = CommonUtils.newInstance(childDO,PermTreeVO.class);
                child.setKey(childDO.getId().toString());
                child.setPermTypeName(PermTypeEnum.valueOfByCode(childDO.getPermType())==null?"":PermTypeEnum.valueOfByCode(childDO.getPermType()).getDesc());
                children.add(child);
                buildPermTree2(permDOList,child);
            }
        }
    }

    @Override
    public void fullPermPid(List<Long> permIds) {
        List<PermDO> permDOList = permDaoManager.listByIds(permIds);
        if(!CollectionUtils.isEmpty(permDOList)){
            for(PermDO permDO:permDOList){
                if(!permIds.contains(permDO.getPid())&&permDO.getPid()!=0L){
                    List<Long> pids = new ArrayList<>();
                    pids.add(permDO.getPid());
                    //递归找父节点的父节点
                    fullPermPid(pids);
                    permIds.addAll(pids);
                }
            }
        }


    }

}
