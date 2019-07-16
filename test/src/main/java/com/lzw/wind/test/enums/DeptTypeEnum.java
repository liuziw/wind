package com.lzw.wind.test.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum DeptTypeEnum {


     IMPORTANT(1,"重要部门"),
     MUNICIPAL(2,"市委部门"),
     GOVERNMENT(3,"政府部门"),
     INSTITUTION(4,"事业部门"),
     SOCIAL(5,"社会团体"),
     COURT(6,"法院、检查"),
     OTHER(7,"其他单位");


     public final Integer code;

     public final String desc;


     private DeptTypeEnum(Integer code,String desc)
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


    public static DeptTypeEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //重要部门
        if(code.equals(1))
        {
            return IMPORTANT;
        }

        //市委部门
        if(code.equals(2))
        {
            return MUNICIPAL;
        }

        //政府部门
        if(code.equals(3))
        {
            return GOVERNMENT;
        }

        //事业部门
        if(code.equals(4))
        {
            return INSTITUTION;
        }

        //社会团体
        if(code.equals(5))
        {
            return SOCIAL;
        }

        //法院、检查
        if(code.equals(6))
        {
            return COURT;
        }

        //其他单位
        if(code.equals(7))
        {
            return OTHER;
        }

         return null;
    }


}
