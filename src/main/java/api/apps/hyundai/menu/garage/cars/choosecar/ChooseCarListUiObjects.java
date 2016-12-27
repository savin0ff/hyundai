package api.apps.hyundai.menu.garage.cars.choosecar;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 24.12.2016.
 */
public class ChooseCarListUiObjects {
    protected static UiObject
            allCars,
            carByName;

    public UiObject allCars() {
        allCars = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/car_model").makeUiObject();
        return allCars;
    }

    public UiObject getCarUiObjectByName(String carName) {
        carByName = new UiSelector().text(carName).makeUiObject();
        return carByName;
    }
}
