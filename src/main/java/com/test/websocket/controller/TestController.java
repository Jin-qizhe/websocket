package com.test.websocket.controller;

import com.test.websocket.server.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author jin
 * @Date 2023/1/3 16:26
 * @Description TODO
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private WebSocketServer webSocketServer;

    @RequestMapping("/index")
    public String index(ModelMap modelMap, String id) {
        modelMap.put("id", id);
        modelMap.put("index", "index!");
        return "/test/index";
    }

    @RequestMapping("/send")
    @ResponseBody
    public String send(String id, String message) {
        webSocketServer.sendOneMessage(id, message);
        return "123";
    }

}
