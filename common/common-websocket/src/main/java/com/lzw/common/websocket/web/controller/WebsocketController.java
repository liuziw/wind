package com.lzw.common.websocket.web.controller;

import com.lzw.common.websocket.dto.MessageDTO;
import com.lzw.common.websocket.dto.MessageToAllDTO;
import com.lzw.common.websocket.dto.MessageToUsersDTO;
import com.lzw.common.websocket.service.WebsocketService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/20 10:54
 */
@RestController
@RequestMapping("/websocket")
public class WebsocketController {
    @Autowired
    WebsocketService websocketService;

    @ApiOperation("向指定的用户或页面发消息")
    @RequestMapping(value = "/sendMessage",method = RequestMethod.POST)
    @ResponseBody
    public void sendMessage(@RequestBody MessageDTO messageDTO){
        websocketService.sendMessage(messageDTO);
    }

    @ApiOperation("向指定的多个用户群发消息")
    @RequestMapping(value = "/sendMessageToUsers",method = RequestMethod.POST)
    @ResponseBody
    public void sendMessageToUsers(@RequestBody MessageToUsersDTO messageDTO){
        websocketService.sendMessageToUsers(messageDTO);
    }

    @ApiOperation("向指定的用户或页面发消息")
    @RequestMapping(value = "/sendMessageToAll",method = RequestMethod.POST)
    @ResponseBody
    public void sendMessageToAll(@RequestBody MessageToAllDTO messageDTO){
        websocketService.sendMessageToAll(messageDTO);
    }


}
