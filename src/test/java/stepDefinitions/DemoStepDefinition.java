package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import utilities.Driver;

import java.time.Duration;

public class DemoStepDefinition {

    DemoPage demoPage = new DemoPage();
    Actions actions = new Actions(Driver.getDriver());
    @Then("Alertse tiklayin")
    public void alertseTiklayin() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        demoPage.alertsButton.click();


    }

    @And("On button click, alert will appear after bes seconds karsisindaki click me butonuna basin")
    public void onButtonClickAlertWillAppearAfterBesSecondsKarsisindakiClickMeButonunaBasin() {
        demoPage.clickMe.click();
    }

    @And("Allert’in gorunur olmasini bekleyin")
    public void allertInGorunurOlmasiniBekleyin() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @And("Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test edin")
    public void allertUzerindekiYazininThisAlertAppearedAfterBesSecondsOldugunuTestEdin() {
        String expectedAlertWE = " This alert appeared after 5 seconds";
        String actualAlertWE =  Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedAlertWE,actualAlertWE);
    }

    @And("Ok diyerek alerti kapatin")
    public void okDiyerekAlertiKapatin() {
        Driver.getDriver().switchTo().alert().accept();
    }
}
