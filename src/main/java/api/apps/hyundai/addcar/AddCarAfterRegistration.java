package api.apps.hyundai.addcar;

import api.android.Android;
import api.apps.hyundai.auth.Auth;
import api.apps.hyundai.home.Home;
import api.apps.hyundai.menu.garage.addcar.ChooseCar;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 19.12.2016.
 */
public class AddCarAfterRegistration implements Activity {
    public static AddCarAfterRegistrationUiObjects uiObject = new AddCarAfterRegistrationUiObjects();

    public ChooseCar tapPlusButton(){
        try{
            MyLogger.log.info("Tapping Plus Button ");
            uiObject.plusButton().waitToAppear(5).tap();
            return Android.app.hyundai.chooseCar;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Plus Button, element absent or blocked");
        }
    }

    public ChooseCar tapAddToGarageButton(){
        try{
            MyLogger.log.info("Tapping AddToGarage Button ");
            uiObject.addToGarageButton().waitToAppear(5).tap();
            return Android.app.hyundai.chooseCar;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap AddToGarage Button, element absent or blocked");
        }
    }

    public Home tapSkipButton(){
        try{
            MyLogger.log.info("Tapping Skip Button ");
            uiObject.SkipButton().waitToAppear(5).tap();
            return Android.app.hyundai.home;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Skip Button, element absent or blocked");
        }
    }

    @Override
    public AddCarAfterRegistration waitToLoad() {
        try{
            MyLogger.log.info("Waiting for AddCarAfterRegistration activity");
            uiObject.title().waitToAppear(5);
            uiObject.subtitle().waitToAppear(5);
            return Android.app.hyundai.addCarAfterRegistration;
        }catch (AssertionError e){
            throw new AssertionError("AddCarAfterRegistration activity failed to load/open");
        }
    }
}
