
  Feature: US017 Class Work

    Scenario:TC01 Explicitly Wait

   Given Kullanici "demoqaUrl" adresine gider
    Then Kullanici Will enable bes  seconds butonunun enable olmasini bekler
    And Kullanici Will enable bes seconds butonunun enable oldugunu test eder
    And Sayfayi kapatir