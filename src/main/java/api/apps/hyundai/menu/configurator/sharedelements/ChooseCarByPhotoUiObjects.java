package api.apps.hyundai.menu.configurator.sharedelements;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 27.12.2016.
 */
public class ChooseCarByPhotoUiObjects {
    ChooseCarByPhotoUiObjects(Integer index){
        this.xPathForAllElements = "//android.support.v7.widget.RecyclerView[@index='0']/android.widget.FrameLayout[@index='"+index+"']";
    }

    private String xPathForAllElements;
    private static UiObject
            carImage,
            carModelName,
            carPrice;

    public UiObject carImage() {
        carImage = new UiSelector().xPath(xPathForAllElements+"//android.widget.ImageView[@resource-id='"+
                Android.app.hyundai.packageID()+":id/test_drive_card_image_view']").makeUiObject();
        return carImage;
    }

    public UiObject carModelName() {
        carModelName = new UiSelector().xPath(xPathForAllElements+"//android.widget.TextView[@resource-id='"+
                Android.app.hyundai.packageID()+":id/test_drive_card_name']").makeUiObject();
        return carModelName;
    }

    public UiObject carPrice() {
        carPrice = new UiSelector().xPath(xPathForAllElements+"//android.widget.TextView[@resource-id='"+
                Android.app.hyundai.packageID()+":id/test_drive_card_price']").makeUiObject();
        return carPrice;
    }
}
