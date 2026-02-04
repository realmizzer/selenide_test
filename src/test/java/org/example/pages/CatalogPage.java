package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class CatalogPage extends BasePage {

    public SelenideElement searchInput = mainSection.$("input[type='search']");

    public CatalogPage writeSearchInput(String text) {
        searchInput.shouldBe(Condition.visible);
        searchInput.setValue(text);
        return this;
    }

}
