package api.apps.hyundai.addcar;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 19.12.2016.
 */
public class AddCarAfterRegistrationUiObjects {
    private static UiObject
            title,
            subtitle,
            plusButton,
            addToGarageButton,
            SkipButton;

    public UiObject title() {
        if (title == null) title = new UiSelector().text("Мой hyundai").makeUiObject();
        return title;
    }

    public UiObject subtitle() {
        if (subtitle == null) subtitle = new UiSelector().text("Выберите модель автомобиля").makeUiObject();
        return subtitle;
    }

    public UiObject plusButton() {
        if (plusButton == null) plusButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/btn_choice_car").makeUiObject();
        return plusButton;
    }

    public UiObject addToGarageButton() {
        if (addToGarageButton == null) addToGarageButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/btn_add_car").makeUiObject();
        return addToGarageButton;
    }

    public UiObject SkipButton() {
        if (SkipButton == null) SkipButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+"i:id/add_car_later").makeUiObject();
        return SkipButton;
    }
}
