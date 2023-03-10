Feature: US1001 Kullanici amazonda arama yapar
  @ilk
  Scenario: TC02 kullanici Amazonda Java aratir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Java yazip aratir
    When arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir


  @ilk
  Scenario: TC03 kullanici amazonda Apple aratir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna apple yazip aratir
    When arama sonuclarinin apple icerdigini test eder
    And sayfayi kapatir