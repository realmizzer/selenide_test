package org.example.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HeaderElement {

    public SelenideElement header = $("header");
    public SelenideElement homeLink = header.$x(".//a[@href='/']");
    public SelenideElement catalogLink = header.$x(".//a[@href='/browse']");
    public SelenideElement roomsLink = header.$x(".//a[@href='/game']");
    public SelenideElement profileLink = header.$x(".//a[@href='/profile']");

    @Step("Pressed Catalog Link in header")
    public HeaderElement clickCatalogLink() {
        catalogLink.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Pressed Profile Link in header")
    public HeaderElement clickProfileLink() {
        profileLink.shouldBe(Condition.visible).click();
        return this;
    }

}
