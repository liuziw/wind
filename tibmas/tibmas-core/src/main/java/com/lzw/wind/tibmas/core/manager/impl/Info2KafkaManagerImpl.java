
package com.lzw.wind.tibmas.core.manager.impl;


import com.hyzs.event.kafka.producer.event.KafkaProducerEvent;
import com.hyzs.gz.common.core.manager.IdManager;
import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.tibmas.core.dbo.DeptDO;
import com.hyzs.tibmas.core.dbo.RoleDO;
import com.hyzs.tibmas.core.dbo.UserDO;
import com.hyzs.tibmas.core.dto.DeptDTO;
import com.hyzs.tibmas.core.dto.RoleDTO;
import com.hyzs.tibmas.core.dto.UserDTO;
import com.hyzs.tibmas.core.manager.Info2KafkaManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/7/24 9:57
 */

@Component
@Primary
@ConditionalOnClass(name="com.hyzs.event.kafka.producer.event.KafkaProducerEvent")
@ConditionalOnProperty(name="hyzs.tibmas.info2kafka.enabled",havingValue="true",matchIfMissing = false)
public class Info2KafkaManagerImpl implements Info2KafkaManager {


    public Info2KafkaManagerImpl() {
        super();
    }

    @Autowired
    private IdManager idManager;
    @Autowired
    private ApplicationContext applicationContext;

    ExecutorService executor = Executors.newFixedThreadPool(4);

    @Override
    public void addUser(UserDO userDO) {
        CompletableFuture.supplyAsync(()->user2KafkaManager(userDO,"insert"),executor);
    }

    @Override
    public void updateUser(UserDO userDO) {
        CompletableFuture.supplyAsync(()->user2KafkaManager(userDO,"update"),executor);
    }

    @Override
    public void deleteUser(UserDO userDO) {
        CompletableFuture.supplyAsync(()->user2KafkaManager(userDO,"delete"),executor);
    }

    @Override
    public void addRole(RoleDO roleDO) {
        CompletableFuture.supplyAsync(()->role2KafkaManager(roleDO,"insert"),executor);
    }

    @Override
    public void updateRole(RoleDO roleDO) {
        CompletableFuture.supplyAsync(()->role2KafkaManager(roleDO,"update"),executor);
    }

    @Override
    public void deleteRole(RoleDO roleDO) {
        CompletableFuture.supplyAsync(()->role2KafkaManager(roleDO,"delete"),executor);
    }

    @Override
    public void addDept(DeptDO deptDO) {
        CompletableFuture.supplyAsync(()->dept2KafkaManager(deptDO,"insert"),executor);
    }

    @Override
    public void updateDept(DeptDO deptDO) {
        CompletableFuture.supplyAsync(()->dept2KafkaManager(deptDO,"update"),executor);
    }

    @Override
    public void deleteDept(DeptDO deptDO) {
        CompletableFuture.supplyAsync(()->dept2KafkaManager(deptDO,"delete"),executor);
    }

    private String user2KafkaManager(UserDO userDO, String operateType){
        UserDTO userDTO = CommonUtils.newInstance(userDO,UserDTO.class);
        userDTO.setOperateType(operateType);
        KafkaProducerEvent kafkaEvent = new KafkaProducerEvent(this,"tibmas_activiti_user",idManager.createId(),userDTO);
        this.applicationContext.publishEvent(kafkaEvent);
        return null;
    }

    private String role2KafkaManager(RoleDO roleDO, String operateType){
        RoleDTO roleDTO = CommonUtils.newInstance(roleDO,RoleDTO.class);
        roleDTO.setOperateType(operateType);
        KafkaProducerEvent kafkaEvent = new KafkaProducerEvent(this,"tibmas_activiti_role",idManager.createId(),roleDTO);
        this.applicationContext.publishEvent(kafkaEvent);
        return null;
    }

    private String dept2KafkaManager(DeptDO deptDO, String operateType){
        DeptDTO deptDTO = CommonUtils.newInstance(deptDO,DeptDTO.class);
        deptDTO.setOperateType(operateType);
        KafkaProducerEvent kafkaEvent = new KafkaProducerEvent(this,"tibmas_activiti_dept",idManager.createId(),deptDTO);
        this.applicationContext.publishEvent(kafkaEvent);
        return null;
    }

}

