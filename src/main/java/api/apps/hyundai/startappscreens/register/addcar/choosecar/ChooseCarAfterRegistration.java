package api.apps.hyundai.startappscreens.register.addcar.choosecar;

import api.android.Android;
import api.apps.hyundai.menu.garage.cars.choosecar.ChooseCar;
import api.interfaces.Activity;
import core.MyLogger;

/**
 * Created by sav80 on 19.12.2016.
 */
public class ChooseCarAfterRegistration implements Activity {

    public static ChooseCarAfterRegistrationUiObjects uiObject = new ChooseCarAfterRegistrationUiObjects();
    public static ChooseCar chooseCar = new ChooseCar();

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
