
Feature: US004 Parametre Kullanimi

  @gp6
  Scenario: TC01 Parametre Kullanimi
    Given Kullanici "https://www.hepsiburada.com" sayfasina girer
    Then Kullanici 3 saniye bekler
    When Url'in "hepsi" icerdigini test edin
    And Sayfayi kapatir