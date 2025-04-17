package pages;
import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import components.VKEcosystemElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class FeedPage extends LoadableComponent<FeedPage> {

    private final SelenideElement myFeed=$x("//*[@class='link__91azp tab__9agyv __is-active__9agyv __primary__91azp']");
    private final SelenideElement recommendations=$x("//*[@class='link__91azp tab__9agyv __primary__91azp']");
    private final SelenideElement moments=$x("//*[@class='button-clean__0wfyv tab__9h5vh']");
    private final SelenideElement feedLink=$x("//*[@class='nav-side_i  __ac __with-ic __with-new-icons']");
    private final SelenideElement toolbarVKEcosystem=$x("//*[@class='vk_ecosystem_toolbar h-mod']");
    private final SelenideElement toolbarUserSettings=$x("//*[@class='toolbar_dropdown_w h-mod']");
    private final SelenideElement buttonLogOut=$x("//*[@class='toolbar_accounts-user-delete-button']");

    private final SelenideElement buttonLogOutAfterSuggestionToRememberAccount=$x("//*[@id='hook_FormButton_logoff.confirm_not_decorate']");
    //элементы ToolbarVKEcosystem
    private final SelenideElement mailLinkinToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __mail']");
    private final SelenideElement weatherLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __weather']");
    private final SelenideElement ladyLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __lady']");
    private final SelenideElement portalLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __mail']");
    private final SelenideElement cloudLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __cloud']");
    private final SelenideElement calendarLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __calendar']");
    private final SelenideElement notesLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __notes']");
    private final SelenideElement callsLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __calls']");
    private final SelenideElement vkMailLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __vk_mail']");
    private final SelenideElement tvLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __tv']");
    private final SelenideElement horoscopeLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __horoscope']");
    private final SelenideElement sportLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __sport']");
    private final SelenideElement answersLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __answers']");
    private final SelenideElement autoLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __auto']");
    private final SelenideElement vkLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __vk']");
    private final SelenideElement moreLinkToolbarVKEcosystem=$x("//*[@class='vk-ecosystem-link __more']");


    public VKEcosystemElement mailLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(mailLinkinToolbarVKEcosystem);
    }
    public VKEcosystemElement weatherLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(weatherLinkToolbarVKEcosystem);
    }
    public VKEcosystemElement ladyLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(ladyLinkToolbarVKEcosystem);
    }
    public VKEcosystemElement portalLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(portalLinkToolbarVKEcosystem);
    }
    public VKEcosystemElement cloudLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(cloudLinkToolbarVKEcosystem);
    }public VKEcosystemElement calendarLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(calendarLinkToolbarVKEcosystem);
    }public VKEcosystemElement notesLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(notesLinkToolbarVKEcosystem);
    }public VKEcosystemElement vkMailLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(vkMailLinkToolbarVKEcosystem);
    }
    public VKEcosystemElement callsLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(callsLinkToolbarVKEcosystem);
    }public VKEcosystemElement tvLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(tvLinkToolbarVKEcosystem);
    }
    public VKEcosystemElement horoscopeLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(horoscopeLinkToolbarVKEcosystem);
    }
    public VKEcosystemElement sportLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(sportLinkToolbarVKEcosystem);
    }
    public VKEcosystemElement answersLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(answersLinkToolbarVKEcosystem);
    }
    public VKEcosystemElement moreLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(moreLinkToolbarVKEcosystem);
    }
    public VKEcosystemElement vkLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(vkLinkToolbarVKEcosystem);
    }
    public VKEcosystemElement autoLinkinToolbarVKEcosystem() {
        return new VKEcosystemElement(autoLinkToolbarVKEcosystem);
    }

    @Override
    protected void isLoaded(){
        assertAll(
                ()-> myFeed.should(Condition.exist.because("Проверка нахождения на нужной странице")),
                ()->feedLink.should(Condition.exist.because("Проверка нахождения на нужной странице")),
                ()->moments.should(Condition.exist.because("Проверка нахождения на нужной странице")),
                ()->recommendations.should(Condition.exist.because("Проверка нахождения на нужной странице"))
        );
    }

    public void checkNotFeedPage(){
        assertAll(
                ()-> myFeed.shouldNot(Condition.exist.because("Проверка нахождения на нужной странице")),
                ()->feedLink.shouldNot(Condition.exist.because("Проверка нахождения на нужной странице")),
                ()->moments.shouldNot(Condition.exist.because("Проверка нахождения на нужной странице")),
                ()->recommendations.shouldNot(Condition.exist.because("Проверка нахождения на нужной странице"))
        );
    }
    public FeedPage() {
        isLoaded();
    }
    public FeedPage clickToolbarVKEcosystem() {
        toolbarVKEcosystem.shouldBe(visible).click();
        return this;
    }
    public FeedPage clickToolbarUserSettings(){
        toolbarUserSettings.shouldBe(visible.because("Проверка на наличие тулбара с настрйоками пользователя"),Duration.ofSeconds(5)).click();
        return this;
    }
    public FeedPage clickButtonLogOut(){
        buttonLogOut.shouldBe(visible,Duration.ofSeconds(5)).shouldBe(clickable).click();
        return this;
    }
    public void clickButtonLogOutAfterSuggestionToRememberAccount(){
        buttonLogOutAfterSuggestionToRememberAccount.shouldBe(clickable.because("Проверка на наличие кнопки, чтобы выйти из аккаунта"), Duration.ofSeconds(10)).click(ClickOptions.usingJavaScript());

    }
    public FeedPage checkToolbarVkEcosystemContent(){
        assertAll(
                ()-> mailLinkinToolbarVKEcosystem.should(Condition.exist.because("Ссылка на сервис Почта должна существовать")),
                ()->ladyLinkToolbarVKEcosystem.should(Condition.exist.because("Ссылка на сервис Леди должна существовать")),
                ()->weatherLinkToolbarVKEcosystem.should(Condition.exist.because("Ссылка на сервис Погода должна существовать"))
        );
        return this;
    }

}
