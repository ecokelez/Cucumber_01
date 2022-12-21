
@demo
Feature: US015 ClassWork Calismasi

  Scenario: TC01 Alerts and Explicitly Wait


  Given Kullanici olarak "demoUrl" adresine gidin
    And Kullanici 3 saniye bekler
  Then Alertse tiklayin
  And On button click, alert will appear after bes seconds karsisindaki click me butonuna basin
  And Allert’in gorunur olmasini bekleyin
  And Allert uzerindeki yazinin This alert appeared after bes seconds oldugunu test edin
  And Ok diyerek alerti kapatin
