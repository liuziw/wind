package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class OpenUserDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="open_user";




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
     *openId
     *openId
     */
    public static final String  OPEN_ID="openId";

    /**
     *openId
     *open_id
     */
    public static final String  DB_OPEN_ID="open_id";

    /**
     *
     *userId
     */
    public static final String  USER_ID="userId";

    /**
     *
     *user_id
     */
    public static final String  DB_USER_ID="user_id";

    /**
     *是否审核：0未审核，1已审核（未审核就去注册表找用户信息，已审核就去用户表找用户信息）
     *examineStatus
     */
    public static final String  EXAMINE_STATUS="examineStatus";

    /**
     *是否审核：0未审核，1已审核（未审核就去注册表找用户信息，已审核就去用户表找用户信息）
     *examine_status
     */
    public static final String  DB_EXAMINE_STATUS="examine_status";

    /**
     *微信头像
     *wxHeadImg
     */
    public static final String  WX_HEAD_IMG="wxHeadImg";

    /**
     *微信头像
     *wx_head_img
     */
    public static final String  DB_WX_HEAD_IMG="wx_head_img";

    /**
     *微信昵称
     *nickName
     */
    public static final String  NICK_NAME="nickName";

    /**
     *微信昵称
     *nick_name
     */
    public static final String  DB_NICK_NAME="nick_name";

    /**
     *微信电话号码
     *wxPhoneNum
     */
    public static final String  WX_PHONE_NUM="wxPhoneNum";

    /**
     *微信电话号码
     *wx_phone_num
     */
    public static final String  DB_WX_PHONE_NUM="wx_phone_num";

    /**
     *微信性别
     *wxGender
     */
    public static final String  WX_GENDER="wxGender";

    /**
     *微信性别
     *wx_gender
     */
    public static final String  DB_WX_GENDER="wx_gender";

    /**
     *所属小程序id
     *wxAppId
     */
    public static final String  WX_APP_ID="wxAppId";

    /**
     *所属小程序id
     *wx_app_id
     */
    public static final String  DB_WX_APP_ID="wx_app_id";

    /**
     *微信union_id
     *unionId
     */
    public static final String  UNION_ID="unionId";

    /**
     *微信union_id
     *union_id
     */
    public static final String  DB_UNION_ID="union_id";

    /**
     *是否删除：0未删除，1已删除
     *isDeleted
     */
    public static final String  IS_DELETED="isDeleted";

    /**
     *是否删除：0未删除，1已删除
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
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


    /**
     *openId
     */
    @ApiModelProperty(value = "openId")
    private String openId;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long userId;


    /**
     *是否审核：0未审核，1已审核（未审核就去注册表找用户信息，已审核就去用户表找用户信息）
     */
    @ApiModelProperty(value = "是否审核：0未审核，1已审核（未审核就去注册表找用户信息，已审核就去用户表找用户信息）")
    private Integer examineStatus;


    /**
     *微信头像
     */
    @ApiModelProperty(value = "微信头像")
    private String wxHeadImg;


    /**
     *微信昵称
     */
    @ApiModelProperty(value = "微信昵称")
    private String nickName;


    /**
     *微信电话号码
     */
    @ApiModelProperty(value = "微信电话号码")
    private String wxPhoneNum;


    /**
     *微信性别
     */
    @ApiModelProperty(value = "微信性别")
    private Integer wxGender;


    /**
     *所属小程序id
     */
    @ApiModelProperty(value = "所属小程序id")
    private String wxAppId;


    /**
     *微信union_id
     */
    @ApiModelProperty(value = "微信union_id")
    private String unionId;


    /**
     *是否删除：0未删除，1已删除
     */
    @ApiModelProperty(value = "是否删除：0未删除，1已删除")
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

