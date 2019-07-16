package com.lzw.wind.tibmas.core.service.impl;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.dao.dto.QueryItemDTO;
import com.hyzs.gz.common.dao.util.DaoUtils;
import com.hyzs.tibmas.core.bo.AppBO;
import com.hyzs.tibmas.core.daomanager.AppDaoManager;
import com.hyzs.tibmas.core.daomanager.PermDaoManager;
import com.hyzs.tibmas.core.dbo.AppDO;
import com.hyzs.tibmas.core.dto.AddAppDTO;
import com.hyzs.tibmas.core.dto.ListQueryAppDTO;
import com.hyzs.tibmas.core.dto.UpdateAppDTO;
import com.hyzs.tibmas.core.service.AppService;
import com.hyzs.tibmas.core.util.EncryptUtils;
import com.hyzs.tibmas.core.vo.ClientVO;
import com.hyzs.tibmas.core.vo.SelectTreeVO;
import com.hyzs.tibmas.core.vo.SelectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kjtang on 2018/3/19 0019.
 */
@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private AppDaoManager appDaoManager;

    @Autowired
    private PermDaoManager permDaoManager;

    @Transactional
    @Override
    public Integer insert(AddAppDTO dto) {
        //验证应用信息
        //1.验证应用名称
        Integer count = appDaoManager.countByAppName(dto.getAppName());
        if(count>0)
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该应用名称已经存在");
        count = appDaoManager.countByAppCode(dto.getAppCode());
        //2.验证应用编码
        if(count>0)
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该应用编码已经存在");
        AppDO appDO = CommonUtils.newInstance(dto,AppDO.class);
        appDO.setAccessKey(EncryptUtils.encryptBySha256(appDO.getAccessKeyPlain()));

        return appDaoManager.insertNotNullProperties(appDO);
    }

    @Transactional
    @Override
    public Integer updateById(UpdateAppDTO dto) {
        //验证应用信息
        //1.验证应用名称
        AppDO dbAppDO = appDaoManager.singleResultByAppName(dto.getAppName());
        if(dbAppDO!=null && !dbAppDO.getId().equals(dto.getId()))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该应用名称已经存在");
        //2.验证应用编码
        dbAppDO = appDaoManager.singleResultByAppCode(dto.getAppCode());
        if(dbAppDO!=null && !dbAppDO.getId().equals(dto.getId()))
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"该应用编码已经存在");
        AppDO appDO = CommonUtils.newInstance(dto,AppDO.class);
        //3.更新应用信息
        return appDaoManager.updateNotNullProperties(appDO);
    }

    @Transactional
    @Override
    public Integer deleteById(Long id) {
        //判断该应用是否被使用
        if(permDaoManager.countByAppId(id)>0) {
            //throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该应用已经被使用不能删除");
            permDaoManager.deleteByAppId(id);
        }
        //删除应用
        return appDaoManager.deleteById(id);
    }

    @Transactional
    @Override
    public Integer deleteByIds(List<Long> ids) {
        //判断传入的Id集合是否为空
        if(CollectionUtils.isEmpty(ids)) throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"请选择要删除的应用");
        //检查应用是否被使用
        for(Long id:ids){
            if(permDaoManager.countByAppId(id)>0) {
                //throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该应用已经被使用不能删除");
                permDaoManager.deleteByAppId(id);
            }
        }
        return appDaoManager.deleteByIds(ids);
    }

    @Override
    public AppBO getById(Long id) {
        AppDO appDO = appDaoManager.getById(id);
        if(appDO == null){
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"没有找到信息！");
        }
        AppBO appBO = CommonUtils.newInstance(appDO,AppBO.class);
        return appBO;
    }

    @Override
    public PageBO<AppBO> listQuery(ListQueryAppDTO listQueryAppDTO) {
        //拼接查询条件
        List<QueryItemDTO> conditions = new ArrayList<>();
        //首先通过名称模糊查询
        if(!StringUtils.isEmpty(listQueryAppDTO.getAppName())){
            conditions.add(DaoUtils.buildLike(AppDO.DB_APP_NAME,"%"+listQueryAppDTO.getAppName()+"%"));
        }else if(!StringUtils.isEmpty(listQueryAppDTO.getAppCode())){
            conditions.add(DaoUtils.buildLike(AppDO.DB_APP_CODE,"%"+listQueryAppDTO.getAppCode()+"%"));
        }else if(!StringUtils.isEmpty(listQueryAppDTO.getAccessKeyPlain())){
            conditions.add(DaoUtils.buildLike(AppDO.DB_ACCESS_KEY,"%"+listQueryAppDTO.getAccessKeyPlain()+"%"));
        }
        listQueryAppDTO.setQueryItems(conditions);
        PageBO<AppDO> pageBO  = appDaoManager.pageQuery(listQueryAppDTO);

        if(pageBO == null){
            return new PageBO<>();
        }

        return CommonUtils.convertPageBO(pageBO,AppBO.class);
    }

    @Override
    public AppDO getByAppCode(String appCode){
        return appDaoManager.singleResultByAppCode(appCode);
    }

    @Override
    public List<SelectVO> listAppSelectVO(){
        List<AppDO> appDOList = appDaoManager.listAll();
        if(CollectionUtils.isEmpty(appDOList)){
            return Collections.emptyList();
        }
        List<SelectVO> selectVOList = new ArrayList<>();
        for(AppDO appDO : appDOList){
            SelectVO selectVO = new SelectVO(appDO.getId(),appDO.getAppName());
            selectVOList.add(selectVO);
        }
        return selectVOList;
    }

    @Override
    public List<SelectTreeVO> listAppSelectTreeVO(){
        List<AppDO> appDOList = appDaoManager.listAll();
        if(CollectionUtils.isEmpty(appDOList)){
            return Collections.emptyList();
        }
        List<SelectTreeVO> selectTreeVOList = new ArrayList<>();
        for(AppDO appDO : appDOList){
            SelectTreeVO selectTreeVO = new SelectTreeVO(appDO.getId(),appDO.getId()+"-"+appDO.getAppName(),appDO.getAppName());
            selectTreeVOList.add(selectTreeVO);
        }
        return selectTreeVOList;
    }

    @Override
    public ClientVO getClient(String clientId){
        ClientVO clientVO = null;
        AppDO appDO = appDaoManager.singleResultByAppCode(clientId);
        if(appDO != null){
            clientVO = CommonUtils.newInstance(appDO,ClientVO.class);
        }
        return clientVO;
    }
}