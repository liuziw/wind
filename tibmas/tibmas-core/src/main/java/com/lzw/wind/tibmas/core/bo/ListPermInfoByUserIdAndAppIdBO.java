package com.lzw.wind.tibmas.core.bo;


import com.hyzs.tibmas.core.dbo.PermDO;
import com.hyzs.tibmas.core.dbo.RoleDO;
import com.hyzs.tibmas.core.vo.PermTreeVO;
import lombok.Data;

import java.util.List;

@Data
public class ListPermInfoByUserIdAndAppIdBO {


    /**
     * 操作权限
     */
    private List<PermDO> optrPermList;


    /**
     * 菜单树
     */
    private List<PermTreeVO> permTreeVOS;


    /**
     * 角色
     */
    private List<RoleDO> roleDOList;
}
