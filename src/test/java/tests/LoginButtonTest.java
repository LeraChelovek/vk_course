package tests;


import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginButtonTest {

    @BeforeEach
    public void setUp() {
        open("https://ok.ru/");  // Открываем страницу авторизации Одноклассников
    }

    // Тест для проверки работоспособности кнопки "Войти"
    @Test
    public void testLoginButtonWithErrorValues() {
        LoginPage loginPage = new LoginPage();
        loginPage.enterPhone("000000000");
        loginPage.enterPassword("dxf1212hjkDJSIgf").clickLoginButton();

        loginPage.waitForError()
                .getErrorText()
                .contains("Неверный номер"); // Проверяем часть текста
    }
}
