package com.lzw.wind.tibmas.core.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum RoleTypeEnum {


     ADMIN(1,"超级管理员"),
     BUSINESS(2,"业务员"),
     GENERAL(3,"普通管理员");


     public final Integer code;

     public final String desc;


     private RoleTypeEnum(Integer code,String desc)
     {
        this.code=code;
        this.desc=desc;
     }


    public final Integer getCode()
    {
        return this.code;
    }

    public final String getDesc()
    {
        return this.desc;
    }


    public static RoleTypeEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //超级管理员
        if(code.equals(1))
        {
            return ADMIN;
        }

        //业务员
        if(code.equals(2))
        {
            return BUSINESS;
        }

        //普通管理员
        if(code.equals(3))
        {
            return GENERAL;
        }

         return null;
    }


}
