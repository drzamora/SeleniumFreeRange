@Amazon
Feature: Test Amazon search functionality

  @Cart
  Scenario Outline: As a Customer when I search for Alexa, I want to see if the third option on the second page is avalible for purchase and can be added to the cart.
    Given The user navigates to www.amazon.com
    And searches for <Product>
    And navigates to the page number "2"
    And selects the third item
    Then the user is able to add it to the cart

    Examples:
      | Product     |
      | Alexa       |
      | Playstation |