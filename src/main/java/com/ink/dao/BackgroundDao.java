package com.ink.dao;

import com.ink.entity.Background;
import com.ink.entity.Style;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * Created by chenyueling on 2015/7/25.
 */
@Component("backgroundDao")
public interface BackgroundDao {

    @Insert("insert into tb_background (id, background_type,background_color, background_img1, background_img2, background_img3, background_img4, background_img6, background_img9) values(#{id}, #{background_type}, #{background_color}, #{background_img1}, #{background_img2}, #{background_img3}, #{background_img4}, #{background_img6}, #{background_img9})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int save(Background background);

    @Select("select * from tb_background where id=#{id}")
    @ResultMap("com.ink.dao.BackgroundDao.BackgroundResult")
    public Background findById(@Param("id")int id);
}