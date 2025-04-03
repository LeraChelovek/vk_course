package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.*;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

public class LoginQRcodeTest {
    @BeforeEach
    @Timeout(5)
    public void setUp() {
        open("https://ok.ru/");  // Открываем страницу авторизации Одноклассников
    }
    @Test
    @Tag("LoginTests")
    @DisplayName("Check right work of link for getting QRcode")
    public void testQrCodeLogin() {
        LoginPage loginPage = new LoginPage();
        // Нажимаем на ссылку "Войти по QR-коду"
        loginPage.clickQRcodeLink();

        // Проверяем наличие заголовка QR-авторизации
        $x("//*[@class='qr_code_info_header']").shouldHave(Condition.text("Получите код для быстрого входа в ОК"));
    }
    @AfterEach
    public void close(){
        closeWebDriver();
    }
}
