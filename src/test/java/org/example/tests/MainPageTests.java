package org.example.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.example.pages.CatalogPage;
import org.example.pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTests extends BasePageTests {

    @Test
    @DisplayName("Correct Home Page title")
    void shouldTitleExists() {
        assertEquals("Home - AnimeEnigma", Selenide.title(), "Title doesn't equal to expected");
    }

    @Test
    @DisplayName("Buttons for navigation exist in header")
    void navbarButtonsExist() {
        MainPage mainPage = new MainPage();

        mainPage.headerElement.homeLink.shouldBe(Condition.visible);
        mainPage.headerElement.catalogLink.shouldBe(Condition.visible);
        mainPage.headerElement.roomsLink.shouldBe(Condition.visible);
    }

    @Test
    @DisplayName("Navigation from Main Page to Catalog Page and find Frieren there with search input")
    void shouldNavigateCatalogPageFromHomePageAndFindFrieren() {
        MainPage mainPage = new MainPage();
        CatalogPage catalogPage = new CatalogPage();

        mainPage.headerElement.clickCatalogLink();
        catalogPage.enterSearchInput("Frieren");
        catalogPage.searchInput.pressEnter();

        catalogPage.mainSection.$x(".//a[contains(@href, 'f0b40660-6627-4a59-8dcf-7ec8596b3623')]").shouldBe(Condition.visible);
    }

}
