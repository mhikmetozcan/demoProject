package com.devPayever.staging.stepDefinitions;

import com.devPayever.staging.pages.FashionPage;
import com.devPayever.staging.utilities.ConfigurationReader;
import com.devPayever.staging.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class signUpForFashionSteps {

    FashionPage fashionPage = new FashionPage();

    @Given("user is on the {string} page")
    public void user_is_on_the_page(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("baseURL") + string);
    }

    @When("user enters {string} as {string}")
    public void userEntersAs(String fieldName, String fieldValue) {
        fashionPage.dataEntrytoInputBox(fieldName, fieldValue);
    }

    @And("user confirms {string} as {string}")
    public void userConfirmsAs(String arg0, String arg1) {
    }

    @And("user clicks on {string} button")
    public void userClicksOnButton(String arg0) {
    }
}
