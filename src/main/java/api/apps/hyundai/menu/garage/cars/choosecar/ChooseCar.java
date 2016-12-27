package api.apps.hyundai.menu.garage.cars.choosecar;

import api.android.Android;
import api.apps.hyundai.menu.garage.cars.addvin.AddCarByVIN;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sav80 on 24.12.2016.
 */
public class ChooseCar implements Activity{
    public static ChooseCarListUiObjects uiObject = new ChooseCarListUiObjects();

    public AddCarByVIN addCarByIndex(Integer i){
        try{
            MyLogger.log.info("Tapping CarByIndex="+i);
            uiObject.allCars().waitToAppear(5);
            List<WebElement> allCars = Android.driver.findElementsByAndroidUIAutomator(uiObject.allCars().getLocator());
            MyLogger.log.debug("Size of cars="+allCars.size());
            allCars.get(i).click();
            return Android.app.hyundai.addCarByVIN;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap car by index, element absent or blocked");
        }
    }

    @Override
    public ChooseCar waitToLoad() {
        try{
            MyLogger.log.info("Waiting for List of Cars activity");
            uiObject.allCars().waitToAppear(5);
            return this;
        }catch (AssertionError e){
            throw new AssertionError("Garage List of Cars activity failed to load/open");
        }
    }

}
