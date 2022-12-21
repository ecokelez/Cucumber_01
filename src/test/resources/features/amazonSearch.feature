

Feature: Amazon Search



    Scenario: TC01 Kullanici amazonda Nutella aratir

      Given Kullanici amazon sayfasina gider
      Then Kullanici Nutella aratir
      And Sonuclarin Nutella icerdigini test eder



      Scenario: TC02 Kullanici amazonda Selenium aratir
        Given Kullanici amazon sayfasina gider
        Then Kullanici Selenium icin arama yapar
        And Sonuclarin Selenium icerdigini test eder


    Scenario: TC03 Kullanici amazonda iphone aratir

      Given Kullanici amazon sayfasina gider
      Then Kullanici iphone icin arama yapar
      And Sonuclarin iphone icerdigini test eder
      And Sayfayi kapatir


