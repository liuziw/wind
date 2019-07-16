package com.lzw.common.core.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/1/15 17:05
 */
@Data
@ApiModel("gps坐标实体")
public class Gps {

    @ApiModelProperty("坐标Y,纬度")
    private String latitude;

    @ApiModelProperty("坐标X,经度")
    private String longitude;

}
