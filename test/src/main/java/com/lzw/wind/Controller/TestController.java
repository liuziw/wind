package com.lzw.wind.Controller;

import com.lzw.test.breakPointTrans.upload.UploadService;
import com.lzw.wind.annotation.ApiIdempotent;
import com.lzw.wind.common.ServerResponse;
import com.lzw.wind.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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


    @RequestMapping(value = "upload",method = RequestMethod.POST)
    public Long upload(@RequestParam("file") MultipartFile file,@RequestParam("lastModifyTime") String lastModifyTime){
        UploadService uploadService = new UploadService();
        return uploadService.upload(file,lastModifyTime);
    }
}
