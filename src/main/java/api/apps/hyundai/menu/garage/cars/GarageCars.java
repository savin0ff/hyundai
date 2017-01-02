package api.apps.hyundai.menu.garage.cars;

import api.android.Android;
import api.apps.hyundai.menu.garage.Garage;
import api.apps.hyundai.menu.garage.cars.activatecar.ActivateCar;
import api.apps.hyundai.menu.garage.cars.addvin.AddCarByVIN;
import api.apps.hyundai.menu.garage.cars.choosecar.ChooseCar;
import api.apps.hyundai.menu.technicalservice.TechnicalService;
import api.apps.hyundai.navigator.history.NavigatorHistory;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 24.12.2016.
 */
public class GarageCars extends Garage implements Activity {
    public static GarageCarsUiObjects uiObject = new GarageCarsUiObjects();
    public static ChooseCar chooseCar = new ChooseCar();

    public ChooseCar tapPlusButton(){
        try{
            MyLogger.log.info("Tapping plus button in the garage");
            uiObject.plusButton().waitToAppear(5).tap();
            return chooseCar.waitToLoad();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap plus button in the garage, element absent or blocked");
        }
    }

    public GarageCars getCarModelName(){
        try{
            MyLogger.log.info("Getting car model name in the garage");
            uiObject.carModelName().waitToAppear(5).getText();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get car model name in the garage, element absent or blocked");
        }
    }

    public AddCarByVIN tapEnterVinNumberButton(){
        try{
            MyLogger.log.info("Tapping EnterVinNumber button in the garage");
            uiObject.enterVinNumberButton().waitToAppear(5).tap();
            return new AddCarByVIN();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap EnterVinNumber button in the garage, element absent or blocked");
        }
    }

    public ActivateCar tapActivateButton(){
        try{
            MyLogger.log.info("Tapping Activate button in the garage");
            uiObject.activateCarButton().waitToAppear(5).tap();
            return new ActivateCar();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Activate button in the garage, element absent or blocked");
        }
    }

    public ActivateCar tapMenuBurgerButton(){
        try{
            MyLogger.log.info("Tapping MenuBurger button in the garage");
            uiObject.menuBurgerButton().waitToAppear(5).tap();
            return new ActivateCar();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap MenuBurger button in the garage, element absent or blocked");
        }
    }

    public ChooseCar tapAddCarInBurgerMenu(){
        try{
            MyLogger.log.info("Tapping AddCarInBurgerMenu button in the garage");
            uiObject.burgerMenuAddCar().waitToAppear(5).tap();
            return chooseCar.waitToLoad();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap AddCarInBurgerMenu button in the garage, element absent or blocked");
        }
    }

    public AddCarByVIN tapEnterVinInBurgerMenu(){
        try{
            MyLogger.log.info("Tapping EnterVinInBurgerMenu button in the garage");
            uiObject.burgerMenuEnterVin().waitToAppear(5).tap();
            return new AddCarByVIN();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap EnterVinInBurgerMenu button in the garage, element absent or blocked");
        }
    }

    public GarageCars tapClearHistoryInBurgerMenu(){
        try{
            MyLogger.log.info("Tapping ClearHistoryInBurgerMenu button in the garage");
            uiObject.burgerMenuClearHistory().waitToAppear(5).tap();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap ClearHistoryInBurgerMenu button in the garage, element absent or blocked");
        }
    }

/*    public Garage tapDescriptionOnSiteInBurgerMenu(){
        try{
            MyLogger.log.info("Tapping DescriptionOnSite button in the garage");
            uiObject.burgerMenuDescriptionOnSite().waitToAppear(5).tap();
            return Android.app.hyundai.garage;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap DescriptionOnSite button in the garage, element absent or blocked");
        }
    }*/


    public GarageCars tapDeleteCarInBurgerMenu(){
        try{
            MyLogger.log.info("Tapping DeleteCarInBurgerMenu button in the garage");
            uiObject.burgerMenuDeleteCar().waitToAppear(5).tap();
            return new GarageCars();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap DeleteCarInBurgerMenu button in the garage, element absent or blocked");
        }
    }

    public GarageCars tapLeftCalendarButton(){
        try{
            MyLogger.log.info("Tapping LeftCalendar button in the garage");
            uiObject.leftCalendarButton().waitToAppear(5).tap();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap LeftCalendar button in the garage, element absent or blocked");
        }
    }

    public GarageCars tapRightCalendarButton(){
        try{
            MyLogger.log.info("Tapping RightCalendar button in the garage");
            uiObject.rightCalendarButton().waitToAppear(5).tap();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap RightCalendar button in the garage, element absent or blocked");
        }
    }

    //TODO можно сделать переход в зависимости от типа машины
    public TechnicalService tapTechnicalServiceButton(){
        try{
            MyLogger.log.info("Tapping TechnicalService button in the garage");
            uiObject.TechnicalServiceButton().waitToAppear(5).tap();
            return Android.app.hyundai.technicalService;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap TechnicalService button in the garage, element absent or blocked");
        }
    }

    public NavigatorHistory tapTripHistoryButton(){
        try{
            MyLogger.log.info("Tapping TripHistory button in the garage");
            uiObject.TechnicalServiceButton().waitToAppear(5).tap();
            return new NavigatorHistory();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap TripHistory button in the garage, element absent or blocked");
        }
    }

    @Override
    public GarageCars waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Garage Cars activity");
            super.uiObject.navigationBarText().waitToAppear(5);
            if (!super.uiObject.carsNavigationButton().isSelected()) throw new AssertionError("Garage Cars activity failed to load/open");
            return this;
        }catch (AssertionError e){
            throw new AssertionError("Garage Cars activity failed to load/open");
        }
    }
}
