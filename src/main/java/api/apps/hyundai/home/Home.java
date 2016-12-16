package api.apps.hyundai.home;

import api.android.Android;
import api.apps.hyundai.footer_menu.FooterMenu;
import api.apps.hyundai.home.*;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 16.12.2016.
 */
public class Home implements Activity {
    public api.apps.hyundai.home.HomeUiObjects uiObject = new api.apps.hyundai.home.HomeUiObjects();

    public FooterMenu footerMenu = new FooterMenu();

/*    public String getPingSpeed(){
        try{
            MyLogger.log.info("Getting Ping Speed");
            return uiObject.pingSpeed().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get Ping Speed, element absent or blocked");
        }
    }*/

    public api.apps.hyundai.menu.Menu tapMenu(){
        try{
            MyLogger.log.info("Tapping Menu");
            uiObject.menuButton().waitToAppear(10).tap();
            return Android.app.hyundai.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Menu button, element absent or blocked");
        }
    }

    @Override
    public api.apps.hyundai.home.Home waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Home activity");
            uiObject.ToolbarText().waitToAppear(10);
            return Android.app.hyundai.home;
        }catch (AssertionError e){
            throw new AssertionError("Home activity failed to load/open");
        }
    }
}
