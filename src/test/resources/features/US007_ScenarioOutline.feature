
@All

Feature: US007 Scenario Outline Kullanimi


  Scenario Outline: TC01 ConfigReader ile Outline Kullanimi
    Given Kullanici "<arananUrl>" sayfasina gider
    Then Kullanici 3 saniye bekler
    When Url'in "<arananKelime>" icerdigini test edin
    And Sayfayi kapatir

    Examples:
      | arananUrl | arananKelime |
      | amznUrl   | amazon |
      | faceUrl   | face |
      | brcUrl    | blue |
      | googleUrl | google |


    #Kapatmayı sona atamayiz , sayfa her acıldıgında kapanacak ve tekrar sayfa acılıp kapanacaktır


