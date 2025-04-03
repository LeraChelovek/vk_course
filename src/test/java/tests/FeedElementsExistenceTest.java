package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.FeedPage;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.BeforeEach;

public class FeedElementsExistenceTest {

    @BeforeEach
    public void setUp(){
        open("https://ok.ru/");
        LoginPage loginPage=new LoginPage();
        loginPage.enterPhone("technopol68");
        loginPage.enterPassword("technopolisPassword").clickLoginButton();
    }
    @Test
    @Disabled("I don't know how I can go through the captcha")
    public void FeedElementsExistence(){
        FeedPage feedPage=new FeedPage();


        assertAll(
                ()-> feedPage.getMyFeed().should(Condition.exist),
                ()->feedPage.getFeedLink().should(Condition.exist),
                ()->feedPage.getMoments().should(Condition.exist),
                ()->feedPage.getRecommendations().should(Condition.exist)
        );
    }
}
