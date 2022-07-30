Feature: Tide website Functionality

Scenario Outline: Signup with Valid data
Given loading the website
When Click on Register
And Click on Signnow
Then Place <Firstname>and<Emial>and<Password>
And Click on Create an Account
Examples:
| Firstname  	| Email							| Password		|
| priyanka 		| priyankabijjam440@gmail.com  	| Priyanka@102	|


Scenario Outline: Signup with InValid data
Given loading the website
When Click on Register
And Click on Signnow
Then Place <Firstname>and<Emial>and<Password>
And Try to Click on Create an Account
Examples:
| Firstname  	| Email							| Password		|
| p942a 		| lavanta@g.com  				| ptue12		|


Scenario Outline: Login with Valid data
Given loading the website
When Click on Register
And Click on Signnow
And Click on Login
Then Enter <Emial>and<Password>
And Click on EndLogin
Examples:
| Email							| Password		|
| priyankabijjam440@gmail.com  	| Priyanka@102	|

Scenario Outline: Login with InValid data
Given loading the website
When Click on Register
And Click on Signnow
And Click on Login
Then Enter <Emial>and<Password>
And  Try to Click on EndLogin
Examples:
| Email							| Password		|
| lavanta@g.com  				| ptue12		|


Scenario: Searching functionality 

Given loading the website
When clicking the search button
And Enter the text in searchbox as "Hygienic"
Then check whether the text is present or not



Scenario: ShopProducts functionality 

Given loading the website
When Mouse hover on shopproducts
And Click on powder
And Check the text in page
Then Click on shopproducts
And Validate the text

Scenario: Whatsnew functionality 

Given loading the website
When Click on Whatsnew
And Click on new product in that page
Then Validate the text in page

Scenario: PandG functionality 

Given loading the website
When Click on PandG
And Mouse hover on ourbrands
Then Click on fragrenceingredients
And Checking the text


Scenario: Bounce functionality 

Given loading the website
When Click on Bounce
And Click on search and Enter the text "spray" in searchbox
Then Click on product
And Check the text in Bouncepage

Scenario: BBB functionality 

Given loading the website
When Click on BBB
Then Check the BBB Text in page