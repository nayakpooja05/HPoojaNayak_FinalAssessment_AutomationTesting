Feature: HRM Login Test Case
Scenario: Verify user is able to login with valid user id and
password
  Given browser is open and application is in login page
  When user enters user name and password
  Then home page is displayed
	
Scenario: Apply for leave
	Given Click Leave element
	Then Click on Apply option
	Then Select leave type
	Then Choose the dates
	Then give the reason 
	Then click Apply button
	
Scenario: Search employee using username and also by employee name
	Given Click on Admin element
	Then Give Username as "Admin"
	Then Give Username as "Admin" and employeeName as "Pooja"
	

