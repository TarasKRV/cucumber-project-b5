package io.loop.step_definitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.WikipediaSearchPage;
import io.loop.utilities.DocuportConstants;
import io.loop.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class WikipediaStepDef {

    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();


    @Given("user is on Wikipedia search page")
    public void user_is_on_wikipedia_search_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @Given("user searching the following item")
    public void user_searching_the_following_item() {
        wikipediaSearchPage.searchbox.sendKeys("Steve Jobs");

    }

    @Given("user click on search button")
    public void user_click_on_search_button() {
        wikipediaSearchPage.searchButton.click();
    }

    @Then("user should be able to see Steve Jobs is in the wiki title")
    public void user_should_be_able_to_see_steve_jobs_is_in_the_wiki_title() {
        assertEquals("title is not visible", "Steve Jobs - Wikipedia", Driver.getDriver().getTitle());
    }

    @Then("user should be able to see Steve Jobs is in the main header")
    public void user_should_be_able_to_see_steve_jobs_is_in_the_main_header() {
        assertEquals("title is not visible", "Steve Jobs", wikipediaSearchPage.steveJobsMainTitle.getText());
    }

    @Then("user should be able to see Steve Jobs is in the image header")
    public void user_should_be_able_to_see_steve_jobs_is_in_the_image_header() {
        assertEquals("title is not visible", "Steve Jobs", wikipediaSearchPage.steveJobsImageHeader.getText());

    }
    @Given("user is on search page on Wikipedia")
    public void user_is_on_search_page_on_wikipedia() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @When("user searching the {string}")
    public void user_searching_the(String searchItems) {
        wikipediaSearchPage.searchbox.sendKeys( searchItems+ Keys.ENTER);
    }

    @Then("user should be able to see {string} as {string} on wiki page")
    public void user_should_be_able_to_see_as_on_wiki_page(String results, String title) {
        switch (results.toLowerCase()) {
            case "title":
                WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(DocuportConstants.MEDIUM));
                wait.until(ExpectedConditions.titleContains(title));
                String pagetitle = Driver.getDriver().getTitle();
                assertEquals("title is not match", title, pagetitle);
                break;
            case "main header":
                WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(DocuportConstants.MEDIUM));
                wait1.until(ExpectedConditions.titleContains(title));
                String pagetitle1 = wikipediaSearchPage.steveJobsMainTitle.getText();
                assertEquals("main header is not match", title, pagetitle1);
                break;
            case  "image header":
                WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(DocuportConstants.MEDIUM));
                wait2.until(ExpectedConditions.titleContains(title));
                String pagetitle2 = wikipediaSearchPage.steveJobsImageHeader.getText();
                assertEquals("image header is not match", title, pagetitle2);
        }

    }
}