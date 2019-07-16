package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by kjtang on 2018/3/21 0021.
 */
@Data
@ApiModel("区域视图对象")
public class TreeVO {

    @ApiModelProperty("树节点的名称")
    private String label;

    @ApiModelProperty("树节点的value值为{id}-{label}的值，前端TreeSelect控件查找时，查找是的value的内容,这样就能根据label能查询了")
    private String value;


    @ApiModelProperty("与id值一样，不过为String类型的")
    private String key;

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("pid")
    private Long pid;

    @ApiModelProperty("排序")
    private Long seq;

    @ApiModelProperty("子节点")
    private List<TreeVO> children;

}
