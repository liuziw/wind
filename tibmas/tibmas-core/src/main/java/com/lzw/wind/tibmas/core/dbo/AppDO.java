package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class AppDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="app";




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
     *应用程序编码
     *appCode
     */
    public static final String  APP_CODE="appCode";

    /**
     *应用程序编码
     *app_code
     */
    public static final String  DB_APP_CODE="app_code";

    /**
     *应用程序名称
     *appName
     */
    public static final String  APP_NAME="appName";

    /**
     *应用程序名称
     *app_name
     */
    public static final String  DB_APP_NAME="app_name";

    /**
     *应用程序图标对应资源表中的Id
     *appIcon
     */
    public static final String  APP_ICON="appIcon";

    /**
     *应用程序图标对应资源表中的Id
     *app_icon
     */
    public static final String  DB_APP_ICON="app_icon";

    /**
     *应用程序描述
     *appDesc
     */
    public static final String  APP_DESC="appDesc";

    /**
     *应用程序描述
     *app_desc
     */
    public static final String  DB_APP_DESC="app_desc";

    /**
     *应用的URL
     *appUrl
     */
    public static final String  APP_URL="appUrl";

    /**
     *应用的URL
     *app_url
     */
    public static final String  DB_APP_URL="app_url";

    /**
     *访问的KEY
     *accessKey
     */
    public static final String  ACCESS_KEY="accessKey";

    /**
     *访问的KEY
     *access_key
     */
    public static final String  DB_ACCESS_KEY="access_key";

    /**
     *访问的key（明文）
     *accessKeyPlain
     */
    public static final String  ACCESS_KEY_PLAIN="accessKeyPlain";

    /**
     *访问的key（明文）
     *access_key_plain
     */
    public static final String  DB_ACCESS_KEY_PLAIN="access_key_plain";

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
     *应用程序编码
     */
    @ApiModelProperty(value = "应用程序编码")
    private String appCode;


    /**
     *应用程序名称
     */
    @ApiModelProperty(value = "应用程序名称")
    private String appName;


    /**
     *应用程序图标对应资源表中的Id
     */
    @ApiModelProperty(value = "应用程序图标对应资源表中的Id")
    private Long appIcon;


    /**
     *应用程序描述
     */
    @ApiModelProperty(value = "应用程序描述")
    private String appDesc;


    /**
     *应用的URL
     */
    @ApiModelProperty(value = "应用的URL")
    private String appUrl;


    /**
     *访问的KEY
     */
    @ApiModelProperty(value = "访问的KEY")
    private String accessKey;


    /**
     *访问的key（明文）
     */
    @ApiModelProperty(value = "访问的key（明文）")
    private String accessKeyPlain;


    /**
     *是否删除,枚举定义:DELETED_NO(0,未删除);DELETED_YES(1,已删除);
     */
    @ApiModelProperty(value = "是否删除,枚举定义:DELETED_NO(0,未删除);DELETED_YES(1,已删除);")
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

