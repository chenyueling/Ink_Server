package com.ink.vo;

import com.ink.entity.Font;

/**
 * Created by chenyueling on 2015/7/26.
 */
public class FontVo {
    public int id;
    public String font_color;
    public int font_size;
    public String border_color;
    public int border_size;

    public FontVo(Font font) {
        this.id = font.getId();
        this.border_color = font.getBorder_color();
        this.border_size = font.getBorder_size();
        this.font_color = font.getFont_color();
        this.font_size = font.getFont_size();
    }


    public FontVo() {
    }
}
