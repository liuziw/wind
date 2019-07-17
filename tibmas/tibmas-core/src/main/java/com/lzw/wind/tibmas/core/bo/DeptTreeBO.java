package com.lzw.wind.tibmas.core.bo;

import com.lzw.wind.tibmas.core.dbo.DeptDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by kjtang on 2018/3/15 0015.
 */
@Data
@ApiModel("部门业务实体")
public class DeptTreeBO extends DeptDO {

    @ApiModelProperty("子部门")
    private List<DeptTreeBO> children;

}
