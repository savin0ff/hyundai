package api.apps.hyundai.startappscreens.register;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 19.12.2016.
 */
public class RegisterUiObjects {
    private static UiObject
            title,
            name,
            email,
            password,
            showPassword,
            agreeWithConditions,
            registerButton,
            vkButton,
            fbButton,
            goToAuthButton;

    public UiObject title() {
        if (title == null) title = new UiSelector().text("Регистрация").makeUiObject();
        return title;
    }

    public UiObject name() {
        if (name == null) name = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/input_name").makeUiObject();
        return name;
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

    public UiObject agreeWithConditions() {
        if (agreeWithConditions == null) agreeWithConditions = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/checkbox_container").makeUiObject();
        return agreeWithConditions;
    }

    public UiObject registerButton() {
        if (registerButton == null) registerButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/sign_up").makeUiObject();
        return registerButton;
    }

    public UiObject vkButton() {
        if (vkButton == null) vkButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/login_vk").makeUiObject();
        return vkButton;
    }

    public UiObject fbButton() {
        if (fbButton == null) fbButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/login_fb").makeUiObject();
        return fbButton;
    }

    public UiObject goToAuthButton() {
        if (goToAuthButton == null) goToAuthButton = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/sign_in").makeUiObject();
        return goToAuthButton;
    }


}
