package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class RoleTypeDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="role_type";




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
     *角色类型编码:全大写,英文数字加-组成
     *roleTypeCode
     */
    public static final String  ROLE_TYPE_CODE="roleTypeCode";

    /**
     *角色类型编码:全大写,英文数字加-组成
     *role_type_code
     */
    public static final String  DB_ROLE_TYPE_CODE="role_type_code";

    /**
     *角色类型描述
     *roleTypeDesc
     */
    public static final String  ROLE_TYPE_DESC="roleTypeDesc";

    /**
     *角色类型描述
     *role_type_desc
     */
    public static final String  DB_ROLE_TYPE_DESC="role_type_desc";

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
     *角色类型编码:全大写,英文数字加-组成
     */
    @ApiModelProperty(value = "角色类型编码:全大写,英文数字加-组成")
    private String roleTypeCode;


    /**
     *角色类型描述
     */
    @ApiModelProperty(value = "角色类型描述")
    private String roleTypeDesc;


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

