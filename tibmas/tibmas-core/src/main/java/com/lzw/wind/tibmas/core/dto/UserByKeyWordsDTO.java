package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/6/13
 * @description:
 */
@ApiModel("通过关键字请求用户实体")
@Data
public class UserByKeyWordsDTO {

    @ApiModelProperty("关键字")
    private String keyWords;
}
