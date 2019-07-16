package com.lzw.wind.gateway.service;

import com.hyzs.gateway.bo.MiniProgramLoginBO;
import com.hyzs.gateway.dto.MiniProgramLoginDTO;

public interface MiniProgramService {



    public MiniProgramLoginBO login(MiniProgramLoginDTO loginDTO);
}
