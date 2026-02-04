package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class AuthPage extends BasePage {

    public SelenideElement usernameInput = mainSection.$("form > div:nth-child(1) > input");
    public SelenideElement passwordInput = mainSection.$("form > div:nth-child(2) > input");
    public SelenideElement authorizeButton = mainSection.$("form > button[type='submit']");

    public AuthPage enterUsernameValue(String value) {
        usernameInput.shouldBe(Condition.visible).setValue(value);
        return this;
    }

    public AuthPage enterPasswordValue(String value) {
        passwordInput.shouldBe(Condition.visible).setValue(value);
        return this;
    }

    public AuthPage clickAuthorizeButton() {
        authorizeButton.shouldBe(Condition.visible).click();
        return this;
    }
}
