package com.lzw.wind.gateway.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.WebSession;

import java.util.List;
import java.util.Map;

public class GatewayUtils {

    public static final String USER_INFO_KEY="_USER_INFO_KEY_";


    public static final String HEADER_NAME_CHANNEL_INFO="X-Channel-Info";

    public static final String HEADER_NAME_AUTH_INFO="X-Auth-Info";

    public static final String AUTH_PASSWORD="http://www.hua-cloud.com.cn";


    public static final String MINI_PROGRAM_TOKEN_KEY="wind:mini_program_token:";


    public static String getParam(ServerHttpRequest request,String name){
        MultiValueMap<String, String> queryParams = request.getQueryParams();
        List<String> stringList = queryParams.get(name);
        if(CollectionUtils.isEmpty(stringList)){
            return "";
        }
        return stringList.get(0);
    }

    public static String getHeader(ServerHttpRequest request, String name){
        HttpHeaders headers = request.getHeaders();
        List<String> stringList = headers.get(name);
        if(CollectionUtils.isEmpty(stringList)){
            return "";
        }
        return stringList.get(0);
    }


    public static void setAttributes(WebSession session,String name,Object object){
        session.getAttributes().put(name,object);
        session.save();
    }

    public static void setAttributes(WebSession session, Map<String,Object> attr){
        session.getAttributes().putAll(attr);
        session.save();
    }

    public static void setAttributes(WebSession session, String[] names,Object[] values){
        for(int i=0;i<names.length;i++){
            session.getAttributes().put(names[i],values[i]);
        }
        session.save();
    }







}
