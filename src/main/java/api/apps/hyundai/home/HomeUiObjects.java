package api.apps.hyundai.home;

import api.android.Android;
import api.apps.hyundai.footer_menu.FooterMenu;
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
            toolbarText;

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



    public UiObject toolbarText(){
        if(toolbarText == null) toolbarText = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/toolbar_text").makeUiObject();
        return toolbarText;
    }
}
