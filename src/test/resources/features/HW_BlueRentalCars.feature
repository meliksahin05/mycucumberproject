@blueRental
Feature: BlueRental
   Background: user navigates to bluerentalcars
     Given user navigates to "https://www.bluerentalcars.com/login"
  Scenario Outline: BlueRental Login
    Given user navigates to "https://www.bluerentalcars.com/login"
    When user navigates to the "<login page>"


