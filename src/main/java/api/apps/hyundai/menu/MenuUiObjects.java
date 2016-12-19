package api.apps.hyundai.menu;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 19.12.2016.
 */
public class MenuUiObjects {
    private static UiObject
            homeButton,
            eventsButton,
            navigatorButton,
            configuratorButton,
            giftsButton,
            bonusBalanceButton,
            moreButton,
            specialOffersButton,
            garageButton,
            advicesButton,
            technicalServiceButton,
            testDriveButton,
            creditButton,
            myProfileButton,
            lookForDilerButton,
            supportButton,
            quitButton,
            closeMenuButton;

    public UiObject homeButton() {
        if (homeButton == null) homeButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_main").makeUiObject();
        return homeButton;
    }

    public UiObject eventsButton() {
        if (eventsButton == null) eventsButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_events").makeUiObject();
        return eventsButton;
    }

    public UiObject navigatorButton() {
        if (navigatorButton == null) navigatorButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_navigator").makeUiObject();
        return navigatorButton;
    }

    public UiObject configuratorButton() {
        if (configuratorButton == null) configuratorButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_configurator").makeUiObject();
        return configuratorButton;
    }

    public UiObject giftsButton() {
        if (giftsButton == null) giftsButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_presents").makeUiObject();
        return giftsButton;
    }

    public UiObject bonusBalanceButton() {
        if (bonusBalanceButton == null) bonusBalanceButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_my_balance").makeUiObject();
        return bonusBalanceButton;
    }

    public UiObject moreButton() {
        if (moreButton == null) moreButton = new UiSelector().text("Еще").makeUiObject();
        return moreButton;
    }

    public UiObject specialOffersButton() {
        if (specialOffersButton == null) specialOffersButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_promo").makeUiObject();
        return specialOffersButton;
    }

    public UiObject garageButton() {
        if (garageButton == null) garageButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_garage").makeUiObject();
        return garageButton;
    }

    public UiObject advicesButton() {
        if (advicesButton == null) advicesButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_advices").makeUiObject();
        return advicesButton;
    }

    public UiObject technicalServiceButton() {
        if (technicalServiceButton == null) technicalServiceButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_t_o").makeUiObject();
        return technicalServiceButton;
    }

    public UiObject testDriveButton() {
        if (testDriveButton == null) testDriveButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_test_drive").makeUiObject();
        return testDriveButton;
    }

    public UiObject creditButton() {
        if (creditButton == null) creditButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/menu_credit").makeUiObject();
        return creditButton;
    }

    public UiObject myProfileButton() {
        if (myProfileButton == null) myProfileButton = new UiSelector().text("Мой Профиль").makeUiObject();
        return myProfileButton;
    }

    public UiObject lookForDilerButton() {
        if (lookForDilerButton == null) lookForDilerButton = new UiSelector().text("Найти дилера").makeUiObject();
        return lookForDilerButton;
    }

    public UiObject supportButton() {
        if (supportButton == null) supportButton = new UiSelector().text("Служба поддержки").makeUiObject();
        return supportButton;
    }

    public UiObject quitButton() {
        if (quitButton == null) quitButton = new UiSelector().text("Выйти").makeUiObject();
        return quitButton;
    }

    public UiObject closeMenuButton() {
        if (closeMenuButton == null) closeMenuButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/close_menu_btn").makeUiObject();
        return closeMenuButton;
    }
}
