Feature: Booking a hotel in Adactin wen Application

@Reg
Scenario Outline: TC01 User Login Page with valid username and password

Given User launch Adactin Web Application
When User enter valid "<username>" and "<password>"
And User clicks login Button
Then Search hotel Page is displayed

Examples:

|username|password|
|Naveenprasad2095|N@veen123|


@Sanity
Scenario Outline: TC02 User Login Page with invalid username and password

Given User launch Adactin Web Application
When User enter valid "<username>" and "<password>"
And User clicks login Button
Then verify error msg is displayed

Examples:

|username|password|
|Naveenprasad209|N@veen12|

@E2E
Scenario Outline: TC03_User Search hotel 
Given User launch Adactin Web Application
When User enter valid "<username>" and "<password>"
And User clicks login Button
Then User verify seach hotel page is displayed
When User Selects the "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
And User clicks Search Button  
Then User select hotel page is displayed

Examples:

|username        |password |Location|Hotels        |Room Type|Number of Rooms|Check In Date|Check Out Date|Adults per Room|Childs per room|First Name|Last Name|Billing Address|Credit Card No|Credit Card Type|Select Month|Select year|CVV No| 
|Naveenprasad2095|N@veen123|Sydney  |Hotel Sunshine  |Double   |2 - Two        |22/05/2022   |23/05/2022  |2 - Two        |2 - Two       |Naveen|Prasad|Coimbatore|6557354135344668|VISA|March|2022|236|

@E2E @Sanity
Scenario Outline: TC04_User Select hotel 
Given User launch Adactin Web Application
When User enter valid "<username>" and "<password>"
And User clicks login Button
Then User verify seach hotel page is displayed
When User Selects the "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
And User clicks Search Button  
When User select hotel by clicking the radio Button and continue Button
Then Book hotel page is displayed

Examples:

|username        |password |Location|Hotels        |Room Type|Number of Rooms|Check In Date|Check Out Date|Adults per Room|Childs per room|First Name|Last Name|Billing Address|Credit Card No|Credit Card Type|Select Month|Select year|CVV No| 
|Naveenprasad2095|N@veen123|Sydney  |Hotel Sunshine  |Double   |2 - Two        |22/05/2022   |23/05/2022  |2 - Two        |2 - Two       |Naveen|Prasad|Coimbatore|6557354135344668|VISA|March|2022|236|


@E2E @Reg
Scenario Outline: TC05_User enters appropriate details  
Given User launch Adactin Web Application
When User enter valid "<username>" and "<password>"
And User clicks login Button
Then User verify seach hotel page is displayed
When User Selects the "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
And User clicks Search Button  
When User select hotel by clicking the radio Button and continue Button
Then Book hotel page is displayed
When User enters the valid "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Select Month>","<Select Year>","<CVV No>"
And User clicks BookNow Button
Then User Booking confirmation page is displayed


Examples:

|username        |password |Location|Hotels        |Room Type|Number of Rooms|Check In Date|Check Out Date|Adults per Room|Childs per room|First Name|Last Name|Billing Address|Credit Card No|Credit Card Type|Select Month|Select year|CVV No| 
|Naveenprasad2095|N@veen123|Sydney  |Hotel Sunshine  |Double   |2 - Two        |22/05/2022   |23/05/2022  |2 - Two        |2 - Two       |Naveen|Prasad|Coimbatore|6557354135344668|VISA|March|2022|236|

@Reg @sanity
Scenario Outline: TC06_User Booking confirmation 
Given User launch Adactin Web Application
When User enter valid "<username>" and "<password>"
And User clicks login Button
Then User verify seach hotel page is displayed
When User Selects the "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
And User clicks Search Button  
When User select hotel by clicking the radio Button and continue Button
Then Book hotel page is displayed
When User enters the valid "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>","<Select Month>","<Select Year>","<CVV No>"
And User clicks BookNow Button
Then User Booking confirmation page is displayed
Then User prints orderid


Examples:

|username        |password |Location|Hotels        |Room Type|Number of Rooms|Check In Date|Check Out Date|Adults per Room|Childs per room|First Name|Last Name|Billing Address|Credit Card No|Credit Card Type|Select Month|Select year|CVV No| 
|Naveenprasad2095|N@veen123|Sydney  |Hotel Sunshine  |Double   |2 - Two        |22/05/2022   |23/05/2022  |2 - Two        |2 - Two       |Naveen|Prasad|Coimbatore|6557354135344668|VISA|March|2022|236|



