package api.apps.hyundai;

import api.android.Android;
import api.apps.speedtest.about.About;
import api.apps.speedtest.begintest.BeginTest;
import api.apps.hyundai.home.Home;
import api.interfaces.Activity;
import api.interfaces.Application;

/**
 * Created by sav80 on 16.12.2016.
 */
public class Hyundai implements Application{

    //public Menu menu = new Menu();
    public Home home = new Home();
    //public BeginTest beginTest = new BeginTest();
    //public Results results = new Results();

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
