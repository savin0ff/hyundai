package tests;

import api.android.Android;
import api.apps.hyundai.Hyundai;
import api.apps.hyundai.startscreens.StartScreen;
import api.apps.hyundai.startscreens.StartScreen1;
import api.apps.hyundai.startscreens.StartScreen2;
import api.apps.hyundai.startscreens.StartScreen3;
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
        hyundai.clearData();
        hyundai.open();
    }

    @Before
    public void before(){
        testInfo.suite("Navigation");
    }

    @Test
    public void testStartScreens(){
        StartScreen1 sc1 = hyundai.startscreen1.waitToLoad();
        sc1.checkIsAllElementsExists();
        StartScreen1 sc2 = sc1.swipeRight();
        sc2.waitToLoad().checkIsAllElementsExists();
        StartScreen1 sc3 = sc2.swipeRight();
        sc3.waitToLoad().checkIsAllElementsExists();
        StartScreen1 sc4 = sc3.swipeRight();
        sc4.waitToLoad().checkIsAllElementsExists();
/*        testInfo.id("test1").name("Verify that Home Activity has all the elements");
        hyundai.home.waitToLoad();
        hyundai.home.footerMenu.tapCalendarButton().footerMenu.tapHomeButton().footerMenu.tapNavigatorButton().footerMenu.tapTipsButton().footerMenu.tapBalanceButton().footerMenu.tapHomeButton();
        hyundai.home.footerMenu.tapBalanceButton().footerMenu.tapTipsButton().footerMenu.tapHomeButton().footerMenu.tapCalendarButton().footerMenu.tapNavigatorButton().footerMenu.tapHomeButton();
        hyundai.home.tapMenu();
        Assert.assertTrue(hyundai.home.uiObject.menuButton().exists());*/
    }


}
