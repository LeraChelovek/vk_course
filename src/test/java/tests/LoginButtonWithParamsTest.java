package tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginButtonWithParamsTest extends BaseLoginTest{
    @ParameterizedTest(name="{index} - Логин: {0}, Пароль: {1} - is not good variation")
    @CsvSource({
            "000000000000, dxf1212hjkDJSIgf",
            "спасите я очень стараюсь, 123456",
            "dododo@mail.ru, weakpass"})

    @Tag("LoginTests")
    @DisplayName("Check for right work of showing captcha")
    @Timeout(value = 6000, unit = TimeUnit.MILLISECONDS)
    public void testLoginButtonWithErrorValues(String login, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.enterPhone(login);
        loginPage.enterPassword(password).clickLoginButton();
        String errorText = loginPage.waitForMessageForEnter().getErrorText();
        assertTrue(errorText.contains("Неправильно указан логин"), "Текст не содержит 'Неправильно указан логин'");
    }
}
