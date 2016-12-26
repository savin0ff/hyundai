package api.apps.hyundai.menu.garage.configurations;

import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 24.12.2016.
 */
public class ConfigurationsUiObjects {
    private static UiObject
            //No configurations uiObjects
            noConfigurationsTitle,
            noConfigurationsSubtitle,
            addConfigurationButton,
            newConfigurationButton,
            //With car configurations uiObjects TODO доделать
            allConfigurations;



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
        addConfigurationButton = new UiSelector().text("Выбрать модель").makeUiObject();
        return addConfigurationButton;
    }

    public UiObject newConfigurationButton() {
        newConfigurationButton = new UiSelector().text("Новая конфигурация").makeUiObject();
        return newConfigurationButton;
    }

}
