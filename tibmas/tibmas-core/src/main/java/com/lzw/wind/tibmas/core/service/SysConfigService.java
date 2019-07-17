package com.lzw.wind.tibmas.core.service;

import com.lzw.common.core.bo.PageBO;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.wind.tibmas.core.dbo.SysConfigDO;
import com.lzw.wind.tibmas.core.dto.SysConfigDTO;
import com.lzw.wind.tibmas.core.dto.SysConfigQueryConditionDTO;

/**
 * Created by yeyu on 2018/5/15.
 */
public interface SysConfigService {

    /**
     * 查询系统配置信息集（根据查询条件）
     *
     * @param sysConfigQueryConditionDTO
     * @return
     */
    PageBO<SysConfigDO> listQuerySysConfig(SysConfigQueryConditionDTO sysConfigQueryConditionDTO);

    /**
     * 查询系统配置详情 （根据ID）
     *
     * @param idDTO
     * @return
     */
    SysConfigDO findSysConfigById(IdDTO<Long> idDTO);

    /**
     * 修改系统配置信息
     *
     * @param sysConfigDTO
     * @return
     */
    Integer updateById(SysConfigDTO sysConfigDTO);
}
