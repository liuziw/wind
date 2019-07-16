package com.lzw.wind.tibmas.core.enums;

/**
 * 代码自动生成，请不要修改，切记！！！
 */
public enum PoliticalStatusEnum {


     COMMUNIST_PARTY_MEMBER(1,"党员"),
     LEAGUE_MEMBER(2,"团员"),
     PUBLIC_PEOPLE(3,"群众");


     public final Integer code;

     public final String desc;


     private PoliticalStatusEnum(Integer code,String desc)
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


    public static PoliticalStatusEnum valueOfByCode(Integer code)
    {

        if(code==null)
        {
            return null;
        }

        //党员
        if(code.equals(1))
        {
            return COMMUNIST_PARTY_MEMBER;
        }

        //团员
        if(code.equals(2))
        {
            return LEAGUE_MEMBER;
        }

        //群众
        if(code.equals(3))
        {
            return PUBLIC_PEOPLE;
        }

         return null;
    }


}
