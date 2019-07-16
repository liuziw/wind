package com.lzw.wind.tibmas.core.service;

import com.hyzs.gz.common.dao.dto.IdDTO;
import com.hyzs.tibmas.core.bo.AreaBO;
import com.hyzs.tibmas.core.bo.AreaDetailsBO;
import com.hyzs.tibmas.core.dbo.AreaDO;
import com.hyzs.tibmas.core.dto.AreaTreeDTO;
import com.hyzs.tibmas.core.dto.ListQueryAreaDTO;
import com.hyzs.tibmas.core.vo.AreaTreeTableVO;
import com.hyzs.tibmas.core.vo.AreaTreeVO;

import java.util.List;

/**
 * Created by kjtang on 2018/3/16 0016.
 */
public interface AreaService {

    /**
     * 新增区域
     * @param areaDO
     * @return
     */
    Integer insert(AreaDO areaDO);

    /**
     * 修改区域
     * @param areaDO
     * @return
     */
    Integer updateById(AreaDO areaDO);

    /**
     * 删除区域
     * @param id
     * @return
     */
    Integer deleteById(Long id);

    /**
     * 批量删除区域信息
     * @param ids
     * @return
     */
    Integer deleteByIds(List<Long> ids);

    /**
     * 通过区域Id查询区域详情
     * @param id
     * @return
     */
    AreaBO getById(Long id);

    /**
     * 查询区域列表信息（树状结构）
     * @param listQueryAreaDTO
     * @return
     */
    List<AreaBO> listQuery(ListQueryAreaDTO listQueryAreaDTO);

    /**
     * 查询整颗资源树
     * @param
     * @return
     */
    List<AreaTreeVO> listAllAreaTree();

    /**
     * 根据id查询区域树
     * @param dto
     * @return
     */
    List<AreaTreeVO> listAreaTreeById(IdDTO<Long> dto);

    /**
     * 得到地区详细信息
     * @param id
     * @return
     */
    AreaDetailsBO getAreaDetailsById(Long id);

    /**
     * 得到区域树table
     * @param areaTreeDTO
     * @return
     */
    List<AreaTreeTableVO> listAreaTreeTable(AreaTreeDTO areaTreeDTO);

    /**
     * 得到默认地区的树
     * @return
     */
    List<AreaTreeVO> listAreaTree();

    /**
     * 得到区域树只到街道这一层
     * @return
     */
    List<AreaTreeVO> listStreetAreaTree();

    /**
     * 根据地区id得到地区全称如35,广东省汕尾市城区
     * @return
     */
    String getFullAreaNameById(Long id);

    /**
     * 根据区划ID 返回区划ID和名称字符串数组 eg.[35-城区, 39-新港街道, 213-立新社区居委会]
     * 主要用于前端所属区划字段回显
     * @param id
     * @return
     */
    String[] getAreaNameByAreaId(Long id);

}
