package tests;

import api.android.Android;
import api.apps.hyundai.Hyundai;
import api.apps.speedtest.Speedtest;
import core.managers.TestManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Artur on 6/2/2016.
 */
public class Navigation extends TestManager {

    //private static Speedtest speedtest = Android.app.speedtest;
    private static Hyundai hyundai = Android.app.hyundai;

    @BeforeClass
    public static void beforeClass(){
        hyundai.open();
    }

    @Before
    public void before(){
        testInfo.suite("Navigation");
    }

    @Test
    public void test1(){

        testInfo.id("test1").name("Verify that Home Activity has all the elements");
        hyundai.home.waitToLoad();
        hyundai.home.footerMenu.tapNavigatorButton();
        hyundai.home.footerMenu.tapCalendarButton();
        hyundai.home.footerMenu.tapNavigatorButton();
        hyundai.home.footerMenu.tapHomeButton();
        hyundai.home.footerMenu.tapTipsButton();
        hyundai.home.footerMenu.tapBalanceButton();
        hyundai.home.tapMenu();
        Assert.assertTrue(hyundai.home.uiObject.menuButton().exists());
    }


}
