package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by kjtang on 2018/3/21 0021.
 */
@Data
@ApiModel("区域查询传输实体")
public class ListQueryAreaDTO {

    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


    /**
     *区域名称
     */
    @ApiModelProperty(value = "区域名称")
    private String name;


    /**
     *区域父ID
     */
    @ApiModelProperty(value = "区域父ID")
    private Long pid;


    /**
     *区域编码
     */
    @ApiModelProperty(value = "区域编码")
    private String code;

}
