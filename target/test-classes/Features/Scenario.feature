Feature: To Test the end to end functions of Orange HRM application
@one
Scenario Outline: To check the login page in HRM applcation

Given To launch the Orange HRM application URL
When To enter the value in username "<user>"
And To enter the value in password "<pass>"
And To click the login button
Examples: 
|user|pass|
|Admin|admin123|
|Admin234567|admin1230987654|
|Admin7777|admin123|