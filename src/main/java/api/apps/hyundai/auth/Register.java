package api.apps.hyundai.auth;

import api.android.Android;
import api.apps.hyundai.menu.garage.addcar.AddCarAfterRegistration;
import api.interfaces.Activity;
import core.MyLogger;
import core.UiObject;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 18.12.2016.
 */
public class Register implements Activity {
    public static RegisterUiObjects uiObject = new RegisterUiObjects();

    public UiObject tapName(){
        try{
            MyLogger.log.info("Tapping Name textedit");
            UiObject obj = uiObject.name().waitToAppear(5).tap();
            return obj;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Name textedit, element absent or blocked");
        }
    }

    public UiObject tapEmail(){
        try{
            MyLogger.log.info("Tapping Email textedit");
            UiObject obj = uiObject.email().waitToAppear(5).tap();
            return obj;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Email textedit, element absent or blocked");
        }
    }

    public UiObject tapPassword(){
        try{
            MyLogger.log.info("Tapping Password textedit");
            UiObject obj = uiObject.password().waitToAppear(5).tap();
            return obj;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Password textedit, element absent or blocked");
        }
    }

    public Register tapShowPassword(){
        try{
            MyLogger.log.info("Tapping showPassword ");
            uiObject.showPassword().waitToAppear(5).tap();
            return Android.app.hyundai.register;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap showPassword, element absent or blocked");
        }
    }

    public Register tapAgreeWithConditions(){
        try{
            MyLogger.log.info("Tapping AgreeWithConditions checkbox ");
            uiObject.agreeWithConditions().waitToAppear(5).tap();
            return Android.app.hyundai.register;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap AgreeWithConditions checkbox , element absent or blocked");
        }
    }

    public AddCarAfterRegistration tapRegisterButton(){
        try{
            MyLogger.log.info("Tapping Register Button ");
            uiObject.registerButton().waitToAppear(5).tap();
            return Android.app.hyundai.addCarAfterRegistration;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Register Button, element absent or blocked");
        }
    }

    public Object tapVKButton(){
        try{
            MyLogger.log.info("Tapping VKButton ");
            uiObject.vkButton().waitToAppear(5).tap();
            return Android.app.hyundai.vkWebView;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap VKButton, element absent or blocked");
        }
    }

    public Object tapFBButton(){
        try{
            MyLogger.log.info("Tapping FBButton ");
            uiObject.vkButton().waitToAppear(5).tap();
            return Android.app.hyundai.facebookWebView;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap FBButton, element absent or blocked");
        }
    }

    public Register tapGoToRegisterButton(){
        try{
            MyLogger.log.info("Tapping GoTo Auth Button ");
            uiObject.registerButton().waitToAppear(5).tap();
            return Android.app.hyundai.register;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap GoTo Auth Button, element absent or blocked");
        }
    }

    @Override
    public Register waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Register activity");
            uiObject.title().waitToAppear(5);
            return Android.app.hyundai.register;
        }catch (AssertionError e){
            throw new AssertionError("Register activity failed to load/open");
        }
    }
}
