package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class HepsiBuradaStepDefinition {
    @Given("Kullanici {string} sayfasina girer")
    public void kullaniciSayfasinaGirer(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
}
