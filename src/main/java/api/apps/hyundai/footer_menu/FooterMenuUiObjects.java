package api.apps.hyundai.footer_menu;

import api.android.Android;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sav80 on 16.12.2016.
 */
public class FooterMenuUiObjects {
    private List<WebElement> elements;

    private static WebElement
            navigatorButton,
            calendarButton,
            homeButton,
            tipsButton,
            balanceButton;

    public WebElement navigatorButton(){
        if(navigatorButton == null) {
            getButtons();
        }
        return navigatorButton;
    }

    public WebElement calendarButton(){
        if(calendarButton == null) {
            getButtons();
        }
        return calendarButton;
    }



    public WebElement homeButton(){
        if(homeButton == null) {
            getButtons();
        }
        return homeButton;
    }

    public WebElement tipsButton(){
        if(tipsButton == null) {
            getButtons();
        }
        return tipsButton;
    }

    public WebElement balanceButton(){
        if(balanceButton == null) {
            getButtons();
        }
        return balanceButton;
    }

    private void getButtons() {
        if (elements == null) {

            elements = Android.driver.findElementsByXPath("//android.widget.ImageView[@resource-id='com.mediapark.hyundai:id/bottom_navigation_small_item_icon']");
            navigatorButton = elements.get(0);
            calendarButton = elements.get(1);
            homeButton = elements.get(2);
            tipsButton = elements.get(3);
            balanceButton = elements.get(4);
        }
    }
}
