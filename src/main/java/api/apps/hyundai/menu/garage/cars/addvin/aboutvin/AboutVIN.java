package api.apps.hyundai.menu.garage.cars.addvin.aboutvin;

import api.apps.hyundai.menu.garage.cars.GarageCars;
import api.apps.hyundai.menu.garage.cars.addvin.AddCarByVIN;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

/**
 * Created by sav80 on 27.12.2016.
 */
public class AboutVIN implements Activity {

    public static AboutVINuiObjects uiObject = new AboutVINuiObjects();

    public void tapCloseButton(){
        try{
            MyLogger.log.info("Tapping Close button in the garage");
            uiObject.closeButton().waitToAppear(5).tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap close button in the AboutVIN, element absent or blocked");
        }
    }

    @Override
    public AddCarByVIN waitToLoad() {
        try{
            MyLogger.log.info("Waiting for AboutVIN activity");
            uiObject.title().waitToAppear(5);
            uiObject.text().waitToAppear(5);
            return new AddCarByVIN();
        }catch (AssertionError e){
            throw new AssertionError("AboutVIN activity failed to load/open");
        }
    }
}
