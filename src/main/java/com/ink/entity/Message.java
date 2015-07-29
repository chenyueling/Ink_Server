package com.ink.entity;

import com.google.gson.Gson;

import java.util.Date;

/**
 * Created by chenyueling on 2015/7/20.
 */
public class Message {
    /**
     {
     "headIcon":"http://www.baidu.com",
     "showName":"罗成",
     "showText":"say some thing",
     "iconText":"9个字符"，
     "showImg":"http://www.baidu.com/img.jpg",
     "style": {
     "styleId":"8151c88f",
     "font": {
     "id": "1",
     "font_color": "#ffffff",
     "font_size": "11",
     "border_color": "#000000",
     "border_size": "4"
     },
     "background": {
     "id": "2",
     "background_type": "image",
     "background_color": "",
     "background_img1": "/Uploads/201507/559ddfffd23b7.jpg",
     "background_img2": "/Uploads/201507/559ddfffd2568.jpg",
     "background_img3": "/Uploads/201507/559ddfffd26cf.jpg",
     "background_img4": "/Uploads/201507/559ddfffd280f.jpg",
     "background_img6": "/Uploads/201507/559ddfffd280f.jpg",
     "background_img9": "/Uploads/201507/559ddfffd280f.jpg"
     }
     }
     }
     */


    private int id;
    private String headIcon;
    private String showName;
    private String showText;
    private String iconText;
    private String showImg;
    private int styleId;
    private Style style;

    private Date createTime;
    private boolean status;


    public static void main(String[] args) {
       Gson gson = new Gson();
        String json = "{\"headIcon\":\"http://www.baidu.com\",\"showName\":\"罗成\",\"showText\":\"say some thing\",\"iconText\":\"9个字符\",\"showImg\":\"http://www.baidu.com/img.jpg\",\"style\":{\"styleId\":\"8151c88f\",\"font\":{\"id\":\"1\",\"font_color\":\"#ffffff\",\"font_size\":\"11\",\"border_color\":\"#000000\",\"border_size\":\"4\"},\"background\":{\"id\":\"2\",\"background_type\":\"image\",\"background_color\":\"\",\"background_img1\":\"/Uploads/201507/559ddfffd23b7.jpg\",\"background_img2\":\"/Uploads/201507/559ddfffd2568.jpg\",\"background_img3\":\"/Uploads/201507/559ddfffd26cf.jpg\",\"background_img4\":\"/Uploads/201507/559ddfffd280f.jpg\",\"background_img6\":\"/Uploads/201507/559ddfffd280f.jpg\",\"background_img9\":\"/Uploads/201507/559ddfffd280f.jpg\"}}}";
        Message message = gson.fromJson(json,Message.class);
        System.out.println(message.getHeadIcon() + "___" + message.getStyle());
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowText() {
        return showText;
    }

    public void setShowText(String showText) {
        this.showText = showText;
    }

    public String getIconText() {
        return iconText;
    }

    public void setIconText(String iconText) {
        this.iconText = iconText;
    }

    public String getShowImg() {
        return showImg;
    }

    public void setShowImg(String showImg) {
        this.showImg = showImg;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getStyleId() {
        return styleId;
    }

    public void setStyleId(int styleId) {
        this.styleId = styleId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
