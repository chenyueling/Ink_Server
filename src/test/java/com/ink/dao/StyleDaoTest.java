package com.ink.dao;

import com.ink.entity.Style;
import junit.framework.TestCase;
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
public class StyleDaoTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Resource( name = "styleDao")
    StyleDao styleDao;
    public void testSave() throws Exception {
        Style s = new Style();

        styleDao.save(s);
    }
}