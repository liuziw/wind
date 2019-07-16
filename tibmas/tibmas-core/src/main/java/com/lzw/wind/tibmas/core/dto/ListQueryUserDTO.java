package com.lzw.wind.tibmas.core.dto;

import com.hyzs.gz.common.dao.dto.PageQueryItemDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by kjtang on 2018/3/22 0022.
 */
@Data
@ApiModel("用户查询实体")
public class ListQueryUserDTO extends PageQueryItemDTO {

    @ApiModelProperty("查询关键字")
    private String queryKey;

    @ApiModelProperty("部门id")
    private Long deptId;

}
