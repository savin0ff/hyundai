package api.apps.hyundai.startappscreens.auth.forgotpass;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 18.12.2016.
 */
public class ForgotPasswordUiObjects {
    private static UiObject
            title,
            backToAuthButton,
            email,
            sendPasswordButton,
            registerButton,
            alertText,
            alertCloseButton;

    public UiObject title() {
        if (title == null) title = new UiSelector().text("Восстановление пароля").makeUiObject();
        return title;
    }

    public UiObject backToAuthButton() {
        if (backToAuthButton == null) backToAuthButton = new UiSelector().description("Navigate up").makeUiObject();
        return backToAuthButton;
    }

    public UiObject email() {
        if (email == null) email = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/input_email").makeUiObject();
        return email;
    }

    public UiObject sendPasswordButton() {
        if (sendPasswordButton == null) sendPasswordButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/restore_password_send").makeUiObject();
        return sendPasswordButton;
    }

    public UiObject registerButton() {
        if (registerButton == null) registerButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/restore_password_back_to_register").makeUiObject();
        return registerButton;
    }

    public UiObject alertText() {
        alertText = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/dialog_alert_text").makeUiObject();
        return alertText;
    }

    public UiObject alertCloseButton() {
        alertCloseButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/dialog_alert_button_1").makeUiObject();
        return alertCloseButton;
    }
}