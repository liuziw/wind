package com.lzw.wind.gateway.manager.impl;

import com.lzw.wind.gateway.manager.StateCodeCreator;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

@Component
public class StateCodeCreatorImpl implements StateCodeCreator {

    private static final char[] _CHARS="1234567890QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();


    private static final int _CHARS_LENGTH=_CHARS.length;


    private static final int _LENGTH=6;

    @Override
    public String createStateCode() {
        char[] chars=new char[_LENGTH];
        for(int i=0;i<_LENGTH;i++){
            chars[i]= _CHARS[RandomUtils.nextInt(0,_CHARS_LENGTH)];
        }
        return new String(chars);
    }
}
