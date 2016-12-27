package api.apps.hyundai.popups;

import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 27.12.2016.
 */
public class PopupsUiObjects {
    private static UiObject
                popupText,
                popupCloseButton;

    public UiObject popupText() {
        popupText = new UiSelector().resourceId(":id/dialog_alert_text").makeUiObject();
        return popupText;
    }

    public UiObject popupCloseButton() {
        popupCloseButton = new UiSelector().text("Закрыть").makeUiObject();
        return popupCloseButton;
    }
}
