package api.apps.hyundai.home;

import api.android.Android;
import api.apps.hyundai.sharedblocks.footer_menu.FooterMenu;
import api.apps.hyundai.menu.Menu;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 16.12.2016.
 */
public class Home extends FooterMenu implements Activity {

    public HomeUiObjects uiObject = new HomeUiObjects();

    @Override
    public Home waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Home activity");
            if (Android.app.hyundai.popup.uiObject.popupCloseButton().exists()){ //Close popup if it appear
                Android.app.hyundai.popup.tapPopupClose();
            }
            uiObject.toolbarText().waitToAppear(15);
            return Android.app.hyundai.home;
        }catch (AssertionError e){
            throw new AssertionError("Home activity failed to load/open");
        }
    }
}
