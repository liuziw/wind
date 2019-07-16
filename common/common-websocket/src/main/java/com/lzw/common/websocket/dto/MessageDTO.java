package com.lzw.common.websocket.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("websocket信息实体")
public class MessageDTO {

	@ApiModelProperty("发送者")
	private Long from;

	@ApiModelProperty("接收者")
	private Long to;

	@ApiModelProperty("接收端token")
	private String token;

	@ApiModelProperty("发送的文本")
	private String text;

	@ApiModelProperty("发送日期")
	private Date date;

}
