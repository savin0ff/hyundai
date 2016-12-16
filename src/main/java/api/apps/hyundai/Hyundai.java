package api.apps.hyundai;

import api.android.Android;
import api.apps.hyundai.balance.Balance;
import api.apps.hyundai.calendar.Calendar;
import api.apps.hyundai.menu.Menu;
import api.apps.hyundai.home.Home;
import api.apps.hyundai.navigator.Navigator;
import api.apps.hyundai.tips.Tips;
import api.interfaces.Activity;
import api.interfaces.Application;

/**
 * Created by sav80 on 16.12.2016.
 */
public class Hyundai implements Application{

    public Menu menu = new Menu();
    public Home home = new Home();
    public Calendar calendar = new Calendar();
    public Navigator navigator = new Navigator();
    public Tips tips = new Tips();
    public Balance balance = new Balance();

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
