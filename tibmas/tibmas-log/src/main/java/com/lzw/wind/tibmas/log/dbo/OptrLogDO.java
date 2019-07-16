package com.lzw.wind.tibmas.log.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class OptrLogDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="optr_log";




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
     *用户ID
     *userId
     */
    public static final String  USER_ID="userId";

    /**
     *用户ID
     *user_id
     */
    public static final String  DB_USER_ID="user_id";

    /**
     *部门ID
     *deptId
     */
    public static final String  DEPT_ID="deptId";

    /**
     *部门ID
     *dept_id
     */
    public static final String  DB_DEPT_ID="dept_id";

    /**
     *应用ID
     *appId
     */
    public static final String  APP_ID="appId";

    /**
     *应用ID
     *app_id
     */
    public static final String  DB_APP_ID="app_id";

    /**
     *应用主模块
     *mainModel
     */
    public static final String  MAIN_MODEL="mainModel";

    /**
     *应用主模块
     *main_model
     */
    public static final String  DB_MAIN_MODEL="main_model";

    /**
     *应用子模块
     *subModel
     */
    public static final String  SUB_MODEL="subModel";

    /**
     *应用子模块
     *sub_model
     */
    public static final String  DB_SUB_MODEL="sub_model";

    /**
     *操作对象
     *optrTarget
     */
    public static final String  OPTR_TARGET="optrTarget";

    /**
     *操作对象
     *optr_target
     */
    public static final String  DB_OPTR_TARGET="optr_target";

    /**
     *操作描述
     *optrDesc
     */
    public static final String  OPTR_DESC="optrDesc";

    /**
     *操作描述
     *optr_desc
     */
    public static final String  DB_OPTR_DESC="optr_desc";

    /**
     *操作时间
     *optrTime
     */
    public static final String  OPTR_TIME="optrTime";

    /**
     *操作时间
     *optr_time
     */
    public static final String  DB_OPTR_TIME="optr_time";

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
     *用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;


    /**
     *部门ID
     */
    @ApiModelProperty(value = "部门ID")
    private Long deptId;


    /**
     *应用ID
     */
    @ApiModelProperty(value = "应用ID")
    private Long appId;


    /**
     *应用主模块
     */
    @ApiModelProperty(value = "应用主模块")
    private String mainModel;


    /**
     *应用子模块
     */
    @ApiModelProperty(value = "应用子模块")
    private String subModel;


    /**
     *操作对象
     */
    @ApiModelProperty(value = "操作对象")
    private String optrTarget;


    /**
     *操作描述
     */
    @ApiModelProperty(value = "操作描述")
    private String optrDesc;


    /**
     *操作时间
     */
    @ApiModelProperty(value = "操作时间")
    private java.util.Date optrTime;


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

