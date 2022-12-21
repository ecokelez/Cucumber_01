
Feature: US008 Scenario Outline Kullanimi
    Scenario Outline: TC11 kullanici gecerli bilgilerle giris yapar

    Given Kullanici "brcUrl" anasayfasina gider
    Then Kullanici Login yazisina tiklar
    And Kullanici "<gecersizEmail>" username girer
    And Kullanici "<gecersizPass>" password girer
    And Kullanici Login butonuna basar
    Then Kullanici sayfaya giris yapilamadigini kontrol eder
    And Kullanici  3 saniye bekler
    And  Kullanici  sayfayi kapatir

        Examples:
            | gecersizEmail | gecersizPass |
            | a@gmail.com   | 1234   |
            |  b@gmail.com  | 12345  |
            |  c@gmail.com  | 45799  |
            |  d@gmail.com  | 2568   |
            |  e@gmail.com  | 2568   |
