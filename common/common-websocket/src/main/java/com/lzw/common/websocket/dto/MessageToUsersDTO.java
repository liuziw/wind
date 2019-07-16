package com.lzw.common.websocket.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/20 10:57
 */
@Data
@ApiModel("向多个用户群发实体")
public class MessageToUsersDTO {

    @ApiModelProperty("发送者")
    private Long from;

    @ApiModelProperty("接收者")
    private List<Long> userIdList;

    @ApiModelProperty("发送的文本")
    private String text;

    @ApiModelProperty("发送日期")
    private Date date;
}
