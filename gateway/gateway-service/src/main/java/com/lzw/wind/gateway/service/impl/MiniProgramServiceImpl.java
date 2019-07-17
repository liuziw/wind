package com.lzw.wind.gateway.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lzw.wind.gateway.bo.MiniProgramLoginBO;
import com.lzw.wind.gateway.dto.MiniProgramLoginDTO;
import com.lzw.wind.gateway.filter.AuthProperties;
import com.lzw.wind.gateway.service.MiniProgramService;
import com.lzw.wind.gateway.util.GatewayUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Service
@Slf4j
public class MiniProgramServiceImpl implements MiniProgramService {


    private RestTemplate restTemplate=new RestTemplate();

    @Autowired
    private AuthProperties authProperties;

    private static final String OPEN_ID_URL="https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";

    @Autowired
    private StringRedisTemplate redisTemplate;

    private ObjectMapper objectMapper=new ObjectMapper();

    private JacksonJsonParser jacksonJsonParser=new JacksonJsonParser();

    /**
     * <PRE>
     *     调用微信接口获取openId等信息
     *     生成token,保存在redis中
     * </PRE>
     * @param loginDTO
     * @return
     */
    @Override
    public MiniProgramLoginBO login(MiniProgramLoginDTO loginDTO) {
        AuthProperties.MiniProgram miniProgram = this.authProperties.getMiniProgram();
        if(miniProgram==null){
            throw new RuntimeException("小程序的openId没有配置");
        }
        String url=String.format(OPEN_ID_URL,miniProgram.getAppId(),miniProgram.getAppSecret(),loginDTO.getJsCode());
        ResponseEntity<String> mapResponseEntity = this.restTemplate.postForEntity(url, null, String.class);
        if(mapResponseEntity.getStatusCodeValue()!=200){
            throw new RuntimeException(String.format("调用微信接口错误,url=%s,statusCode=%d",OPEN_ID_URL,mapResponseEntity.getStatusCodeValue()));
        }
        Map map = jacksonJsonParser.parseMap(mapResponseEntity.getBody());
        log.warn("miniProgramLogin:{}",map);
        String openId=(String)map.get("openid");
        String sessionKey=(String)map.get("session_key");
        String unionId=(String)map.get("unionid");
        if(StringUtils.isBlank(openId)){
            throw new RuntimeException("没有返回openId");
        }
        MiniProgramLoginBO miniProgramLoginBO=new MiniProgramLoginBO();
        miniProgramLoginBO.setSessionKey(sessionKey);
        miniProgramLoginBO.setUnionId(unionId);
        miniProgramLoginBO.setOpenId(openId);

        //生成token
        String date= DateFormatUtils.format(new Date(),"yyyyMMdd");
        String token=date+"-"+ UUID.randomUUID().toString();
        miniProgramLoginBO.setToken(token);
        String key=GatewayUtils.MINI_PROGRAM_TOKEN_KEY+date;
        try {
            this.redisTemplate.opsForHash().put(key,token,this.objectMapper.writeValueAsString(miniProgramLoginBO));
        } catch (JsonProcessingException e) {
            log.error("json error",e);
            throw new RuntimeException(e);
        }
        return miniProgramLoginBO;
    }



}
