package com.ink.dao;

import com.ink.entity.Background;
import com.ink.entity.Font;
import com.ink.entity.Style;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * Created by chenyueling on 2015/7/25.
 */
@Component("fontDao")
public interface FontDao {

    @Insert("insert into tb_font (id, font_color, border_color, border_size, font_size) values (#{id}, #{font_color}, #{border_color}, #{border_size}, #{font_size})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int save(Font font);

    @Select("select * from tb_font where id=#{id}")
    @ResultMap("com.ink.dao.FontDao.FontResult")
    public Font findById(@Param("id")int id);
}
