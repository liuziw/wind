package com.lzw.common.dao.web.controller;


import com.lzw.common.core.bo.PageBO;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.common.core.web.controller.BaseController;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.common.dao.dto.PageQueryItemDTO;
import com.lzw.common.dao.service.DOService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class DOController<D,K> extends BaseController {

    private DOService<D,K> doService;


    public void setDoService(DOService<D, K> doService) {
        this.doService = doService;
    }

    @RequestMapping(value = "/pageQuery",method = RequestMethod.POST)
    @ApiOperation("查询")
    public ResponseVO<PageBO<D>> pageQuery(@RequestBody PageQueryItemDTO pageQueryItemDTO) {
        return CommonUtils.okResponseVO(this.doService.pageQuery(pageQueryItemDTO));
    }

    @RequestMapping(value = "/getById",method = RequestMethod.POST)
    @ApiOperation("根据ID获取详细信息")
    public ResponseVO<D> getById(@RequestBody IdDTO<K> dto) {
        if(dto==null || dto.getId()==null){
            throw CommonException.exception("id can not be null");
        }
        return CommonUtils.okResponseVO(this.doService.getById(dto.getId()));
    }

    @RequestMapping(value = "/deleteById",method = RequestMethod.POST)
    @ApiOperation("根据ID删除记录")
    public ResponseVO<Integer> deleteById(@RequestBody IdDTO<K> dto) {
        if(dto==null || dto.getId()==null){
            throw CommonException.exception("id can not be null");
        }
        return CommonUtils.okResponseVO(this.doService.deleteById(dto.getId()));
    }

    @RequestMapping(value = "/updateById",method = RequestMethod.POST)
    @ApiOperation("根据ID更新记录，为空或不填的字段不更新")
    public ResponseVO<Integer> updateById(@RequestBody D d) {
        if(d==null){
            throw CommonException.exception("do can not be null");
        }
        return CommonUtils.okResponseVO(this.doService.updateById(d));
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ApiOperation("插入新的记录")
    public ResponseVO<Integer> insert(@RequestBody D d) {
        return CommonUtils.okResponseVO(this.doService.insert(d));
    }
}
