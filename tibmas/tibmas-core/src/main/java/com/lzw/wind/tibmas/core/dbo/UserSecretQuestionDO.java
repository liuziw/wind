package com.lzw.wind.tibmas.core.dbo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 代码自动生成，请不要修改，切记！！！
 */
@Data
public class UserSecretQuestionDO implements java.io.Serializable  {


    private static final long serialVersionUID = 1L;


    //表名
    public static final String TABLE_NAME="user_secret_question";




    //定义字段常量
    /**
     *
     *id
     */
    public static final String  ID="id";

    /**
     *
     *id
     */
    public static final String  DB_ID="id";

    /**
     *用户账号
     *userAccount
     */
    public static final String  USER_ACCOUNT="userAccount";

    /**
     *用户账号
     *user_account
     */
    public static final String  DB_USER_ACCOUNT="user_account";

    /**
     *问题id
     *questionId
     */
    public static final String  QUESTION_ID="questionId";

    /**
     *问题id
     *question_id
     */
    public static final String  DB_QUESTION_ID="question_id";

    /**
     *问题答案（加密）
     *questionAnswer
     */
    public static final String  QUESTION_ANSWER="questionAnswer";

    /**
     *问题答案（加密）
     *question_answer
     */
    public static final String  DB_QUESTION_ANSWER="question_answer";

    /**
     *顺序
     *seq
     */
    public static final String  SEQ="seq";

    /**
     *顺序
     *seq
     */
    public static final String  DB_SEQ="seq";

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
     *
     */
    @ApiModelProperty(value = "")
    private Long id;


    /**
     *用户账号
     */
    @ApiModelProperty(value = "用户账号")
    private String userAccount;


    /**
     *问题id
     */
    @ApiModelProperty(value = "问题id")
    private Long questionId;


    /**
     *问题答案（加密）
     */
    @ApiModelProperty(value = "问题答案（加密）")
    private String questionAnswer;


    /**
     *顺序
     */
    @ApiModelProperty(value = "顺序")
    private Integer seq;


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

