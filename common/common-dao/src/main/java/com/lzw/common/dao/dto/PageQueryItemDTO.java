package com.lzw.common.dao.dto;

import java.util.List;

public class PageQueryItemDTO extends PageQueryDTO {

    /**
     * 查询条件
     */
    private List<QueryItemDTO> queryItems;

    /**
     * 要查询那
     */
    private String[] fieldNames;

    public List<QueryItemDTO> getQueryItems() {
        return queryItems;
    }

    public void setQueryItems(List<QueryItemDTO> queryItems) {
        this.queryItems = queryItems;
    }

    public String[] getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(String[] fieldNames) {
        this.fieldNames = fieldNames;
    }
}
