package com.lzw.wind.tibmas.log.service;

import com.hyzs.tibmas.log.dto.InsertOptrLogDTO;

import java.util.List;

public interface OptrLogService {

    public void insertOptrLog(InsertOptrLogDTO insertOptrLogDTO);

    public void insertOptrLogList(List<InsertOptrLogDTO> list);
}
