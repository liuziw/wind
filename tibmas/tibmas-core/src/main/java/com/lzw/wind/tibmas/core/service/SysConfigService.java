package com.lzw.wind.tibmas.core.service;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.dao.dto.IdDTO;
import com.hyzs.tibmas.core.dbo.SysConfigDO;
import com.hyzs.tibmas.core.dto.SysConfigDTO;
import com.hyzs.tibmas.core.dto.SysConfigQueryConditionDTO;

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
