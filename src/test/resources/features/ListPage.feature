Feature: I can find a city inside a state

  @TestListPage
  Scenario Outline: Validate that a text is present inside the list
    Given I navigate to the list page
    When I search for <state> in the list
    Then I can find <city> in the list

    Examples:
      | state      | city                    |
      | California | Los Angeles, California |
      | Texas      | Houston, Texas          |
      | Florida    | Miami, Florida          |