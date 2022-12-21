
    #Yeni bir test methoduolusturalim
    #https://the-internet.herokuapp.com/add_remove_elements/ adresinegidin
    #1)“Add Element” butonabasin
    #2)“Delete” butonu gorunur oluncaya kadarbekleyin
    #3)“Delete” butonunun gorunur oldugunu testedin
    #4)Delete butonuna basarak butonusilin
    #5)Delete butonunun gorunmedigini testedin


Feature: US010 ClassWork Calismasi

   Scenario:TC01 herokuapp sitesi buton tarama

    Given Kullanici olarak "herokuUrl" adresine gidin
    And “Add Element” butonuna basin
    And “Delete” butonu gorunur oluncaya kadar bekleyin
    And “Delete” butonunun gorunur oldugunu test edin
    And Delete butonuna basarak butonu silin
    And AddRemove Elements yazisinin gorunurlugunu test edin
    And Delete butonunun gorunmedigini test edin
    And Sayfayi kapatin


