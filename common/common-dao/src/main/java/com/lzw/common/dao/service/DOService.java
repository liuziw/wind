package com.lzw.common.dao.service;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.gz.common.dao.dto.PageQueryItemDTO;

public interface DOService<D,K> {

    public PageBO<D> pageQuery(PageQueryItemDTO pageQueryItemDTO);

    public D getById(K id);

    public Integer deleteById(K id);

    public Integer updateById(D d);

    public Integer insert(D d);
}
