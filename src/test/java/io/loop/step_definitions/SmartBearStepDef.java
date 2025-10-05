package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.POM;
import io.loop.pages.SmartBearPage;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SmartBearStepDef {

    POM pages = new POM();
    private static final Logger LOGGER = LogManager.getLogger();


    @Given("user is already logged in and navigated to order page")
    public void user_is_already_logged_in_and_navigated_to_order_page() {
      Driver.getDriver().get(ConfigurationReader.getProperties("smartBear.url"));
      LOGGER.info("Navigated to order page");
      pages.getSmartBearPage().username.sendKeys("Tester");
      pages.getSmartBearPage().password.sendKeys("test");
      pages.getSmartBearPage().loginButton.click();
      pages.getSmartBearPage().orderButton.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        pages.getSmartBearPage().getWait().until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Order")));
      pages.getSmartBearPage().dropDown.click();
      pages.getSmartBearPage().getSelect("FamilyAlbum");
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
      pages.getSmartBearPage().quantityInput.clear();
      pages.getSmartBearPage().quantityInput.sendKeys("2");
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
      pages.getSmartBearPage().customerNameInput.clear();
      pages.getSmartBearPage().customerNameInput.sendKeys("Chuck Norris");
    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {
      pages.getSmartBearPage().streetInput.sendKeys("1100 Long way dr");
    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {
      pages.getSmartBearPage().cityInput.sendKeys("Chantilly");
    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {
        pages.getSmartBearPage().stateInput.sendKeys("Virginia");
    }
    @When("user enters zip {string}")
    public void user_enters_zip(String string) {
       pages.getSmartBearPage().zipInput.sendKeys("22011");
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
       pages.getSmartBearPage().cardInput.click();
    }
    @When("user enters credit car number {string}")
    public void user_enters_credit_car_number(String string) {
      pages.getSmartBearPage().cardNoInput.sendKeys("1111222233334444");
    }
    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String string) {
      pages.getSmartBearPage().expireDateInput.sendKeys("12/25");
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() throws InterruptedException {
      pages.getSmartBearPage().processButton.click();
    }
    @Then("user should see {string} in the first row of the table")
    public void user_should_see_in_the_first_row_of_the_table(String string) {
      pages.getSmartBearPage().allOrdersButton.click();

    }

}
