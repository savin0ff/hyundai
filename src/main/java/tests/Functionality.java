package tests;

import api.android.Android;
import api.apps.hyundai.Hyundai;
import core.managers.TestManager;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Artur on 6/2/2016.
 */
public class Functionality extends TestManager {

    private static Hyundai hyundai = Android.app.hyundai;

    @Test
    public void test4(){
        testInfo.id("test4").suite("Functionality").name("Verify that you can Test Again");
        hyundai.home.tapMenu();
 /*       speedtest.home.tapTestAgain();
        Assert.assertTrue(speedtest.home.uiObject.ping().exists());
        Assert.assertTrue(speedtest.home.uiObject.pingSpeed().exists());
        Assert.assertTrue(speedtest.home.uiObject.download().exists());
        Assert.assertTrue(speedtest.home.uiObject.downloadSpeed().exists());
        Assert.assertTrue(speedtest.home.uiObject.upload().exists());
        Assert.assertTrue(speedtest.home.uiObject.uploadSpeed().exists());
        Assert.assertTrue(speedtest.home.uiObject.shareButton().exists());
        Assert.assertTrue(speedtest.home.uiObject.removeAdsButton().exists());
        Assert.assertTrue(speedtest.home.uiObject.testAgainButton().exists());
        Assert.assertTrue(speedtest.home.uiObject.logo().exists()); */
    }
}
