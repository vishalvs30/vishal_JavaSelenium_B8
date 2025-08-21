Feature: check user is able to login with valid credetials
Scenario Outline: successful login
Given login page should be open in default browser
When click on login button and enter valid <username1> and <password1>
And click on signin button check <status>
Then login successfully and open home page
Examples:
|username1|password1|status|
|377328|password|fail|
|username|6hew897|fail|
|gjhj34|jhjjkk|fail|
|username|password|success|