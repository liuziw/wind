package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.po.LouDong;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface LouDongRepository {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
