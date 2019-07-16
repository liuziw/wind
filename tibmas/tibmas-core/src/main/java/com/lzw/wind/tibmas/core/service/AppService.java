package com.lzw.wind.tibmas.core.service;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.tibmas.core.bo.AppBO;
import com.hyzs.tibmas.core.dbo.AppDO;
import com.hyzs.tibmas.core.dto.AddAppDTO;
import com.hyzs.tibmas.core.dto.ListQueryAppDTO;
import com.hyzs.tibmas.core.dto.UpdateAppDTO;
import com.hyzs.tibmas.core.vo.ClientVO;
import com.hyzs.tibmas.core.vo.SelectTreeVO;
import com.hyzs.tibmas.core.vo.SelectVO;

import java.util.List;

/**
 * Created by kjtang on 2018/3/19 0019.
 */
public interface AppService {

    /**
     * 新增应用
     * @param dto
     * @return
     */
    public Integer insert(AddAppDTO dto);

    /**
     * 修改应用
     * @param dto
     * @return
     */
    public Integer updateById(UpdateAppDTO dto);

    /**
     * 删除应用
     * @param  id
     * @return
     */
    public Integer deleteById(Long id);

    /**
     * 批量删除应用
     * @param ids
     * @return
     */
    public Integer deleteByIds(List<Long> ids);

    /**
     * 查询应用详情
     * @param
     * @return
     */
    public AppBO getById(Long id);


    /**
     * 查询应用列表信息
     * @param listQueryAppDTO
     * @return
     */
    public PageBO<AppBO> listQuery(ListQueryAppDTO listQueryAppDTO);

    /**
     * 根据client_id(即app_code)得到app对象
     * @param appCode
     * @return
     */
    AppDO getByAppCode(String appCode);

    /**
     * 得到app下拉列表
     * @return
     */
    List<SelectVO> listAppSelectVO();

    /**
     * app下拉
     * @return
     */
    List<SelectTreeVO> listAppSelectTreeVO();

    /**
     * 根据clientId得到应用信息
     * @param clientId
     * @return
     */
    ClientVO getClient(String clientId);
}
