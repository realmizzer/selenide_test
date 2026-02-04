package org.example.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.example.pages.CatalogPage;
import org.example.pages.MainPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTests extends BasePageTests {

    @Test
    void shouldTitleExists() {
        assertEquals("Home - AnimeEnigma", Selenide.title(), "Title doesn't equal to expected");
    }

    @Test
    void navbarButtonsExist() {
        MainPage mainPage = new MainPage();

        mainPage.headerElement.homeLink.shouldBe(Condition.visible);
        mainPage.headerElement.catalogLink.shouldBe(Condition.visible);
        mainPage.headerElement.roomsLink.shouldBe(Condition.visible);
    }

    @Test
    void shouldNavigateCatalogPageFromHomePageAndFindFrieren() {
        MainPage mainPage = new MainPage();
        CatalogPage catalogPage = new CatalogPage();

        mainPage.headerElement.clickCatalogLink();
        catalogPage.writeSearchInput("Frieren");
        catalogPage.searchInput.pressEnter();

        catalogPage.mainSection.$x(".//a[contains(@href, 'f0b40660-6627-4a59-8dcf-7ec8596b3623')]").shouldBe(Condition.visible);
    }

}
