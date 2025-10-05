package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.dnd.DragSource;
import java.time.Duration;

public class SmartBearPage {

    private Select select;
    private WebDriverWait wait;

    public SmartBearPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public Select getSelect (String str) {
        select = new Select(dropDown);
        select.selectByVisibleText(str);
        return select;
    }
    public WebDriverWait getWait() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        return wait;
    }


       //Login page
       @FindBy (xpath = "//input[@id='ctl00_MainContent_username']")
       public WebElement username;


        @FindBy (xpath = "//input[@id='ctl00_MainContent_password']")
                public WebElement password;

        @FindBy(xpath = "//input[@id='ctl00_MainContent_login_button']")
                public WebElement loginButton;


        //Home order page
        @FindBy(xpath = "//a[text()='Order']")
                public WebElement orderButton;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantityInput;

    @FindBy(xpath = "//select[@name]")
    public WebElement dropDown;

    @FindBy(xpath = "//input[@id='//option[@value='FamilyAlbum']']")
    public WebElement familyAlbumInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement customerNameInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")
    public WebElement streetInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")
    public WebElement stateInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zipInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_cardList_2']")
    public WebElement cardInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")
    public WebElement cardNoInput;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")
    public WebElement expireDateInput;

    @FindBy(xpath = "//div[@class='buttons_process']//a")
    public WebElement processButton;


    @FindBy(xpath = "//a[@href='Default.aspx']")
    public WebElement allOrdersButton;


}

