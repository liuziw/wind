package com.lzw.wind.tibmas.core.bo;

import com.hyzs.tibmas.core.dbo.PermDO;
import com.hyzs.tibmas.core.vo.PermTreeVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by liuzw on 2018/3/26 0019.
 */
@Data
@ApiModel("用户应用权限实体")
public class UserAppBO {

    @ApiModelProperty("菜单树")
    private List<PermTreeVO> permTreeVOS;

    @ApiModelProperty("权限集合")
    private List<PermDO> permDOS;
}