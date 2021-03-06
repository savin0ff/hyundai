package api.apps.hyundai.menu.garage;

import api.android.Android;
import api.apps.hyundai.sharedblocks.footer_menu.FooterMenu;
import api.apps.hyundai.menu.Menu;
import api.apps.hyundai.menu.garage.cars.activatecar.ActivateCar;
import api.apps.hyundai.menu.garage.cars.addvin.AddCarByVIN;
import api.apps.hyundai.menu.garage.cars.GarageCars;
import api.apps.hyundai.menu.garage.configurations.GarageConfigurtations;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 19.12.2016.
 */
public class Garage extends FooterMenu{
    public static GarageUiObjects uiObject = new GarageUiObjects();

    public Menu tapMenuButton(){
        try{
            MyLogger.log.info("Tapping menu button in the garage");
            uiObject.menuButton().waitToAppear(5).tap();
            return Android.app.hyundai.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap menu button in the garage, element absent or blocked");
        }
    }

    public GarageCars tapCarsNavigationButton(){
        try{
            MyLogger.log.info("Tapping CarsNavigation button in the garage");
            uiObject.carsNavigationButton().waitToAppear(5).tap();
            return new GarageCars();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap CarsNavigation button in the garage, element absent or blocked");
        }
    }

    public GarageConfigurtations tapConfigurationsNavigationButton(){
        try{
            MyLogger.log.info("Tapping ConfigurationsNavigation button in the garage");
            uiObject.configurationsNavigationButton().waitToAppear(5).tap();
            return new GarageConfigurtations();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap ConfigurationsNavigation button in the garage, element absent or blocked");
        }
    }
}
