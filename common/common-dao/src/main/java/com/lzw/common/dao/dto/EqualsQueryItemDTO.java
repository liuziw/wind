package com.lzw.common.dao.dto;

import com.hyzs.gz.common.dao.enums.QueryTypeEnum2;

public class EqualsQueryItemDTO extends QueryItemDTO {
    public EqualsQueryItemDTO(String fieldName, Object value) {
        super(fieldName, QueryTypeEnum2.EQUAL_TO, value);
    }
}
