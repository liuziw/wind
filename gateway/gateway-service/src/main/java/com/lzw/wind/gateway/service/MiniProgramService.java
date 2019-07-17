package com.lzw.wind.gateway.service;


import com.lzw.wind.gateway.bo.MiniProgramLoginBO;
import com.lzw.wind.gateway.dto.MiniProgramLoginDTO;

public interface MiniProgramService {



    public MiniProgramLoginBO login(MiniProgramLoginDTO loginDTO);
}
