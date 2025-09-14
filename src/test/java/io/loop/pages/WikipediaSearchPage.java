package io.loop.pages;


import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    public WikipediaSearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy (xpath = "//input[@id='searchInput']")
        public WebElement searchbox;

        @FindBy (xpath = "//i[text()='Search']")
        public WebElement searchButton;

        @FindBy (xpath = "//h1//span[@class='mw-page-title-main']")
        public WebElement steveJobsMainTitle;

        @FindBy (xpath = "//div[@class='fn']")
        public WebElement steveJobsImageHeader;

    }


