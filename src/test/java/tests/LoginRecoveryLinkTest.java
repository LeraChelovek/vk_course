package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

public class LoginRecoveryLinkTest {

    @BeforeEach
    public void setUp() {
        open("https://ok.ru/");  // Открываем страницу авторизации Одноклассников
    }
    @Test
    public void testRecoveryLink() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickRecoveryLink();
        $x("//*[@id=\"hook_Block_AnonymRecoveryStart\"]/div/div[1]/div[1]")
                .shouldHave(Condition.text("Восстановление доступа"));

    }
}
