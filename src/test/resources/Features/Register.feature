Feature: Nopcommerce Register
  Background:
    Given User able to open browser
    And enter the Url

    Scenario: Nopcommerce Register Test
      When user click on Register Link
      Then User on Register Page Verify Register Page Title
      And User click on Gender
      Then User Enter First Name
      Then User Enter Last name
      Then User Enter Birth of Date
      Then User Enter Valid Enail
      Then User Enter Company Name
      Then User Enter Password
      Then User Enter Confirm Password
      Then User is on complete Register Page
      And User Close the Browser



