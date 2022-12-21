package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebDUPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;

public class WebDUStepDefinition {
    WebDUPage web = new WebDUPage();
    Actions actions = new Actions(Driver.getDriver());

    ArrayList<String> windows;
    String ilkWindow;


    @Given("Kullanici {string}adresine gider")
    public void kullaniciAdresineGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Kullanici Login Portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() {
        ilkWindow = Driver.getDriver().getCurrentUrl();
        actions.sendKeys(Keys.PAGE_DOWN).perform();


    }

    @And("Kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
        web.loginPortal.click();

    }

    @And("Kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
        windows = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(1));
    }

    @And("Kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String username) {
        web.userName.sendKeys(username);
    }

    @And("Kullanici {string} kutularina bilgileri girer")
    public void kullaniciKutularinaBilgileriGirer(String password) {
        actions.sendKeys(Keys.TAB).sendKeys(password).perform();
    }

    @And("Kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
    }

    @And("Kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
       String actualPopupText = Driver.getDriver().switchTo().alert().getText();
       String expectedPopupText = "validation failed";
        Assert.assertEquals(expectedPopupText,actualPopupText);

    }

    @And("Kullanici Ok diyerek Popupi kapatir")
    public void kullaniciOkDiyerekPopupiKapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }

    @And("Kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
        Driver.getDriver().switchTo().window(windows.get(0));
    }

    @And("Kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ilkWindow);
    }
}
