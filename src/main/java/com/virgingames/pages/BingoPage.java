package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BingoPage extends Utility {
    private static final Logger log = Logger.getLogger(BingoPage.class);

    @CacheLookup
    @FindBy(xpath = "//h2[text() = 'Online Bingo Games']")
    WebElement title;

    @CacheLookup
    @FindBy(xpath = "//label[text() = 'Necessary cookies only']")
    WebElement necessaryCookiesButton;


    public String getTextFromBingoTitle() {
        log.info("Getting text from " + title.getText().toString());
        return getTextFromElement(title);
    }

    public void clickOnNecessaryCookiesButton() {
        log.info("Click on " + necessaryCookiesButton.getText().toString());
        clickOnElement(necessaryCookiesButton);
    }


}
