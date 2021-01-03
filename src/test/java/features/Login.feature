Feature: Application Login

Scenario: Home page default login
Given user is on NetBanking landing page
When user login into application with username "Aditee" and password "123"
Then home page is populated
And cards displayed are "True"


Scenario: Home page default login
Given user is on NetBanking landing page
When user login into application with username "Mrunmayee" and password "456"
Then home page is populated
And cards displayed are "False"