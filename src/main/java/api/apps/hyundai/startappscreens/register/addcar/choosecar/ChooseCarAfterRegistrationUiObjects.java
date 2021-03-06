package api.apps.hyundai.startappscreens.register.addcar.choosecar;

import api.apps.hyundai.menu.garage.cars.choosecar.ChooseCarListUiObjects;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 19.12.2016.
 */
public class ChooseCarAfterRegistrationUiObjects extends ChooseCarListUiObjects {
    protected static UiObject
            title,
            subtitle;

    public UiObject title() {
        if (title == null) title = new UiSelector().text("Мой hyundai").makeUiObject();
        return title;
    }

    public UiObject subtitle() {
        if (subtitle == null) subtitle = new UiSelector().text("Выберите модель автомобиля").makeUiObject();
        return subtitle;
    }


}
