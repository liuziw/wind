package com.lzw.wind.tibmas.core.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by yeyu on 2018/5/18.
 */
@ApiModel("常用语页面下拉框 视图对象")
@Data
public class CommonExpressionSelectVO2 {

    @ApiModelProperty(value = "所属环节 下拉框")
    private List<SelectVO> selectVOList;

}
