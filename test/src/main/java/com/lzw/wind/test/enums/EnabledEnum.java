package com.lzw.wind.test.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum EnabledEnum {


     ENABLED(1,"已禁用"),
     UNENABLED(0,"正常");


     public final Integer code;

     public final String desc;


     private EnabledEnum(Integer code,String desc)
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


    public static EnabledEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //已禁用
        if(code.equals(1))
        {
            return ENABLED;
        }

        //正常
        if(code.equals(0))
        {
            return UNENABLED;
        }

         return null;
    }


}
