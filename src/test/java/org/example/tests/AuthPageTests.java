package org.example.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.testdata.UserTestData;
import org.example.pages.AuthPage;
import org.example.pages.ProfilePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthPageTests extends BasePageTests {

    AuthPageTests() {
        super("auth");
    }

    @Test
    @DisplayName("User authorizes and logout from the system")
    @Severity(SeverityLevel.CRITICAL)
    void shouldAuthorizeAndLogout() {
        AuthPage authPage = new AuthPage();
        ProfilePage profilePage = new ProfilePage();

        authPage
                .enterUsernameValue(UserTestData.username)
                .enterPasswordValue(UserTestData.password)
                .clickAuthorizeButton();

        authPage.headerElement.clickProfileLink();
        profilePage.clickSettingsTab().clickSignOutButton();

        authPage.headerElement.profileLink.shouldBe(Condition.hidden);
    }

}
