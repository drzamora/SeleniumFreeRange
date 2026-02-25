
Feature: SauceDemo Login

  @test1
  Scenario Outline: User logs in with valid credentials
    Given I am on the SauceDemo login page
    When I enter the username "<username>" and the password "<password>"
    And I click on the login button
    Then I should see the products page

    Examples:
      | username     | password     |
      | standard_user| secret_sauce |
      | visual_user  | secret_sauce |

@test2
Scenario: User adds products to the cart
  Given I am on the SauceDemo login page
  When I enter the username "standard_user" and the password "secret_sauce"
  And I click on the login button
  Then I should see the products page
  When I add the product "Sauce Labs Backpack" to the cart
  And I add the product "Sauce Labs Bike Light" to the cart
  Then the cart should contain 2 items