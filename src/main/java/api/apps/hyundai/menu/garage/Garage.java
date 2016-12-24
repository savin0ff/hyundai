package api.apps.hyundai.menu.garage;

import api.android.Android;
import api.apps.hyundai.home.Home;
import api.interfaces.Activity;
import core.MyLogger;

/**
 * Created by sav80 on 19.12.2016.
 */
public class Garage implements Activity {
    public static GarageUiObjects uiObject = new GarageUiObjects();

    @Override
    public Garage waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Garage activity");
            uiObject.navigationBarText().waitToAppear(10);
            return Android.app.hyundai.garage;
        }catch (AssertionError e){
            throw new AssertionError("Garage activity failed to load/open");
        }
    }
}
