package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath="//img[@alt='Docuport']")
    public WebElement logo;


    @FindBy (xpath="//button[@type='submit']")
    public WebElement continueButton;

    //CLIENT PAGE

    @FindBy(xpath = "//span[.='Home']")
    public WebElement homeElement;

    @FindBy(xpath = "//span[.='Received docs']")
    public WebElement receivedElement;

    @FindBy(xpath = "//span[.='My uploads']")
    public WebElement myUploadsElement;

    @FindBy(xpath = "//span[.='Invitations']")
    public WebElement invitationsElement;

    //EMPLOYEE PAGE

    @FindBy(xpath = "//span[.='Clients']")
    public WebElement clientsElement;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersElement;

    @FindBy(xpath = "//span[.='Bookkeeping']")
    public WebElement bookkeepingElement;

    @FindBy(xpath = "//span[.='1099 Form']")
    public WebElement formElement;

    @FindBy(xpath = "//span[.='Reconciliations']")
    public WebElement reconciliationsElement;

    //ADVISOR PAGE

    @FindBy(xpath = "//span[.='Leads']")
    public WebElement leadsElement;

    @FindBy(xpath = "//*[contains(@class, 'v-list-item__content')]")
    public List<WebElement> leadsContent;

    public List<String> leadsContentText(){
        return leadsContent.stream().map(e -> e.getText().trim()).filter(s -> !s.isEmpty()).collect(Collectors.toList());
    }

}