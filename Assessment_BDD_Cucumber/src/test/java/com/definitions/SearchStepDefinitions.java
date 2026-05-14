package com.definitions;

import org.testng.Assert;

import com.actions.SearchActions;
import com.utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinitions {

    SearchActions searchActions;

    String keyword;

    @Given("User is on the home  page")
    public void user_is_on_the_home_page() {

        HelperClass.setDriver();

        HelperClass.openPage("https://tutorialsninja.com/demo/");

        searchActions = new SearchActions();
    }

    @When("User searches for {string}")
    public void user_searches_for(String keyword) {

        this.keyword = keyword;

        searchActions.enterProduct(keyword);

        searchActions.clickSearch();
    }

    @Then("Search result should {string} the keyword")
    public void search_result_should_the_keyword(String resultStatus) {

        String pageSource = HelperClass.getDriver().getPageSource().toLowerCase();

        if (resultStatus.equalsIgnoreCase("contain")) {

            Assert.assertTrue(
                    pageSource.contains("products meeting the search criteria"),
                    "Product not found");

        } else {

            Assert.assertTrue(
                    pageSource.contains("there is no product that matches the search criteria"),
                    "Unexpected product is displayed");
        }

        HelperClass.teardown();
    }
}