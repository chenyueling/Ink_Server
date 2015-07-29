package com.ink.vo;

import com.ink.entity.Background;

/**
 * Created by chenyueling on 2015/7/26.
 */
public class BackgroundVo {
    public String id;
    public String background_type;
    public String background_color;
    public String background_img1;
    public String background_img2;
    public String background_img3;
    public String background_img4;
    public String background_img6;
    public String background_img9;

    public BackgroundVo() {
    }

    public BackgroundVo(Background background) {
        this.background_color = background.getBackground_color();
        this.background_type = background.getBackground_type();
        this.background_img1 = background.getBackground_img1();
        this.background_img2 = background.getBackground_img2();
        this.background_img3 = background.getBackground_img3();
        this.background_img4 = background.getBackground_img4();
        this.background_img6 = background.getBackground_img6();
        this.background_img9 = background.getBackground_img9();
    }
}
