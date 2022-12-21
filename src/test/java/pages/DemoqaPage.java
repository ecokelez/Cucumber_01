package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {

    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id='enableAfter']")
    public WebElement enableWE;

    @FindBy (xpath = "//*[@id='visibleAfter']")
    public WebElement visibleWE;

}
