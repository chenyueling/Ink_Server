package com.ink.vo;

import com.ink.common.DateUtils;
import com.ink.entity.Style;

/**
 * Created by chenyueling on 2015/7/26.
 */
public class StyleVo {

    public int id;
    public FontVo font;
    public BackgroundVo background;
    public int backgroundId;
    public int fontId;
    public String createTime;

    public StyleVo(Style style) {
        this.id = style.getId();
        this.background = new BackgroundVo(style.getBackground());
        this.backgroundId = style.getBackgroundId();
        this.createTime = DateUtils.DateToString(style.getCreateTime());
        this.font = new FontVo(style.getFont());
        this.fontId = style.getFontId();
    }
    //this filed user sort

}
