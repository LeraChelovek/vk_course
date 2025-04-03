package pages;

import com.codeborne.selenide.SelenideElement;
import java.time.Duration;
import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    // Поле для ввода номера телефона
    private final SelenideElement phoneField = $x("//*[@id='field_email']");
    private final SelenideElement passwordField=$x("//*[@id='field_password']");
    private final SelenideElement vkLink =$x("//*[@class='i ic social-icon __s __vk_id']");
    private final SelenideElement mailLink=$x("//*[@class='i ic social-icon __s __mailru']");
    private final SelenideElement yandexLink=$x("//*[@class='i ic social-icon __s __yandex']");
    private final SelenideElement loginButton =$x("//*[@class='button-pro __wide']");
    private final SelenideElement messageForEnterCode = $x("//*[@tsid='login-block21_label_d27716']");
    private final SelenideElement QRcodeLink=$x("//*[@class='button-pro __wide qr-code-button mt-2x js-login-nav js-login-qrCode']");

    // Ссылка "Не получается войти?"
    private final SelenideElement recoveryLink = $x("//*[@class='lp']");

    // Метод для ввода номера телефона
    public void enterPhone(String phone) {
        phoneField.setValue(phone);
    }
    public LoginPage enterPassword(String password){
        passwordField.setValue(password);
        return this;
    }

    // Метод для клика на кнопку "Войти"
    public void clickLoginButton() {
        loginButton.click();
    }

    // Метод для клика на ссылку "Не получается войти?"
    public void clickRecoveryLink() {
        recoveryLink.click();
    }
    public void clickQRcodeLink(){
        QRcodeLink.click();
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
    // Проверка текста ошибки
    public String getErrorText() {
        return messageForEnterCode.getText();
    }
}
