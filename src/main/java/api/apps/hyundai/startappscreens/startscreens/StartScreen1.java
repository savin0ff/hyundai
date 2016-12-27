package api.apps.hyundai.startappscreens.startscreens;

import api.android.Android;
import api.apps.hyundai.startappscreens.auth.Auth;
import api.interfaces.Activity;
import core.MyLogger;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 18.12.2016.
 */
public class StartScreen1  implements Activity {

    public StartScreen1UiObjects uiObject = new StartScreen1UiObjects();

    public Auth tapSkipButton(){
        try{
            MyLogger.log.info("Tapping Skip button");
            uiObject.skipButton().waitToAppear(3).tap();
            return Android.app.hyundai.auth;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Skip button, element absent or blocked");
        }
    }

    public Auth tapCloseButton(){
        try{
            MyLogger.log.info("Tapping Close button");
            uiObject.closeButton().waitToAppear(3).tap();
            return Android.app.hyundai.auth;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Close button, element absent or blocked");
        }
    }

    public StartScreen1 swipeRight(){
        try{
            MyLogger.log.info("Swipping right");
            Android.driver.swipe(1000,640, 100, 640, 300);
            return Android.app.hyundai.startscreen2;
        }catch (Exception e){
            throw new AssertionError("Can't swipe");
        }
    }

    public void checkIsAllElementsExists (){
        Assert.assertTrue("closeButton exists",this.uiObject.closeButton().exists());
        Assert.assertTrue(this.uiObject.TitleText().exists());
        Assert.assertTrue(this.uiObject.skipButton().exists());
        Assert.assertTrue(this.uiObject.descriptionText().exists());
        Assert.assertTrue(this.uiObject.indicator().exists());
        Assert.assertTrue(this.uiObject.mirHyundaiText().exists());
        Assert.assertTrue("closeButton isClickable",this.uiObject.skipButton().isClickable());
        Assert.assertTrue(this.uiObject.closeButton().isClickable());
    }

    @Override
    public StartScreen1 waitToLoad() {
        try{
            MyLogger.log.info("Waiting for StartScreen activity");
            //MyLogger.log.info("Waiting for "+this.uiObject.TitleText().getText());
            this.uiObject.TitleText().waitToAppear(5);
            return this;
        }catch (AssertionError e){
            MyLogger.log.info(this.getClass().getName()+" activity failed to load/open");
            throw new AssertionError(this.getClass().getName()+" activity failed to load/open");
        }
    }
}


