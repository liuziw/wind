package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class RoleDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="role";




    //定义字段常量
    /**
     *代理主键
     *id
     */
    public static final String  ID="id";

    /**
     *代理主键
     *id
     */
    public static final String  DB_ID="id";

    /**
     *角色编码
     *roleCode
     */
    public static final String  ROLE_CODE="roleCode";

    /**
     *角色编码
     *role_code
     */
    public static final String  DB_ROLE_CODE="role_code";

    /**
     *角色名称
     *roleName
     */
    public static final String  ROLE_NAME="roleName";

    /**
     *角色名称
     *role_name
     */
    public static final String  DB_ROLE_NAME="role_name";

    /**
     *角色描述
     *roleDesc
     */
    public static final String  ROLE_DESC="roleDesc";

    /**
     *角色描述
     *role_desc
     */
    public static final String  DB_ROLE_DESC="role_desc";

    /**
     *角色类型,枚举定义:ADMIN(1,超级管理员);BUSINESS(2,业务员);GENERAL(3,普通管理员)
     *roleType
     */
    public static final String  ROLE_TYPE="roleType";

    /**
     *角色类型,枚举定义:ADMIN(1,超级管理员);BUSINESS(2,业务员);GENERAL(3,普通管理员)
     *role_type
     */
    public static final String  DB_ROLE_TYPE="role_type";

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
     *枚举定义:NO(0,否);YES(1,是);
     *isExtend
     */
    public static final String  IS_EXTEND="isExtend";

    /**
     *枚举定义:NO(0,否);YES(1,是);
     *is_extend
     */
    public static final String  DB_IS_EXTEND="is_extend";

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
     *代理主键
     */
    @ApiModelProperty(value = "代理主键")
    private Long id;


    /**
     *角色编码
     */
    @ApiModelProperty(value = "角色编码")
    private String roleCode;


    /**
     *角色名称
     */
    @ApiModelProperty(value = "角色名称")
    private String roleName;


    /**
     *角色描述
     */
    @ApiModelProperty(value = "角色描述")
    private String roleDesc;


    /**
     *角色类型,枚举定义:ADMIN(1,超级管理员);BUSINESS(2,业务员);GENERAL(3,普通管理员)
     */
    @ApiModelProperty(value = "角色类型,枚举定义:ADMIN(1,超级管理员);BUSINESS(2,业务员);GENERAL(3,普通管理员)")
    private Integer roleType;


    /**
     *应用ID
     */
    @ApiModelProperty(value = "应用ID")
    private Long appId;


    /**
     *枚举定义:NO(0,否);YES(1,是);
     */
    @ApiModelProperty(value = "枚举定义:NO(0,否);YES(1,是);")
    private Integer isExtend;


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

