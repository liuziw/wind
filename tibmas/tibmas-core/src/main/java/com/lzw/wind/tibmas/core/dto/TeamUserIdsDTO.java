package com.lzw.wind.tibmas.core.dto;

import com.hyzs.tibmas.core.vo.UserInfoVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class TeamUserIdsDTO {

    @ApiModelProperty(value = "成员的id和成员类型")
    private List<UserInfoVo> userInfo;

    @ApiModelProperty(value = "团队Id",example = "1")
    private Long teamId;

    @ApiModelProperty(value = "团队类型编码",example = "ZF_XCJ")
    private String teamTypeCode;

}
