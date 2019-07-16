package com.lzw.wind.tibmas.core.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum GenderEnum {


     MALE(1,"男"),
     FEMALE(0,"女");


     public final Integer code;

     public final String desc;


     private GenderEnum(Integer code,String desc)
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


    public static GenderEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //男
        if(code.equals(1))
        {
            return MALE;
        }

        //女
        if(code.equals(0))
        {
            return FEMALE;
        }

         return null;
    }


}
