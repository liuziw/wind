package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class TeamTypeDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="team_type";




    //定义字段常量
    /**
     *团队类型id
     *id
     */
    public static final String  ID="id";

    /**
     *团队类型id
     *id
     */
    public static final String  DB_ID="id";

    /**
     *团队类型简称
     *teamTypeCode
     */
    public static final String  TEAM_TYPE_CODE="teamTypeCode";

    /**
     *团队类型简称
     *team_type_code
     */
    public static final String  DB_TEAM_TYPE_CODE="team_type_code";

    /**
     *团队类型名称
     *teamTypeName
     */
    public static final String  TEAM_TYPE_NAME="teamTypeName";

    /**
     *团队类型名称
     *team_type_name
     */
    public static final String  DB_TEAM_TYPE_NAME="team_type_name";

    /**
     *0：可重复；1：不可重复
     *teamTypeRepeat
     */
    public static final String  TEAM_TYPE_REPEAT="teamTypeRepeat";

    /**
     *0：可重复；1：不可重复
     *team_type_repeat
     */
    public static final String  DB_TEAM_TYPE_REPEAT="team_type_repeat";

    /**
     *是否删除:0,未删除);1,已删除
     *isDeleted
     */
    public static final String  IS_DELETED="isDeleted";

    /**
     *是否删除:0,未删除);1,已删除
     *is_deleted
     */
    public static final String  DB_IS_DELETED="is_deleted";

    /**
     *创建时间
     *gmtCreate
     */
    public static final String  GMT_CREATE="gmtCreate";

    /**
     *创建时间
     *gmt_create
     */
    public static final String  DB_GMT_CREATE="gmt_create";

    /**
     *更新时间
     *gmtModified
     */
    public static final String  GMT_MODIFIED="gmtModified";

    /**
     *更新时间
     *gmt_modified
     */
    public static final String  DB_GMT_MODIFIED="gmt_modified";




    /**
     *团队类型id
     */
    @ApiModelProperty(value = "团队类型id")
    private Long id;


    /**
     *团队类型简称
     */
    @ApiModelProperty(value = "团队类型简称")
    private String teamTypeCode;


    /**
     *团队类型名称
     */
    @ApiModelProperty(value = "团队类型名称")
    private String teamTypeName;


    /**
     *0：可重复；1：不可重复
     */
    @ApiModelProperty(value = "0：可重复；1：不可重复")
    private Integer teamTypeRepeat;


    /**
     *是否删除:0,未删除);1,已删除
     */
    @ApiModelProperty(value = "是否删除:0,未删除);1,已删除")
    private Integer isDeleted;


    /**
     *创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private java.util.Date gmtCreate;


    /**
     *更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private java.util.Date gmtModified;
}

