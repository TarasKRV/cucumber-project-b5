package io.loop.step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.DocuportLoginPage1;
import io.loop.pages.HomePage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DocuportLoginLogoutStepdefs {


    DocuportLoginPage1 docuportLoginPage = new DocuportLoginPage1();
    HomePage homePage = new HomePage();




    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("docuportBETA"));
    }

    @When("user enters username for client")
    public void user_enters_username_for_client() {
        BrowserUtils.waitForClickable(docuportLoginPage.loginButton, DocuportConstants.MEDIUM);
        assertTrue("Login button is not visible", docuportLoginPage.loginButton.isDisplayed());
        docuportLoginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);

    }

    @And("user enters password for client")
    public void user_enters_password_for_client() {
        docuportLoginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);

    }

    @And("user clicks login button")
    public void user_clicks_login_button() throws InterruptedException {
        Thread.sleep(2000);
        docuportLoginPage.loginButton.click();

    }

    @Then("user should be able to see the home page for client")
    public void user_should_be_able_to_see_the_home_page_for_client() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(homePage.leadsContentText());
        assertTrue("Home element is not visible", homePage.homeElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.receivedElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.myUploadsElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.invitationsElement.isDisplayed());


    }

    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
        BrowserUtils.waitForClickable(docuportLoginPage.loginButton, DocuportConstants.MEDIUM);
        assertTrue("Login button is not visible", docuportLoginPage.loginButton.isDisplayed());
        docuportLoginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);


    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() throws InterruptedException {
        docuportLoginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);

    }

    @And("user clicks login button like employee")
    public void user_clicks_login_button_like_employee() throws InterruptedException {
        Thread.sleep(2000);
        docuportLoginPage.loginButton.click();
    }
    @Then("user should be able to see the home page for employee")
    public void user_should_be_able_to_see_the_home_page_for_employee() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue("Home element is not visible", homePage.homeElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.receivedElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.myUploadsElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.clientsElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.usersElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.bookkeepingElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.formElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.reconciliationsElement.isDisplayed());

    }




    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {
        BrowserUtils.waitForClickable(docuportLoginPage.loginButton, DocuportConstants.MEDIUM);
        assertTrue("Login button is not visible", docuportLoginPage.loginButton.isDisplayed());
        docuportLoginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_ADVISOR);

    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {
        docuportLoginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }

    @And("user clicks login button like advisor")
    public void user_clicks_login_button_like_advisor() throws InterruptedException {
        Thread.sleep(2000);
        docuportLoginPage.loginButton.click();
    }

    @Then("user should be able to see the home page for advisor")
    public void user_should_be_able_to_see_the_home_page_for_advisor() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue("Home element is not visible", homePage.homeElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.receivedElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.myUploadsElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.clientsElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.invitationsElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.usersElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.leadsElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.bookkeepingElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.formElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.reconciliationsElement.isDisplayed());
    }




    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {
        BrowserUtils.waitForClickable(docuportLoginPage.loginButton, DocuportConstants.MEDIUM);
        assertTrue("Login button is not visible", docuportLoginPage.loginButton.isDisplayed());
        docuportLoginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);

    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {
        docuportLoginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);


    }
        @And("user clicks login button like supervisor")
        public void user_clicks_login_button_like_supervisor() throws InterruptedException {
            Thread.sleep(2000);
            docuportLoginPage.loginButton.click();

    }
    @Then("user should be able to see the home page for supervisor")
    public void user_should_be_able_to_see_the_home_page_for_supervisor() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue("Home element is not visible", homePage.homeElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.receivedElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.myUploadsElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.clientsElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.usersElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.leadsElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.bookkeepingElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.formElement.isDisplayed());
        assertTrue("Home element is not visible", homePage.reconciliationsElement.isDisplayed());
    }




    //=============================================================================


    @Given("user is on Docuport login page outline")
    public void user_is_on_docuport_login_page_outline() {
        Driver.getDriver().get(ConfigurationReader.getProperties("docuportBETA"));
    }
    @Then("user enters username for {string}")
    public void user_enters_username_for(String user) {
       switch (user.toLowerCase()) {
           case "client"    -> docuportLoginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_CLIENT);
           case "employee"  -> docuportLoginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);
           case "advisor"   -> docuportLoginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_ADVISOR);
           case "supervisor"-> docuportLoginPage.userNameInput.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);
           default -> throw new IllegalArgumentException("Invalid username entered: " + user);
       }
    }
    @Then("user enters password for {string}")
    public void user_enters_password_for(String password) {
        docuportLoginPage.passwordInput.clear();
        docuportLoginPage.passwordInput.sendKeys(DocuportConstants.PASSWORD);
    }
    @Then("user clicks login button outline")
    public void user_clicks_login_button_outline() throws InterruptedException {
        docuportLoginPage.loginButton.click();
        Thread.sleep(5000);
    }
    @Then("user should be able to see the home page for {string} with {string}")
    public void user_should_be_able_to_see_the_home_page_for_with(String user, String elements) {
        List<String> expectedElements = Arrays.stream(elements.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        List<String> actual = homePage.leadsContentText();
        assertEquals("Wrong elements in leads content", expectedElements, actual);
    }

    @When("user enters credentials")
    public void user_enters_credentials(Map<String,String> credentials) throws InterruptedException {

        docuportLoginPage.login(credentials.get("username"), credentials
                .get("password"));

    }
}
