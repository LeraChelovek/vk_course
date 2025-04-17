package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.FeedPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.error.ShouldHave.shouldHave;

public class FeedToolBarVKEcosystemTest extends BaseFeedTest{
    @Test
    @Tag("FeedTests")
    @DisplayName("Test the toolbar with VK services")
    public void testToolbarVKEcosystem(){
        FeedPage feedPageCheckVKEcosystem = page(FeedPage.class);
        feedPageCheckVKEcosystem.clickToolbarVKEcosystem().checkToolbarVkEcosystemContent();
    }
    @Test
    @Tag("FeedTests")
    @DisplayName("Test the toolbar has correct href for More")
    public void testMoreElement(){
        FeedPage feedPageCheckVKEcosystem = page(FeedPage.class);
        feedPageCheckVKEcosystem.clickToolbarVKEcosystem().moreLinkinToolbarVKEcosystem().click();

        Wait().until(d -> webdriver().driver().getWebDriver().getWindowHandles().size() > 1);
        switchTo().window(1);

        webdriver().shouldHave(urlContaining("ru/projects/"), Duration.ofSeconds(20));
    }
}
