Feature: Validating the Admin Functionality


Scenario: Add new User in User Management
Given Select Admin
And Select User Management and click on user
When Click on Add and filling the details of user
And Click on Save User
Then User validate the saved successfully

Scenario: Searching for Added User in User Management
Given Select Admin
And Select User Management and click on user
When User Enter the Search Details 
And User Click the Search Btn
Then User Check Weather New user Added or not

Scenario: Checking the Functionality of Job Title in Job
Given Select Admin
And Select Job and click on Job Title
When Click on Add and filling the details
And Click on Save Job Title
Then User validate the saved Successfully

Scenario: Checking the functionality Pay Grades in Job
Given Select Admin
And Select Job and click on Pay Grades
When Click on Add and filling the details
And Click on Save Pay Grades
Then User validate the saved successfully 
When Successfully added go for search and and the delete the user
Then Validate weather the user deleted Successfully

Scenario: Checking the functionality of General Informationf in Organization
Given Select Admin
When Click on Organization and select General Informationf
And Click on Edit and fill the details 
Then Take screeshotUser succesfully

Scenario: Checking the functionality of Location in Organization
Given Select Admin
When Click on Organization and select Location
And Click on Add and fill the details 
Then User validate the saved successfully

Scenario: Searching the user by selecting the Location in Organization
Given Select Admin
When Click on Organization and select Location
And User Click the Search Btn
Then get the user and validate the user by it location 

Scenario: Checking the functionality of Skills in Qualification
Given Select Admin
When Click on Qualification and select Skills
And Click on Add fill the details 
Then validate the saved successfully

Scenario: Checking the functionality of Help
Given Select Admin
And Select User Management and click on user
When Click on Help
Then validate Help function working fine or not