package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@ApiModel("根据DefKey启动表单")
public class StartIstByDefKeyDTO {

    @ApiModelProperty("流程定义key")
    private String defKey;


    @ApiModelProperty("业务ID")
    private String busId;


    @ApiModelProperty("流程名称")
    private String istName;


    @ApiModelProperty("启动者ID")
    private String initiatorId;


    @ApiModelProperty("启动者姓名")
    private String initiatorName;


    @ApiModelProperty("流程草稿箱id")
    private Long eliteDraftId;


    @ApiModelProperty("启动时的变量")
    private Map<String, Object> context;

    @ApiModelProperty("附件列表")
    private List<Long> fileIds;
}
