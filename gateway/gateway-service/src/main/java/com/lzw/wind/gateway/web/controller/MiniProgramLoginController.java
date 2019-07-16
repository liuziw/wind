package com.lzw.wind.gateway.web.controller;

import com.hyzs.gateway.bo.MiniProgramLoginBO;
import com.hyzs.gateway.dto.MiniProgramLoginDTO;
import com.hyzs.gateway.service.MiniProgramService;
import com.hyzs.gateway.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/miniProgram",method = RequestMethod.POST)
public class MiniProgramLoginController {

    @Autowired
    private MiniProgramService miniProgramService;

    @RequestMapping("login")
    public ResponseVO<MiniProgramLoginBO> login(@RequestBody MiniProgramLoginDTO loginDTO){
        MiniProgramLoginBO loginBO = this.miniProgramService.login(loginDTO);
        MiniProgramLoginBO returnBO=new MiniProgramLoginBO();
        returnBO.setToken(loginBO.getToken());
        returnBO.setOpenId(loginBO.getOpenId());
        returnBO.setUnionId(loginBO.getUnionId());
        return new ResponseVO<>(0,"TradeOK",loginBO);
    }
}
