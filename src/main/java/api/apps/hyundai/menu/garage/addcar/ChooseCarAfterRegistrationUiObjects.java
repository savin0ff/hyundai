package api.apps.hyundai.menu.garage.addcar;

import api.android.Android;
import core.MyLogger;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 19.12.2016.
 */
public class ChooseCarAfterRegistrationUiObjects {
    private static UiObject
            title,
            subtitle,
            allCars,
            carByName;

    public UiObject title() {
        if (title == null) title = new UiSelector().text("Мой hyundai").makeUiObject();
        return title;
    }

    public UiObject subtitle() {
        if (subtitle == null) subtitle = new UiSelector().text("Выберите модель автомобиля").makeUiObject();
        return subtitle;
    }

    public UiObject allCars() {
        if (allCars == null) allCars = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/car_model").makeUiObject();
        return allCars;
    }

    public UiObject getCarUiObjectByName(String carName) {
        carByName = new UiSelector().text(carName).makeUiObject();
        return carByName;
    }
}
