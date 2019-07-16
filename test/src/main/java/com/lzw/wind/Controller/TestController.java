package com.lzw.wind.Controller;

import com.lzw.wind.annotation.ApiIdempotent;
import com.lzw.wind.common.ServerResponse;
import com.lzw.wind.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/7/11 15:56
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;

    @ApiIdempotent
    @PostMapping("testIdempotence")
    public ServerResponse testIdempotence() {
        return testService.testIdempotence();
    }
}
