package com.lzw.wind.tibmas.core.daomanager.impl;

import com.lzw.wind.tibmas.core.dao.SecretQuestionDao;
import com.lzw.wind.tibmas.core.daomanager.SecretQuestionDaoManager;
import com.lzw.wind.tibmas.core.daomanager.immutable.impl.ImmutableSecretQuestionDaoManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecretQuestionDaoManagerImpl extends  ImmutableSecretQuestionDaoManagerImpl implements SecretQuestionDaoManager{


    @Autowired
    private SecretQuestionDao secretQuestionDao;

}
