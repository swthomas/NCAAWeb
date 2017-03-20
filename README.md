# Summary
A NCAA team management web-app built using SpringMVA. This was a required project designed to present basic programming skill with SpringMVC and the C.R.U.D. concept. The project was fairly straight forward though I did run into a couple problems when switching from a Maven project to Gradle. I also had some trouble working with the sessions attribute of SpringMVC and creating a new session for each user.  

## In This Document
1. [How to Execute](#how-to-execute)
2. [Class Structure Overview](#class-structure-overview)

## How to Execute
- The web-app is hosted on: insert URL <a href="http://35.162.216.236:8080/NCAAWeb/">**here**</a>

## Instructions
1. User arrives on landing page.
2. User can select a conference using the main buttons or there are more selections in the navigation bar.
3. Information is diplayed for the chosen conference or team.
4. User can navigate forwards or backwards when a team is selected. When user gets to the end or the beginning, arrows will take them back to the other end.
5. User can edit or delete teams as well as add new team at the bottom or the Teams list.

## Class Structure Overview
- The **CollegeController** class is the controller and interacts with the **CollegeDAOImpl** class which implements methods declared in the **CollegeDAO** interface. The college objects are constructed using information from the **College** class and accompanying .txt files.
- The **CollegeController** provides information back through a **.jsp** file for the user to view based on their selection throughout the page.

**example of back-button**
