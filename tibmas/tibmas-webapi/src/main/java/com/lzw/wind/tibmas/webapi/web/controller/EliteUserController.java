package com.lzw.wind.tibmas.webapi.web.controller;

import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
import com.hyzs.tibmas.core.dto.ExamineDTO;
import com.hyzs.tibmas.core.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0.0
 * @author: kjtang
 * @date: 2019/6/20
 * @description:
 */
@RestController
public class EliteUserController extends BaseController {

    @Autowired
    private UserService userService;


    @ApiOperation("审核注册用户信息 ")
    @RequestMapping(value = "examineUser/v1.0", method = RequestMethod.POST)
    public ResponseVO<Integer> examine(@RequestBody ExamineDTO dto) {
        return CommonUtils.okResponseVO(userService.examine(dto));
    }


}
