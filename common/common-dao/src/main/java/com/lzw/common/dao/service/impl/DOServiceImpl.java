package com.lzw.common.dao.service.impl;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.dao.daomanager.CommonDaoManager;
import com.hyzs.gz.common.dao.dto.PageQueryItemDTO;
import com.hyzs.gz.common.dao.manager.DOChecker;
import com.hyzs.gz.common.dao.service.DOService;
import org.springframework.transaction.annotation.Transactional;

public abstract class DOServiceImpl<D,K> implements DOService<D,K>{

    private CommonDaoManager<D,K> commonDaoManager;



    private DOChecker doChecker;


    public void setDoChecker(DOChecker doChecker) {
        this.doChecker = doChecker;
    }

    public void setCommonDaoManager(CommonDaoManager<D, K> commonDaoManager) {
        this.commonDaoManager = commonDaoManager;
    }

    @Override
    public PageBO<D> pageQuery(PageQueryItemDTO pageQueryItemDTO) {
        return this.commonDaoManager.pageQuery(pageQueryItemDTO);
    }

    @Override
    public D getById(K id) {
        if(id==null){
            throw CommonException.exception("id can not be null");
        }
        return this.commonDaoManager.getById(id);
    }

    @Override
    @Transactional
    public Integer deleteById(K id) {
        if(id==null){
            throw CommonException.exception("id can not be null");
        }
        if(this.doChecker!=null){
            this.doChecker.checkWhenRemove(id);
        }

        return this.commonDaoManager.deleteById(id);
    }

    @Override
    @Transactional
    public Integer updateById(D d) {
        if(this.doChecker!=null){
            this.doChecker.checkWhenModify(d);
        }

        return this.commonDaoManager.updateNotNullProperties(d);
    }

    @Override
    @Transactional
    public Integer insert(D d) {
        if(this.doChecker!=null){
            this.doChecker.checkWhenAdd(d);
        }

        return this.commonDaoManager.insertNotNullProperties(d);
    }
}
