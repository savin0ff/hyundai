package api.apps.hyundai.menu;

import api.android.Android;
import api.apps.hyundai.advices.Advices;
import api.apps.hyundai.auth.Auth;
import api.apps.hyundai.auth.Register;
import api.apps.hyundai.balance.Balance;
import api.apps.hyundai.balance.gifts.Gifts;
import api.apps.hyundai.events.Events;
import api.apps.hyundai.home.Home;
import api.apps.hyundai.menu.configurator.Configurator;
import api.apps.hyundai.menu.garage.Garage;
import api.apps.hyundai.menu.lookfordiler.LookForDiler;
import api.apps.hyundai.menu.myprofile.MyProfile;
import api.apps.hyundai.menu.specialoffers.SpecialOffers;
import api.apps.hyundai.menu.support.Support;
import api.apps.hyundai.menu.technicalservice.TechnicalService;
import api.apps.hyundai.menu.testdrive.TestDrive;
import api.apps.hyundai.navigator.Navigator;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 16.12.2016.
 */
public class Menu implements Activity {

    public static MenuUiObjects uiObject = new MenuUiObjects();

    public Home tapHomeButton(){
        try{
            MyLogger.log.info("Tapping Home Button ");
            uiObject.homeButton().waitToAppear(5).tap();
            return Android.app.hyundai.home;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Home Button, element absent or blocked");
        }
    }

    public Events tapEventsButton(){
        try{
            MyLogger.log.info("Tapping Events Button ");
            uiObject.eventsButton().waitToAppear(5).tap();
            return Android.app.hyundai.events;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Events Button, element absent or blocked");
        }
    }

    public Navigator tapNavigatorButton(){
        try{
            MyLogger.log.info("Tapping Navigator Button ");
            uiObject.navigatorButton().waitToAppear(5).tap();
            return Android.app.hyundai.navigator;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Navigator Button, element absent or blocked");
        }
    }

    public Configurator tapConfiguratorButton(){
        try{
            MyLogger.log.info("Tapping Configurator Button ");
            uiObject.configuratorButton().waitToAppear(5).tap();
            return Android.app.hyundai.configurator;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Configurator Button, element absent or blocked");
        }
    }

    public Gifts tapGiftsButton(){
        try{
            MyLogger.log.info("Tapping Gifts Button ");
            uiObject.giftsButton().waitToAppear(5).tap();
            return Android.app.hyundai.gifts;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Gifts Button, element absent or blocked");
        }
    }

    public Balance tapBonusBalanceButton(){
        try{
            MyLogger.log.info("Tapping BonusBalance Button ");
            uiObject.bonusBalanceButton().waitToAppear(5).tap();
            return Android.app.hyundai.balance;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap BonusBalance Button, element absent or blocked");
        }
    }

    public Menu tapMoreButton(){
        try{
            MyLogger.log.info("Tapping More Button ");
            uiObject.moreButton().waitToAppear(5).tap();
            return Android.app.hyundai.menu;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap More Button, element absent or blocked");
        }
    }

    public SpecialOffers tapSpecialOffersButton(){
        try{
            MyLogger.log.info("Tapping SpecialOffers Button ");
            uiObject.specialOffersButton().waitToAppear(5).tap();
            return Android.app.hyundai.specialOffers;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap SpecialOffers Button, element absent or blocked");
        }
    }

    public Garage tapGarageButton(){
        try{
            MyLogger.log.info("Tapping Garage Button ");
            uiObject.garageButton().waitToAppear(5).tap();
            return Android.app.hyundai.garage;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Garage Button, element absent or blocked");
        }
    }

    public Advices tapAdvicesButton(){
        try{
            MyLogger.log.info("Tapping Advices Button ");
            uiObject.advicesButton().waitToAppear(5).tap();
            return Android.app.hyundai.advices;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Advices Button, element absent or blocked");
        }
    }

    public TechnicalService tapTechnicalServiceButton(){
        try{
            MyLogger.log.info("Tapping TechnicalService Button ");
            uiObject.technicalServiceButton().waitToAppear(5).tap();
            return Android.app.hyundai.technicalService;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap TechnicalService Button, element absent or blocked");
        }
    }

    public TestDrive tapTestDriveButton(){
        try{
            MyLogger.log.info("Tapping TestDrive Button ");
            uiObject.testDriveButton().waitToAppear(5).tap();
            return Android.app.hyundai.testdrive;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap TestDrive Button, element absent or blocked");
        }
    }

    public TestDrive tapCreditButton(){
        try{
            MyLogger.log.info("Tapping TestDrive Button ");
            uiObject.testDriveButton().waitToAppear(5).tap();
            return Android.app.hyundai.testdrive;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap TestDrive Button, element absent or blocked");
        }
    }

    public MyProfile tapMyProfileButton(){
        try{
            MyLogger.log.info("Tapping MyProfile Button ");
            uiObject.myProfileButton().waitToAppear(5).tap();
            return Android.app.hyundai.myProfile;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap MyProfile Button, element absent or blocked");
        }
    }

    public LookForDiler tapLookForDilerButton(){
        try{
            MyLogger.log.info("Tapping LookForDiler Button ");
            uiObject.lookForDilerButton().waitToAppear(5).tap();
            return Android.app.hyundai.lookForDiler;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap LookForDiler Button, element absent or blocked");
        }
    }

    public Support tapSupportButton(){
        try{
            MyLogger.log.info("Tapping Support Button ");
            uiObject.supportButton().waitToAppear(5).tap();
            return Android.app.hyundai.support;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Support Button, element absent or blocked");
        }
    }

    public Auth tapQuitButton(){
        try{
            MyLogger.log.info("Tapping Quit Button ");
            uiObject.quitButton().waitToAppear(5).tap();
            return Android.app.hyundai.auth;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Quit Button, element absent or blocked");
        }
    }

    public void tapCloseMenuButton(){
        try{
            MyLogger.log.info("Tapping CloseMenu Button ");
            uiObject.closeMenuButton().waitToAppear(5).tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap CloseMenu Button, element absent or blocked");
        }
    }

    @Override
    public Menu waitToLoad() {
        try{
            MyLogger.log.info("Waiting for Menu activity");
            uiObject.myProfileButton().waitToAppear(5);
            return Android.app.hyundai.menu;
        }catch (AssertionError e){
            throw new AssertionError("Menu activity failed to load/open");
        }
    }
}
