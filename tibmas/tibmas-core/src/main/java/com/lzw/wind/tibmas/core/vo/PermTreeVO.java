package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by kjtang on 2018/3/14 0014.
 */
@Data
@ApiModel("权限业务实体")
public class PermTreeVO {

    private Long id;

    private Long pid;

    @ApiModelProperty("菜单名称")
    private String permName;

    @ApiModelProperty("菜单图标")
    private Long permIcon;

    @ApiModelProperty("权限编码")
    private String permCode;

    /**
     *图标地址
     */
    @ApiModelProperty(value = "图标地址")
    private String permIconUrl;

    @ApiModelProperty("路径")
    private String permUrl;

    @ApiModelProperty("权限类型")
    private Integer permType;

    @ApiModelProperty("权限类型")
    private String permTypeName;

    /**
     *权限描述
     */
    @ApiModelProperty(value = "权限描述")
    private String permDesc;

    @ApiModelProperty("与id值一样，不过为String类型的")
    private String key;

    /**
     *权限对应的应用程序
     */
    /*@ApiModelProperty(value = "权限对应的应用程序")
    private Long appId;*/


    /**
     *排序
     */
    @ApiModelProperty(value = "排序")
    private Long seq;

    /**
     *是否禁用
     */
    @ApiModelProperty(value = "是否禁用")
    private Integer enableStatus;

    @ApiModelProperty("子菜单")
    private List<PermTreeVO> children;

}
