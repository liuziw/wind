package com.lzw.wind.tibmas.webapi.web.controller;

import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.common.core.web.controller.BaseController;
import com.lzw.wind.tibmas.core.service.TeamTypeService;
import com.lzw.wind.tibmas.core.vo.TeamTypeVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Furant
 * 2019/6/27 18:36
 */
@RestController
@RequestMapping(value = "api/v1.0/teamType")
@Api(value = "teamTypeComtroller", description = "对团队类型的操作")
public class TeamTypeController extends BaseController {

    @Autowired
    private TeamTypeService teamTypeService;

    @ApiOperation("所有的团队类型")
    @RequestMapping(value = "listTeamType", method = RequestMethod.POST)
    public ResponseVO<List<TeamTypeVO>> listTeamType() {
        return CommonUtils.okResponseVO(teamTypeService.listTeamType());
    }
}
