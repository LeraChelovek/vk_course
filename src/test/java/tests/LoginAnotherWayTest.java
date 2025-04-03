package tests;

import org.junit.jupiter.api.*;
import pages.LoginPage;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertAll;
public class LoginAnotherWayTest {

    @BeforeEach
    @Timeout(5)
    public void setUp() {
        open("https://ok.ru/");

    }
    @Test
    @Tag("LoginTests")
    @DisplayName("Check clickability of links for logging in using social media accounts")
    public void LoginAnotherWay(){
        LoginPage loginPage=new LoginPage();
        assertAll(
            loginPage::checkClickabilityVkLink,
            loginPage::checkClickabilityMailLink,
            loginPage::checkClickabilityYandexLink
        );
    }
    @AfterEach
    public void close(){
        closeWebDriver();
    }

}
