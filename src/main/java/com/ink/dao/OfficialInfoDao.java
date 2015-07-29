package com.ink.dao;

import com.ink.entity.OfficialInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenyueling on 2015/7/27.
 */
@Component("officialInfoDao")
public interface OfficialInfoDao {

    @Insert("insert into tb_officialinfo (id, banner, info) values(#{id}, #{banner}, #{info})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public int save(OfficialInfo officialInfo);


    @Update("update tb_officialinfo set banner = #{banner}, info = #{info} where id=#{id}")
    public void update(OfficialInfo officialInfo);

    @Select("select * from tb_officialinfo where id=#{id}")
    @RequestMapping("com.ink.dao.OfficialInfoDao.OfficialInfoResult")
    public OfficialInfo findById(@Param("id")int id);
}
