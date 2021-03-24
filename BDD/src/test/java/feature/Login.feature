Feature: Login

Scenario: Succesfully login with valid credentials
Given User launch chrome browser
When User opens URL "https://www.typingclub.com/"	
And Click on login button		
And User enters email as "xxxxxxxxxxx" and password as "xxxxxxx"			
And Click on signin button		
Then Page url must be "https://www.typingclub.com/login.html"			
When User click on dropdown button	
Then User click on logout button		
And Page url should be "https://www.typingclub.com/sportal/#"