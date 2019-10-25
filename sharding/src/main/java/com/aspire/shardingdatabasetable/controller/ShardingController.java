package com.aspire.shardingdatabasetable.controller;

import com.aspire.shardingdatabasetable.model.StaffPO;
import com.aspire.shardingdatabasetable.service.ShardingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author liuziw
 * @date 2019/9/5 9:10
 */
@RestController
public class ShardingController {

    @Autowired
    private ShardingService shardingService;

    @RequestMapping("test")
    public Integer test(){
        String uuid = UUID.randomUUID().toString();
        StaffPO staffPO = StaffPO.builder()
                .id(uuid)
                .name("无敌小婷妹")
                .age(21)
                .gender("女")
                .build();
        int result = shardingService.insertDemo(staffPO);
        return result;
    }
}
