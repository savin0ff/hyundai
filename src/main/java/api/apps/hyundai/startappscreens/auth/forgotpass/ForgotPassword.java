package api.apps.hyundai.startappscreens.auth.forgotpass;

import api.android.Android;
import api.apps.hyundai.startappscreens.auth.Auth;
import api.interfaces.Activity;
import core.MyLogger;
import core.UiObject;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 18.12.2016.
 */
public class ForgotPassword implements Activity {
    public ForgotPasswordUiObjects uiObject = new ForgotPasswordUiObjects();

    public UiObject tapEmail(){
        try{
            MyLogger.log.info("Tapping Email");
            UiObject obj = uiObject.email().waitToAppear(10).tap();
            return obj;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Email textedit, element absent or blocked");
        }
    }

    public Auth tapBackToAuthButton(){
        try{
            MyLogger.log.info("Tapping BackToAuth Button");
            uiObject.backToAuthButton().waitToAppear(10).tap();
            return Android.app.hyundai.auth;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap BackToAuth Button, element absent or blocked");
        }
    }

    public Auth tapSendPasswordButton(){
        try{
            MyLogger.log.info("Tapping SendPassword Button");
            uiObject.sendPasswordButton().waitToAppear(10).tap();
            return Android.app.hyundai.auth;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap SendPassword Button, element absent or blocked");
        }
    }

    public String getAlertText(){
        try{
            MyLogger.log.info("Getting AlertText");
            String s = uiObject.alertText().waitToAppear(10).getText();
            return s;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant get AlertText, element absent or blocked");
        }
    }

    public Auth tapAlertCloseButton(){
        try{
            MyLogger.log.info("Tapping AlertClose Button");
            uiObject.alertCloseButton().waitToAppear(10).tap();
            return Android.app.hyundai.auth;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap AlertClose Button, element absent or blocked");
        }
    }


    @Override
    public ForgotPassword waitToLoad() {
        try{
            MyLogger.log.info("ForgotPassword for Home activity");
            uiObject.title().waitToAppear(10);
            return Android.app.hyundai.forgotpassword;
        }catch (AssertionError e){
            throw new AssertionError("ForgotPassword activity failed to load/open");
        }
    }

}
