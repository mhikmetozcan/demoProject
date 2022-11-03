Feature: Register for fashion page

  Background: User navigates to fashion sign up page
    Given user is on the "fashion" page

  Scenario: Verify user can see the required apps on the dashboard upon registry
    When user enters "firstName" as "testName"
    And user enters "lastName" as "testLastName"
    And user enters "email" as "test@test.com"
    And user enters "password" as "Test1234."
    And user enters "password confirmation" as "Test1234."
    And user clicks on "Sign up for free" button