@Web
Feature: As a user, i have be able to search the product so that i can see the detail of product

  @DetailProduct
  Scenario Outline: As a user, i have be able to search the product, then see the detail
    Given user on tokopedia homepage
    When user search product "<name>"
    And user click product on the top right
    Then user see detail of product

    Examples:
    |name|
    |laptop asus  |
    |laptop hp    |
    |laptop lenovo|
