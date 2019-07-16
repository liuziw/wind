package com.lzw.common.dao.dto;

import com.hyzs.gz.common.dao.enums.QueryTypeEnum2;
import lombok.Data;

@Data
public class QueryItemDTO {

    /**
     * 左边的字段名
     */
    private String fieldName;

    /**
     * 中间的操作符，如：= <> in 等
     */
    private QueryTypeEnum2 type;

    /**
     * 右边具体的值
     */
    private Object value;

    public QueryItemDTO(String fieldName, QueryTypeEnum2 type, Object value) {
        this.fieldName = fieldName;
        this.type = type;
        this.value = value;
    }

    public QueryItemDTO() {
    }

    public String getValueKeyName(){
        return fieldName+type;
    }


}
