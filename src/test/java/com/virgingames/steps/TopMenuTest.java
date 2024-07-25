package com.virgingames.steps;

import com.virgingames.pages.TopMenuPage;
import io.cucumber.java.en.And;

public class TopMenuTest {
    @And("I click on {string} from top menu")
    public void iClickOnFromTopMenu(String menu) {
        new TopMenuPage().selectMenu(menu);
    }
}
