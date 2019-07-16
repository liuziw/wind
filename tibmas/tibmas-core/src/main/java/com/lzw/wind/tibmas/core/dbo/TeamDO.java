package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class TeamDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="team";




    //定义字段常量
    /**
     *团队ID
     *id
     */
    public static final String  ID="id";

    /**
     *团队ID
     *id
     */
    public static final String  DB_ID="id";

    /**
     *团队名称
     *teamName
     */
    public static final String  TEAM_NAME="teamName";

    /**
     *团队名称
     *team_name
     */
    public static final String  DB_TEAM_NAME="team_name";

    /**
     *团队说明
     *teamDesc
     */
    public static final String  TEAM_DESC="teamDesc";

    /**
     *团队说明
     *team_desc
     */
    public static final String  DB_TEAM_DESC="team_desc";

    /**
     *团队类型
     *teamTypeCode
     */
    public static final String  TEAM_TYPE_CODE="teamTypeCode";

    /**
     *团队类型
     *team_type_code
     */
    public static final String  DB_TEAM_TYPE_CODE="team_type_code";

    /**
     *团队负责人ID
     *teamLeaderId
     */
    public static final String  TEAM_LEADER_ID="teamLeaderId";

    /**
     *团队负责人ID
     *team_leader_id
     */
    public static final String  DB_TEAM_LEADER_ID="team_leader_id";

    /**
     *团队所属组织
     *teamDeptId
     */
    public static final String  TEAM_DEPT_ID="teamDeptId";

    /**
     *团队所属组织
     *team_dept_id
     */
    public static final String  DB_TEAM_DEPT_ID="team_dept_id";

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
     *片长ID
     *teamHandleId
     */
    public static final String  TEAM_HANDLE_ID="teamHandleId";

    /**
     *片长ID
     *team_handle_id
     */
    public static final String  DB_TEAM_HANDLE_ID="team_handle_id";




    /**
     *团队ID
     */
    @ApiModelProperty(value = "团队ID")
    private Long id;


    /**
     *团队名称
     */
    @ApiModelProperty(value = "团队名称")
    private String teamName;


    /**
     *团队说明
     */
    @ApiModelProperty(value = "团队说明")
    private String teamDesc;


    /**
     *团队类型
     */
    @ApiModelProperty(value = "团队类型")
    private String teamTypeCode;


    /**
     *团队负责人ID
     */
    @ApiModelProperty(value = "团队负责人ID")
    private Long teamLeaderId;


    /**
     *团队所属组织
     */
    @ApiModelProperty(value = "团队所属组织")
    private Long teamDeptId;


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


    /**
     *片长ID
     */
    @ApiModelProperty(value = "片长ID")
    private Long teamHandleId;
}

