package com.lzw.wind.tibmas.core.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum PermTypeEnum {


     DIRECTORY(1,"目录"),
     MENU(2,"菜单"),
     OPERATOR(3,"操作");


     public final Integer code;

     public final String desc;


     private PermTypeEnum(Integer code,String desc)
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


    public static PermTypeEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //目录
        if(code.equals(1))
        {
            return DIRECTORY;
        }

        //菜单
        if(code.equals(2))
        {
            return MENU;
        }

        //操作
        if(code.equals(3))
        {
            return OPERATOR;
        }

         return null;
    }


}
