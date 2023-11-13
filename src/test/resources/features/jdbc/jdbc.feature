Feature: jdbc_feature
  @user_login
  Scenario: TC01_read_customer_login_info
    Given user connects to the application database
    And user gets the column "*" from the table "jhi_user"
    And read all the column "login" data