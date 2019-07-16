package com.lzw.wind.tibmas.core.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum ExamineStatusEnum {


     WAIT(1,"待审核"),
     PASS(2,"审核通过"),
     NO_PASS(3,"审核不通过");


     public final Integer code;

     public final String desc;


     private ExamineStatusEnum(Integer code,String desc)
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


    public static ExamineStatusEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //待审核
        if(code.equals(1))
        {
            return WAIT;
        }

        //审核通过
        if(code.equals(2))
        {
            return PASS;
        }

        //审核不通过
        if(code.equals(3))
        {
            return NO_PASS;
        }

         return null;
    }


}
