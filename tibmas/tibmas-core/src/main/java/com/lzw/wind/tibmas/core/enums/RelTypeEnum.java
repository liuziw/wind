package com.lzw.wind.tibmas.core.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum RelTypeEnum {


     PERM_NO(0,"没有权限"),
     PERM_YES(1,"有权限");


     public final Integer code;

     public final String desc;


     private RelTypeEnum(Integer code,String desc)
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


    public static RelTypeEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //没有权限
        if(code.equals(0))
        {
            return PERM_NO;
        }

        //有权限
        if(code.equals(1))
        {
            return PERM_YES;
        }

         return null;
    }


}
