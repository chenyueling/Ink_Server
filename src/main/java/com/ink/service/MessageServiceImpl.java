package com.ink.service;

import com.ink.common.Result;
import com.ink.dao.BackgroundDao;
import com.ink.dao.FontDao;
import com.ink.dao.MessageDao;
import com.ink.dao.StyleDao;
import com.ink.entity.Background;
import com.ink.entity.Font;
import com.ink.entity.Message;
import com.ink.entity.Style;
import com.ink.form.MessageForm;
import com.ink.vo.MessageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by chenyueling on 2015/7/23.
 */
@Service(value = "messagesService")
public class MessageServiceImpl implements MessageService {

    @Resource(name = "backgroundDao")
    BackgroundDao backgroundDao;

    @Resource(name = "fontDao")
    FontDao fontDao;

    @Resource(name = "messageDao")
    MessageDao messageDao;

    @Resource(name = "styleDao")
    StyleDao styleDao;



    @Override
    public Result addMessage(MessageForm dataForm) {
        Message message = new Message();



        Style style = new Style();

        Background background = new Background();
        background.setBackground_type(dataForm.getBg_type());
        if (dataForm.getBg_type().equals("bg_image")){
            background.setBackground_img1(dataForm.getImg1());
            background.setBackground_img2(dataForm.getImg2());
            background.setBackground_img3(dataForm.getImg3());
            background.setBackground_img4(dataForm.getImg4());
            background.setBackground_img6(dataForm.getImg6());
            background.setBackground_img9(dataForm.getImg9());

        }else if(dataForm.getBg_type().equals("bg_color")){
            background.setBackground_color(dataForm.getBg_color());
        }
        style.setBackgroundId(background.getId());
        Font font = new Font();
        font.setFont_color(dataForm.getFont_color());
        font.setFont_size(dataForm.getFont_size());
        font.setBorder_color(dataForm.getBorder_color());
        font.setBorder_size(dataForm.getBorder_size());
        fontDao.save(font);

        style.setFontId(font.getId());

        style.setCreateTime(new Date());
        style.setSort(System.currentTimeMillis());

        styleDao.save(style);

        message.setStatus(dataForm.isStatus());
        message.setStyleId(style.getId());
        message.setShowText(dataForm.getShowText());
        message.setShowImg(dataForm.getShowImg());
        message.setCreateTime(new Date());
        message.setHeadIcon(dataForm.getHeadIcon());
        message.setShowName(dataForm.getShowName());
        message.setIconText(dataForm.getIconText());

        messageDao.save(message);

        return Result.success();
    }

    @Override
    public List<MessageVo> getMessages(int p, int rows) {
        int start = (p - 1) * rows;
        List<Message> messages = messageDao.getScrollData(start, rows);

        List<MessageVo> messageVos = new ArrayList<>();
            for (Message m : messages) {
                messageVos.add(new MessageVo(m));
            }
        return messageVos;
    }

    @Override
    public MessageVo getMessage(int id) {
        Message message = messageDao.findById(id);
        return new MessageVo(message);
    }
}
