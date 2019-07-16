package com.lzw.wind.tibmas.webapi.web.controller;

import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
import com.hyzs.tibmas.core.dbo.AddSecretQuestionDTO;
import com.hyzs.tibmas.core.dto.ListSecretQuestionDTO;
import com.hyzs.tibmas.core.dto.SecretQuestionDTO;
import com.hyzs.tibmas.core.dto.ValidateSecretQuestionDTO;
import com.hyzs.tibmas.core.service.SecretQuestionService;
import com.hyzs.tibmas.core.vo.SecretQuestionVO;
import com.hyzs.tibmas.core.vo.UserSecretQuestionVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/6/29 10:37
 */
@RestController
@RequestMapping(value = {"/api/v1.0/secretQuestion"})
@Api(value = "SecretQuestionController", description = "密保问题相关接口")
public class SecretQuestionController extends BaseController {

    @Autowired
    private SecretQuestionService secretQuestionService;


    @ApiOperation("保存用户密保问题")
    @RequestMapping(value = "/addUserSecretQuestions", method = RequestMethod.POST)
    public ResponseVO<Integer> addUserSecretQuestions(@RequestBody SecretQuestionDTO dto){
        return CommonUtils.okResponseVO(secretQuestionService.addUserSecretQuestions(dto));
    }

    @ApiOperation("修改用户密保问题")
    @RequestMapping(value = "/updateUserSecretQuestions", method = RequestMethod.POST)
    public ResponseVO<Integer> updateUserSecretQuestions(@RequestBody SecretQuestionDTO dto){
        return CommonUtils.okResponseVO(secretQuestionService.updateUserSecretQuestions(dto));
    }

    @ApiOperation("查询用户密保问题")
    @RequestMapping(value = "/listUserSecretQuestions", method = RequestMethod.POST)
    public ResponseVO<List<UserSecretQuestionVO>> listUserSecretQuestions(@RequestBody ListSecretQuestionDTO dto){
        return CommonUtils.okResponseVO(secretQuestionService.listUserSecretQuestions(dto));
    }

    @ApiOperation("验证用户密保问题")
    @RequestMapping(value = "/validateSecretQuestions", method = RequestMethod.POST)
    public ResponseVO<String> validateSecretQuestions(@RequestBody ValidateSecretQuestionDTO dto){
        return CommonUtils.okResponseVO(secretQuestionService.validateSecretQuestions(dto));
    }

    @ApiOperation("添加密保问题")
    @RequestMapping(value = "/addSecretQuestions", method = RequestMethod.POST)
    public ResponseVO<Integer> addSecretQuestions(@RequestBody AddSecretQuestionDTO dto){
        return CommonUtils.okResponseVO(secretQuestionService.addSecretQuestion(dto));
    }

    @ApiOperation("查询密保问题列表（可做下拉）")
    @RequestMapping(value = "/listSecretQuestion", method = RequestMethod.POST)
    public ResponseVO<List<SecretQuestionVO>> listSecretQuestion(){
        return CommonUtils.okResponseVO(secretQuestionService.listSecretQuestion());
    }

}
