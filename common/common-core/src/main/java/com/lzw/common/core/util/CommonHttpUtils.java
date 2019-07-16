package com.lzw.common.core.util;

import com.alibaba.fastjson.JSON;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zhongsj
 * @email zhongsj@hua-cloud.com.cn
 * @date 2018/7/12
 */
@Slf4j
public class CommonHttpUtils {

    private static final RestTemplate _REST_TEMPLATE = new RestTemplate();

    static {
        _REST_TEMPLATE.getMessageConverters().forEach(e -> {
            if (e instanceof StringHttpMessageConverter) {
                StringHttpMessageConverter sm = (StringHttpMessageConverter) e;
                sm.setDefaultCharset(Charset.forName("utf8"));
            }
        });
    }

    /**
     * http工具类，没有参数get请求
     *
     * @param url
     * @return
     */
    public static ResponseEntity<String> toGet(String url) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> entity = restTemplate.getForEntity(url, String.class);
        return entity;
    }

    public static<T> ResponseVO<T> toGet(String url, Class<T> clazz) {
        ResponseEntity<ResponseVO> entity = _REST_TEMPLATE.getForEntity(url, ResponseVO.class);
        return fullResponseVOData(entity,clazz);
    }

    /**
     * http工具类，带有参数的get请求
     */
    public static ResponseEntity<String> toGet(String url, Map<String, String> map) {
        if (map != null && map.size() > 0) {
            String params = map.entrySet().stream().map(e -> e.getKey() + "={" + e.getKey() + "}").collect(Collectors.joining("&"));
            url = url + "?" + params;
        }
        log.debug("toGet:url={},param={}", url, map);
        ResponseEntity<String> entity = _REST_TEMPLATE.getForEntity(url, String.class, map);
        return entity;
    }

    public static<T> ResponseVO<T> toGet(String url, Map<String, String> map,Class<T> clazz) {
        if (map != null && map.size() > 0) {
            String params = map.entrySet().stream().map(e -> e.getKey() + "={" + e.getKey() + "}").collect(Collectors.joining("&"));
            url = url + "?" + params;
        }
        log.debug("toGet:url={},param={}", url, map);
        ResponseEntity<ResponseVO> entity = _REST_TEMPLATE.getForEntity(url, ResponseVO.class, map);
        return fullResponseVOData(entity,clazz);
    }

    public static ResponseEntity<String> toGet(String url, String[] fieldNames, String[] values) {
        if (fieldNames.length == values.length) {
            Map<String, String> map = new LinkedHashMap<>();
            for (int i = 0; i < fieldNames.length; i++) {
                map.put(fieldNames[i], values[i]);
            }
            return toGet(url, map);
        } else {
            throw CommonException.exception(1001, "属性名和值数量不匹配");
        }
    }

    /**
     * post请求
     * @param url
     * @param object
     * @param clazz
     * @return
     */
    public static<T> ResponseVO<T> toPost(String url, Object object,Class<T> clazz){
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        HttpEntity<Object> httpEntity = new HttpEntity(headers);
//        ResponseVO<T> responseVO = _REST_TEMPLATE.exchange(url,HttpMethod.GET,httpEntity, new ParameterizedTypeReference<ResponseVO<T>>() {}).getBody();
        ResponseEntity<ResponseVO> entity = _REST_TEMPLATE.postForEntity(url,object,ResponseVO.class);
        return fullResponseVOData(entity,clazz);
    }

    /**
     * 填充ResponseVO的data
     * @param entity
     * @param clazz
     * @param <T>
     */
    private static<T> ResponseVO<T> fullResponseVOData(ResponseEntity<ResponseVO> entity,Class<T> clazz){
        if(entity==null || entity.getBody()==null){
            ResponseVO responseVO = new ResponseVO();
            responseVO.setCode(-1);
            responseVO.setMsg("post请求返回空！");
            return responseVO;
        }
        if(entity.getBody().getCode() == -1){
            log.info("接口返回错误信息：",entity.getBody().getMsg());
            throw CommonException.exception("接口返回错误："+entity.getBody().getMsg());
        }
        try {
            T t = JSON.parseObject(JSON.toJSONString(entity.getBody().getData()),clazz);
            entity.getBody().setData(t);
        }catch (Exception e){
            e.printStackTrace();
            throw CommonException.exception("转换失败，传入的实体有误！");
        }
        return entity.getBody();
    }
}
