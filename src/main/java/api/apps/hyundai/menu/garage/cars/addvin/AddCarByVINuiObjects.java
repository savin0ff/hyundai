package api.apps.hyundai.menu.garage.cars.addvin;

import api.android.Android;
import api.apps.hyundai.menu.garage.Garage;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 27.12.2016.
 */
public class AddCarByVINuiObjects {
    protected static UiObject
                carImage,
                vinHelpButton,
                vinInput,
                surnameInput,
                vinAndSurnameLaterCheckbox,
                addCarButton,
                popupMessage,
                popupOkButton;

    public UiObject carImage() {
        carImage = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/image_car_model").makeUiObject();
        return carImage;
    }

    public UiObject vinHelpButton() {
        vinHelpButton = new UiSelector().text("VIN-НОМЕР").makeUiObject();
        return vinHelpButton;
    }

    public UiObject vinInput() {
        vinInput = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/my_garage_add_car_input_vin_number").makeUiObject();
        return vinInput;
    }

    public UiObject surnameInput() {
        surnameInput = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/my_garage_add_car_input_surname").makeUiObject();
        return surnameInput;
    }

    public UiObject vinAndSurnameLaterCheckbox() {
        vinAndSurnameLaterCheckbox = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/checkbox_container").makeUiObject();
        return vinAndSurnameLaterCheckbox;
    }

    public UiObject addCarButton() {
        addCarButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/btn_add_car").makeUiObject();
        return addCarButton;
    }

    public UiObject popupMessage() {
        popupMessage = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/message").makeUiObject();
        return popupMessage;
    }

    public UiObject popupOkButton() {
        popupOkButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/button1").makeUiObject();
        return popupOkButton;
    }
}
