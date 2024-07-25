package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OnlineSlotsPage extends Utility {
    private static final Logger log = Logger.getLogger(OnlineSlotsPage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Play Online Slots at Virgin Games']")
    WebElement onlineSlotsTitle;

    public String getPlayOnlineSlotsAtVirginGamesTitle() {
        log.info("Getting text from " + onlineSlotsTitle.getText().toString());
        return getTextFromElement(onlineSlotsTitle);

    }
}
