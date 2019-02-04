package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileEngineTestSuite {

    private static SettingFileEngine settingFileEngine;

    @BeforeClass
    public static void openSettingsFile() {

//        settingFileEngine = new SettingFileEngine();
//        settingFileEngine.open("myapp.settings");
        SettingFileEngine.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {

       // settingFileEngine.close();
        SettingFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String fileName = SettingFileEngine.getInstance().getFileName();
        System.out.println("Opened :" + fileName);
        //Then
        Assert.assertEquals("myapp.settings",fileName);
    }
}

