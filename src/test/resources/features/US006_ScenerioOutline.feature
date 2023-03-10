Feature: US006 Kullanici amazonda istedigi kelimeleri aratir

  Scenario Outline: TC01 kullanici istedigi kelimeleri aratir

    Given Kullanici amazon sayfasina gider
    Then Kullanici "<istenenKelime>" icin arama yapar
    And Sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And Sayfayi kapatir

    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | Nutella       | Nutella              |
      | Selenium      | Selenium             |
      | SQL           | SQL                  |


     #TestNG deki dataProvider kullanimindaki gibi Cucumber'da da  Scenario Outline kullaniriz
    #Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz
  #Feature dosyasinda yazdigimiz komutta eger "" (Tirnak) kullanirsak stepDefinition da parametreli
  #bir method olusturur.Ve artik stepDefiniton'i kullanmadan Feature dosyasinda ""(Tirnak)
  #icindeki string'idegistirerek istedigim kelimeyi aratabilirim .
  #Scenario Outline da ise yine ""(Tirnak) icinde birden fazla kelime aratacaksam  "<>" seklindeki kullanim
  # ile "<>" icine yazdigim  herhangi bir kelimeyi  Scenario Outline'in asagida olusturdugu Examples
  #altinda aratmak istedigim kelimeleri yazar ve sirasiyla aratabiliriz


