Feature: Check Login with valid and invalid credentials

Scenario Outline: 
Given Login to Facebook Application
Then  Enter username "<Username>" to application
And   Enter password "<Password>"  to application
Then  click Login button
And   Verify user lands on home page or not


Examples: 
| Username | Password |
| Rinky | sjncjscnsjuc |
|Nitya | wwef3efefdwecwd |