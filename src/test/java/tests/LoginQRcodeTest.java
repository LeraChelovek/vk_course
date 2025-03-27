package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

public class LoginQRcodeTest {
    @BeforeEach
    public void setUp() {
        open("https://ok.ru/");  // Открываем страницу авторизации Одноклассников
    }
    @Test
    public void testQrCodeLogin() {
        // Нажимаем на ссылку "Войти по QR-коду"
        $x("//*[@id=\"qrCode-5671152440\"]").click();

        // Проверяем наличие заголовка QR-авторизации
        $x("//*[@id=\"hook_Block_AnonymLoginQRCode\"]/div/div[1]/div[1]/div[1]")
                .shouldHave(Condition.text("Получить код для быстрого входа в ОК"));
    }
}
