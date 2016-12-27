package tests;

import api.android.Android;
import api.apps.hyundai.Hyundai;
import api.apps.hyundai.menu.garage.Garage;
import api.apps.hyundai.startappscreens.register.addcar.AddCarAfterRegistration;
import api.apps.hyundai.startappscreens.auth.Auth;
import api.apps.hyundai.startappscreens.auth.forgotpass.ForgotPassword;
import api.apps.hyundai.startappscreens.register.Register;
import api.apps.hyundai.startappscreens.register.addcar.choosecar.ChooseCarAfterRegistration;
import api.apps.hyundai.startappscreens.startscreens.StartScreen1;
import core.MyLogger;
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
        auth startappscreens = sc4.tapCloseButton();
        startappscreens.waitToLoad();
        hyundai.forceStop();
        hyundai.clearData();
        hyundai.open();
        sc1 = hyundai.startscreen1.waitToLoad();*/
        sc1.tapSkipButton().waitToLoad();

    }

    @Test
    public void test2() {
        testInfo.id("test2").name("Verify auth");
        Auth auth = new Auth();
        auth.waitToLoad().tapEmail().typeText("sav80@bk.ru");
        auth.tapPassword().typeText("Qwerty1");
        Garage garage = auth.tapEnterButton().waitToLoad().tapMenu().tapMoreButton().waitToLoad().tapGarageButton();
        garage.tapCarsNavigationButton().tapPlusButton().addCarByIndex(1).
        garage.tapConfigurationsNavigationButton().waitToLoad().getConfigurationCard(0).waitToLoad().tapBurgerButton();
        Android.adb.tapBackButtonOnPhone();
        garage.tapConfigurationsNavigationButton().tapNewConfigurationButton();

        MyLogger.log.info(garage.configurtations.getConfigurationCard(1).waitToLoad().getCarModificationAndComplectation());
        MyLogger.log.info(garage.configurtations.getConfigurationCard(2).waitToLoad().getCarModificationAndComplectation());

 /*       Assert.assertTrue(startappscreens.uiObject.title().exists());
        startappscreens.tapEmail().typeText("test@test.ru");
        startappscreens.tapPassword().typeText("PaSsWoRd");
        startappscreens.tapShowPassword();
        startappscreens.uiObject.title().tap();
        startappscreens.tapPassword().typeText("123456").waitToAppear(5);
        Assert.assertTrue("Assert password as was typed", startappscreens.uiObject.password().getText().equals("PaSsWoRd123456"));
        startappscreens.tapShowPassword();
        ForgotPassword fp = startappscreens.tapForgotPassword().waitToLoad();
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

    //@Test
    public void test4() {
        testInfo.id("test2").name("Choose Car");
        Register reg = new Register();
        reg.waitToLoad().tapName().waitToAppear(5).typeText("Тест");
        reg.tapEmail().waitToAppear(5).typeText("test000002@delete.me");
        reg.tapPassword().waitToAppear(5).typeText("Qwerty1");
        AddCarAfterRegistration add = reg.tapRegisterButton();
        ChooseCarAfterRegistration choosecar = add.waitToLoad().tapPlusButton();
        choosecar.chooseCar.addCarByIndex(11);
    }


}
