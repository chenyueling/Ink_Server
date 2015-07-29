package com.ink.entity;

/**
 * Created by chenyueling on 2015/7/25.
 */
public class Font {

    private int id;
    private String font_color;
    private int font_size;
    private String border_color;
    private int border_size;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFont_color() {
        return font_color;
    }

    public void setFont_color(String font_color) {
        this.font_color = font_color;
    }



    public String getBorder_color() {
        return border_color;
    }

    public void setBorder_color(String border_color) {
        this.border_color = border_color;
    }


    public int getFont_size() {
        return font_size;
    }

    public void setFont_size(int font_size) {
        this.font_size = font_size;
    }

    public int getBorder_size() {
        return border_size;
    }

    public void setBorder_size(int border_size) {
        this.border_size = border_size;
    }
}
