package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import pages.FeedPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseFeedTest {

    @BeforeEach
    @Timeout(60)
    public void setUp() {
        open("https://ok.ru/");
        LoginPage loginPage=new LoginPage();
        loginPage.enterPhone("technopol72");
        loginPage.enterPassword("technopolisPassword").clickLoginButton();
    }

    @AfterEach
    @Timeout(20)
    public void close(){
        closeWebDriver();
    }
}
