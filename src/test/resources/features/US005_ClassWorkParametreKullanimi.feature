Feature: US1009 BlueRentACar Login

  Scenario: TC11 kullanici gecerli bilgilerle giris yapar
    Given Kulanici "brcUrl" ana sayfasina gider
    And Kullanici 2 saniye bekler
    Then Login yazisina tiklar
    And Kullanici 2 saniye bekler
    And Gecersiz username girer
    And Kullanici 2 saniye bekler
    And Gecersiz password girer
    And Kullanici 2 saniye bekler
    And Login butonuna basar
    And Kullanici 2 saniye bekler
    Then Sayfaya giris yapilamadigini kontrol eder
    And Kullanici sayfayi kapatir
