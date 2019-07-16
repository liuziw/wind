package com.lzw.wind.test.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum ExpiredEnum {


     EXPIRED_YES(1,"过期"),
     EXPIRED_NO(0,"未过期");


     public final Integer code;

     public final String desc;


     private ExpiredEnum(Integer code,String desc)
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


    public static ExpiredEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //过期
        if(code.equals(1))
        {
            return EXPIRED_YES;
        }

        //未过期
        if(code.equals(0))
        {
            return EXPIRED_NO;
        }

         return null;
    }


}
