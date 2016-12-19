package tests;

import api.android.Android;
import api.apps.hyundai.Hyundai;
import api.apps.hyundai.auth.Auth;
import api.apps.hyundai.auth.ForgotPassword;
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
    public static void test1(){
        testInfo.id("test1").name("Verify start screens");
        StartScreen1 sc1 = hyundai.startscreen1.waitToLoad();
       /* sc1.checkIsAllElementsExists();
        StartScreen1 sc2 = sc1.swipeRight();
        sc2.waitToLoad().checkIsAllElementsExists();
        StartScreen1 sc3 = sc2.swipeRight();
        sc3.waitToLoad().checkIsAllElementsExists();
        StartScreen1 sc4 = sc3.swipeRight();
        sc4.waitToLoad().checkIsAllElementsExists();
        Auth auth = sc4.tapCloseButton();
        auth.waitToLoad();
        hyundai.forceStop();
        hyundai.clearData();
        hyundai.open();
        sc1 = hyundai.startscreen1.waitToLoad();*/
        sc1.tapSkipButton().waitToLoad();
    }

    @Test
    public static void test2() {
        testInfo.id("test2").name("Verify Auth");
        Auth auth = new Auth();
        auth.waitToLoad();
        Assert.assertTrue(auth.uiObject.title().exists());
        auth.tapEmail().typeText("test@test.ru");
        auth.tapPassword().typeText("PaSsWoRd");
        auth.tapShowPassword();
        auth.uiObject.title().tap();
        auth.tapPassword().typeText("123456").waitToAppear(5);
        Assert.assertTrue("Assert password as was typed", auth.uiObject.password().getText().equals("PaSsWoRd123456"));
        auth.tapShowPassword();
        ForgotPassword fp = auth.tapForgotPassword().waitToLoad();
    }

    //TODO Сделать проверку почты
    @Test
    public static void test3() {
        testInfo.id("test2").name("Verify ForgotPassword");
        ForgotPassword fp = new ForgotPassword();
        fp.tapSendPasswordButton();
        Assert.assertTrue("Assert alert is exist", fp.uiObject.alertCloseButton().exists());

    }


}
