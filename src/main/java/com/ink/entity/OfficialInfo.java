package com.ink.entity;

/**
 * Created by chenyueling on 2015/7/20.
 *
 */
public class OfficialInfo {
    /**
     "bg":"http://www.baidu.com",
     "headIcon":"http://www.baidu.com",
     "name":"Name",
     "someInfo":"someInfo"
     */

    private int id;
    private String banner;
    private String info;

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
