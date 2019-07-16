package com.lzw.wind.Controller;

import com.lzw.wind.common.ServerResponse;
import com.lzw.wind.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/7/11 15:49
 */
@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @GetMapping
    public ServerResponse token() {
        return tokenService.createToken();
    }

}