package com.ink.vo;

import com.ink.entity.OfficialInfo;

/**
 * Created by chenyueling on 2015/7/27.
 */
public class OfficialInfoVo {
    public int id;
    public String banner;
    public String info;


    public OfficialInfoVo() {
    }

    public OfficialInfoVo(OfficialInfo officialInfo) {
        this.id = officialInfo.getId();
        this.banner = officialInfo.getBanner();
        this.info = officialInfo.getInfo();
    }

}
