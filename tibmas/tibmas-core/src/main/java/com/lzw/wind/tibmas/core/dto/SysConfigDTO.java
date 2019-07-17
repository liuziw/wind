package com.lzw.wind.tibmas.core.dto;

import com.lzw.common.dao.dto.PageQueryItemDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by yeyu on 2018/5/15.
 */
@ApiModel("系统配置 传输对象")
@Data
public class SysConfigDTO extends PageQueryItemDTO {

    @ApiModelProperty(value = "代理主键")
    private Long id;

    @ApiModelProperty(value = "键")
    private String configKey;

    @ApiModelProperty(value = "值")
    private String configValue;

    @ApiModelProperty(value = "备注")
    private String remark;

}
