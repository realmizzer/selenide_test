package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.elements.HeaderElement;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public final HeaderElement headerElement = new HeaderElement();
    public final SelenideElement mainSection = $("main");

}
