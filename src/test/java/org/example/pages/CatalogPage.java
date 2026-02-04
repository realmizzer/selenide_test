package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class CatalogPage extends BasePage {

    public SelenideElement searchInput = mainSection.$("input[type='search']");

    @Step("Entered a text in search input")
    public CatalogPage enterSearchInput(String text) {
        searchInput.shouldBe(Condition.visible);
        searchInput.setValue(text);
        return this;
    }

}
