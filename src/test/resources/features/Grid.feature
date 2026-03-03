@grid
Feature: test different actions on the Static Table page

  Rule: The user can return values from the table and validate them

    Background: Navigate to table web app.
      Given I navigate to the static table

    @Test
    Scenario: As a test Engineer, I want to retrieve the value of an static table.
      Then I can return the value I wanted

    @Test1
    Scenario: As a test Engineer, I want to validate the static table is displayed.
      Then I can validate the table is displayed