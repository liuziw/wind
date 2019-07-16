package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class UserRegisterDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="user_register";




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
     *业务ID
     *busId
     */
    public static final String  BUS_ID="busId";

    /**
     *业务ID
     *bus_id
     */
    public static final String  DB_BUS_ID="bus_id";

    /**
     *用户账号
     *userAccount
     */
    public static final String  USER_ACCOUNT="userAccount";

    /**
     *用户账号
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
     *生日
     *birthday
     */
    public static final String  BIRTHDAY="birthday";

    /**
     *生日
     *birthday
     */
    public static final String  DB_BIRTHDAY="birthday";

    /**
     *用户头像，对应资源表中的id
     *userPhoto
     */
    public static final String  USER_PHOTO="userPhoto";

    /**
     *用户头像，对应资源表中的id
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
     *性别：1男，0女
     *gender
     */
    public static final String  GENDER="gender";

    /**
     *性别：1男，0女
     *gender
     */
    public static final String  DB_GENDER="gender";

    /**
     *所属部门id
     *deptId
     */
    public static final String  DEPT_ID="deptId";

    /**
     *所属部门id
     *dept_id
     */
    public static final String  DB_DEPT_ID="dept_id";

    /**
     *审核状态，枚举定义:WAIT(1,待审核);PASS(2,审核通过);NO_PASS(3,审核不通过);
     *examineStatus
     */
    public static final String  EXAMINE_STATUS="examineStatus";

    /**
     *审核状态，枚举定义:WAIT(1,待审核);PASS(2,审核通过);NO_PASS(3,审核不通过);
     *examine_status
     */
    public static final String  DB_EXAMINE_STATUS="examine_status";

    /**
     *审核人id
     *examineUserId
     */
    public static final String  EXAMINE_USER_ID="examineUserId";

    /**
     *审核人id
     *examine_user_id
     */
    public static final String  DB_EXAMINE_USER_ID="examine_user_id";

    /**
     *团队类型编码（注册的时候选的团队团队类型）
     *teamTypeCode
     */
    public static final String  TEAM_TYPE_CODE="teamTypeCode";

    /**
     *团队类型编码（注册的时候选的团队团队类型）
     *team_type_code
     */
    public static final String  DB_TEAM_TYPE_CODE="team_type_code";

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
     *ID
     */
    @ApiModelProperty(value = "ID")
    private Long id;


    /**
     *业务ID
     */
    @ApiModelProperty(value = "业务ID")
    private String busId;


    /**
     *用户账号
     */
    @ApiModelProperty(value = "用户账号")
    private String userAccount;


    /**
     *用户密码
     */
    @ApiModelProperty(value = "用户密码")
    private String userPassword;


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
     *生日
     */
    @ApiModelProperty(value = "生日")
    private java.util.Date birthday;


    /**
     *用户头像，对应资源表中的id
     */
    @ApiModelProperty(value = "用户头像，对应资源表中的id")
    private Long userPhoto;


    /**
     *身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idCardNo;


    /**
     *性别：1男，0女
     */
    @ApiModelProperty(value = "性别：1男，0女")
    private Integer gender;


    /**
     *所属部门id
     */
    @ApiModelProperty(value = "所属部门id")
    private Long deptId;


    /**
     *审核状态，枚举定义:WAIT(1,待审核);PASS(2,审核通过);NO_PASS(3,审核不通过);
     */
    @ApiModelProperty(value = "审核状态，枚举定义:WAIT(1,待审核);PASS(2,审核通过);NO_PASS(3,审核不通过);")
    private Integer examineStatus;


    /**
     *审核人id
     */
    @ApiModelProperty(value = "审核人id")
    private Long examineUserId;


    /**
     *团队类型编码（注册的时候选的团队团队类型）
     */
    @ApiModelProperty(value = "团队类型编码（注册的时候选的团队团队类型）")
    private String teamTypeCode;


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
     *是否删除：0未删除，1已删除
     */
    @ApiModelProperty(value = "是否删除：0未删除，1已删除")
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

