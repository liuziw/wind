package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class SysConfigDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="sys_config";




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
     *配置项
     *configKey
     */
    public static final String  CONFIG_KEY="configKey";

    /**
     *配置项
     *config_key
     */
    public static final String  DB_CONFIG_KEY="config_key";

    /**
     *配置值
     *configValue
     */
    public static final String  CONFIG_VALUE="configValue";

    /**
     *配置值
     *config_value
     */
    public static final String  DB_CONFIG_VALUE="config_value";

    /**
     *备注
     *remark
     */
    public static final String  REMARK="remark";

    /**
     *备注
     *remark
     */
    public static final String  DB_REMARK="remark";

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
     *修改时间
     *gmtModified
     */
    public static final String  GMT_MODIFIED="gmtModified";

    /**
     *修改时间
     *gmt_modified
     */
    public static final String  DB_GMT_MODIFIED="gmt_modified";

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
     *是否删除:0-否,1-是
     *isDeleted
     */
    public static final String  IS_DELETED="isDeleted";

    /**
     *是否删除:0-否,1-是
     *is_deleted
     */
    public static final String  DB_IS_DELETED="is_deleted";




    /**
     *代理主键
     */
    @ApiModelProperty(value = "代理主键")
    private Long id;


    /**
     *配置项
     */
    @ApiModelProperty(value = "配置项")
    private String configKey;


    /**
     *配置值
     */
    @ApiModelProperty(value = "配置值")
    private String configValue;


    /**
     *备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;


    /**
     *创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private java.util.Date gmtCreate;


    /**
     *创建人ID
     */
    @ApiModelProperty(value = "创建人ID")
    private Long userIdCreate;


    /**
     *修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private java.util.Date gmtModified;


    /**
     *最后修改人ID
     */
    @ApiModelProperty(value = "最后修改人ID")
    private Long userIdModified;


    /**
     *是否删除:0-否,1-是
     */
    @ApiModelProperty(value = "是否删除:0-否,1-是")
    private Integer isDeleted;
}

