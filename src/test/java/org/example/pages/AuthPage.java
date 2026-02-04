package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class AuthPage extends BasePage {

    public SelenideElement usernameInput = mainSection.$("form > div:nth-child(1) > input");
    public SelenideElement passwordInput = mainSection.$("form > div:nth-child(2) > input");
    public SelenideElement authorizeButton = mainSection.$("form > button[type='submit']");

    @Step("Entered username")
    public AuthPage enterUsernameValue(String value) {
        usernameInput.shouldBe(Condition.visible).setValue(value);
        return this;
    }

    @Step("Entered password")
    public AuthPage enterPasswordValue(String value) {
        passwordInput.shouldBe(Condition.visible).setValue(value);
        return this;
    }

    @Step("Clicked authorize button")
    public AuthPage clickAuthorizeButton() {
        authorizeButton.shouldBe(Condition.visible).click();
        return this;
    }
}
