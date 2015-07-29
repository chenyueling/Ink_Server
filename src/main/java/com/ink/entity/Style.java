package com.ink.entity;

import java.util.Date;

/**
 * Created by chenyueling on 2015/7/20.
 */
public class Style {

    private int id;

    private Font font;
    private Background background;
    private int backgroundId;
    private int fontId;

    private Date createTime;
    //this filed user sort 
    private long sort;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public int getBackgroundId() {
        return backgroundId;
    }

    public void setBackgroundId(int backgroundId) {
        this.backgroundId = backgroundId;
    }

    public int getFontId() {
        return fontId;
    }

    public void setFontId(int fontId) {
        this.fontId = fontId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getSort() {
        return sort;
    }

    public void setSort(long sort) {
        this.sort = sort;
    }
}
