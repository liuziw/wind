package com.lzw.common.sso.web.controller;

import com.hyzs.gz.common.core.util.CommonUtils;
import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.gz.common.core.web.controller.BaseController;
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
