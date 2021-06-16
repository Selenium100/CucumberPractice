Feature: Home Page
In order to check my ordered details
As resistered user
I want to specify the features of order details page.


Background: 
Given User is on Amazon Login Page
When User is entered user details
Then User is entered password details
And User is clicked login Button
Then User navigate to order page

Scenario: Check the previous oder details
Then User is clicked on Previous order details
And user clicks on order link
Then User checks the previous orders

Scenario: Check the open oder details
Then User is clicked on open oder details
And user clicks on order link
Then User checks the open oder


Scenario: Check the cancelled oder details
Then User is clicked on cancelled oder details
And user clicks on cancelled oder link
Then User checks the cancelled oder



