
  @contact_list_datatables
  Feature: User can open an account and add contacts

  Scenario: Open account and Add contacts
    Given user navigates to "https://thinking-tester-contact-list.herokuapp.com/"
    When user clicks on sign up button
    And user enters firstname "John"
    And user enters lastname "Doe"
    And user enters email "john.123@doe.com"
    And user enters password "John.123"
    And user clicks on submit button

    Given click on add a new contact button and fill the form and click submit
      | John  | Doe  | 2000-01-01 | john@doe.com   | 1234567890 | street1         | street2 | Long Island | stateProvince1 | 567 | USA    |
      | Mary  | Star | 2000-01-01 | mary@gmail.com | 1234567890 | street istanbul | street2 | istanbul    | Besiktas       | 123 | Turkey |
      | Ali   | Star | 2000-01-01 | mary@gmail.com | 1234567890 | street istanbul | street2 | istanbul    | Besiktas       | 123 | Turkey |
      | Harry | Star | 2000-01-01 | mary@gmail.com | 1234567890 | street istanbul | street2 | istanbul    | Besiktas       | 123 | Turkey |
      | Terry | Star | 2000-01-01 | mary@gmail.com | 1234567890 | street istanbul | street2 | istanbul    | Besiktas       | 123 | Turkey |
