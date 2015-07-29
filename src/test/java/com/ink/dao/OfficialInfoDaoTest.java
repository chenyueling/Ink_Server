package com.ink.dao;

import com.google.gson.Gson;
import com.ink.entity.OfficialInfo;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@TransactionConfiguration( defaultRollback = false)
public class OfficialInfoDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Resource(name = "officialInfoDao")
    OfficialInfoDao officialInfoDao;

    @Test
    public void testSave() throws Exception {
        OfficialInfo info = new OfficialInfo();
        info.setInfo("info");
        info.setBanner("banner");
        System.out.println(info.getId());
        System.out.println(officialInfoDao.save(info));

        System.out.println(info.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        OfficialInfo info = new OfficialInfo();
        info.setId(5);
        info.setBanner("update");
        info.setInfo("update");
        officialInfoDao.update(info);
    }

    @Test
    public void testFindById() throws Exception {
        OfficialInfo info = officialInfoDao.findById(5);
        Gson gson = new Gson();
        System.out.println(gson.toJson(info));
    }
}