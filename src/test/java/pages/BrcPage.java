package pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement ilklogin;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy (xpath = "//*[@id='formBasicPassword']")
    public WebElement password;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement ikinciLogin;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement girisYapilamadi;


}
