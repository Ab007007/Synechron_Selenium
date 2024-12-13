Feature: Registration form
  Scenario: Register Users
    Given User is on FormyPage
    When user enter all required Fields
    And click on Submit button
    Then user validate successmessage
    And close the browser


  Scenario: Register New User
    Given User is on FormyPage
    When user enter FirstName, LastName,JobTitle
    And click on Submit button
    Then user validate successmessage
    And close the browser