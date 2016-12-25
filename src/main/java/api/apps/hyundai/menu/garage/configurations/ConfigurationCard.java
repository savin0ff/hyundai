package api.apps.hyundai.menu.garage.configurations;

import api.android.Android;
import api.apps.hyundai.menu.configurator.Configurator;
import api.apps.hyundai.menu.garage.cars.GarageCars;
import api.interfaces.Activity;
import core.MyLogger;
import core.Timer;
import core.UiObject;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sav80 on 24.12.2016.
 */
public class ConfigurationCard implements Activity{
    ConfigurationCard (WebElement element) {
        this.element = element;
    }

    //public static ConfigurationCardUiObjects uiObject = new ConfigurationCardUiObjects();
    private WebElement element;
    private static String
            carModelNameSelector = ":id/my_garage_configuration_model",
            carPriceSelector = ":id/my_garage_configuration_car_price",
            carModificationAndComplectationSelector = ":id/my_garage_configuration_description",
            burgerButttonSelector = ":id/my_garage_configuration_dots",
            sendByEmaiMenuButtonSelector = "Отправить на email",
            descriptionOnSiteMenuButtonSelector = "Описание модели на сайте",
            deleteMenuButtonSelector = "Удалить";

    public String getCarModelName(){
        try{
            MyLogger.log.info("Getting car model name in configuration in the garage");
            return element.findElement(By.id(Android.app.hyundai.packageID()+carModelNameSelector)).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Get car model name in configuration in the garage, element absent or blocked");
        }
    }

    public String getCarPrice(){
        try{
            MyLogger.log.info("Getting car price in configuration in the garage");
            return element.findElement(By.id(Android.app.hyundai.packageID()+carPriceSelector)).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Get car price in configuration in the garage, element absent or blocked");
        }
    }

    public String getCarModification(){
        try{
            MyLogger.log.info("Getting car modification in configuration in the garage");
            String str = element.findElement(By.id(Android.app.hyundai.packageID()+carModificationAndComplectationSelector)).getText();
            String[] array = str.split("(^[\\w]+\\s)([\\s\\w]+)");
            return array[0];
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Get car modification in configuration in the garage, element absent or blocked");
        }
    }

    public String getCarComplectation(){
        try{
            MyLogger.log.info("Getting car modification in configuration card in the garage");
            String str = element.findElement(By.id(Android.app.hyundai.packageID()+carModificationAndComplectationSelector)).getText();
            String[] array = str.split("(^[\\w]+\\s)([\\s\\w]+)");
            return array[1];
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Get car Complectation in configuration card in the garage, element absent or blocked");
        }
    }

    public ConfigurationCard tapBurgerButton(){
        try{
            MyLogger.log.info("Tapping BurgerButton button on car configuration in the garage");
            element.findElement(By.id(Android.app.hyundai.packageID()+burgerButttonSelector)).click();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap BurgerButton button on car configuration in the garage, element absent or blocked");
        }
    }

    private Boolean isCardVisible(){
        if(element.findElement(By.id(Android.app.hyundai.packageID()+carModelNameSelector)).isDisplayed()&&
                element.findElement(By.id(Android.app.hyundai.packageID()+carModificationAndComplectationSelector)).isDisplayed()) return true;
        else return false;
    }

    @Override
    public ConfigurationCard waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Configuration Card activity");
            Timer timer = new Timer();
            timer.start();
            while(!timer.expired(10)) {
                if(isCardVisible()) break;
                Android.app.hyundai.swipeDown(1);
            }
            if(timer.expired(10) && !isCardVisible()) throw new AssertionError("Element Configuration Card failed to appear within "+10+" seconds");
            return this;
        }catch (AssertionError e){
            throw new AssertionError("Garage Configuration Card activity failed to load/open");
        }
    }


}
