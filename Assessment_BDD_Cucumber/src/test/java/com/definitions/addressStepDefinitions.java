package com.definitions;

import java.util.Map;

import org.testng.Assert;

import com.actions.addressActions;
import com.utilities.HelperClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addressStepDefinitions {

    addressActions addressactions;

    @Given("User is logged into the application")
    public void user_is_logged_into_the_application() {

        HelperClass.setDriver();

        HelperClass.openPage("https://tutorialsninja.com/demo/");

        addressactions = new addressActions();

        addressactions.loginApplication();
    }

    @When("User adds a new address with following details")
    public void user_adds_a_new_address_with_following_details(DataTable dataTable) {

        Map<String, String> data =
                dataTable.asMap(String.class, String.class);

        addressactions.navigateToAddressBook();

        addressactions.enterAddressDetails(data);

        addressactions.clickContinue();
    }

    @Then("Address should be added successfully")
    public void address_should_be_added_successfully() {

        String message = addressactions.successMessage();

        Assert.assertTrue(
                message.contains("Your address has been successfully added"));

        HelperClass.teardown();
    }
}