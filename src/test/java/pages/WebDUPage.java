package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDUPage {
    public WebDUPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='LOGIN PORTAL']")
    public WebElement loginPortal;

    @FindBy (xpath = "//*[@id='text']")
    public WebElement userName;


}
