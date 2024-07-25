package com.virgingames.steps;

import com.virgingames.pages.OnlineSlotsPage;
import com.virgingames.pages.TopMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class OnlineSlotsTest {
    @And("I Click On {string} Tab")
    public void iClickOnOnlineSlotsTab(String menu) {
        new TopMenuPage().selectMenu(menu);
    }

    @Then("I Verify Text {string}")
    public void iVerifyTextPlayOnlineSlotsAtVirginGames(String val) {
        Assert.assertEquals(new OnlineSlotsPage().getPlayOnlineSlotsAtVirginGamesTitle(),val);
    }
}
