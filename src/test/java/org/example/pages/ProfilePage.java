package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class ProfilePage extends BasePage {

    public SelenideElement settingsTab = mainSection.$x(".//div/div[2]/div/div[1]/button[3]");
    public SelenideElement signOutButton = mainSection.$x(".//div[@role='tabpanel']/div/div[5]/div/button[2]");

    public ProfilePage clickSettingsTab() {
        settingsTab.shouldBe(Condition.visible).click();
        return this;
    }

    public ProfilePage clickSignOutButton() {
        signOutButton.shouldBe(Condition.visible).click();
        return this;
    }

}
