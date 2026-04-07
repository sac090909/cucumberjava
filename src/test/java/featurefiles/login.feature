Feature: Login Feature



Background: 

Given The user is at bank application login page

#Scenario: Login with valid user

#Given The user is checking user
#When User provide valid email "abc@gmail.com" and password "pa123"
#Then User gets login to the page


Scenario Outline: Login with different users

Given The user is checking user
When User provide valid <username> and <password>
Then User gets login to the page

Examples:
|username|password|
|user1|password1|
|user2|passwrod2|
