package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenuPage extends Utility {
    private static final Logger log = Logger.getLogger(TopMenuPage.class);

    @CacheLookup
    @FindBy(xpath = "//div[@class='StyledNavigationMenuWrapper-sc-v46bks-0 jLmDjy']//li")
    List<WebElement> topMenu;

    public void selectMenu(String menu) {
        log.info("Click on " + menu);

        List<WebElement> topMenuList = topMenu;
        for (WebElement e : topMenuList) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }

    }
}
