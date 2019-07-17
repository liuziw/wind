package com.lzw.wind.tibmas.core.manager;


import com.lzw.wind.tibmas.core.dbo.PermDO;
import com.lzw.wind.tibmas.core.vo.PermTreeVO;

import java.util.List;

/**
 * @author liuzw
 * @date 2018/3/139:16
 */
public interface PermManager {

    /**
     * 传入权限list返回权限的上下级
     * @param permDOList
     * @return
     */
    public List<PermTreeVO> getPermTreeTable(List<PermDO> permDOList);

    /**
     * 组装权限树
     * @param permDOList
     * @return
     */
    public List<PermTreeVO> getPermTree(List<PermDO> permDOList);

    /**
     * 判断选中的权限的父权限有没有被选中，如果没有则加进去
     * @param permIds
     * @return
     */
    public void fullPermPid(List<Long> permIds);

}
