package com.ink.dao;

import com.google.gson.Gson;
import com.ink.entity.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.annotation.Resource;
import java.sql.Time;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@TransactionConfiguration( defaultRollback = false)
public class MessageDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Resource(name = "messageDao")
    MessageDao messageDao;

    @Test
    public void testFindById() throws Exception {

        Message message = messageDao.findById(5);
        Gson gson = new Gson();
        System.out.println(gson.toJson(message));
    }

    @Test
    public void testGetScrollData(){
        for (Message message : messageDao.getScrollData(0, 10)) {
            System.out.println(message.getStyle().getId());
        }
    }

    @Test
    public void testSave() throws Exception {
        Message m = new Message();
        m.setHeadIcon("headIcon");
        m.setShowName("luozhaocheng");
        m.setCreateTime(new Date());
        m.setIconText("hahahahah");
        m.setShowImg("showImg");
        m.setShowText("showText");
        m.setStyleId(1);
        m.setStatus(true);
        messageDao.save(m);
    }
}