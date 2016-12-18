package api.apps.hyundai.footer_menu;

import api.android.Android;
import core.MyLogger;
import io.appium.java_client.MobileElement;

import java.util.List;

/**
 * Created by sav80 on 16.12.2016.
 */
public class FooterMenuUiObjects {
    private List<MobileElement> elements;

    private MobileElement
            navigatorButton,
            calendarButton,
            homeButton,
            tipsButton,
            balanceButton;

    public MobileElement navigatorButton(){
        if(navigatorButton == null) {
            getButtons();
        }
        return navigatorButton;
    }

    public MobileElement calendarButton(){
        if(calendarButton == null) {
            getButtons();
        }
        return calendarButton;
    }



    public MobileElement homeButton(){
        if(homeButton == null) {
            getButtons();
        }
        return homeButton;
    }

    public MobileElement tipsButton(){
        if(tipsButton == null) {
            getButtons();
        }
        return tipsButton;
    }

    public MobileElement balanceButton(){
        if(balanceButton == null) {
            getButtons();
        }
        return balanceButton;
    }

    private void getButtons() {
        if (elements == null) {

            elements = Android.driver.findElementsByXPath("//android.widget.ImageView[@resource-id='com.mediapark.hyundai:id/bottom_navigation_small_item_icon']");
            MyLogger.log.debug("=========FooterMenu Elements size="+ elements.size());
            navigatorButton = elements.get(0);
            calendarButton = elements.get(1);
            homeButton = elements.get(2);
            tipsButton = elements.get(3);
            balanceButton = elements.get(4);

        }
    }
}
