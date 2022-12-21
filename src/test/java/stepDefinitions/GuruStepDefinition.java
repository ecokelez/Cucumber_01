package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinition {

    GuruPage guru = new GuruPage();


    @Given("Kullanici  {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("Kullanici {string} sutunundaki tum degerleri yazdirir")
    public void kullaniciSutunundakiTumDegerleriYazdirir(String baslik) {

        int index = 0;
        //==> fori' yi  index ile kullanabilmek icin tercih ettik
        for (int i = 0; i < guru.baslikWE.size() ; i++) {

            if (guru.baslikWE.get(i).getText().equals(baslik)){ // Featuredan gelen string degeri degerine esitledik
                System.out.println(guru.baslikWE.get(i).getText()); //Featuredan gelen basligi yazdirdik

                index = i+1;  // Featuredan  gelen  i degerine esitledigimiz String'i ayni degere sahip sutunlarda
                //==> yazdirabilmek icin bos bir koyteynıra atadık.
                //Listte index 0 dan bas. icin ve WebTable locate'imiz 1 den bas. icin i degerini bir arttırdik

                List<WebElement> sutunWE = Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+index+"]"));

                //Sonrasinda WebTable' daki body'i locate edip esitledigimiz index'i baslik altindaki sutunu getirebilmesi
                // icin bu liste attık


                //=>  sutunWE.forEach(t-> System.out.println(t.getText()));
                //Lambda ve ya foreach ile de  ile sutunu yazdirdik

                for ( WebElement w:sutunWE) {
                    System.out.println(w.getText());
                }


            }

        }
    }





}
