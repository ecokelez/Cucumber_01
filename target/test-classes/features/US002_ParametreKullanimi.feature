
@parametre
Feature: US002 Parametre Kullanimi

  Background: Ortak adim
    Given Kullanici amazon sayfasina gider


  Scenario: TC01 Kullanici amazonda parametreli arama yapar

    Then Kullanici "Nutella" icin arama yapar
    And Sonuclarin "Nutella" icerdigini test eder
    And Sayfayi kapatir



  Scenario: TC02 Kullanici amazonda parametreli arama yapar

    Then Kullanici "Selenium" icin arama yapar
    And Sonuclarin "Selenium" icerdigini test eder
    And Sayfayi kapatir


  Scenario: TC03 Kullanici amazonda parametreli arama yapar

    Then Kullanici "Java" icin arama yapar
    And Sonuclarin "Java" icerdigini test eder
    And Sayfayi kapatir


  Scenario: TC04 Kullanici amazonda parametreli arama yapar

    Then Kullanici "SQL" icin arama yapar
    And Sonuclarin "SQL" icerdigini test eder
    And Sayfayi kapatir





    # Feature dosyasinda parametreli arama yaptigimizda ""(tirnak) icine aldigimiz degeri
    #==> StepDefinition'da 1 kere parametreli bir method olusturur ve yeni bir arama yapmak istedigimizde
    #==> yeni bir method olusturmadan feature dosyasindan ""(tirnak) icindeki ifadeyi degistirmemiz
    #==> yeterli olacaktir, boylece kodlarimiz dinamik olacaktir