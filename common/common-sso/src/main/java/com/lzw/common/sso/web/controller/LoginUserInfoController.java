package com.lzw.common.sso.web.controller;

import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.core.vo.ResponseVO;
import com.lzw.common.core.web.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author liys
 * @date 2018/6/2615:06
 */
@RestController
public class LoginUserInfoController extends BaseController {

    @RequestMapping(value = "/webapi/loginUserInfo",method = RequestMethod.POST)
    public ResponseVO<Principal> loginUserInfo(Principal principal){
        return CommonUtils.okResponseVO(principal);
    }
}
