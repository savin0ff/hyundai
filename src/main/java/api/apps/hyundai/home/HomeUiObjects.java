package api.apps.hyundai.home;

import api.android.Android;
import core.UiObject;
import core.UiSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static api.android.Android.driver;

public class HomeUiObjects {

    //TODO добавить машину
    private static UiObject
            menuButton,
            showStatButton,
            bonusActivities,
            tipTitle,
            nearestEventTitle,
            navigatorButton,
            calendarButton,
            tipsButton,
            balanceButton,
            toolbarText;
    private static WebElement homeButton;

    public UiObject menuButton(){
        if(menuButton == null) menuButton = new UiSelector().className("android.widget.ImageButton").makeUiObject();
        return menuButton;
    }

    public UiObject showStatButton(){
        if(showStatButton == null) showStatButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/main_show_car_arrow").makeUiObject();
        return showStatButton;
    }

    public UiObject bonusActivities(){
        if(bonusActivities == null) bonusActivities = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/main_actions_view_pager").makeUiObject();
        return bonusActivities;
    }

    public UiObject tip(){
        if(tipTitle == null) tipTitle = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/main_advice_title").makeUiObject();
        return tipTitle;
    }

    public UiObject nearestEventTitle(){
        if(nearestEventTitle == null) nearestEventTitle = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/main_event_name").makeUiObject();
        return nearestEventTitle;
    }

    public UiObject navigatorButton(){
        if(navigatorButton == null) navigatorButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/bottom_navigation_small_item_icon").makeUiObject();
        return navigatorButton;
    }

    public UiObject calendarButton(){
        if(calendarButton == null) calendarButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/bottom_navigation_small_item_icon").makeUiObject();
        return calendarButton;
    }

    public WebElement homeButton(){
        if(homeButton == null) {
            List<WebElement> allButtons = driver.findElementsByAndroidUIAutomator("new UiSelector().resourceId(\""+Android.app.hyundai.packageID()+":id/bottom_navigation_small_item_icon\"");
            homeButton = allButtons.get(2);
        }
        return homeButton;
    }

    public UiObject tipsButton(){
        if(tipsButton == null) tipsButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/shareButton").makeUiObject();
        return tipsButton;
    }

    public UiObject balanceButton(){
        if(balanceButton == null) balanceButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/shareButton").makeUiObject();
        return balanceButton;
    }

    public UiObject ToolbarText(){
        if(toolbarText == null) toolbarText = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/toolbar_text").makeUiObject();
        return toolbarText;
    }
}
