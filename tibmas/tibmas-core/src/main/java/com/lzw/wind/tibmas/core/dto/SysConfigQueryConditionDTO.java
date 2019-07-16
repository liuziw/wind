package com.lzw.wind.tibmas.core.dto;

import com.hyzs.gz.common.dao.dto.PageQueryItemDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by yeyu on 2018/5/15.
 */
@ApiModel("系统配置信息查询条件 传输对象")
@Data
public class SysConfigQueryConditionDTO extends PageQueryItemDTO {

    @ApiModelProperty(value = "键")
    private String configKey;

    @ApiModelProperty(value = "备注")
    private String remark;

}
