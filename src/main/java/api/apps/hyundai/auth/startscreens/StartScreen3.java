package api.apps.hyundai.auth.startscreens;

import api.android.Android;
import core.MyLogger;

/**
 * Created by sav80 on 18.12.2016.
 */
public class StartScreen3  extends StartScreen1 {
    public StartScreen3() {
        super.uiObject = new StartScreen3UiObjects();
    }

    @Override
    public StartScreen1 swipeRight(){
        try{
            MyLogger.log.info("Swipping right");
            Android.driver.swipe(1000,640, 200, 640, 100);
            return Android.app.hyundai.startscreen4;
        }catch (Exception e){
            throw new AssertionError("Can't swipe");
        }
    }
}
