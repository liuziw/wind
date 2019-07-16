package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class RolePermDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="role_perm";




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
     *角色ID
     *roleId
     */
    public static final String  ROLE_ID="roleId";

    /**
     *角色ID
     *role_id
     */
    public static final String  DB_ROLE_ID="role_id";

    /**
     *权限ID
     *permId
     */
    public static final String  PERM_ID="permId";

    /**
     *权限ID
     *perm_id
     */
    public static final String  DB_PERM_ID="perm_id";

    /**
     *是否有权限,枚举定义:PERM_NO(0,没有权限);PERM_YES(1,有权限);
     *relType
     */
    public static final String  REL_TYPE="relType";

    /**
     *是否有权限,枚举定义:PERM_NO(0,没有权限);PERM_YES(1,有权限);
     *rel_type
     */
    public static final String  DB_REL_TYPE="rel_type";

    /**
     *开始时间
     *startTime
     */
    public static final String  START_TIME="startTime";

    /**
     *开始时间
     *start_time
     */
    public static final String  DB_START_TIME="start_time";

    /**
     *结束时间
     *endTime
     */
    public static final String  END_TIME="endTime";

    /**
     *结束时间
     *end_time
     */
    public static final String  DB_END_TIME="end_time";

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
     *角色ID
     */
    @ApiModelProperty(value = "角色ID")
    private Long roleId;


    /**
     *权限ID
     */
    @ApiModelProperty(value = "权限ID")
    private Long permId;


    /**
     *是否有权限,枚举定义:PERM_NO(0,没有权限);PERM_YES(1,有权限);
     */
    @ApiModelProperty(value = "是否有权限,枚举定义:PERM_NO(0,没有权限);PERM_YES(1,有权限);")
    private Integer relType;


    /**
     *开始时间
     */
    @ApiModelProperty(value = "开始时间")
    private java.util.Date startTime;


    /**
     *结束时间
     */
    @ApiModelProperty(value = "结束时间")
    private java.util.Date endTime;


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

