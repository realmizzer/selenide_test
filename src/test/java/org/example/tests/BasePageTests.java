package org.example.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BasePageTests {

    static final String BASE_URL = "https://animeenigma.ru/";
    String resultURL = BASE_URL;

    BasePageTests() {}

    BasePageTests(String path) {
        resultURL = BASE_URL + path;
    }

    @BeforeAll
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
    }

    @BeforeEach
    void setup() {
        Selenide.open(resultURL);
    }

}
