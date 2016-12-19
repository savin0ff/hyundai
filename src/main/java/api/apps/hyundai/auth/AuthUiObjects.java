package api.apps.hyundai.auth;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 18.12.2016.
 */
public class AuthUiObjects {
    private static UiObject
            title,
            email,
            password,
            showPassword,
            forgotPassword,
            enterButton,
            vkButton,
            fbButton,
            goToRegisterButton;

    public UiObject title() {
        if (title == null) title = new UiSelector().text("Вход в профиль").makeUiObject();
        return title;
    }

    public UiObject email() {
        if (email == null) email = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/input_email").makeUiObject();
        return email;
    }

    public UiObject password() {
        if (password == null) password = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/input_password").makeUiObject();
        return password;
    }

    public UiObject showPassword() {
        if (showPassword == null) showPassword = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/text_input_password_toggle").makeUiObject();
        return showPassword;
    }

    public UiObject forgotPassword() {
        if (forgotPassword == null) forgotPassword = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/forgot_password").makeUiObject();
        return forgotPassword;
    }

    public UiObject enterButton() {
        if (enterButton == null) enterButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/sign_in").makeUiObject();
        return enterButton;
    }

    public UiObject vkButton() {
        if (vkButton == null) vkButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/login_vk").makeUiObject();
        return vkButton;
    }

    public UiObject fbButton() {
        if (fbButton == null) fbButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/login_fb").makeUiObject();
        return fbButton;
    }

    public UiObject registerButton() {
        if (goToRegisterButton == null) goToRegisterButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/sign_up").makeUiObject();
        return goToRegisterButton;
    }
}
