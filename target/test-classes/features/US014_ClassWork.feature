
Feature:  US014 Class Work


  Scenario: Kullanici ve Url Tetsi

    Given Kullanici "webUrl"adresine gider
    Then Kullanici Login Portala kadar asagi iner
    And Kullanici Login Portala tiklar
    And Kullanici diger windowa gecer
    And Kullanici "username" kutusuna bilgileri girer
    And Kullanici "password" kutularina bilgileri girer
    And Kullanici login butonuna basar
    And Kullanici Popup'ta cikan yazinin validation failed oldugunu test eder
    And Kullanici Ok diyerek Popupi kapatir
    And Kullanici ilk sayfaya geri doner
    And Kullanici ilk sayfaya donuldugunu test eder
    And Sayfayi kapatir