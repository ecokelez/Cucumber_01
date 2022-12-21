Feature: Classwork Calismasi

  Scenario Outline: TC02 Kullanici data ekleyebilmeli

    When Kullanici "edtUrl" adresine gider
    Then New butonuna basar
    And Isim bolumune "<first name>" girer
    Then Kullanici 1 saniye bekler
    And Soyisim bolumune "<last name>" girer
    Then Kullanici 1 saniye bekler
    And Position bolumune "<position>" girer
    Then Kullanici 1 saniye bekler
    And Ofis bolumune "<ofis bilgisi>" girer
    Then Kullanici 1 saniye bekler
    And Extension bolumune "<extension>" girer
    Then Kullanici 1 saniye bekler
    And Startdate "<Start date>" girer
    Then Kullanici 1 saniye bekler
    And Salary "<Salary>" girer
    Then Kullanici 1 saniye bekler
    And Create tusuna basar
    When Kullanici "<first name>" ile arama yapar
    Then Isim bolumunde "<first name>" oldugunu dogrular


    Examples:
      | first name | last name | position | ofis bilgisi | extension | Start date | Salary |
      | Ersoy      | COKELEZ   | QA       | Amazon        | Senior   | 2022-12-17 | 20000 |
      | Ali        | COKELEZ   | QA       | Google        | Senior   | 2022-12-17 | 20000 |
      | Zafer      | COKELEZ   | QA       | Amazon        | Senior   | 2022-12-17 | 20000 |
      | Gokhan     | COKELEZ   | QA       | Facebook      | Senior   | 2022-12-17 | 20000 |
      | Emre       | COKELEZ   | QA       | Trendyol      | Senior   | 2022-12-17 | 20000 |

    #DataTableStepDefinition dosyasi ve gerekli step definition’lari olusturun ve 5 farkli kayit
    # ekleyin