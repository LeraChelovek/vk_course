package tests;

import org.junit.jupiter.api.*;
import pages.LoginPage;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginRecoveryLinkTest extends BaseLoginTest{
    @Test
    @Tag("LoginTests")
    @Timeout(6)
    @DisplayName("Check right work of link for recovery page ")
    public void testRecoveryLink() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickRecoveryLink();

        assertThat(loginPage.getRecoveryText())
                .isEqualTo("Восстановление доступа");
    }

}
