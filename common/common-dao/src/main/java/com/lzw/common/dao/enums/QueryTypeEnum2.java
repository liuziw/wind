package com.lzw.common.dao.enums;

public enum QueryTypeEnum2 {
    EQUAL_TO("="),
    NOT_EQUAL_TO("<>"),
    IN("in"),
    NOT_IN("not in"),
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUAL_TO(">="),
    IS_NULL("is null"),
    IS_NOT_NULL("is not null"),
    LESS_THAN("<"),
    LESS_THAN_OR_EQUAL_TO("<="),
    LIKE("like"),
    NOT_LIKE("not like");

    private String optr;





    private QueryTypeEnum2(String optr){
        this.optr=optr;
    }

    public boolean getHasValue(){
        if(this==IS_NOT_NULL || this==IS_NULL){
            return false;
        }
        return true;
    }


    public String getOptr(){
        return this.optr;
    }
}
