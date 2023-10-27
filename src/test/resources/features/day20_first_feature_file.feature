Feature: google_search_feature
  Scenario: TC01_iphone_search
    Given user is on the google home page
    And user search for iPhone
    Then verify the result contains iPhone

#FEATURE FILE**********************************************************************
#  All feature files have .feature extensions
#  Feature files are written in Gherkin language
#  Feature files are used to create test scenarios / test cases
#  All feature files must begin with Feature: keyword.
#  One feature file can not have more than one Feature: keyword
#  Scenario keyword is used to create test cases
#  One feature file can have more than one Scenario keyword
#  Each step must begin with a Gherkin keyword : Given, And, When, Then, But, *
#STEP DEFINITIONS*******************************************************************
#  After we create our test Scenarios, we need to generate step definitions to write our code
#  Use Runner to generate the missing step definitions
#  Use the templates and add them in your step definitions folder
#  Then complete your java code using page object model

