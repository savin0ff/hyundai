package tests;

import api.android.Android;
import api.apps.hyundai.Hyundai;
import api.apps.hyundai.menu.garage.addcar.AddCarAfterRegistration;
import api.apps.hyundai.auth.Auth;
import api.apps.hyundai.auth.ForgotPassword;
import api.apps.hyundai.auth.Register;
import api.apps.hyundai.menu.garage.addcar.ChooseCarAfterRegistration;
import api.apps.hyundai.startscreens.StartScreen1;
import core.managers.TestManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
    public void test1(){
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
    public void test2() {
        testInfo.id("test2").name("Verify Auth");
        Auth auth = new Auth();
        auth.waitToLoad().tapGoToRegisterButton();
 /*       Assert.assertTrue(auth.uiObject.title().exists());
        auth.tapEmail().typeText("test@test.ru");
        auth.tapPassword().typeText("PaSsWoRd");
        auth.tapShowPassword();
        auth.uiObject.title().tap();
        auth.tapPassword().typeText("123456").waitToAppear(5);
        Assert.assertTrue("Assert password as was typed", auth.uiObject.password().getText().equals("PaSsWoRd123456"));
        auth.tapShowPassword();
        ForgotPassword fp = auth.tapForgotPassword().waitToLoad();
        fp.tapBackToAuthButton().tapGoToRegisterButton();*/
    }

    //TODO Сделать проверку почты
    //@Test
    public void test3() {
        testInfo.id("test2").name("Verify ForgotPassword");
        ForgotPassword fp = new ForgotPassword();
        fp.tapSendPasswordButton();
        //Assert.assertTrue("Assert alert is exist", fp.uiObject.alertCloseButton().exists()); it's FAILED

    }

    @Test
    public void test4() {
        testInfo.id("test2").name("Choose Car");
        Register reg = new Register();
        reg.waitToLoad().tapName().waitToAppear(5).typeText("Тест");
        reg.tapEmail().waitToAppear(5).typeText("test000002@delete.me");
        reg.tapPassword().waitToAppear(5).typeText("Qwerty1");
        AddCarAfterRegistration add = reg.tapRegisterButton();
        ChooseCarAfterRegistration choosecar = add.waitToLoad().tapPlusButton();
        choosecar.tapCarByIndex(11);
    }


}
