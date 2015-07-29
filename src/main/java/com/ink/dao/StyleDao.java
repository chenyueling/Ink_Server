package com.ink.dao;

import com.ink.entity.Style;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * Created by chenyueling on 2015/7/25.
 */
@Component("styleDao")
public interface StyleDao {

    @Insert("insert into tb_style (id, backgroundId, fontId, sort, createTime) values(#{id}, #{backgroundId}, #{fontId}, #{sort}, #{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int save(Style style);

    @Select("select * from tb_style where id=#{id}")
    @ResultMap("com.ink.dao.StyleDao.StyleResult")
    public Style findById(@Param("id")int id);

}
