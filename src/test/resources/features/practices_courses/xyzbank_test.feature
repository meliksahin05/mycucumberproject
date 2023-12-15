@XYZBank_Datatables
Feature: xyz bank test

  Scenario: xyz bank customer
    Given Go to url "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"
    When Click on Bank Manager Login button
    And Click on Add Customer button
    And Fill inputs and click on Add Customer form Accept alert
      | John  | Doe  | 123 |
      | Ali   | Can  | 567 |
      | Veli  | Han  | 987 |
      | Mary  | Star | 456 |
      | Harry | One  | 765 |

    #The rest is homework

#  Given
#  Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
#  When
#  Click on "Bank Manager Login" button
#  And
#  Click on "Add Customer" button
#  And
#  Fill inputs and click on "Add Customer" form
#  And
#  Accept alert
#  And
#  Add 4 more customers
#  And
#  Click on "Open Account"  button
#  And
#  Click on "Customer" dropdown
#  And
#  Select customer name
#  And
#  Click on "Currency" dropdown
#  And
#  Select "Dollar"
#  And
#  Click on "Process" button
#  And
#  Accept alert
#  And
#  Open 4 more accounts
#  And
#  Click on "Customers" button
#  And
#  Get last 5 customers' account numbers
#  Then
#  Assert that you created 5 accounts
#  When
#  Click on "Home" button
#  And
#  Click on "Customer Login" button
#  And
#  Click on "Your Name" dropdown
#  And
#  Select the any name you created
#  And
#  Click on "Login" button
#  And
#  Click on "Deposit" button
#  And
#  Type 100 into "Amount to be Deposited" input
#  And
#  Click on "Deposit"(Submit) button
#  Then
#  Assert that "Deposit Successful" is displayed
#  And
#  Click on "Withdrawal" button
#  And
#  Type 100 into "Amount to be Withdrawn" input
#  And
#  Click on "Withdraw"(Submit) button
#  Then
#  Assert that "Transaction  Successful" is displayed
#  When
#  Click on "Logout" button
#  And
#  Click on "Home" button
#  And
#  Click on "Bank Manager Login" button
#  And
#  Click on "Customers" button
#  And
#  Click on each "Delete" button
#  And
#  Count table row numbers
#  Then
#  Assert that number of customers is 0

