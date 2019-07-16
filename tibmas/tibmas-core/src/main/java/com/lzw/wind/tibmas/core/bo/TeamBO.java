package com.lzw.wind.tibmas.core.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/6/25 17:37
 */
@Data
@ApiModel("团队信息实体")
public class TeamBO {

    @ApiModelProperty("团队id")
    private Long teamId;

    @ApiModelProperty("团队名称")
    private String teamName;

    @ApiModelProperty("团队负责人id")
    private Long teamLeaderUserId;

    @ApiModelProperty("团队负责人账号")
    private String teamLeaderUserAccount;

    @ApiModelProperty("团队负责人名称")
    private String teamLeaderUserName;

}
