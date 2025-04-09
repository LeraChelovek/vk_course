package tests;

import org.junit.jupiter.api.*;
import pages.LoginPage;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginQRcodeTest extends BaseLoginTest{

    @Test
    @Tag("LoginTests")
    @DisplayName("Check right work of link for getting QRcode")
    public void testQrCodeLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickQRcodeLink();

        assertThat(loginPage.getQRcodeInfoHeaderText())
                .isEqualTo("Получите код для быстрого входа в ОК");
    }
}
