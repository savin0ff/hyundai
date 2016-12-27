package api.apps.hyundai.popups;

import api.android.Android;
import api.apps.hyundai.home.Home;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 27.12.2016.
 */
public class Popups {
    public static PopupsUiObjects uiObject = new PopupsUiObjects();

    public String getPopupText(){
        try{
            MyLogger.log.info("Getting popup text");
            return uiObject.popupText().waitToAppear(5).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Get popup text, element absent or blocked");
        }
    }

    public Home tapPopupClose(){
        try{
            MyLogger.log.info("Tapping Popup close button");
            uiObject.popupCloseButton().waitToAppear(5).tap();
            return Android.app.hyundai.home;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Popup close button, element absent or blocked");
        }
    }

    public void waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Popup");
            uiObject.popupCloseButton().waitToAppear(10);
        }catch (AssertionError e){
            throw new AssertionError("Popup failed to load/open");
        }
    }
}
