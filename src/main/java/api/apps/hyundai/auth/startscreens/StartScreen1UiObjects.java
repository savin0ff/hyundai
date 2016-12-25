package api.apps.hyundai.auth.startscreens;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 18.12.2016.
 */
public class StartScreen1UiObjects {

     UiObject
            mirHyundaiText,
            TitleText,
            descriptionText,
            skipButton,
            indicator,
            closeButton;
    String
            mirHyundaiTextLocator = "Мир Хёндэ",
            TitleTextLocator = "Быстрая запись на ТО к любому дилеру",
            descriptionTextLocator = "Записывайтесь на техобслуживание в удобное для вас время.",
            skipButtonLocator = "Пропустить",
            indicatorLocator = ":id/viewpager_indicator",
            closeButtonLocator = ":id/btn_close";

    public UiObject mirHyundaiText(){
        if(mirHyundaiText == null) mirHyundaiText = new UiSelector().text(mirHyundaiTextLocator).makeUiObject();
        return mirHyundaiText;
    }

    public UiObject TitleText(){
        if(TitleText == null) TitleText = new UiSelector().text(TitleTextLocator).makeUiObject();
        return TitleText;
    }

    public UiObject descriptionText(){
        if(descriptionText == null) descriptionText = new UiSelector().text(descriptionTextLocator).makeUiObject();
        return descriptionText;
    }

    public UiObject skipButton(){
        if(skipButton == null) skipButton = new UiSelector().text(skipButtonLocator).makeUiObject();
        return skipButton;
    }

    public UiObject indicator(){
        if(indicator == null) indicator = new UiSelector().resourceId(Android.app.hyundai.packageID()+indicatorLocator).makeUiObject();
        return indicator;
    }

    public UiObject closeButton(){
        if(closeButton == null) closeButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+closeButtonLocator).makeUiObject();
        return closeButton;
    }
}
