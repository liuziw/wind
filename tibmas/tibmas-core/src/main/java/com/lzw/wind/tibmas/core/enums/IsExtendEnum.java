package com.lzw.wind.tibmas.core.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum IsExtendEnum {


     NO(0,"否"),
     YES(1,"是");


     public final Integer code;

     public final String desc;


     private IsExtendEnum(Integer code,String desc)
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


    public static IsExtendEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //否
        if(code.equals(0))
        {
            return NO;
        }

        //是
        if(code.equals(1))
        {
            return YES;
        }

         return null;
    }


}
