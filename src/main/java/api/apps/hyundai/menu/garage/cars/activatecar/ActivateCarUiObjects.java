package api.apps.hyundai.menu.garage.cars.activatecar;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

/**
 * Created by sav80 on 27.12.2016.
 */
public class ActivateCarUiObjects {
    private static UiObject
            toolbarText,
            backButton,
            title,
            subtitle,
            side1PhotoButton,
            deletePhoto1Button,
            side2PhotoButton,
            deletePhoto2Button,
            agreeTermsCheckbox,
            agreeTermsLink,
            sendButton,
            successPopupText,
            successPopupCloseButton;

    public UiObject toolbarText() {
        toolbarText = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/toolbar_text").makeUiObject();
        return toolbarText;
    }

    public UiObject backButton() {
        backButton = new UiSelector().description("Перейти вверх").makeUiObject();
        return backButton;
    }

    public UiObject title() {
        title = new UiSelector().text("Активация").makeUiObject();
        return title;
    }

    public UiObject subtitle() {
        subtitle = new UiSelector().text("Загрузите фото/скан ПТС или СТС с двух сторон").makeUiObject();
        return subtitle;
    }

    public UiObject side1PhotoButton() {
        side1PhotoButton = new UiSelector().resourceId(":id/activate_my_car_side_1_text_view").makeUiObject();
        return side1PhotoButton;
    }

    public UiObject deletePhoto1Button() {
        deletePhoto1Button = new UiSelector().resourceId(":id/activate_my_car_side_1_basket").makeUiObject();
        return deletePhoto1Button;
    }

    public UiObject side2PhotoButton() {
        side2PhotoButton = new UiSelector().resourceId(":id/activate_my_car_side_2_text_view").makeUiObject();
        return side2PhotoButton;
    }

    public UiObject deletePhoto2Button() {
        deletePhoto2Button = new UiSelector().resourceId(":id/activate_my_car_side_2_basket").makeUiObject();
        return deletePhoto2Button;
    }

    public UiObject agreeTermsCheckbox() {
        agreeTermsCheckbox = new UiSelector().resourceId(Android.app.hyundai.packageID()+":id/checkbox_container").makeUiObject();
        return agreeTermsCheckbox;
    }

    public UiObject agreeTermsLink() {
        agreeTermsLink = new UiSelector().text("Согласен с условиями обработки\n" +
                "личных данных").makeUiObject();
        return agreeTermsLink;
    }

    public UiObject sendButton() {
        sendButton = new UiSelector().text("Отправить заявку").makeUiObject();
        return sendButton;
    }

    public UiObject successPopupText() {
        successPopupText = new UiSelector().text("Документы отправлены успешно.").makeUiObject();
        return successPopupText;
    }

    public UiObject successPopupCloseButton() {
        successPopupCloseButton = new UiSelector().text("Закрыть").makeUiObject();
        return successPopupCloseButton;
    }
}
