package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class PermDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="perm";




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
     *父权限ID,如果是根节点为0
     *pid
     */
    public static final String  PID="pid";

    /**
     *父权限ID,如果是根节点为0
     *pid
     */
    public static final String  DB_PID="pid";

    /**
     *权限编码
     *permCode
     */
    public static final String  PERM_CODE="permCode";

    /**
     *权限编码
     *perm_code
     */
    public static final String  DB_PERM_CODE="perm_code";

    /**
     *权限名称
     *permName
     */
    public static final String  PERM_NAME="permName";

    /**
     *权限名称
     *perm_name
     */
    public static final String  DB_PERM_NAME="perm_name";

    /**
     *权限类型,枚举定义:DIRECTORY(1,目录);MENU(2,菜单);OPERATOR(3,操作);
     *permType
     */
    public static final String  PERM_TYPE="permType";

    /**
     *权限类型,枚举定义:DIRECTORY(1,目录);MENU(2,菜单);OPERATOR(3,操作);
     *perm_type
     */
    public static final String  DB_PERM_TYPE="perm_type";

    /**
     *权限路径
     *permUrl
     */
    public static final String  PERM_URL="permUrl";

    /**
     *权限路径
     *perm_url
     */
    public static final String  DB_PERM_URL="perm_url";

    /**
     *权限描述
     *permDesc
     */
    public static final String  PERM_DESC="permDesc";

    /**
     *权限描述
     *perm_desc
     */
    public static final String  DB_PERM_DESC="perm_desc";

    /**
     *权限图标，对应资源表的id
     *permIcon
     */
    public static final String  PERM_ICON="permIcon";

    /**
     *权限图标，对应资源表的id
     *perm_icon
     */
    public static final String  DB_PERM_ICON="perm_icon";

    /**
     *图标地址
     *permIconUrl
     */
    public static final String  PERM_ICON_URL="permIconUrl";

    /**
     *图标地址
     *perm_icon_url
     */
    public static final String  DB_PERM_ICON_URL="perm_icon_url";

    /**
     *权限对应的应用程序
     *appId
     */
    public static final String  APP_ID="appId";

    /**
     *权限对应的应用程序
     *app_id
     */
    public static final String  DB_APP_ID="app_id";

    /**
     *排序
     *seq
     */
    public static final String  SEQ="seq";

    /**
     *排序
     *seq
     */
    public static final String  DB_SEQ="seq";

    /**
     *是否禁用（0启用，1禁用）
     *enableStatus
     */
    public static final String  ENABLE_STATUS="enableStatus";

    /**
     *是否禁用（0启用，1禁用）
     *enable_status
     */
    public static final String  DB_ENABLE_STATUS="enable_status";

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
     *创建人ID
     *userIdCreate
     */
    public static final String  USER_ID_CREATE="userIdCreate";

    /**
     *创建人ID
     *user_id_create
     */
    public static final String  DB_USER_ID_CREATE="user_id_create";

    /**
     *最后修改人ID
     *userIdModified
     */
    public static final String  USER_ID_MODIFIED="userIdModified";

    /**
     *最后修改人ID
     *user_id_modified
     */
    public static final String  DB_USER_ID_MODIFIED="user_id_modified";




    /**
     *id
     */
    @ApiModelProperty(value = "id")
    private Long id;


    /**
     *父权限ID,如果是根节点为0
     */
    @ApiModelProperty(value = "父权限ID,如果是根节点为0")
    private Long pid;


    /**
     *权限编码
     */
    @ApiModelProperty(value = "权限编码")
    private String permCode;


    /**
     *权限名称
     */
    @ApiModelProperty(value = "权限名称")
    private String permName;


    /**
     *权限类型,枚举定义:DIRECTORY(1,目录);MENU(2,菜单);OPERATOR(3,操作);
     */
    @ApiModelProperty(value = "权限类型,枚举定义:DIRECTORY(1,目录);MENU(2,菜单);OPERATOR(3,操作);")
    private Integer permType;


    /**
     *权限路径
     */
    @ApiModelProperty(value = "权限路径")
    private String permUrl;


    /**
     *权限描述
     */
    @ApiModelProperty(value = "权限描述")
    private String permDesc;


    /**
     *权限图标，对应资源表的id
     */
    @ApiModelProperty(value = "权限图标，对应资源表的id")
    private Long permIcon;


    /**
     *图标地址
     */
    @ApiModelProperty(value = "图标地址")
    private String permIconUrl;


    /**
     *权限对应的应用程序
     */
    @ApiModelProperty(value = "权限对应的应用程序")
    private Long appId;


    /**
     *排序
     */
    @ApiModelProperty(value = "排序")
    private Long seq;


    /**
     *是否禁用（0启用，1禁用）
     */
    @ApiModelProperty(value = "是否禁用（0启用，1禁用）")
    private Integer enableStatus;


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
     *创建人ID
     */
    @ApiModelProperty(value = "创建人ID")
    private Long userIdCreate;


    /**
     *最后修改人ID
     */
    @ApiModelProperty(value = "最后修改人ID")
    private Long userIdModified;
}

