package com.lzw.wind.test.daomanager.impl;

import com.lzw.wind.test.daomanager.UserDaoManager;
import com.lzw.wind.test.dbo.UserDO;
import com.lzw.wind.test.daomanager.immutable.impl.ImmutableUserDaoManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import com.lzw.wind.test.mapper.UserMapper;
import com.lzw.wind.test.dao.UserDao;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserDaoManagerImpl extends  ImmutableUserDaoManagerImpl implements UserDaoManager{


    @Autowired
    private UserDao userDao;

}
