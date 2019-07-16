package com.lzw.common.encrypt.mvcConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hyzs.common.encrypt.util.EncryptUtils;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;


/**
 * 扩展{@link MappingJackson2HttpMessageConverter}接口，在转换对象时进行加解密.
 *因为写了@EnableEncypt注解来开启注入此类，所以以下代码就去调了@Component和encrypt代码
 * @author chenws
 * @email chenws@hua-cloud.com.cn
 * @date 2018/4/4
 */
//@ConditionalOnProperty(name="hyzs.encrypt.enabled",havingValue="true",matchIfMissing = false)
//@Component

@Slf4j
public class EncryptableMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {

    private static final Logger logger = LoggerFactory.getLogger(EncryptableMappingJackson2HttpMessageConverter.class);

    private static final String KEY_INDEX_NAME = "_KEY_INDEX_";

    /*@Value("${hyzs.encrypt.enabled}")
    private Boolean encrypt;*/

    private ObjectMapper objectMapper;

    public EncryptableMappingJackson2HttpMessageConverter(ObjectMapper objectMapper) {
        super(objectMapper);
        this.objectMapper=objectMapper;
    }

    @Override
    public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        //不加密
        /*if (!this.isEncrypt()) {
            logger.warn("uap.app.encrypt=false");
            return super.read(type, contextClass, inputMessage);
        }*/
        HttpInputMessage newHttpInputMessage = new HttpInputMessageWrapper(inputMessage);
        return super.read(type, contextClass, newHttpInputMessage);
    }

    @Override
    protected void writeInternal(Object object, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        //不加密
        /*if (!this.isEncrypt()) {
            super.writeInternal(object, type, outputMessage);
            return;
        }*/

        //如果不是返回ResponseVO,不做加密处理
        if (!(object instanceof ResponseVO)) {
            super.writeInternal(object, type, outputMessage);
            return;
        }
        //随机生成一个keyIndex
        int keyIndex = RandomUtils.nextInt(EncryptUtils.threeDesKeyBytesListSize());
        //写http header
        outputMessage.getHeaders().add(KEY_INDEX_NAME, new Integer(keyIndex).toString());

        //转json
        byte[] json = this.objectMapper.writeValueAsBytes(object);
        //直接写
        byte[] resBytes = EncryptUtils.encrypt3Des(keyIndex, json);
        outputMessage.getBody().write(resBytes);
        outputMessage.getBody().flush();
    }


    private static class HttpInputMessageWrapper implements HttpInputMessage {

        private HttpInputMessage httpInputMessage;

        public HttpInputMessageWrapper(HttpInputMessage httpInputMessage) {
            this.httpInputMessage = httpInputMessage;
        }

        @Override
        public InputStream getBody() throws IOException {

            //没有key值，不解密
            if (!httpInputMessage.getHeaders().containsKey(KEY_INDEX_NAME)) {
                log.warn("header[_KEY_INDEX_] not found!!");
                return this.httpInputMessage.getBody();
            }

            //解密处理
            //获取key的索引
            List<String> stringKeyIndexList = httpInputMessage.getHeaders().get(KEY_INDEX_NAME);

            int index = -1;
            //没有找到key

            //在http header里有key的情况,以该值为准
            if (!CollectionUtils.isEmpty(stringKeyIndexList)) {
                try {
                    index = Integer.parseInt(stringKeyIndexList.get(0));
                } catch (Exception e) {
                    logger.warn("index值非法", e);
                }
            }


            if (index < 0 || index >= EncryptUtils.threeDesKeyBytesListSize()) {
                throw CommonException.exception("index值非法:" + stringKeyIndexList.get(0));
            }

            byte[] bytes=IOUtils.toByteArray(this.httpInputMessage.getBody());
            //logger.warn("index={},newBytes={}",index,EncryptUtils.getBytesString(bytes));
            //生成新的InputStream
            ByteArrayInputStream newIs = new ByteArrayInputStream(EncryptUtils.decrypt3Des(index, bytes));
            return newIs;
        }

        @Override
        public HttpHeaders getHeaders() {
            return this.httpInputMessage.getHeaders();
        }
    }


//    protected boolean isEncrypt(){

        /*
        HttpServletRequest request=getHttpServletRequest();
        if(StringUtils.isNotBlank(request.getHeader(KEY_INDEX_NAME))){
            return true;
        }
        if (!this.encrypt) {
            return false;
        }
        return true;
        */
//        return this.encrypt.booleanValue();
//    }

    public static HttpServletRequest getHttpServletRequest(){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes())
                .getRequest();
        return request;
    }
}
