package com.lzw.wind.tibmas.webapi.web.controller;

import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.common.core.web.controller.BaseController;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.wind.tibmas.core.bo.AreaBO;
import com.lzw.wind.tibmas.core.bo.AreaDetailsBO;
import com.lzw.wind.tibmas.core.dbo.AreaDO;
import com.lzw.wind.tibmas.core.dto.AreaTreeDTO;
import com.lzw.wind.tibmas.core.dto.IdsDTO;
import com.lzw.wind.tibmas.core.dto.ListQueryAreaDTO;
import com.lzw.wind.tibmas.core.service.AreaService;
import com.lzw.wind.tibmas.core.service.UserService;
import com.lzw.wind.tibmas.core.vo.AreaTreeTableVO;
import com.lzw.wind.tibmas.core.vo.AreaTreeVO;
import com.lzw.wind.tibmas.core.vo.UserDetailsVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kjtang on 2018/3/16 0016.
 */
@RestController
@RequestMapping("/api/v1.0/area")
@Api(value="AreaController",description = "区域管理API")
public class AreaController extends BaseController {

    @Autowired
    private AreaService areaService;
    @Autowired
    private UserService userService;

    @ApiOperation("新增区域")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ResponseVO<Integer> insert(@RequestBody AreaDO areaDO) {
        return CommonUtils.okResponseVO(areaService.insert(areaDO));
    }

    @ApiOperation("修改区域")
    @RequestMapping(value = "/updateById",method = RequestMethod.POST)
    public ResponseVO<Integer> updateById(@RequestBody AreaDO areaDO) {
        UserDetailsVO user = userService.getUserByUserId(66L);
        return CommonUtils.okResponseVO(areaService.updateById(areaDO));
    }

    @ApiOperation("删除区域")
    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    public ResponseVO<Integer> deleteById(@RequestBody IdDTO<Long> idDTO) {
        return CommonUtils.okResponseVO(areaService.deleteById(idDTO.getId()));
    }

    @ApiOperation("批量删除区域")
    @RequestMapping(value = "/deleteByIds",method = RequestMethod.POST)
    public ResponseVO<Integer> deleteByIds(@RequestBody IdsDTO<Long> idsDTO){
        return CommonUtils.okResponseVO(areaService.deleteByIds(idsDTO.getIds()));
    }

    @ApiOperation("通过Id查询区域详细信息")
    @RequestMapping(value = "/getById",method = RequestMethod.POST)
    public ResponseVO<AreaBO> getById(@RequestBody IdDTO<Long> idDTO) {
        return CommonUtils.okResponseVO(areaService.getById(idDTO.getId()));
    }

    @ApiOperation("查询区域列表（树状结构） ")
    @RequestMapping(value = "/listQuery",method = RequestMethod.POST)
    public ResponseVO<List<AreaBO>> listQuery(@RequestBody ListQueryAreaDTO listQueryAreaDTO){
        List<AreaBO> dataList = areaService.listQuery(listQueryAreaDTO);
        return CommonUtils.okResponseVO(dataList);
    }

    @ApiOperation("查询整颗区域树")
    @RequestMapping(value = "/listAllAreaTree",method = RequestMethod.POST)
    public ResponseVO<List<AreaTreeVO>> listAllAreaTree(){
        List<AreaTreeVO> treeList = areaService.listAllAreaTree();
        return CommonUtils.okResponseVO(treeList);
    }

    @ApiOperation("根据区域id查询区域树")
    @RequestMapping(value = "/listAreaTreeById",method = RequestMethod.POST)
    public ResponseVO<List<AreaTreeVO>> listAreaTreeById(@RequestBody IdDTO<Long> dto){
        List<AreaTreeVO> treeList = areaService.listAreaTreeById(dto);
        return CommonUtils.okResponseVO(treeList);
    }

    @ApiOperation("根据默认区域树")
    @RequestMapping(value = "/listAreaTree",method = RequestMethod.POST)
    public ResponseVO<List<AreaTreeVO>> listAreaTree(){
        List<AreaTreeVO> treeList = areaService.listAreaTree();
        return CommonUtils.okResponseVO(treeList);
    }

    @ApiOperation("得到默认区域树只到街道这一层")
    @RequestMapping(value = "/listStreetAreaTree",method = RequestMethod.POST)
    public ResponseVO<List<AreaTreeVO>> listStreetAreaTree(){
        List<AreaTreeVO> treeList = areaService.listStreetAreaTree();
        return CommonUtils.okResponseVO(treeList);
    }

    @ApiOperation("查询区域树table")
    @RequestMapping(value = "/listAreaTreeTable",method = RequestMethod.POST)
    public ResponseVO<List<AreaTreeTableVO>> listAreaTreeTable(@RequestBody AreaTreeDTO areaTreeDTO){
        List<AreaTreeTableVO> treeList = areaService.listAreaTreeTable(areaTreeDTO);
        return CommonUtils.okResponseVO(treeList);
    }

    @ApiOperation("得到地区详细信息")
    @RequestMapping(value = "/getAreaDetailsById",method = RequestMethod.POST)
    public ResponseVO<AreaDetailsBO> getAreaDetailsById(@RequestBody IdDTO<Long> dto){
        return CommonUtils.okResponseVO(areaService.getAreaDetailsById(dto.getId()));
    }

}
