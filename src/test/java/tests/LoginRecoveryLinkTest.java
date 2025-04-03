package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.*;
import pages.LoginPage;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

public class LoginRecoveryLinkTest {

    @BeforeEach
    @Timeout(5)
    public void setUp() {
        open("https://ok.ru/");
    }
    @Test
    @Tag("LoginTests")
    @DisplayName("Check right work of link for recovery page ")
    public void testRecoveryLink() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickRecoveryLink();
        $x("//*[@class='ext-registration_h']").shouldHave(Condition.text("Восстановление доступа"));
    }
    @AfterEach
    public void close(){
        closeWebDriver();
    }
}
