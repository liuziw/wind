package com.lzw.common.websocket.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/20 11:38
 */
@Data
@ApiModel("给所有在线用户发websocket消息实体")
public class MessageToAllDTO {

    @ApiModelProperty("发送者")
    private Long from;

    @ApiModelProperty("发送的文本")
    private String text;

    @ApiModelProperty("发送日期")
    private Date date;
}
