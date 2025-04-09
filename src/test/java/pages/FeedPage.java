package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertAll;

public class FeedPage {
    private final SelenideElement myFeed=$x("//*[@class='link__91azp tab__9agyv __is-active__9agyv __primary__91azp']");
    private final SelenideElement recommendations=$x("//*[@class='link__91azp tab__9agyv __primary__91azp']");
    private final SelenideElement moments=$x("//*[@class='button-clean__0wfyv tab__9h5vh']");
    private final SelenideElement feedLink=$x("//*[@class='nav-side_i  __ac __with-ic __with-new-icons']");
    private final SelenideElement toolbar=$x("//*[@class='vk_ecosystem_toolbar h-mod']");
    public void check(){
        assertAll(
                ()-> myFeed.should(Condition.exist),
                ()->feedLink.should(Condition.exist),
                ()->moments.should(Condition.exist),
                ()->recommendations.should(Condition.exist)
        );
    }
    public FeedPage() {
        check();
    }
    public void clickToolbar() {
        toolbar.shouldBe(visible).click();
    }

}
