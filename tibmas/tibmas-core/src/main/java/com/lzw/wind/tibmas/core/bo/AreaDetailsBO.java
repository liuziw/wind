package com.lzw.wind.tibmas.core.bo;

import com.hyzs.tibmas.core.dbo.AreaDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2018/4/2.
 */
@Data
@ApiModel("地区详情实体")
public class AreaDetailsBO {

    private AreaDO areaDO;

    @ApiModelProperty(value = "属于该地区的部门")
    private List<DeptBO> deptBOList;
}
