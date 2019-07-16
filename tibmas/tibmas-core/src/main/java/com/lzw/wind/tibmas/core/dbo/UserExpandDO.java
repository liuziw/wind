package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class UserExpandDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="user_expand";




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
     *属性名
     *propertyName
     */
    public static final String  PROPERTY_NAME="propertyName";

    /**
     *属性名
     *property_name
     */
    public static final String  DB_PROPERTY_NAME="property_name";

    /**
     *属性值
     *propertyValue
     */
    public static final String  PROPERTY_VALUE="propertyValue";

    /**
     *属性值
     *property_value
     */
    public static final String  DB_PROPERTY_VALUE="property_value";

    /**
     *注册id
     *userId
     */
    public static final String  USER_ID="userId";

    /**
     *注册id
     *user_id
     */
    public static final String  DB_USER_ID="user_id";

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
     *属性名
     */
    @ApiModelProperty(value = "属性名")
    private String propertyName;


    /**
     *属性值
     */
    @ApiModelProperty(value = "属性值")
    private String propertyValue;


    /**
     *注册id
     */
    @ApiModelProperty(value = "注册id")
    private Long userId;


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

