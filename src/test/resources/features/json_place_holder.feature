#Author: Karolaynmazo@gmail.com

Feature: As QA Analyst
      I want to test the API CRUD of JsonPlaceHolder
      So that verify the quality of the api

  
  Scenario Outline: The Analyst want to test the GET path
    Given that the request service is made
    When testing the "GET" method with the following data
      | Id   |
      | <Id> |
    Then it check the result <Id>

  Examples:
    | Id | Code|
    |  2 |    200 |

@Segundo
  Scenario Outline: The Analyst want to test the GET path
    Given that the request service is made
    When testing the "POST" method with the following data
      | Title   | Body   |
      | <Title> | <Body> |
   Then it check the result with the code 201 and <Id>

  Examples:
      | Title     | Body                      | Id  |
      | New movie | New cinema and new movies | 101 |

  Scenario: The Analyst want to test the PATCH path
    Given that the request service is made
    When testing the "PATCH" method with the following data
      | Id   |
      | 1 |
    Then it check the result with the code 200 and 1
