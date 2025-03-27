package pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    // Поле для ввода номера телефона
    private final SelenideElement phoneField = $x("//*[@id=\"field_email\"]");
    private final SelenideElement passwordField=$x("//*[@id=\"field_password\"]");

    // Кнопка "Войти"
    private final SelenideElement loginButton =$x("//button[@type='submit']");
    private final SelenideElement errorMessage = $x("//*[@id=\"tabpanel-login-4856252181\"]/form/div[3]/div"); // Или $x("//div[contains(@class,'error')]")

    // Ссылка "Не получается войти?"
    private final SelenideElement recoveryLink = $x("//*[@id=\"tabpanel-login-4856252181\"]/form/div[7]/input");

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

    public LoginPage waitForError() {
        errorMessage.shouldBe(visible, Duration.ofSeconds(5));
        return this;
    }

    // Проверка текста ошибки
    public String getErrorText() {
        return errorMessage.getText();
    }
}
