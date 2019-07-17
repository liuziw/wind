package com.lzw.wind.tibmas.core.dto;

import com.lzw.common.dao.dto.PageQueryItemDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zhongsj
 * @date 2019/4/2 19:47
 */
@Data
@ApiModel("分页查询用户信息列表")
public class ListUserInfoPageDTO extends PageQueryItemDTO {

    @ApiModelProperty("账号")
    private String userAccount;

    @ApiModelProperty("手机号")
    private String mobileNo;

    @ApiModelProperty("email")
    private String email;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("部门id")
    private Long deptId;

    @ApiModelProperty("身份证号")
    private String idCardNo;

    @ApiModelProperty("部门ids")
    private List<Long> deptIds;

    /**
     *学历
     */
    @ApiModelProperty(value = "学历")
    private Long education;

    /**
     *政治面貌,枚举定义:COMMUNIST_PARTY_MEMBER(1,党员);LEAGUE_MEMBER(2,团员);PUBLIC_PEOPLE(3,群众);
     */
    @ApiModelProperty(value = "政治面貌,枚举定义:COMMUNIST_PARTY_MEMBER(1,党员);LEAGUE_MEMBER(2,团员);PUBLIC_PEOPLE(3,群众);")
    private Integer politicalStatus;


    /**
     *人员类型
     */
    @ApiModelProperty(value = "人员类型")
    private String userType;

    /**
     *性别,枚举定义:MALE(1,男);FEMALE(0,女);
     */
    @ApiModelProperty(value = "性别,枚举定义:MALE(1,男);FEMALE(0,女);")
    private Integer gender;

    /**
     *是否禁用,枚举定义:ENABLED(1,已禁用);UNENABLED(0,正常);
     */
    @ApiModelProperty(value = "是否禁用,枚举定义:ENABLED(1,已禁用);UNENABLED(0,正常);")
    private Integer enabled;


}
