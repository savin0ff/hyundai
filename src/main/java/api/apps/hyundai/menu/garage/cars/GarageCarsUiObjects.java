package api.apps.hyundai.menu.garage.cars;

import api.android.Android;
import api.apps.hyundai.menu.garage.addcar.ChooseCarListUiObjects;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 24.12.2016.
 */
public class GarageCarsUiObjects extends ChooseCarListUiObjects {
    protected static UiObject
            //No cars uiObjects
            noCarsTitle,
            noCarsSubtitle,
            plusButton,
    //with cars uiObjects
            carModelName,
            enterVinNumberButton,
            activateCarButton,
            carsPagerIndicator,
            menuBurgerButton,
            burgerMenuAddCar,
            burgerMenuEnterVin,
            burgerMenuClearHistory,
            burgerMenuDescriptionOnSite,
            burgerMenuDeleteCar,
            monthText,
            leftCalendarButton,
            rightCalendarButton,
            TechnicalServiceButton,
            tripsHistoryButton;

    //No cars
    public UiObject noCarsTitle() {
        noCarsTitle = new UiSelector().text("Узнайте все о своем Hyundai").makeUiObject();
        return noCarsTitle;
    }

    public UiObject noCarsSubtitle() {
        noCarsSubtitle = new UiSelector().text("Добавте свой Hyundai и получите самую важную информацию о модели.").makeUiObject();
        return noCarsSubtitle;
    }

    public UiObject plusButton() {
        plusButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/my_garage_add_car").makeUiObject();
        return plusButton;
    }

    //with cars
    public UiObject carModelName() {
        carModelName = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/car_model").makeUiObject();
        return carModelName;
    }

    public UiObject enterVinNumberButton() {
        enterVinNumberButton = new UiSelector().text("Указать\n" +
                "VIN-номер").makeUiObject();
        return enterVinNumberButton;
    }

    public UiObject activateCarButton() {
        activateCarButton = new UiSelector().text("Активировать").makeUiObject();
        return activateCarButton;
    }

    public UiObject carsPagerIndicator() {
        carsPagerIndicator = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/cars_pager_indicator").makeUiObject();
        return carsPagerIndicator;
    }
    public UiObject menuBurgerButton() {
        menuBurgerButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/my_garage_dots").makeUiObject();
        return menuBurgerButton;
    }

    public UiObject burgerMenuAddCar() {
        burgerMenuAddCar = new UiSelector().text("Добавить автомобиль").makeUiObject();
        return burgerMenuAddCar;
    }

    public UiObject burgerMenuEnterVin() {
        burgerMenuEnterVin = new UiSelector().text("Указать VIN-номер").makeUiObject();
        return burgerMenuEnterVin;
    }

    public UiObject burgerMenuClearHistory() {
        burgerMenuClearHistory = new UiSelector().text("Очистить историю поездок").makeUiObject();
        return burgerMenuClearHistory;
    }

    public UiObject burgerMenuDescriptionOnSite() {
        burgerMenuDescriptionOnSite = new UiSelector().text("Описание на сайте").makeUiObject();
        return burgerMenuDescriptionOnSite;
    }

    public UiObject burgerMenuDeleteCar() {
        burgerMenuDeleteCar = new UiSelector().text("Удалить автомобиль").makeUiObject();
        return burgerMenuDeleteCar;
    }

    public UiObject monthText() {
        monthText = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/my_garage_calendar_month").makeUiObject();
        return monthText;
    }

    public UiObject leftCalendarButton() {
        leftCalendarButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/my_garage_calendar_arrow_left").makeUiObject();
        return leftCalendarButton;
    }

    public UiObject rightCalendarButton() {
        rightCalendarButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/my_garage_calendar_arrow_right").makeUiObject();
        return rightCalendarButton;
    }

    public UiObject TechnicalServiceButton() {
        TechnicalServiceButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/my_car_order_t_o_layout").makeUiObject();
        return TechnicalServiceButton;
    }

    public UiObject tripsHistoryButton() {
        tripsHistoryButton = new UiSelector().text("История поездок").makeUiObject();
        return tripsHistoryButton;
    }

}
