Feature: Ebay login Page 
@Priority1
Scenario Outline: Check for valid and invalid credentials 
Given login page should be open in default browser
When Email<username1>
And Password <password1>
Then login successfully and open home page
Examples:
|username1|password1|status|
|vishalvswami7@gmail.com|Ebay@140825|pass|
   