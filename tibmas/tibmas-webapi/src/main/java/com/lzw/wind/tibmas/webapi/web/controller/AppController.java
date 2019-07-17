package com.lzw.wind.tibmas.webapi.web.controller;

import com.lzw.common.core.bo.PageBO;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.common.core.web.controller.BaseController;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.wind.tibmas.core.bo.AppBO;
import com.lzw.wind.tibmas.core.dto.AddAppDTO;
import com.lzw.wind.tibmas.core.dto.IdsDTO;
import com.lzw.wind.tibmas.core.dto.ListQueryAppDTO;
import com.lzw.wind.tibmas.core.dto.UpdateAppDTO;
import com.lzw.wind.tibmas.core.service.AppService;
import com.lzw.wind.tibmas.core.vo.SelectTreeVO;
import com.lzw.wind.tibmas.core.vo.SelectVO;
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
@RequestMapping("/api/v1.0/app")
@Api(value="AppController",description = "应用管理API")
public class AppController extends BaseController {

    @Autowired
    private AppService appService;

    @ApiOperation("新增应用信息")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ResponseVO<Integer> insert(@RequestBody AddAppDTO dto){
        return CommonUtils.okResponseVO(appService.insert(dto));
    }

    @ApiOperation("修改应用信息")
    @RequestMapping(value = "/updateById",method = RequestMethod.POST)
    public ResponseVO<Integer> updateById(@RequestBody UpdateAppDTO dto){
        return CommonUtils.okResponseVO(appService.updateById(dto));
    }

    @ApiOperation("删除应用信息")
    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    public ResponseVO<Integer> deleteById(@RequestBody IdDTO<Long> idDTO){
        return CommonUtils.okResponseVO(appService.deleteById(idDTO.getId()));
    }

    @ApiOperation("批量删除应用信息")
    @RequestMapping(value = "/deleteByIds",method = RequestMethod.POST)
    public ResponseVO<Integer> deleteByIds(@RequestBody IdsDTO<Long> idsDTO){
        return CommonUtils.okResponseVO(appService.deleteByIds(idsDTO.getIds()));
    }

    @ApiOperation("通过Id查询应用详情信息")
    @RequestMapping(value="/getById",method = RequestMethod.POST)
    public ResponseVO<AppBO> getById(@RequestBody IdDTO<Long> idDTO){
        return CommonUtils.okResponseVO(appService.getById(idDTO.getId()));
    }

    @ApiOperation("查询应用信息列表 ")
    @RequestMapping(value = "/listQuery",method = RequestMethod.POST)
    public ResponseVO<PageBO<AppBO>> listQuery(@RequestBody ListQueryAppDTO listQueryAppDTO){
        PageBO<AppBO> dataList = appService.listQuery(listQueryAppDTO);
        return CommonUtils.okResponseVO(dataList);
    }

    @ApiOperation("app下拉列表")
    @RequestMapping(value = "/listAppSelectVO",method = RequestMethod.POST)
    public ResponseVO<List<SelectVO>> listAppSelectVO() {
        return CommonUtils.okResponseVO(appService.listAppSelectVO());
    }

    @ApiOperation("app下拉列表")
    @RequestMapping(value = "/listAppSelectTreeVO",method = RequestMethod.POST)
    public ResponseVO<List<SelectTreeVO>> listAppSelectTreeVO() {
        return CommonUtils.okResponseVO(appService.listAppSelectTreeVO());
    }

}