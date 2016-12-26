package api.apps.hyundai.menu.garage.configurations;


import api.android.Android;
import api.apps.hyundai.menu.configurator.Configurator;
import api.apps.hyundai.menu.garage.Garage;
import api.apps.hyundai.menu.garage.addcar.ActivateCar;
import api.apps.hyundai.menu.garage.cars.GarageCars;
import api.interfaces.Activity;
import core.MyLogger;
import core.Timer;
import core.UiObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sav80 on 24.12.2016.
 */
public class Configurtations extends Garage implements Activity{
    public static ConfigurationsUiObjects uiObject = new ConfigurationsUiObjects();

    public Boolean isConfigurationsExist(){
        try{
            MyLogger.log.info("Check existence of the configurations in the garage Configurations");
            return uiObject.noConfigurationsTitle().waitToAppear(5).exists();
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public Configurator tapAddConfiguratonButton(){
        try{
            MyLogger.log.info("Tapping AddConfiguraton button in the garage");
            uiObject.addConfigurationButton().waitToAppear(5).tap();
            return Android.app.hyundai.configurator;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap AddConfiguraton button in the garage, element absent or blocked");
        }
    }

    public Configurator tapNewConfiguratonButton(){
        try{
            MyLogger.log.info("Tapping NewConfiguraton button in the garage");
            uiObject.newConfigurationButton().waitToAppear(5).tap();
            return Android.app.hyundai.configurator;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap NewConfiguraton button in the garage, element absent or blocked");
        }
    }

    public ConfigurationCard getConfigurationCard(Integer i) {
        MyLogger.log.info("Getting configuration card by index = " + i);
        try {
            ConfigurationCard card = new ConfigurationCard(i);
            return card.waitToLoad();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Element allConfigurations for Configuration Card absent or blocked");
        }
    }

    @Override
    public Configurtations waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Garage Configurations activity");
            super.uiObject.navigationBarText().waitToAppear(10);
            if (!super.uiObject.configurationsNavigationButton().isSelected()) throw new AssertionError("Garage Configurations activity failed to load/open");
            return this;
        }catch (AssertionError e){
            throw new AssertionError("Garage Configurations activity failed to load/open");
        }
    }
}
