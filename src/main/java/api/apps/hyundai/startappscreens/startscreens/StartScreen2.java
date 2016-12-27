package api.apps.hyundai.startappscreens.startscreens;

import api.android.Android;
import core.MyLogger;

/**
 * Created by sav80 on 18.12.2016.
 */
public class StartScreen2 extends StartScreen1 {
    public StartScreen2() {
        super.uiObject = new StartScreen2UiObjects();
    }

    @Override
    public StartScreen1 swipeRight(){
        try{
            MyLogger.log.info("Swipping right");
            Android.driver.swipe(1000,640, 200, 640, 100);
            return Android.app.hyundai.startscreen3;
        }catch (Exception e){
            throw new AssertionError("Can't swipe");
        }
    }
}
