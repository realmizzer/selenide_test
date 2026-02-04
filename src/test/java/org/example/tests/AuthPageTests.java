package org.example.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.pages.AuthPage;
import org.example.pages.ProfilePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AuthPageTests extends BasePageTests {

    AuthPageTests() {
        super("auth");
    }

    @ParameterizedTest
    @MethodSource("org.example.testdata.UserTestData#getUserTestData")
    @DisplayName("User authorizes and logouts from the system")
    @Severity(SeverityLevel.CRITICAL)
    void shouldAuthorizeAndLogout(String username, String password) {
        AuthPage authPage = new AuthPage();
        ProfilePage profilePage = new ProfilePage();

        authPage
                .enterUsernameValue(username)
                .enterPasswordValue(password)
                .clickAuthorizeButton();

        authPage.headerElement.clickProfileLink();
        profilePage.clickSettingsTab().clickSignOutButton();

        authPage.headerElement.profileLink.shouldBe(Condition.hidden);
    }

}
