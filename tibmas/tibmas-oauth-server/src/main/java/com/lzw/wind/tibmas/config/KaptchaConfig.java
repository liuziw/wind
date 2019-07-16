package com.lzw.wind.tibmas.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 验证码配置
 *
 * @author zhongsj
 * @date 2018/03/15
 */
@Configuration
public class KaptchaConfig {
    @Bean
    public DefaultKaptcha producer() {
        DefaultKaptcha kaptcha = new DefaultKaptcha();
        Properties properties = new Properties();
        properties.setProperty("kaptcha.border", "no");
        properties.setProperty("kaptcha.textproducer.font.color","white");
        properties.setProperty("kaptcha.textproducer.char.space", "5");
        properties.setProperty("kaptcha.background.clear.from","54,153,214");
        properties.setProperty("kaptcha.background.clear.to","54,153,214");
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        properties.setProperty("kaptcha.noise.impl", "com.google.code.kaptcha.impl.NoNoise");
        properties.setProperty("kaptcha.image.width", "225");
        properties.setProperty("kaptcha.image.height", "112");
        properties.setProperty("kaptcha.textproducer.font.size", "80");
        properties.setProperty("kaptcha.noise.color","white");
        Config config = new Config(properties);
        kaptcha.setConfig(config);
        return kaptcha;
    }
}
