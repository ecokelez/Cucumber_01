package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BRCStepDefinition {

    BrcPage brcPage = new BrcPage();


    @Given("Kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Kullanici Login yazisina tiklar")
    public void kullaniciLoginYazisinaTiklar() {
     brcPage.ilklogin.click();
    }

    @And("Kullanici {string} username girer")
    public void kullaniciUsernameGirer(String gecersizEmail ) {
        brcPage.email.sendKeys(gecersizEmail);
    }

    @And("Kullanici {string} password girer")
    public void kullaniciPasswordGirer(String gecersizPass) {
        brcPage.password.sendKeys(gecersizPass);
    }

    @And("Kullanici Login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
        brcPage.ikinciLogin.click();
    }

    @Then("Kullanici sayfaya giris yapilamadigini kontrol eder")
    public void kullaniciSayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.girisYapilamadi.isDisplayed());
    }

    @And("Kullanici  {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        try {
            Thread.sleep(istenenSure);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Kullanici  sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        //Driver.closeDriver();
    }
}
