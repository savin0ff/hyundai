package api.apps.hyundai.menu.garage.configurations.cards;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import core.Timer;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 24.12.2016.
 */
public class ConfigurationCard implements Activity {
    public ConfigurationCard(Integer index) {
        this.uiObject = new ConfigurationCardUiObjects(index);
    }

    public ConfigurationCardUiObjects uiObject;

    public String getCarModelName(){
        try{
            MyLogger.log.info("Getting car model name in configuration in the garage");
            return uiObject.carModelName().waitToAppear(5).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Get car model name in configuration in the garage, element absent or blocked");
        }
    }

    public String getCarPrice(){
        try{
            MyLogger.log.info("Getting car price in configuration in the garage");
            return uiObject.carPrice().waitToAppear(5).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Get car price in configuration in the garage, element absent or blocked");
        }
    }

    public String getCarModificationAndComplectation(){
        try{
            MyLogger.log.info("Getting car modification in configuration in the garage");
            String str = uiObject.carModificationAndComplectation().waitToAppear(5).getText();
            return str;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Get car modification in configuration in the garage, element absent or blocked");
        }
    }

    public ConfigurationCard tapBurgerButton() {
        try {
            MyLogger.log.info("Tapping BurgerButton button on car configuration in the garage");
            uiObject.burgerButtton().waitToAppear(5).tap();
            return this;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Cant tap BurgerButton button on car configuration in the garage, element absent or blocked");
        }
    }

    @Override
    public ConfigurationCard waitToLoad() {
        MyLogger.log.info("Waiting for Configuration Card activity");
        Timer timer = new Timer();
        timer.start();
        while (!timer.expired(15)) {
            try {
                uiObject.burgerButtton().waitToAppear(5);
                uiObject.carModificationAndComplectation().waitToAppear(1);
                return this;
            } catch (AssertionError e) {
                Android.app.hyundai.swipeDown(1);
                continue;
            }
        }
        throw new AssertionError("Garage Configuration Card activity failed to load/open");
    }
}
