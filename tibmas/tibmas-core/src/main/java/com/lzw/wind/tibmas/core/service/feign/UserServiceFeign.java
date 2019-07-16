package com.lzw.wind.tibmas.core.service.feign;

import com.hyzs.gz.common.core.vo.ResponseVO;
import com.hyzs.tibmas.core.dto.StartIstByDefKeyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0.0
 * @author: liuzw
 * @date: 2019/6/19
 * @description:
 */
@FeignClient(name = "ELITE-SERVICE",path = "elite-service/elite/webapi/core/")
public interface UserServiceFeign {

        @RequestMapping("startIstByDefKey")
        public ResponseVO<Boolean> startIstByDefKey(@RequestBody StartIstByDefKeyDTO startIstByDefKeyDTO);
    }
