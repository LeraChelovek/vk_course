package pages;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FeedPage {
    private final SelenideElement myFeed=$x("//*[@class='link__91azp tab__9agyv __is-active__9agyv __primary__91azp']");
    private final SelenideElement recommendations=$x("//*[@class='link__91azp tab__9agyv __primary__91azp']");
    private final SelenideElement moments=$x("//*[@class='button-clean__0wfyv tab__9h5vh']");
    private final SelenideElement feedLink=$x("//*[@class='nav-side_i  __ac __with-ic __with-new-icons']");

    public SelenideElement getMyFeed() {
        System.out.println(myFeed);
        return myFeed;
    }

    public SelenideElement getRecommendations() {
        return recommendations;
    }

    public SelenideElement getMoments() {
        return moments;
    }

    public SelenideElement getFeedLink() {
        return feedLink;
    }
}
