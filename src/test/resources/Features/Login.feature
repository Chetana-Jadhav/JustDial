Feature: Login Related Test cases
  @SignUP
  Scenario: 1. User is able to Sign up in the application
    Given User navigates to the application url "https://www.justdial.com/"
    When User clicks on Sign up link at the top right corner of the application
    And User enters name as "Chetana" and Phone number as "7066089027" and clicks on Submit Button
    Then User is displayed with the message as "OTP is sent on number"

    @ValidateErrorMessage
    #Negative Scenario, to check error messages thrown by application
  Scenario: 2. User receives an error message when tries to enter incorrect mobile number in the Login pop up
    Given User navigates to the application url "https://www.justdial.com/"
    When User clicks on Login-in link at the top right corner of the application
    And User enters name as "Chetana" and Phone number as "1234567890" and clicks on Send OTP Button
    Then User gets error message as "Please Enter valid Mobile number!"

      @ErrorMsgForBlankName
    #Negative Scenario, to check error messages thrown by application
  Scenario: 3. User receives an error message when tries to enter incorrect name in the Login pop up
    Given User navigates to the application url "https://www.justdial.com/"
    When User clicks on Login-in link at the top right corner of the application
    And User do not enter any name and phone number but clicks on Submit Button
    Then User gets error message as "Please enter a valid name !!"

        @MobileNumberValidate
    # Hint: Check the Max length of the Mobile field in the Then Step using Selenium get attribute method
  Scenario: 4. User is able to enter only 10 digits in the Mobile Text box
    Given User navigates to the application url "https://www.justdial.com/"
    When User clicks on Login-in link at the top right corner of the application
    Then User is able to enter only "10" digits in the Mobile text field