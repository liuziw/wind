package com.lzw.wind.tibmas.core.bo;

import com.hyzs.tibmas.core.dbo.AreaDO;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * Created by kjtang on 2018/3/19 0019.
 */
@Data
@ApiModel("区域业务实体")
public class AreaBO extends AreaDO {

    private List<AreaBO> children;

}