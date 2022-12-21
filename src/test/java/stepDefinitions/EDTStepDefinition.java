package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.EDTPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EDTStepDefinition {

    EDTPage edtPage = new EDTPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }


    @Then("New butonuna basar")
    public void newButonunaBasar() {
       edtPage.newButton.click();
    }

    @And("Isim bolumune {string} girer")
    public void ısimBolumuneGirer(String firstname){
        edtPage.firstName.sendKeys(firstname);
    }

    @And("Soyisim bolumune {string} girer")
    public void soyisimBolumuneGirer(String lastname) {
        actions.sendKeys(Keys.TAB).sendKeys(lastname).perform();
    }

    @And("Position bolumune {string} girer")
    public void positionBolumuneGirer(String position) {
        actions.sendKeys(Keys.TAB).sendKeys(position).perform();
    }

    @And("Ofis bolumune {string} girer")
    public void ofisBolumuneGirer(String office) {
        actions.sendKeys(Keys.TAB).sendKeys(office).perform();
    }

    @And("Extension bolumune {string} girer")
    public void extensionBolumuneGirer(String extension) {
        actions.sendKeys(Keys.TAB).sendKeys(extension).perform();
    }

    @And("Startdate {string} girer")
    public void startdateGirer(String startDate) {
        actions.sendKeys(Keys.TAB).sendKeys(startDate).perform();
    }

    @And("Salary {string} girer")
    public void salaryGirer(String salary) {
        actions.sendKeys(Keys.TAB).sendKeys(salary).perform();
    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
    }

    @When("Kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        edtPage.searchBox.sendKeys(firstname);

    }

    @Then("Isim bolumunde {string} oldugunu dogrular")
    public void ısimBolumundeOldugunuDogrular(String isim) {
        Assert.assertTrue(edtPage.firstNameControl.getText().contains(isim));

    }



}
