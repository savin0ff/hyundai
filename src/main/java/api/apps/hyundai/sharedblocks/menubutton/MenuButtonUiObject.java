package api.apps.hyundai.sharedblocks.menubutton;

import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 27.12.2016.
 */
public class MenuButtonUiObject {
    private static UiObject
            menuButton;

    public UiObject menuButton(){
        menuButton = new UiSelector().className("android.widget.ImageButton").makeUiObject();
        return menuButton;
    }
}
