Feature: US1003 kullanici Amazonda parametre olarak yazdigi kelimeyi aratir


  @ilk
  Scenario: TC07 kullanici parametre ile arama yaptirabilmeli

    Given kullanici amazon anasayfaya gider
    Then amazonda "Samsung" icin arama yapar
    And sonuclarin "Samsung" icerdigini test eder
    And 3 saniye bekler
    And sayfayi kapatir