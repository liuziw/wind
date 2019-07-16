package com.lzw.common.encrypt.annotation;

import com.hyzs.common.encrypt.mvcConverter.EncryptableMappingJackson2HttpMessageConverter;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/24 15:04
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EncryptableMappingJackson2HttpMessageConverter.class)
public @interface EnableEncrypt {
}
