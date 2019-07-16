package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class DeptDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="dept";




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
     *部门编码:全大写,英文数字加-组成
     *deptCode
     */
    public static final String  DEPT_CODE="deptCode";

    /**
     *部门编码:全大写,英文数字加-组成
     *dept_code
     */
    public static final String  DB_DEPT_CODE="dept_code";

    /**
     *部门名称
     *deptName
     */
    public static final String  DEPT_NAME="deptName";

    /**
     *部门名称
     *dept_name
     */
    public static final String  DB_DEPT_NAME="dept_name";

    /**
     *部门描述
     *deptDescribe
     */
    public static final String  DEPT_DESCRIBE="deptDescribe";

    /**
     *部门描述
     *dept_describe
     */
    public static final String  DB_DEPT_DESCRIBE="dept_describe";

    /**
     *机构类型,枚举定义:IMPORTANT(1,重要部门);MUNICIPAL(2,市委部门);GOVERNMENT(3,政府部门);INSTITUTION(4,事业部门);SOCIAL(5,社会团体);COURT(6,法院、检查);OTHER(7,其他单位);
     *deptType
     */
    public static final String  DEPT_TYPE="deptType";

    /**
     *机构类型,枚举定义:IMPORTANT(1,重要部门);MUNICIPAL(2,市委部门);GOVERNMENT(3,政府部门);INSTITUTION(4,事业部门);SOCIAL(5,社会团体);COURT(6,法院、检查);OTHER(7,其他单位);
     *dept_type
     */
    public static final String  DB_DEPT_TYPE="dept_type";

    /**
     *所属区域
     *areaId
     */
    public static final String  AREA_ID="areaId";

    /**
     *所属区域
     *area_id
     */
    public static final String  DB_AREA_ID="area_id";

    /**
     *父部门Id
     *pid
     */
    public static final String  PID="pid";

    /**
     *父部门Id
     *pid
     */
    public static final String  DB_PID="pid";

    /**
     *
     *seq
     */
    public static final String  SEQ="seq";

    /**
     *
     *seq
     */
    public static final String  DB_SEQ="seq";

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
     *部门编码:全大写,英文数字加-组成
     */
    @ApiModelProperty(value = "部门编码:全大写,英文数字加-组成")
    private String deptCode;


    /**
     *部门名称
     */
    @ApiModelProperty(value = "部门名称")
    private String deptName;


    /**
     *部门描述
     */
    @ApiModelProperty(value = "部门描述")
    private String deptDescribe;


    /**
     *机构类型,枚举定义:IMPORTANT(1,重要部门);MUNICIPAL(2,市委部门);GOVERNMENT(3,政府部门);INSTITUTION(4,事业部门);SOCIAL(5,社会团体);COURT(6,法院、检查);OTHER(7,其他单位);
     */
    @ApiModelProperty(value = "机构类型,枚举定义:IMPORTANT(1,重要部门);MUNICIPAL(2,市委部门);GOVERNMENT(3,政府部门);INSTITUTION(4,事业部门);SOCIAL(5,社会团体);COURT(6,法院、检查);OTHER(7,其他单位);")
    private Integer deptType;


    /**
     *所属区域
     */
    @ApiModelProperty(value = "所属区域")
    private Long areaId;


    /**
     *父部门Id
     */
    @ApiModelProperty(value = "父部门Id")
    private Long pid;


    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long seq;


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

