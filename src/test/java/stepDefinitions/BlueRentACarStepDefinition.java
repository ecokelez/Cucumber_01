package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentACarStepDefinition {
    BrcPage brcPage = new BrcPage();


    @Given("Kulanici {string} ana sayfasina gider")
    public void kulaniciAnaSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }



    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.ilklogin.click();
    }

    @And("Gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.email.sendKeys(ConfigReader.getProperty("brcWrongEmail"));

    }

    @And("Gecersiz password girer")
    public void gecersizPasswordGirer() {
        brcPage.password.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        brcPage.ikinciLogin.click();

    }

    @Then("Sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.girisYapilamadi.isDisplayed());

    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }



}
