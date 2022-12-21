
@Background
Feature: US001 Background Kullanimi


  Background: Ortak adimlar
    Given Kullanici amazon sayfasina gider


  Scenario: TC01 Kullanici amazonda Nutella aratir

    Then Kullanici Nutella aratir
    And Sonuclarin Nutella icerdigini test eder


  Scenario: TC02 Kullanici amazonda Selenium aratir

    Then Kullanici Selenium icin arama yapar
    And Sonuclarin Selenium icerdigini test eder


  Scenario: TC03 Kullanici amazonda iphone aratir

    Then Kullanici iphone icin arama yapar
    And Sonuclarin iphone icerdigini test eder
    And Sayfayi kapatir


    #@Background  : Before methodu,  notasyonu gibi calisir
    #==> Scenario'larda  ortak olan adımları tek bir adımda kullanabiliriz

