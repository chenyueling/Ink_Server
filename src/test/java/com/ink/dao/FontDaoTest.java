package com.ink.dao;

import com.ink.entity.Font;
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
public class FontDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Resource(name = "fontDao")
    FontDao fontDao;

    @Test
    public void testSave() throws Exception {
        Font f = new Font();
        f.setBorder_color("setBorder_color");
        f.setBorder_size(0);
        f.setFont_color("setFont_color");
        f.setFont_size(1);
        int id = fontDao.save(f);
        System.out.println(id);
        //fuck
        System.out.println(f.getId());
    }
}