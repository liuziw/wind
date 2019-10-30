package com.lzw.wind.tibmas.log.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.wind.tibmas.log.daomanager.OptrLogDaoManager;
import com.lzw.wind.tibmas.log.dbo.OptrLogDO;
import com.lzw.wind.tibmas.log.dto.InsertOptrLogDTO;
import com.lzw.wind.tibmas.log.service.OptrLogService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class OptrLogServiceImpl implements OptrLogService {


    @Autowired
    private OptrLogDaoManager optrLogDaoManager;

    @LcnTransaction
    @Transactional
    @Override
    public void insertOptrLog(InsertOptrLogDTO insertOptrLogDTO) {
        this.check(insertOptrLogDTO);
        OptrLogDO optrLogDO = CommonUtils.newInstance(insertOptrLogDTO, OptrLogDO.class);
        this.optrLogDaoManager.insertNotNullProperties(optrLogDO);
//        int i = 100/0;
    }

    @Override
    public void insertOptrLogList(List<InsertOptrLogDTO> list) {
        if(CollectionUtils.isEmpty(list)){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"list不能为空");
        }
        if(list.size()>1000){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"超过1000条的记录限制");
        }
        List<OptrLogDO> optrLogDOList = CommonUtils.collection2List(list, insertOptrLogDTO -> {
            this.check(insertOptrLogDTO);
            OptrLogDO optrLogDO = CommonUtils.newInstance(insertOptrLogDTO, OptrLogDO.class);
            return optrLogDO;
        });
        this.optrLogDaoManager.insertAllPropertiesList(optrLogDOList);
    }

    public void check(InsertOptrLogDTO insertOptrLogDTO){
        if(insertOptrLogDTO==null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"insertOptrLogDTO不能为空");
        }
        if(insertOptrLogDTO.getAppId()==null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"insertOptrLogDTO.appId不能为空");
        }
        if(insertOptrLogDTO.getDeptId()==null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"insertOptrLogDTO.deptId不能为空");
        }
        if(insertOptrLogDTO.getUserId()==null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"insertOptrLogDTO.userId不能为空");
        }
        if(StringUtils.isBlank(insertOptrLogDTO.getOptrDesc())){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"insertOptrLogDTO.optrDesc不能为空");
        }
        if(insertOptrLogDTO.getOptrTime()==null){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"insertOptrLogDTO.getOptrTime不能为空");
        }
    }
}
