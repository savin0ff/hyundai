package api.apps.hyundai;

import api.android.Android;
import api.apps.hyundai.popups.Popups;
import api.apps.hyundai.startappscreens.register.addcar.AddCarAfterRegistration;
import api.apps.hyundai.advices.Advices;
import api.apps.hyundai.balance.Balance;
import api.apps.hyundai.balance.gifts.Gifts;
import api.apps.hyundai.calendar.Calendar;
import api.apps.hyundai.events.Events;
import api.apps.hyundai.menu.Menu;
import api.apps.hyundai.home.Home;
import api.apps.hyundai.menu.configurator.Configurator;
import api.apps.hyundai.menu.garage.Garage;
import api.apps.hyundai.menu.garage.cars.addvin.AddCarByVIN;
import api.apps.hyundai.startappscreens.register.addcar.choosecar.ChooseCarAfterRegistration;
import api.apps.hyundai.menu.lookfordiler.LookForDiler;
import api.apps.hyundai.menu.myprofile.MyProfile;
import api.apps.hyundai.menu.specialoffers.SpecialOffers;
import api.apps.hyundai.menu.support.Support;
import api.apps.hyundai.menu.technicalservice.TechnicalService;
import api.apps.hyundai.menu.testdrive.TestDrive;
import api.apps.hyundai.navigator.Navigator;
import api.apps.hyundai.startappscreens.auth.Auth;
import api.apps.hyundai.startappscreens.auth.forgotpass.ForgotPassword;
import api.apps.hyundai.startappscreens.facebook.FacebookWebView;
import api.apps.hyundai.startappscreens.register.Register;
import api.apps.hyundai.startappscreens.startscreens.StartScreen1;
import api.apps.hyundai.startappscreens.startscreens.StartScreen2;
import api.apps.hyundai.startappscreens.startscreens.StartScreen3;
import api.apps.hyundai.startappscreens.startscreens.StartScreen4;
import api.apps.hyundai.startappscreens.vk.VKWebView;
import api.interfaces.Application;
import core.MyLogger;


/**
 * Created by sav80 on 16.12.2016.
 */
public class Hyundai implements Application{

    public StartScreen1 startscreen1 = new StartScreen1();
    public StartScreen2 startscreen2 = new StartScreen2();
    public StartScreen3 startscreen3 = new StartScreen3();
    public StartScreen4 startscreen4 = new StartScreen4();
    public Auth auth = new Auth();
    public Menu menu = new Menu();
    public Home home = new Home();
    public Calendar calendar = new Calendar();
    public Navigator navigator = new Navigator();
    public Advices advices = new Advices();
    public Balance balance = new Balance();
    public ForgotPassword forgotpassword = new ForgotPassword();
    public Register register = new Register();
    public VKWebView vkWebView = new VKWebView();
    public FacebookWebView facebookWebView = new FacebookWebView();
    public AddCarAfterRegistration addCarAfterRegistration = new AddCarAfterRegistration();
    public ChooseCarAfterRegistration chooseCarAfterRegistration = new ChooseCarAfterRegistration();
    public AddCarByVIN addCarByVIN = new AddCarByVIN();
    public Events events = new Events();
    public Configurator configurator = new Configurator();
    public Gifts gifts = new Gifts();
    public SpecialOffers specialOffers = new SpecialOffers();
    public Garage garage = new Garage();
    public TechnicalService technicalService = new TechnicalService();
    public TestDrive testdrive = new TestDrive();
    public MyProfile myProfile = new MyProfile();
    public LookForDiler lookForDiler = new LookForDiler();
    public Support support = new Support();
    public Popups popup = new Popups();

    public void swipeDown (int count) {
        MyLogger.log.debug("Swiping down");
        for (int i=0; i<count; i++) {
            Android.driver.swipe(300, 600, 300, 200, 300);
        }
    }

    public void swipeUp (int count) {
        MyLogger.log.debug("Swiping up");
        for (int i=0; i<count; i++) {
            Android.driver.swipe(300, 300, 300, 700, 300);
        }
    }

    @Override
    public void forceStop() {
        Android.adb.forceStopApp(packageID());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    @Override
    public Object open() {
        Android.adb.openAppsActivity(packageID(), activityID());
        return null;
    }

    @Override
    public String packageID() {
        return "com.mediapark.hyundai";
    }

    @Override
    public String activityID() {
        return "com.mediapark.hyundai.ui.main.MainActivity";
    }
}
