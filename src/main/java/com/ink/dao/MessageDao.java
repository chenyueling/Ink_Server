package com.ink.dao;

import com.ink.entity.Message;
import com.ink.vo.MessageVo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by chenyueling on 2015/7/25.
 */
@Component("messageDao")
public interface MessageDao {


    @Select("select * from tb_message where id=#{id}")
    @ResultMap("com.ink.dao.MessageDao.MessageResult")
    public Message findById(int id);


    @Select("select * from tb_message limit #{start},#{rows}")
    @ResultMap("com.ink.dao.MessageDao.MessageResult")
    public List<Message> getScrollData(@Param("start") int start,@Param("rows")int rows);

    @Insert("insert into tb_message (id, headIcon, showName, showText, iconText, showImg, styleId, status, createTime) values(#{id}, #{headIcon}, #{showName}, #{showText}, #{iconText}, #{showImg}, #{styleId}, #{status}, #{createTime})")
    public void save(Message message);
}
