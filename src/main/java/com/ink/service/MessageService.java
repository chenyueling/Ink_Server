package com.ink.service;

import com.ink.common.Result;
import com.ink.entity.Message;
import com.ink.form.MessageForm;
import com.ink.vo.MessageVo;

import java.util.List;

/**
 * Created by chenyueling on 2015/7/23.
 */
public interface MessageService {
    public Result addMessage(MessageForm dataForm);
    public List<MessageVo> getMessages(int p ,int rows);
    public MessageVo getMessage(int id);
}
