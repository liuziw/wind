package com.lzw.wind.tibmas.core.dto;

import com.hyzs.gz.common.dao.dto.PageQueryItemDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by kjtang on 2018/3/20 0020.
 */
@Data
@ApiModel("应用查询传输对象")
public class ListQueryAppDTO extends PageQueryItemDTO {


    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     *应用程序编码
     */
    @ApiModelProperty(value = "应用程序编码")
    private String appCode;

    /**
     *应用程序名称
     */
    @ApiModelProperty(value = "应用程序名称")
    private String appName;


    @ApiModelProperty(value = "访问的key（明文）")
    private String accessKeyPlain;


}
