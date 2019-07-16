package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class TeamUserDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="team_user";




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
     *团队ID
     *teamId
     */
    public static final String  TEAM_ID="teamId";

    /**
     *团队ID
     *team_id
     */
    public static final String  DB_TEAM_ID="team_id";

    /**
     *成员ID
     *userId
     */
    public static final String  USER_ID="userId";

    /**
     *成员ID
     *user_id
     */
    public static final String  DB_USER_ID="user_id";

    /**
     *成员类型--0:管理员，1:负责人,2:普通成员
     *userType
     */
    public static final String  USER_TYPE="userType";

    /**
     *成员类型--0:管理员，1:负责人,2:普通成员
     *user_type
     */
    public static final String  DB_USER_TYPE="user_type";

    /**
     *是否删除:0,未删除);1,已删除
     *isDeleted
     */
    public static final String  IS_DELETED="isDeleted";

    /**
     *是否删除:0,未删除);1,已删除
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
     *ID
     */
    @ApiModelProperty(value = "ID")
    private Long id;


    /**
     *团队ID
     */
    @ApiModelProperty(value = "团队ID")
    private Long teamId;


    /**
     *成员ID
     */
    @ApiModelProperty(value = "成员ID")
    private Long userId;


    /**
     *成员类型--0:管理员，1:负责人,2:普通成员
     */
    @ApiModelProperty(value = "成员类型--0:管理员，1:负责人,2:普通成员")
    private Integer userType;


    /**
     *是否删除:0,未删除);1,已删除
     */
    @ApiModelProperty(value = "是否删除:0,未删除);1,已删除")
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

