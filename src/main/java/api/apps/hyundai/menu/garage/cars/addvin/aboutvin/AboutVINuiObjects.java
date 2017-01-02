package api.apps.hyundai.menu.garage.cars.addvin.aboutvin;

import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 27.12.2016.
 */
public class AboutVINuiObjects {
    private static UiObject
                closeButton,
                title,
                text;

    public UiObject closeButton() {
        closeButton = new UiSelector().resourceId(":id/close").makeUiObject();
        return closeButton;
    }

    public UiObject title() {
        title = new UiSelector().text("VIN номер").makeUiObject();
        return title;
    }

    public UiObject text() {
        text = new UiSelector().text("VIN или идентификационный номер автомобиля указан в свидетельстве о регистрации вашего автомобиля. Он состоит из 17 символов.\n" +
                "\n" +
                "Программа распространяется на автомобили марки Hyundai, реализованные через официальные дилерские центры Hyundai в Российской Федерации; а/м Starex, выпущенные в первичное обращение на любом другом рынке.\n" +
                "Не участвуют в программе автомобили:\n" +
                "\n" +
                "производства ООО «ТаГАЗ»\n" +
                "выпущенные в первичное обращение на любом другом рынке, включая автомобили с внутреннего рынка Республики Корея (кроме а/м Starex).").makeUiObject();
        return text;
    }
}
