package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseFeedTest {
    @BeforeEach
    @Timeout(7)
    public void setUp() {
        open("https://ok.ru/");
        LoginPage loginPage=new LoginPage();
        loginPage.enterPhone("technopol72");
        loginPage.enterPassword("technopolisPassword").clickLoginButton();
    }

    @AfterEach
    @Timeout(5)
    public void close(){
        closeWebDriver();
    }
}
