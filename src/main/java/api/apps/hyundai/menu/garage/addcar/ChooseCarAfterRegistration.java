package api.apps.hyundai.menu.garage.addcar;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sav80 on 19.12.2016.
 */
public class ChooseCarAfterRegistration implements Activity {

    public static ChooseCarAfterRegistrationUiObjects uiObject = new ChooseCarAfterRegistrationUiObjects();

    public AddCarByVIN tapCarByIndex(Integer i){
        try{
            MyLogger.log.info("Tapping CarByIndex="+i);
            uiObject.allCars().waitToAppear(5);
            List<WebElement> allCars = Android.driver.findElementsByAndroidUIAutomator(uiObject.allCars().getLocator());
            for (WebElement car : allCars) {
                MyLogger.log.debug("Size of cars="+allCars.size());
            }
            allCars.get(0).click();
            return Android.app.hyundai.addCarByVIN;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Register Button, element absent or blocked");
        }
    }

    @Override
    public ChooseCarAfterRegistration waitToLoad() {
        try{
            MyLogger.log.info("Waiting for ChooseCarAfterRegistration activity");
            uiObject.title().waitToAppear(5);
            uiObject.subtitle().waitToAppear(5);
            return Android.app.hyundai.chooseCarAfterRegistration;
        }catch (AssertionError e){
            throw new AssertionError("ChooseCarAfterRegistration activity failed to load/open");
        }
    }
}
