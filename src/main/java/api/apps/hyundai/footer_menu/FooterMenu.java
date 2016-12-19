package api.apps.hyundai.footer_menu;

import api.android.Android;
import api.apps.hyundai.advices.Advices;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

public class FooterMenu {

    public FooterMenuUiObjects menuObject = new FooterMenuUiObjects();

    public api.apps.hyundai.navigator.Navigator tapNavigatorButton(){
        try{
            MyLogger.log.info("Tapping Navigator button");
            menuObject.navigatorButton().click();
            return Android.app.hyundai.navigator;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Navigator button, element absent or blocked");
        }
    }

    public api.apps.hyundai.calendar.Calendar tapCalendarButton(){
        try{
            MyLogger.log.info("Tapping Calendar button");
            menuObject.calendarButton().click();
            return Android.app.hyundai.calendar;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Calendar button, element absent or blocked");
        }
    }

    public api.apps.hyundai.home.Home tapHomeButton(){
        try{
            MyLogger.log.info("Tapping Home");
            menuObject.homeButton().click();
            return Android.app.hyundai.home;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Home button, element absent or blocked");
        }
    }

    public Advices tapTipsButton(){
        try{
            MyLogger.log.info("Tapping Advices");
            menuObject.tipsButton().click();
            return Android.app.hyundai.advices;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Advices button, element absent or blocked");
        }
    }

    public api.apps.hyundai.balance.Balance tapBalanceButton(){
        try{
            MyLogger.log.info("Tapping Balance");
            menuObject.balanceButton().click();
            return Android.app.hyundai.balance;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Balance button, element absent or blocked");
        }
    }
}
