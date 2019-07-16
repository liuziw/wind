package com.lzw.wind.test.dbo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class UserDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="user";




    //定义字段常量
    /**
     *ID
     *id
     */
    public static final String  ID="id";

    /**
     *ID
     *id
     */
    public static final String  DB_ID="id";

    /**
     *用户账户
     *userAccount
     */
    public static final String  USER_ACCOUNT="userAccount";

    /**
     *用户账户
     *user_account
     */
    public static final String  DB_USER_ACCOUNT="user_account";

    /**
     *用户密码
     *userPassword
     */
    public static final String  USER_PASSWORD="userPassword";

    /**
     *用户密码
     *user_password
     */
    public static final String  DB_USER_PASSWORD="user_password";

    /**
     *修改密码时间
     *updatePasswordTime
     */
    public static final String  UPDATE_PASSWORD_TIME="updatePasswordTime";

    /**
     *修改密码时间
     *update_password_time
     */
    public static final String  DB_UPDATE_PASSWORD_TIME="update_password_time";

    /**
     *用户名
     *userName
     */
    public static final String  USER_NAME="userName";

    /**
     *用户名
     *user_name
     */
    public static final String  DB_USER_NAME="user_name";

    /**
     *手机号码
     *mobileNo
     */
    public static final String  MOBILE_NO="mobileNo";

    /**
     *手机号码
     *mobile_no
     */
    public static final String  DB_MOBILE_NO="mobile_no";

    /**
     *邮箱地址
     *email
     */
    public static final String  EMAIL="email";

    /**
     *邮箱地址
     *email
     */
    public static final String  DB_EMAIL="email";

    /**
     *职位
     *job
     */
    public static final String  JOB="job";

    /**
     *职位
     *job
     */
    public static final String  DB_JOB="job";

    /**
     *出生年月
     *birthday
     */
    public static final String  BIRTHDAY="birthday";

    /**
     *出生年月
     *birthday
     */
    public static final String  DB_BIRTHDAY="birthday";

    /**
     *用户头像,对应资源表中的id
     *userPhoto
     */
    public static final String  USER_PHOTO="userPhoto";

    /**
     *用户头像,对应资源表中的id
     *user_photo
     */
    public static final String  DB_USER_PHOTO="user_photo";

    /**
     *身份证号
     *idCardNo
     */
    public static final String  ID_CARD_NO="idCardNo";

    /**
     *身份证号
     *id_card_no
     */
    public static final String  DB_ID_CARD_NO="id_card_no";

    /**
     *性别,枚举定义:MALE(1,男);FEMALE(0,女);
     *gender
     */
    public static final String  GENDER="gender";

    /**
     *性别,枚举定义:MALE(1,男);FEMALE(0,女);
     *gender
     */
    public static final String  DB_GENDER="gender";

    /**
     *所属部门ID
     *deptId
     */
    public static final String  DEPT_ID="deptId";

    /**
     *所属部门ID
     *dept_id
     */
    public static final String  DB_DEPT_ID="dept_id";

    /**
     *联系地址
     *address
     */
    public static final String  ADDRESS="address";

    /**
     *联系地址
     *address
     */
    public static final String  DB_ADDRESS="address";

    /**
     *是否锁定,枚举定义:LOCKED(1,已锁定);UNLOCKED(0,未锁定);
     *locked
     */
    public static final String  LOCKED="locked";

    /**
     *是否锁定,枚举定义:LOCKED(1,已锁定);UNLOCKED(0,未锁定);
     *locked
     */
    public static final String  DB_LOCKED="locked";

    /**
     *锁定时间
     *lockedTime
     */
    public static final String  LOCKED_TIME="lockedTime";

    /**
     *锁定时间
     *locked_time
     */
    public static final String  DB_LOCKED_TIME="locked_time";

    /**
     *是否禁用,枚举定义:ENABLED(1,已禁用);UNENABLED(0,正常);
     *enabled
     */
    public static final String  ENABLED="enabled";

    /**
     *是否禁用,枚举定义:ENABLED(1,已禁用);UNENABLED(0,正常);
     *enabled
     */
    public static final String  DB_ENABLED="enabled";

    /**
     *账号是否过期,枚举定义:EXPIRED_YES(1,过期);EXPIRED_NO(0,未过期);
     *expired
     */
    public static final String  EXPIRED="expired";

    /**
     *账号是否过期,枚举定义:EXPIRED_YES(1,过期);EXPIRED_NO(0,未过期);
     *expired
     */
    public static final String  DB_EXPIRED="expired";

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
     *直接汇报人
     *leaderId
     */
    public static final String  LEADER_ID="leaderId";

    /**
     *直接汇报人
     *leader_id
     */
    public static final String  DB_LEADER_ID="leader_id";




    /**
     *ID
     */
    @ApiModelProperty(value = "ID")
    private Long id;


    /**
     *用户账户
     */
    @ApiModelProperty(value = "用户账户")
    private String userAccount;


    /**
     *用户密码
     */
    @ApiModelProperty(value = "用户密码")
    private String userPassword;


    /**
     *修改密码时间
     */
    @ApiModelProperty(value = "修改密码时间")
    private java.util.Date updatePasswordTime;


    /**
     *用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;


    /**
     *手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String mobileNo;


    /**
     *邮箱地址
     */
    @ApiModelProperty(value = "邮箱地址")
    private String email;


    /**
     *职位
     */
    @ApiModelProperty(value = "职位")
    private String job;


    /**
     *出生年月
     */
    @ApiModelProperty(value = "出生年月")
    private java.util.Date birthday;


    /**
     *用户头像,对应资源表中的id
     */
    @ApiModelProperty(value = "用户头像,对应资源表中的id")
    private Long userPhoto;


    /**
     *身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idCardNo;


    /**
     *性别,枚举定义:MALE(1,男);FEMALE(0,女);
     */
    @ApiModelProperty(value = "性别,枚举定义:MALE(1,男);FEMALE(0,女);")
    private Integer gender;


    /**
     *所属部门ID
     */
    @ApiModelProperty(value = "所属部门ID")
    private Long deptId;


    /**
     *联系地址
     */
    @ApiModelProperty(value = "联系地址")
    private String address;


    /**
     *是否锁定,枚举定义:LOCKED(1,已锁定);UNLOCKED(0,未锁定);
     */
    @ApiModelProperty(value = "是否锁定,枚举定义:LOCKED(1,已锁定);UNLOCKED(0,未锁定);")
    private Integer locked;


    /**
     *锁定时间
     */
    @ApiModelProperty(value = "锁定时间")
    private java.util.Date lockedTime;


    /**
     *是否禁用,枚举定义:ENABLED(1,已禁用);UNENABLED(0,正常);
     */
    @ApiModelProperty(value = "是否禁用,枚举定义:ENABLED(1,已禁用);UNENABLED(0,正常);")
    private Integer enabled;


    /**
     *账号是否过期,枚举定义:EXPIRED_YES(1,过期);EXPIRED_NO(0,未过期);
     */
    @ApiModelProperty(value = "账号是否过期,枚举定义:EXPIRED_YES(1,过期);EXPIRED_NO(0,未过期);")
    private Integer expired;


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


    /**
     *直接汇报人
     */
    @ApiModelProperty(value = "直接汇报人")
    private Long leaderId;
}

