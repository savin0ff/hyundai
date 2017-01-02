package api.apps.hyundai.menu.garage.configurations.cards;

import api.android.Android;
import core.UiObject;
import core.UiSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by sav80 on 24.12.2016.
 */
public class ConfigurationCardUiObjects {
    ConfigurationCardUiObjects (Integer index){
        this.xPathForAllElements = "//android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout[@index='"+index+"']";
    }

    private String xPathForAllElements;

    private static UiObject
                carModelName,
                carPrice,
                carModificationAndComplectation,
                burgerButtton,
                sendByEmaiMenuButton,
                descriptionOnSiteMenuButton,
                deleteMenuButton;

    public UiObject carModelName() {
        carModelName = new UiSelector().xPath(xPathForAllElements+"//android.widget.TextView[@resource-id='"+
                Android.app.hyundai.packageID()+":id/my_garage_configuration_model']").makeUiObject();
        return carModelName;
    }

    public UiObject carPrice() {
        carPrice = new UiSelector().xPath(xPathForAllElements+"//android.widget.TextView[@resource-id='"+
                Android.app.hyundai.packageID()+":id/my_garage_configuration_car_price']").makeUiObject();
        return carPrice;
    }

    public UiObject carModificationAndComplectation() {
        carModificationAndComplectation = new UiSelector().xPath(xPathForAllElements+"//android.widget.TextView[@resource-id='"+
                Android.app.hyundai.packageID()+":id/my_garage_configuration_description']").makeUiObject();
        return carModificationAndComplectation;
    }

    public UiObject burgerButtton() {
        burgerButtton = new UiSelector().xPath(xPathForAllElements+"//android.widget.ImageView[@resource-id='"+
                Android.app.hyundai.packageID()+":id/my_garage_configuration_dots']").makeUiObject();
        return burgerButtton;
    }

    public UiObject sendByEmaiMenuButton() {
        sendByEmaiMenuButton = new UiSelector().text("Отправить на email").makeUiObject();
        return sendByEmaiMenuButton;
    }

    public UiObject descriptionOnSiteMenuButton() {
        descriptionOnSiteMenuButton = new UiSelector().text("Описание модели на сайте").makeUiObject();
        return descriptionOnSiteMenuButton;
    }

    public UiObject deleteMenuButton() {
        deleteMenuButton = new UiSelector().text("Удалить").makeUiObject();
        return deleteMenuButton;
    }
}
