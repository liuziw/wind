package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class AppTokenInfoDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="app_token_info";




    //定义字段常量
    /**
     *ID主键
     *id
     */
    public static final String  ID="id";

    /**
     *ID主键
     *id
     */
    public static final String  DB_ID="id";

    /**
     *用户标识
     *userId
     */
    public static final String  USER_ID="userId";

    /**
     *用户标识
     *user_id
     */
    public static final String  DB_USER_ID="user_id";

    /**
     *app应用id
     *appId
     */
    public static final String  APP_ID="appId";

    /**
     *app应用id
     *app_id
     */
    public static final String  DB_APP_ID="app_id";

    /**
     *标题
     *token
     */
    public static final String  TOKEN="token";

    /**
     *标题
     *token
     */
    public static final String  DB_TOKEN="token";

    /**
     *备注说明
     *remark
     */
    public static final String  REMARK="remark";

    /**
     *备注说明
     *remark
     */
    public static final String  DB_REMARK="remark";

    /**
     *手机序列号
     *serialNumber
     */
    public static final String  SERIAL_NUMBER="serialNumber";

    /**
     *手机序列号
     *serial_number
     */
    public static final String  DB_SERIAL_NUMBER="serial_number";

    /**
     *手机IMEI号
     *imei
     */
    public static final String  IMEI="imei";

    /**
     *手机IMEI号
     *imei
     */
    public static final String  DB_IMEI="imei";

    /**
     *所在服务区
     *serveArea
     */
    public static final String  SERVE_AREA="serveArea";

    /**
     *所在服务区
     *serve_area
     */
    public static final String  DB_SERVE_AREA="serve_area";

    /**
     *登录设备类型,枚举定义:UNKNOW(0,未知);ANDROID(1,安卓);IOS(2,ios):
     *deviceType
     */
    public static final String  DEVICE_TYPE="deviceType";

    /**
     *登录设备类型,枚举定义:UNKNOW(0,未知);ANDROID(1,安卓);IOS(2,ios):
     *device_type
     */
    public static final String  DB_DEVICE_TYPE="device_type";

    /**
     *是否删除:0-否,1-是
     *isDeleted
     */
    public static final String  IS_DELETED="isDeleted";

    /**
     *是否删除:0-否,1-是
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
     *ID主键
     */
    @ApiModelProperty(value = "ID主键")
    private Long id;


    /**
     *用户标识
     */
    @ApiModelProperty(value = "用户标识")
    private Long userId;


    /**
     *app应用id
     */
    @ApiModelProperty(value = "app应用id")
    private Long appId;


    /**
     *标题
     */
    @ApiModelProperty(value = "标题")
    private String token;


    /**
     *备注说明
     */
    @ApiModelProperty(value = "备注说明")
    private String remark;


    /**
     *手机序列号
     */
    @ApiModelProperty(value = "手机序列号")
    private String serialNumber;


    /**
     *手机IMEI号
     */
    @ApiModelProperty(value = "手机IMEI号")
    private String imei;


    /**
     *所在服务区
     */
    @ApiModelProperty(value = "所在服务区")
    private String serveArea;


    /**
     *登录设备类型,枚举定义:UNKNOW(0,未知);ANDROID(1,安卓);IOS(2,ios):
     */
    @ApiModelProperty(value = "登录设备类型,枚举定义:UNKNOW(0,未知);ANDROID(1,安卓);IOS(2,ios):")
    private Integer deviceType;


    /**
     *是否删除:0-否,1-是
     */
    @ApiModelProperty(value = "是否删除:0-否,1-是")
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

