package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class AreaDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="area";




    //定义字段常量
    /**
     *id
     *id
     */
    public static final String  ID="id";

    /**
     *id
     *id
     */
    public static final String  DB_ID="id";

    /**
     *区域代码
     *code
     */
    public static final String  CODE="code";

    /**
     *区域代码
     *code
     */
    public static final String  DB_CODE="code";

    /**
     *区域名称
     *name
     */
    public static final String  NAME="name";

    /**
     *区域名称
     *name
     */
    public static final String  DB_NAME="name";

    /**
     *上级区域ID
     *pid
     */
    public static final String  PID="pid";

    /**
     *上级区域ID
     *pid
     */
    public static final String  DB_PID="pid";

    /**
     *父code
     *pcode
     */
    public static final String  PCODE="pcode";

    /**
     *父code
     *pcode
     */
    public static final String  DB_PCODE="pcode";

    /**
     *区域经度
     *longitude
     */
    public static final String  LONGITUDE="longitude";

    /**
     *区域经度
     *longitude
     */
    public static final String  DB_LONGITUDE="longitude";

    /**
     *区域纬度
     *latitude
     */
    public static final String  LATITUDE="latitude";

    /**
     *区域纬度
     *latitude
     */
    public static final String  DB_LATITUDE="latitude";

    /**
     *存储层级路径，便于查询
     *levelPath
     */
    public static final String  LEVEL_PATH="levelPath";

    /**
     *存储层级路径，便于查询
     *level_path
     */
    public static final String  DB_LEVEL_PATH="level_path";

    /**
     *区域等级
     *level
     */
    public static final String  LEVEL="level";

    /**
     *区域等级
     *level
     */
    public static final String  DB_LEVEL="level";

    /**
     *
     *deep
     */
    public static final String  DEEP="deep";

    /**
     *
     *deep
     */
    public static final String  DB_DEEP="deep";

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
     *是否删除,枚举定义:DELETED_NO(0,未删除);DELETED_YES(1,已删除);
     *isDeleted
     */
    public static final String  IS_DELETED="isDeleted";

    /**
     *是否删除,枚举定义:DELETED_NO(0,未删除);DELETED_YES(1,已删除);
     *is_deleted
     */
    public static final String  DB_IS_DELETED="is_deleted";

    /**
     *创建人id
     *userIdCreate
     */
    public static final String  USER_ID_CREATE="userIdCreate";

    /**
     *创建人id
     *user_id_create
     */
    public static final String  DB_USER_ID_CREATE="user_id_create";

    /**
     *最后修改人id
     *userIdModified
     */
    public static final String  USER_ID_MODIFIED="userIdModified";

    /**
     *最后修改人id
     *user_id_modified
     */
    public static final String  DB_USER_ID_MODIFIED="user_id_modified";




    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


    /**
     *区域代码
     */
    @ApiModelProperty(value = "区域代码")
    private Long code;


    /**
     *区域名称
     */
    @ApiModelProperty(value = "区域名称")
    private String name;


    /**
     *上级区域ID
     */
    @ApiModelProperty(value = "上级区域ID")
    private Long pid;


    /**
     *父code
     */
    @ApiModelProperty(value = "父code")
    private Long pcode;


    /**
     *区域经度
     */
    @ApiModelProperty(value = "区域经度")
    private String longitude;


    /**
     *区域纬度
     */
    @ApiModelProperty(value = "区域纬度")
    private String latitude;


    /**
     *存储层级路径，便于查询
     */
    @ApiModelProperty(value = "存储层级路径，便于查询")
    private String levelPath;


    /**
     *区域等级
     */
    @ApiModelProperty(value = "区域等级")
    private Integer level;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Integer deep;


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


    /**
     *是否删除,枚举定义:DELETED_NO(0,未删除);DELETED_YES(1,已删除);
     */
    @ApiModelProperty(value = "是否删除,枚举定义:DELETED_NO(0,未删除);DELETED_YES(1,已删除);")
    private Integer isDeleted;


    /**
     *创建人id
     */
    @ApiModelProperty(value = "创建人id")
    private Long userIdCreate;


    /**
     *最后修改人id
     */
    @ApiModelProperty(value = "最后修改人id")
    private Long userIdModified;
}

