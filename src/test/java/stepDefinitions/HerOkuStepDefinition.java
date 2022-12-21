package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerOkuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class HerOkuStepDefinition {

    HerOkuPage herOkuPage = new HerOkuPage();

    @Given("Kullanici olarak {string} adresine gidin")
    public void kullaniciOlarakAdresineGidin(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("“Add Element” butonuna basin")
    public void addElementButonunaBasin() {
        herOkuPage.addElementButton.click();
    }

    @And("“Delete” butonu gorunur oluncaya kadar bekleyin")
    public void deleteButonuGorunurOluncayaKadarBekleyin() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herOkuPage.deleteButton));

        //=> ReusableMethods.waitForVisibility(herOkuPage.deleteButton,10);
    }

    @And("“Delete” butonunun gorunur oldugunu test edin")
    public void deleteButonununGorunurOldugunuTestEdin() {

        assert herOkuPage.deleteButton.isDisplayed();
        // herOkuPage.deleteButton.isDisplayed() sonuna . (nokta) koyarak
        //  yukaridaki gibi de  Assert True olarak kulanabiliriz

        //=> Assert.assertTrue(herOkuPage.deleteButton.isDisplayed());
    }

    @And("Delete butonuna basarak butonu silin")
    public void deleteButonunaBasarakButonuSilin() {
        herOkuPage.deleteButton.click();

    }


    @And("AddRemove Elements yazisinin gorunurlugunu test edin")
    public void addremoveElementsYazisininGorunurlugunuTestEdin() {

        assert herOkuPage.addRemoveElement.getText().equals("Add/Remove Elements");

        //=> Eger Assert Equals kullanacaksak ;
        // assert herOkuPage.addRemoveElement.getText().equals("Add/Remove Elements")
        // bu method sekli sadece true ve false (onune unlem koyarsak ) seklinde kullanılabilir.

    }


    @And("Delete butonunun gorunmedigini test edin")
    public void deleteButonununGorunmediginiTestEdin() {

        assert! herOkuPage.deleteButton.isDisplayed();

        //==>   Assert.assertFalse(herOkuPage.deleteButton.isDisplayed());

    }

    @And("Sayfayi kapatin")
    public void sayfayiKapatin() {
        Driver.closeDriver();
    }
}
