Feature: Get paypal testing

  Background:
    Then I am targeting the "https://api-m.sandbox.paypal.com" API
    Given the path has key "/v2/checkout/"

  @RunThis
  Scenario: 1- get an order detail
    Then The request URL has this field "order" with this value "51X10939337306740" as parameter
    Then I make a "GET" request to the API

