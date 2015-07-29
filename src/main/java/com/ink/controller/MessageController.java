package com.ink.controller;

import com.google.gson.Gson;
import com.ink.common.Result;
import com.ink.entity.Message;
import com.ink.form.MessageForm;
import com.ink.service.MessageService;
import com.ink.vo.MessageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.style.ToStringStyler;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * Created by chenyueling on 2015/7/21.
 */
@Controller
@RequestMapping("/messages")
public class MessageController {

    @Resource(name = "messagesService")
    MessageService messageService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Result addMessage(MessageForm dataForm){
        sysoutMessage(dataForm);
        Result result = messageService.addMessage(dataForm);
        return result;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public @ResponseBody
    MessageVo getMessage(@PathVariable("id")int id){
        return messageService.getMessage(id);
    }


    @RequestMapping(value = "{id}",params = {"p","r"}, method = RequestMethod.GET)
    public @ResponseBody
    List<MessageVo> getMessages(int p, int r){
        return messageService.getMessages(p, r);
    }


    private void sysoutMessage(MessageForm dataForm){
        Gson gson = new Gson();
        System.out.println(gson.toJson(dataForm));
    }
}
