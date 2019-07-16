package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author liys
 * @date 2018/3/259:43
 */
@Data
@ApiModel("树形数据，包含被选中的节点")
public class TreeWithSelectedVO {

    /**
     * 树的数据
     */
    @ApiModelProperty("树的数据")
    private List<TreeVO> treeNodes;

    /**
     * 选择中的节点
     */
    @ApiModelProperty("选择中的节点")
    private List<Long> selectIds;
}
