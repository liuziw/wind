package com.lzw.wind.tibmas.core.dto;

import com.lzw.common.dao.dto.PageQueryItemDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by kjtang on 2018/3/20 0020.
 */
@Data
@ApiModel("查询部门树传输实体")
public class ListQueryDeptDTO extends PageQueryItemDTO {

    @ApiModelProperty(value = "部门编码:全大写,英文数字加-组成")
    private String deptCode;

    /**
     *部门名称
     */
    @ApiModelProperty(value = "部门名称")
    private String deptName;

    /**
     *所属区域
     */
    @ApiModelProperty(value = "所属区域")
    private Long areaId;

    /**
     *所属区域
     */
    @ApiModelProperty(value = "部门PID")
    private Long pid;
}
