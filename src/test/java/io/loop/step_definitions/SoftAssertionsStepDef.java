package io.loop.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.POM;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertEquals;

public class SoftAssertionsStepDef {

    private static final Logger LOG = LogManager.getLogger();
    POM pages = new POM();


    @Then("user validates {string} text is displayed login")
    public void user_validates_text_is_displayed_login(String string) {

        pages.getLoginPage().loginTitle.isDisplayed();
        assertEquals("Login", pages.getLoginPage().loginTitle.getText());
        System.out.println("Login text is displayed as: " + pages.getLoginPage().loginButton.getText());

    }
    @Then("user validates {string} text is displayed docuport")
    public void user_validates_text_is_displayed_docuport(String string){

        pages.getHomePage().logo.isDisplayed();
        System.out.println("Docuport text is displayed: " + pages.getHomePage().logo.isDisplayed());


    }

    @When("user validates {string} text is displayed choose")
    public void user_validates_text_is_displayed_choose(String string) {
        pages.getLoginPage().chooseAccountText.isDisplayed();
        assertEquals("Choose account", pages.getLoginPage().chooseAccountText.getText());
        System.out.println("Choose account text is displayed as: " + pages.getLoginPage().chooseAccountText.getText());


    }



    @Then("user should be able to see the home for client")
    public void user_should_be_able_to_see_the_home_for_client() {

    }



}
