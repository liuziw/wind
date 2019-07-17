package com.lzw.wind.gateway.web.controller;

import com.lzw.wind.gateway.util.GatewayUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(value = "test",method = RequestMethod.POST)
public class TestController {


    @Autowired
    private StringRedisTemplate redisTemplate;

    //@RequestMapping("getMiniProgramTestInfo")
    public Map<String,String> getMiniProgramTestInfo() {
        String date = DateFormatUtils.format(new Date(), "yyyyMMdd");
        String time = DateFormatUtils.format(new Date(), "yyyyMMddHHmmssSSS");
        String token = date + "-" + UUID.randomUUID().toString();
        String tradeId = UUID.randomUUID().toString();
        String key=UUID.randomUUID().toString().replace("-", "");
        String keyMD5 = DigestUtils.md5Hex(key);

        this.redisTemplate.opsForHash().put(GatewayUtils.MINI_PROGRAM_TOKEN_KEY+date,token,"hello");

        StringBuilder authInfo = new StringBuilder();
        authInfo.append(DigestUtils.md5Hex(token));
        authInfo.append(",");
        authInfo.append(key);
        authInfo.append(",");
        StringBuilder tmp = new StringBuilder(DigestUtils.md5Hex(token));
        for (int i = 0; i < keyMD5.length(); i = i + 2) {
            tmp.append(keyMD5.charAt(i));
        }
        authInfo.append(Base64.encodeBase64String(tmp.toString().getBytes()));

        StringBuilder channelInfo = new StringBuilder(tradeId);
        channelInfo.append(",");
        channelInfo.append(time);
        channelInfo.append(",");
        channelInfo.append(Base64.encodeBase64String((tradeId+","+time+","+DigestUtils.md5Hex(authInfo.toString().getBytes())).getBytes()));
        Map<String, String> map = new HashMap<>();
        map.put("X-Channel-Info", channelInfo.toString());
        map.put("X-Auth-Info", authInfo.toString());
        map.put("X-Token", token);
        return map;
    }
}
