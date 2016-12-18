package api.apps.hyundai.startscreens;

import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 18.12.2016.
 */
public class StartScreen2UiObjects extends StartScreen1UiObjects {
    StartScreen2UiObjects() {
        super.TitleTextLocator = "Удобный подбор\n" +
                "маршрута";
        super.descriptionTextLocator = "Определите оптимальное время поездки и храните постоянные маршруты.";
    }
}
