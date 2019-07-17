package com.lzw.wind.tibmas.manage.impl;

import com.alibaba.druid.util.StringUtils;
import com.lzw.wind.tibmas.core.util.EncryptUtils;
import com.lzw.wind.tibmas.manage.PasswordManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @version 1.0.0
 * @author: liuzw
 * @date: 2019/5/30
 * @description:
 */
@Component
public class PasswordManagerImpl implements PasswordManager,PasswordEncoder {

    /**
     * 密码加密
     * @param password
     * @return 加密后密码
     */
    @Override
    public String encrypt(String password) {
        return EncryptUtils.encryptBySha256(password);
    }


    /**
     *  PasswordEncoder 密码加密
     * @param rawPassword
     * @return 加密后密码
     */
    @Override
    public String encode(CharSequence rawPassword) {
        return this.encrypt(rawPassword.toString());
    }

    /**
     * 密码校验
     * @param rawPassword
     * @param encodedPassword
     * @return
     */
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return StringUtils.equals(this.encode(rawPassword),encodedPassword);
    }
}
