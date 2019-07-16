package com.lzw.wind.tibmas.core.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum DeviceTypeEnum {


     UNKNOW(0,"未知"),
     ANDROID(1,"安卓"),
     IOS(2,"ios");


     public final Integer code;

     public final String desc;


     private DeviceTypeEnum(Integer code,String desc)
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


    public static DeviceTypeEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //未知
        if(code.equals(0))
        {
            return UNKNOW;
        }

        //安卓
        if(code.equals(1))
        {
            return ANDROID;
        }

        //ios
        if(code.equals(2))
        {
            return IOS;
        }

         return null;
    }


}
