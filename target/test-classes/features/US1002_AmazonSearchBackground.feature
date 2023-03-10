Feature: US1002 kullanici background kullanarak amazonda arama yapar

  Background:
    Given kullanici amazon anasayfaya gider


  Scenario: TC04 Kullanici amazonda Nutella aratir
    Then amazon arama kutusuna Nutella yazip aratir
    And arama sonuclarinin Nutella icerdigini test eder
    Then sayfayi kapatir


  Scenario: TC05 kullanici Amazonda Java aratir
    Then amazon arama kutusuna Java yazip aratir
    When arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir

  Scenario: TC06 kullanici amazonda Apple aratir
    Then amazon arama kutusuna apple yazip aratir
    When arama sonuclarinin apple icerdigini test eder
    And sayfayi kapatir