package com.lzw.wind.tibmas.core.service.feign;

import com.lzw.common.core.vo.ResponseVO;
import com.lzw.wind.tibmas.core.dto.StartIstByDefKeyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @version 1.0.0
 * @author: liuzw
 * @date: 2019/6/19
 * @description:
 */
@FeignClient(name = "TIBMAS2-LOG",path = "webapi/optrlog/")
public interface UserLogServiceFeign {

        @RequestMapping(value = "testLog", method = RequestMethod.POST)
        public ResponseVO<Boolean> testLog();
    }
