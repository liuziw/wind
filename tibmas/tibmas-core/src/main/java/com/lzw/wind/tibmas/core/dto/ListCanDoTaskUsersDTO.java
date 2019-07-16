package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ListCanDoTaskUsersDTO {

    /**
     * 流程启动者
     */
    private String initiatorId;

    @ApiModelProperty("流程Key")
    private String eliteDefKey;

    @ApiModelProperty("任务节点定义的code")
    private String taskNodeCode;

    @ApiModelProperty("任务的可执行用户")
    private List<String> userIds;


    @ApiModelProperty("任务的可执行角色")
    private List<String> roleIds;


    @ApiModelProperty("任务的可执行组织")
    private List<String> deptIds;


    @ApiModelProperty("任务的可执行团队")
    private List<String> teamIds;

}
