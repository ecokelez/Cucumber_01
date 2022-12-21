
 Feature: US018 Class Work

   Scenario: TC01 Explicitly Wait

     Given Kullanici "demoqaUrl" adresine gider
     Then Kullanici Visible After bes seconds butonunun gorunur olmasini bekler
     And Kullanici Visible After bes seconds butonunun gorunur oldugunu test eder
     And Sayfayi kapatir