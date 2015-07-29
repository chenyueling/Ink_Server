package com.ink.vo;

import com.ink.common.DateUtils;
import com.ink.entity.Message;
import com.ink.entity.Style;

import java.util.Date;

/**
 * Created by chenyueling on 2015/7/23.
 */
public class MessageVo {

    public int id;
    public String headIcon;
    public String showName;
    public String showText;
    public String iconText;
    public String showImg;
    public int styleId;
    public StyleVo style;

    public String createTime;
    public String status;
    public MessageVo() {

    }



    public MessageVo(Message message) {
        this.id = message.getId();
        this.createTime = DateUtils.DateToString(message.getCreateTime());
        this.headIcon = message.getHeadIcon();
        this.iconText = message.getIconText();
        this.showImg = message.getShowImg();
        this.showName = message.getShowName();
        this.showText = message.getShowText();
        this.status = message.isStatus()?"enable":"disable";
        this.style = new StyleVo(message.getStyle());
        this.styleId = message.getStyleId();
    }
}
