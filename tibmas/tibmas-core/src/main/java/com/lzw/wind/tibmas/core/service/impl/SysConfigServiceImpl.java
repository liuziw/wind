package com.lzw.wind.tibmas.core.service.impl;

import com.lzw.common.core.bo.PageBO;
import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.common.dao.dto.QueryItemDTO;
import com.lzw.common.dao.util.DaoUtils;
import com.lzw.wind.tibmas.core.daomanager.SysConfigDaoManager;
import com.lzw.wind.tibmas.core.dbo.SysConfigDO;
import com.lzw.wind.tibmas.core.dto.SysConfigDTO;
import com.lzw.wind.tibmas.core.dto.SysConfigQueryConditionDTO;
import com.lzw.wind.tibmas.core.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeyu on 2018/5/15.
 */
@Service
public class SysConfigServiceImpl implements SysConfigService {

    @Autowired
    private SysConfigDaoManager sysConfigDaoManager;

    /**
     * 查询系统配置信息集（根据查询条件）
     *
     * @param sysConfigQueryConditionDTO
     * @return
     */
    @Override
    public PageBO<SysConfigDO> listQuerySysConfig(SysConfigQueryConditionDTO sysConfigQueryConditionDTO) {
        // 拼接查询条件
        List<QueryItemDTO> conditions = new ArrayList<>();

        String key = sysConfigQueryConditionDTO.getConfigKey(); // 键
        if (key != null)
            conditions.add(DaoUtils.buildLike(SysConfigDO.DB_CONFIG_KEY, "%" + key + "%"));
        String remark = sysConfigQueryConditionDTO.getRemark(); // 备注
        if (remark != null)
            conditions.add(DaoUtils.buildLike(SysConfigDO.DB_REMARK, "%" + remark + "%"));

        // 设置分页查询
        sysConfigQueryConditionDTO.setQueryItems(conditions);
        sysConfigQueryConditionDTO.setSortFieldName(SysConfigDO.GMT_MODIFIED);
        sysConfigQueryConditionDTO.setSortType("desc");

        PageBO<SysConfigDO> pageBO = this.sysConfigDaoManager.pageQuery(sysConfigQueryConditionDTO);

        List<SysConfigDO> sysConfigDOList = pageBO.getList();

        if (!CollectionUtils.isEmpty(sysConfigDOList)) {
            return CommonUtils.convertPageBO(pageBO, sysConfigDO -> sysConfigDO);
        }

        return CommonUtils.convertPageBO(pageBO, a -> null);
    }

    /**
     * 查询系统配置详情 （根据ID）
     *
     * @param idDTO
     * @return
     */
    @Override
    public SysConfigDO findSysConfigById(IdDTO<Long> idDTO) {
        if (idDTO == null || idDTO.getId() == null)
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE, "请选择要修改的系统配置！");

        return this.sysConfigDaoManager.getById(idDTO.getId());
    }

    /**
     * 修改系统配置信息
     *
     * @param sysConfigDTO
     * @return
     */
    @Transactional
    @Override
    public Integer updateById(SysConfigDTO sysConfigDTO) {
        // 校验

        // DTO数据转换为DBO数据
        SysConfigDO sysConfigDO = CommonUtils.newInstance(sysConfigDTO, SysConfigDO.class);

        return this.sysConfigDaoManager.updateNotNullProperties(sysConfigDO);
    }

}
