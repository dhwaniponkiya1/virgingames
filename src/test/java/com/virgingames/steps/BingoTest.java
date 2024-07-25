package com.virgingames.steps;

import com.virgingames.pages.BingoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BingoTest {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @Then("Verify that I should be navigate to bingo page successfully")
    public void verifyThatIShouldBeNavigateToBingoPageSuccessfully() {
        Assert.assertEquals(new BingoPage().getTextFromBingoTitle(), "Online Bingo Games", "Navigation failed on bingo page");
    }

    @When("I select necessary cookies only option")
    public void iSelectNecessaryCookiesOnlyOption() {
        new BingoPage().clickOnNecessaryCookiesButton();
    }
}
