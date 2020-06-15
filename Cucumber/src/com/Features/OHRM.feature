Feature: OrangeHRM Application LogIn Test

Scenario Outline: Validating the LogIn functionality of OrangeHRM Application

  To test the login functionality
  User should enter the LogIn details (with both valid and invalid test data)
  and should navigate to the next webpage
  
Given User should open the Chrome Browser and navigate to LogIn WebPage of the OrangeHRM Application
When User enters "<UserName>" UserName
Then User enters "<Password>" Password
Then User clicks on LogIn button
Then User "<Type>" able to LogIn Successfully and close the Application

Examples:
 | UserName  |  Password |  Type      |    
 | Admin     |  admin123 |  shouldbe  | 
 | Hello     |  Testing  |  shouldnot | 