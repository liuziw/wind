package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.UserSecretQuestionDao;
import com.lzw.wind.tibmas.core.daomanager.UserSecretQuestionDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableUserSecretQuestionDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSecretQuestionDaoManagerImpl extends  ImmutableUserSecretQuestionDaoManagerImpl implements UserSecretQuestionDaoManager{


    @Autowired
    private UserSecretQuestionDao userSecretQuestionDao;

}
