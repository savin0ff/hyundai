package api.apps.hyundai.menu.garage;

import api.apps.hyundai.sharedblocks.footer_menu.FooterMenu;
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
            configurationsNavigationButton;

    public FooterMenu footerMenu = new FooterMenu();

    public UiObject menuButton() {
        menuButton = new UiSelector().description("Navigate up").makeUiObject();
        return menuButton;
    }

    public UiObject navigationBarText() {
        navigationBarText = new UiSelector().text("Мой гараж").makeUiObject();
        return navigationBarText;
    }

    public UiObject carsNavigationButton() {
        carsNavigationButton = new UiSelector().text("Автомобили").makeUiObject();
        return carsNavigationButton;
    }

    public UiObject configurationsNavigationButton() {
        configurationsNavigationButton = new UiSelector().text("Конфигурации").makeUiObject();
        return configurationsNavigationButton;
    }







}

