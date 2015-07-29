package com.ink.dao;

import com.ink.entity.Background;
import com.ink.entity.Style;
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
public class BackgroundDaoTest extends AbstractTransactionalJUnit4SpringContextTests {


   @Resource( name = "backgroundDao")
   BackgroundDao backgroundDao;

    @Test
    public void testSave() throws Exception {

        Background b = new Background();
       // b.setId(1);
        b.setBackground_color("setBackground_color");
        b.setBackground_type("setBackground_type");
        b.setBackground_img1("setBackground_img1");
        b.setBackground_img2("setBackground_img2");
        b.setBackground_img3("setBackground_img3");
        b.setBackground_img4("setBackground_img4");
        b.setBackground_img6("setBackground_img6");
        b.setBackground_img9("setBackground_img9");
        int id = backgroundDao.save(b);
        System.out.println(id);
    }
}