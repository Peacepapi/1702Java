Feature: http://35.167.196.224/jenkins/ login
	As a registered user
	I can login
	To create jobs

Scenario: Login
	Given I am on the login page
	And I enter "jenkins" as the username
	And I enter "welcome1" as the password
	When I click login button
	Then I will be on the Jenkins homepage