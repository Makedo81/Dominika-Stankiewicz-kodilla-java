package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeClass
    public static void createFirstLog() {

          Logger.getInstance().log("First log");
    }

    @Test
    public void getLastLog() {

        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log : " + lastLog);
        //Then
        Assert.assertEquals("First log",lastLog);
    }
}
