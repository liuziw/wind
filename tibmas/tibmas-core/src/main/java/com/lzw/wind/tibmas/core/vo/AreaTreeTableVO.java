package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by liuzw on 2018/3/31 1530.
 */
@Data
@ApiModel("区域视图对象")
public class AreaTreeTableVO {


    @ApiModelProperty("与id值一样，不过为String类型的")
    private String key;

    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


    /**
     *区域代码
     */
    @ApiModelProperty(value = "区域代码")
    private Long code;


    /**
     *区域名称
     */
    @ApiModelProperty(value = "区域名称")
    private String name;


    /**
     *上级区域ID
     */
    @ApiModelProperty(value = "上级区域ID")
    private Long pid;


    /**
     *区域经度
     */
    @ApiModelProperty(value = "区域经度")
    private String longitude;


    /**
     *区域纬度
     */
    @ApiModelProperty(value = "区域纬度")
    private String latitude;


    /**
     *存储层级路径，便于查询
     */
    @ApiModelProperty(value = "存储层级路径，便于查询")
    private String levelPath;


    /**
     *区域等级
     */
    @ApiModelProperty(value = "区域等级")
    private Integer level;


    /**
     *创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private java.util.Date gmtCreate;


    /**
     *更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private java.util.Date gmtModified;


    @ApiModelProperty("子节点")
    private List<AreaTreeTableVO> children;

    @ApiModelProperty("是否为根节点")
    private boolean root;



}
