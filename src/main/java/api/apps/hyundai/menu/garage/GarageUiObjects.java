package api.apps.hyundai.menu.garage;

import api.android.Android;
import api.apps.hyundai.footer_menu.FooterMenu;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 19.12.2016.
 */
public class GarageUiObjects {
    private static UiObject
            menuButton,
            navigationBarText,
            carsNavigationButton,
            configurationsNavigationButton,
    //No cars uiObjects
            noCarsTitle,
            noCarsSubtitle,
            plusButton,

    //No configurations uiObjects
            noConfigurationsTitle,
            noConfigurationsSubtitle,
            addConfigurationButton,
    //with cars uiObjects
            carModelName,
            giveVinNumberButton,
            activateCarButton,
            carsPagerIndicator,
            menuBurgerButton,
            burgerMenuAddCar,
            burgerMenuClearHistory,
            burgerMenuDescriptionOnSite,
            burgerMenuDeleteCar,
            monthText,
            leftCalendarButton,
            rightCalendarButton,
            TechnicalServiceButton,
            tripsHistoryButton;

    public FooterMenu footerMenu = new FooterMenu();

    public UiObject menuButton() {
        if (menuButton == null) menuButton = new UiSelector().description("Navigate up").makeUiObject();
        return menuButton;
    }

    public UiObject navigationBarText() {
        if (navigationBarText == null) navigationBarText = new UiSelector().text("Мой гараж").makeUiObject();
        return navigationBarText;
    }

    public UiObject carsNavigationButton() {
        if (carsNavigationButton == null) carsNavigationButton = new UiSelector().text("Автомобили").makeUiObject();
        return carsNavigationButton;
    }

    public UiObject configurationsNavigationButton() {
        if (configurationsNavigationButton == null) configurationsNavigationButton = new UiSelector().text("Конфигурации").makeUiObject();
        return configurationsNavigationButton;
    }

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

//No configurations
    public UiObject noConfigurationsTitle() {
        noConfigurationsTitle = new UiSelector().text("Нет конфигураций").makeUiObject();
        return noConfigurationsTitle;
    }

    public UiObject noConfigurationsSubtitle() {
        noConfigurationsSubtitle = new UiSelector().text("Создайте конфигурацию и сохраните ее, чтобы сравнить несколько моделей.").makeUiObject();
        return noConfigurationsSubtitle;
    }

    public UiObject addConfigurationButton() {
        if (addConfigurationButton == null) addConfigurationButton = new UiSelector().text("Выбрать модель").makeUiObject();
        return addConfigurationButton;
    }

    //with cars uiObjects
    public UiObject carModelName() {
        if (carModelName == null) carModelName = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/car_model").makeUiObject();
        return carModelName;
    }

    public UiObject giveVinNumberButton() {
        if (giveVinNumberButton == null) giveVinNumberButton = new UiSelector().text("Указать\n" +
                "VIN-номер").makeUiObject();
        return giveVinNumberButton;
    }

    public UiObject activateCarButton() {
        if (activateCarButton == null) activateCarButton = new UiSelector().text("Активировать").makeUiObject();
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

