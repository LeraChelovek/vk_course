package pages;

import com.codeborne.selenide.SelenideElement;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement phoneField = $x("//*[@id='field_email']");
    private final SelenideElement passwordField=$x("//*[@id='field_password']");
    private final SelenideElement vkLink =$x("//*[@class='i ic social-icon __s __vk_id']");
    private final SelenideElement mailLink=$x("//*[@class='i ic social-icon __s __mailru']");
    private final SelenideElement yandexLink=$x("//*[@class='i ic social-icon __s __yandex']");
    private final SelenideElement loginButton =$x("//*[@class='button-pro __wide']");
    private final SelenideElement messageForEnterCode = $x("//*[@class='input-e login_error']");
    private final SelenideElement QRcodeLink=$x("//*[@class='button-pro __wide qr-code-button mt-2x js-login-nav js-login-qrCode']");
    private final SelenideElement recoveryLink = $x("//*[@class='lp']");
    private final SelenideElement QRcodeInfoHeader=$x("//*[@class='qr_code_info_header']");
    private final SelenideElement recoveryText=$x("//*[@class='ext-registration_h']");
    public void check() {
        phoneField.shouldBe(visible);
        passwordField.shouldBe(visible);
        loginButton.shouldBe(enabled);
    }
    public LoginPage() {
        check();
    }
    public void enterPhone(String phone) {
        phoneField.setValue(phone);
    }
    public LoginPage enterPassword(String password){
        passwordField.setValue(password);
        return this;
    }
    public void clickLoginButton() {
        loginButton.shouldBe(visible).click();
    }

    public void clickRecoveryLink() {
        recoveryLink.shouldBe(visible).click();
    }
    public void clickQRcodeLink(){

        QRcodeLink.shouldBe(visible).click();
    }

    public void checkClickabilityVkLink(){
        vkLink.shouldBe(clickable);
    }
    public void checkClickabilityMailLink(){
        mailLink.shouldBe(clickable);
    }
    public void checkClickabilityYandexLink(){
        yandexLink.shouldBe(clickable);
    }
    public LoginPage waitForMessageForEnter() {
        messageForEnterCode.shouldBe(visible, Duration.ofSeconds(5));
        return this;
    }
    public String getErrorText() {
        return messageForEnterCode.getText();
    }
    public String getQRcodeInfoHeaderText(){
        return QRcodeInfoHeader.getText();
    }
    public String getRecoveryText(){
        return recoveryText.getText();
    }
}
