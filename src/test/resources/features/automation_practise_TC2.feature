@testcase2
Feature: Automation practise 2
  Scenario: Gecersiz email ve password hatasi dogrulama
    Given user web sayfasinda
    And user sign in linkine tiklar
    And email kutusuna gecersiz email ve password yazar ve sign in butonuna  tiklar
    Then error mesajinin  Authentication failed. oldugunu dogrulayin



