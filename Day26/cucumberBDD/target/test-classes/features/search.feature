Feature:Search in zeroBank
Scenario:search feature
Given login user and search button available
When enter <item> and then use keyboard enter key
Then List of output relevant to input
Examples:
  |item|
  | Online Banking|
  |Transfer Funds|
  |My Money Map|
 
