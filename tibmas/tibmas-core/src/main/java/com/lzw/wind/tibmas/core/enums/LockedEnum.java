package com.lzw.wind.tibmas.core.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum LockedEnum {


     LOCKED(1,"已锁定"),
     UNLOCKED(0,"未锁定");


     public final Integer code;

     public final String desc;


     private LockedEnum(Integer code,String desc)
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


    public static LockedEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //已锁定
        if(code.equals(1))
        {
            return LOCKED;
        }

        //未锁定
        if(code.equals(0))
        {
            return UNLOCKED;
        }

         return null;
    }


}
