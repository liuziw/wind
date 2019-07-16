package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by kjtang on 2018/3/19 0019.
 */
@Data
@ApiModel("id集合传输对象")
public class IdsDTO<K> {

    @ApiModelProperty("批量Id")
    private List<K> ids;

}
