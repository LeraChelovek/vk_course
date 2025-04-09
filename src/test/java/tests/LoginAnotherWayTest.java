package tests;

import org.junit.jupiter.api.*;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.assertAll;
public class LoginAnotherWayTest extends BaseLoginTest{
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
}
