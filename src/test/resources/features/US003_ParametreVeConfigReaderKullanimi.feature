Feature: Parametre Kullanimi


  Scenario: TC01 Parametre kullaniminda ConfigRedaer kullanimi
    Given Kullanici "faceUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url'in "facebook" icerdigini test edin
    And Sayfayi kapatir


  Scenario: TC02 Parametre kullaniminda ConfigRedaer kullanimi
    Given Kullanici "googleUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url'in "google" icerdigini test edin
    And Sayfayi kapatir


  Scenario: TC01 Parametre kullaniminda ConfigRedaer kullanimi
    Given Kullanici "brcUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url'in "blue" icerdigini test edin
    And Sayfayi kapatir


  Scenario: TC03 Parametre kullaniminda ConfigRedaer kullanimi
    Given Kullanici "amznUrl" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url'in "amazon" icerdigini test edin
    And Sayfayi kapatir