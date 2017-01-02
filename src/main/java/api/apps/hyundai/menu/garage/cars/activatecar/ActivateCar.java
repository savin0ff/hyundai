package api.apps.hyundai.menu.garage.cars.activatecar;

import api.android.Android;
import api.apps.hyundai.home.Home;
import api.apps.hyundai.menu.Menu;
import api.apps.hyundai.menu.garage.cars.GarageCars;
import api.apps.hyundai.menu.garage.cars.activatecar.terms.Terms;
import api.apps.hyundai.sharedblocks.menubutton.MenuButton;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 24.12.2016.
 */
public class ActivateCar extends MenuButton implements Activity {
    public static ActivateCarUiObjects uiObject = new ActivateCarUiObjects();

    public GarageCars tapBackButton(){
        try{
            MyLogger.log.info("Tapping back button in the ActivateCar");
            uiObject.backButton().waitToAppear(5).tap();
            return new GarageCars();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap back button in the ActivateCar, element absent or blocked");
        }
    }

        //TODO сделать нативные добавления фото для андройда 4,5,6
    public void tapSide1PhotoButton(){
        try{
            MyLogger.log.info("Tapping side1Photo button in the ActivateCar");
            uiObject.side1PhotoButton().waitToAppear(5).tap();
            //return new GarageCars();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap side1PhotoButton button in the ActivateCar, element absent or blocked");
        }
    }

    public ActivateCar tapDeletePhoto1Button(){
        try{
            MyLogger.log.info("Tapping Delete Photo1 button in the ActivateCar");
            uiObject.side1PhotoButton().waitToAppear(5).tap();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Delete Photo1 button in the ActivateCar, element absent or blocked");
        }
    }

    public Boolean isDisplayedDeletePhoto1Button(){
        try{
            MyLogger.log.info("Checking visibility Delete Photo1 button in the ActivateCar");
            uiObject.deletePhoto1Button().waitToAppear(5).tap();
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public void tapSide2PhotoButton(){
        try{
            MyLogger.log.info("Tapping side2Photo button in the ActivateCar");
            uiObject.side2PhotoButton().waitToAppear(5).tap();
            //return new GarageCars();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap side2PhotoButton button in the ActivateCar, element absent or blocked");
        }
    }

    public ActivateCar tapDeletePhoto2Button(){
        try{
            MyLogger.log.info("Tapping Delete Photo2 button in the ActivateCar");
            uiObject.side2PhotoButton().waitToAppear(5).tap();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Delete Photo2 button in the ActivateCar, element absent or blocked");
        }
    }

    public Boolean isDisplayedDeletePhoto2Button(){
        try{
            MyLogger.log.info("Checking visibility Delete Photo2 button in the ActivateCar");
            uiObject.deletePhoto2Button().waitToAppear(5).tap();
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }

    public Terms tapTermsLink(){
        try{
            MyLogger.log.info("Tapping Terms link in the ActivateCar");
            uiObject.agreeTermsLink().waitToAppear(5).tap();
            return new Terms();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Terms link in the ActivateCar, element absent or blocked");
        }
    }

    public ActivateCar tapAgreeTermsCheckbox(){
        try{
            MyLogger.log.info("Tapping Agree Terms Checkbox in the ActivateCar");
            uiObject.agreeTermsCheckbox().waitToAppear(5).tap();
            return this;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Agree Terms Checkbox in the ActivateCar, element absent or blocked");
        }
    }

    public Home tapSendButton(){
        try{
            MyLogger.log.info("Tapping Send button in the ActivateCar");
            uiObject.sendButton().waitToAppear(5).tap();
            MyLogger.log.info("Tapping SuccessPopupClose button in the ActivateCar");
            uiObject.successPopupText().exists();
            uiObject.successPopupCloseButton().waitToAppear(5).tap();
            return Android.app.hyundai.home;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Send button or SuccessPopup Close button in the ActivateCar, element absent or blocked");
        }
    }

    @Override
    public ActivateCar waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Activate Car activity");
            uiObject.toolbarText().waitToAppear(5);
            uiObject.title().waitToAppear(1);
            uiObject.subtitle().waitToAppear(1);
            return this;
        }catch (AssertionError e){
            throw new AssertionError("Activate Car activity failed to load/open");
        }
    }
}
