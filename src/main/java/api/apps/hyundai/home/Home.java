package api.apps.hyundai.home;

import api.android.Android;
import api.apps.hyundai.footer_menu.FooterMenu;
import api.apps.hyundai.menu.Menu;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 16.12.2016.
 */
public class Home implements Activity {

    public HomeUiObjects uiObject = new HomeUiObjects();
    public FooterMenu footerMenu = new FooterMenu();

    public Menu tapMenu(){
        try{
            MyLogger.log.info("Tapping Menu");
            uiObject.menuButton().waitToAppear(10).tap();
            return Android.app.hyundai.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Menu button, element absent or blocked");
        }
    }

    @Override
    public Home waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Home activity");
            uiObject.toolbarText().waitToAppear(10);
            return Android.app.hyundai.home;
        }catch (AssertionError e){
            throw new AssertionError("Home activity failed to load/open");
        }
    }
}
