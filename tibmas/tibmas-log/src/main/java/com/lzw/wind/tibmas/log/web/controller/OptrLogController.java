package com.lzw.wind.tibmas.log.web.controller;

import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.wind.tibmas.log.dto.InsertOptrLogDTO;
import com.lzw.wind.tibmas.log.service.OptrLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/webapi/optrlog",method = RequestMethod.POST)
public class OptrLogController /*extends BaseController*/ {

    @Autowired
    private OptrLogService optrLogService;

    private static final ResponseVO<Boolean> _SUCCESS_VO= CommonUtils.okResponseVO(Boolean.TRUE);

    @RequestMapping("insertOptrLog")
    public ResponseVO<Boolean> insertOptrLog(@RequestBody InsertOptrLogDTO insertOptrLogDTO){
        this.optrLogService.insertOptrLog(insertOptrLogDTO);
        return _SUCCESS_VO;
    }

    @RequestMapping("insertOptrLogList")
    public ResponseVO<Boolean> insertOptrLogList(@RequestBody List<InsertOptrLogDTO> list){
        this.optrLogService.insertOptrLogList(list);
        return _SUCCESS_VO;
    }

    //测试分布式事务
    @RequestMapping("testLog")
    public ResponseVO<Boolean> testLog() {
        InsertOptrLogDTO dto = new InsertOptrLogDTO();
        dto.setAppId(1L);
        dto.setDeptId(1L);
        dto.setMainModel("asdf");
        dto.setOptrDesc("asdfa");
        dto.setOptrTarget("asdfa");
        dto.setSubModel("sdf");
        dto.setUserId(1L);
//        dto.setOptrTime(new Date());
        optrLogService.insertOptrLog(dto);
        return _SUCCESS_VO;
    }

}
