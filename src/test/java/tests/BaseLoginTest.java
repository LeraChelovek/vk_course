package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseLoginTest {
    @BeforeEach
    @Timeout(20)
    public void setUp() {
        open("https://ok.ru/");
    }

    @AfterEach
    @Timeout(5)
    public void close(){
        closeWebDriver();
    }
}
