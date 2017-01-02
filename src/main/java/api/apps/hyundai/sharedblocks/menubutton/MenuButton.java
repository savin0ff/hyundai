package api.apps.hyundai.sharedblocks.menubutton;

import api.android.Android;
import api.apps.hyundai.home.Home;
import api.apps.hyundai.menu.Menu;
import api.apps.hyundai.menu.MenuUiObjects;
import api.apps.hyundai.sharedblocks.footer_menu.FooterMenu;
import api.interfaces.Activity;
import core.MyLogger;
import core.UiObject;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 27.12.2016.
 */
public class MenuButton {

    public MenuButtonUiObject uiObject = new MenuButtonUiObject();

    public Menu tapMenu(){
        try{
            MyLogger.log.info("Tapping Menu button");
            uiObject.menuButton().waitToAppear(10).tap();
            return Android.app.hyundai.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Menu button, element absent or blocked");
        }
    }

}
