
Feature: US012 Scenario Outline Kullanimi

  Scenario Outline: TC_18 Kullanici sutun basligi ile liste alabilmeli

    Given Kullanici  "guruUrl" ana sayfasinda
    And Kullanici "<Basliklar>" sutunundaki tum degerleri yazdirir
    Examples:
      | Basliklar |
      | Company |
      | Group |
      | Prev Close (Rs) |
      | Current Price (Rs)|
      | % Change |

    Scenario: Kullanici sayfayi kapatir
      Given Sayfayi kapatir