package api.apps.hyundai.auth;

import api.android.Android;
import api.apps.hyundai.home.Home;
import api.interfaces.Activity;
import core.MyLogger;
import core.UiObject;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 18.12.2016.
 */
public class Auth implements Activity{
    public AuthUiObjects uiObject = new AuthUiObjects();

        public UiObject tapEmail(){
        try{
            MyLogger.log.info("Tapping Email");
            UiObject obj = uiObject.email().waitToAppear(10).tap();
            return obj;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Email textedit, element absent or blocked");
        }
    }

    public UiObject tapPassword(){
        try{
            MyLogger.log.info("Tapping Password textedit");
            UiObject obj = uiObject.password().waitToAppear(10).tap();
            return obj;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Password textedit, element absent or blocked");
        }
    }

    public Auth tapShowPassword(){
        try{
            MyLogger.log.info("Tapping showPassword ");
            uiObject.showPassword().waitToAppear(10).tap();
            return Android.app.hyundai.auth;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap showPassword, element absent or blocked");
        }
    }

    public ForgotPassword tapForgotPassword(){
        try{
            MyLogger.log.info("Tapping forgotPassword ");
            uiObject.forgotPassword().waitToAppear(10).tap();
            return Android.app.hyundai.forgotpassword;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap forgotPassword, element absent or blocked");
        }
    }

    public Home tapEnterButton(){
        try{
            MyLogger.log.info("Tapping EnterButton ");
            uiObject.enterButton().waitToAppear(10).tap();
            return Android.app.hyundai.home;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap EnterButton, element absent or blocked");
        }
    }

    public Object tapVKButton(){
        try{
            MyLogger.log.info("Tapping VKButton ");
            uiObject.vkButton().waitToAppear(10).tap();
            return Android.app.hyundai.vkWebView;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap VKButton, element absent or blocked");
        }
    }

    public Object tapFBButton(){
        try{
            MyLogger.log.info("Tapping FBButton ");
            uiObject.vkButton().waitToAppear(10).tap();
            return Android.app.hyundai.facebookWebView;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap FBButton, element absent or blocked");
        }
    }

    public Register tapGoToRegisterButton(){
        try{
            MyLogger.log.info("Tapping GoToRegisterButton ");
            uiObject.registerButton().waitToAppear(10).tap();
            return Android.app.hyundai.register;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap GoToRegisterButton, element absent or blocked");
        }
    }

    @Override
    public Auth waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Auth activity");
            uiObject.title().waitToAppear(10);
            return Android.app.hyundai.auth;
        }catch (AssertionError e){
            throw new AssertionError("Auth activity failed to load/open");
        }
    }

}
