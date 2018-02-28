package com.mc.commonlib;

import com.bloczzgcold.logger.Logger;
import com.bloczzgcold.logger.LoggerManager;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void stringUtilTest(){
        String email = "bloczzgcold@163.com";
        boolean isEmail = StringUtils.isEmail(email);
        System.out.println(isEmail);
    }

    @Test
    public void loggerTest(){
        LoggerManager.Ext.setDebug(true);
        Logger.d("test","test");
        System.out.println();
    }
}