package api.apps.hyundai.menu.garage.cars.addvin;

import api.android.Android;
import api.apps.hyundai.menu.garage.Garage;
import api.apps.hyundai.menu.garage.cars.GarageCars;
import api.apps.hyundai.menu.garage.cars.addvin.aboutvin.AboutVIN;
import api.apps.hyundai.menu.garage.cars.choosecar.ChooseCar;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 19.12.2016.
 */
public class AddCarByVIN extends Garage implements Activity{
    public static AddCarByVINuiObjects uiObject = new AddCarByVINuiObjects();

    public Boolean carImageisDisplaed(){
        try{
            MyLogger.log.info("Check image in Add car by VIN activity");
            return uiObject.carImage().exists();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Check image in Add car by VIN activity, element absent or blocked");
        }
    }

    public AboutVIN tapVinHelpButton(){
        try{
            MyLogger.log.info("Tapping VinHelp button in the garage");
            uiObject.vinHelpButton().waitToAppear(5).tap();
            return new AboutVIN();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap VinHelp button in the garage, element absent or blocked");
        }
    }

    public String getVinInputText(){
        try{
            MyLogger.log.info("Getting VinInput text");
            return uiObject.vinInput().waitToAppear(5).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get VinInput text, element absent or blocked");
        }
    }

    public AddCarByVIN typeVIN(String vin){
        try{
            MyLogger.log.info("Typing VinInput text="+vin);
            uiObject.vinInput().typeText(vin);
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant type VIN="+vin+" element absent or blocked");
        }
    }

    public AddCarByVIN clearVINtext(){
        try{
            MyLogger.log.info("Clearing VinInput");
            uiObject.vinInput().clearText();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Clear VinInput, element absent or blocked");
        }
    }

    public String getSurnameText(){
        try{
            MyLogger.log.info("Getting Surname text");
            return uiObject.surnameInput().waitToAppear(5).getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Surname text, element absent or blocked");
        }
    }

    public AddCarByVIN typeSurname(String surname){
        try{
            MyLogger.log.info("Typing surname text="+surname);
            uiObject.surnameInput().typeText(surname);
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant type surname="+surname+" element absent or blocked");
        }
    }

    public AddCarByVIN clearSurnameText(){
        try{
            MyLogger.log.info("Clearing surname");
            uiObject.surnameInput().clearText();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant Clear surname in add car by VIN screen, element absent or blocked");
        }
    }

    public AddCarByVIN tapVinAndSurnameLaterCheckbox(){
        try{
            MyLogger.log.info("Tapping VinAndSurnameLaterCheckbox ");
            uiObject.vinAndSurnameLaterCheckbox().waitToAppear(5).tap();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap VinAndSurnameLaterCheckbox in add car by VIN screen, element absent or blocked");
        }
    }

    public GarageCars tapAddCarButton(){
        try{
            MyLogger.log.info("Tapping AddCar button ");
            uiObject.addCarButton().waitToAppear(5).tap();
            return new GarageCars();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap AddCar button in add car by VIN screen, element absent or blocked");
        }
    }

    public Boolean isPopupDisplayed(){
        try{
            MyLogger.log.info("Checking popup");
            return uiObject.popupOkButton().exists();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant check popup in add car by VIN screen, element absent or blocked");
        }
    }

    public String getPopupMessage(){
        try{
            MyLogger.log.info("Getting popup message");
            return uiObject.popupMessage().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get popup message in add car by VIN screen, element absent or blocked");
        }
    }

    public AddCarByVIN tapOkPopupButton(){
        try{
            MyLogger.log.info("Tapping OK popup button");
            uiObject.popupOkButton().waitToAppear(5).tap();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap OK popup button in add car by VIN screen, element absent or blocked");
        }
    }

    @Override
    public AddCarByVIN waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Garage Cars activity");
            super.uiObject.navigationBarText().waitToAppear(5);
            uiObject.surnameInput().waitToAppear(5);
            uiObject.vinInput().waitToAppear(5);
            if (!super.uiObject.carsNavigationButton().isSelected()) throw new AssertionError("Garage Cars activity failed to load/open");
            return this;
        }catch (AssertionError e){
            throw new AssertionError("Garage Cars activity failed to load/open");
        }
    }
}
