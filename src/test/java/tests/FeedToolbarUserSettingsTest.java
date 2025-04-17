package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.FeedPage;

import static com.codeborne.selenide.Selenide.*;

public class FeedToolbarUserSettingsTest extends BaseFeedTest {
    @Disabled("Тест не дописан, так как почему-то не меняется страница после клика. Но тут использовать паттерн Chain of invocations. Понимаю, что пока не прописала проверку")
    @Tag("FeedTest")
    @DisplayName("Test toolbar user settings for logging out")
    public void testToolbarUserSettingsLogOut(){
        FeedPage feedPageCheckUserSettingsLogOut = page(FeedPage.class);
        feedPageCheckUserSettingsLogOut.clickToolbarUserSettings().clickButtonLogOut().clickButtonLogOutAfterSuggestionToRememberAccount();
        sleep(7000);

    }
}
