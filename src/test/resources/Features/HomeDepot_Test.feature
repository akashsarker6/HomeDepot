Feature: Test Home Depot functionalities

  Background:
    Given User on the Home Page

  @Account_Profile
  Scenario: User Would to like to see the Account Profile

#    Given User on the Home Page
    And Click on My Account
    And Click on Sign in button
    When user enters email "asarker0420@gmail.com" and password "Idontknow0420@"
    And Click on Sign In
    And Click on Hello My Account
    And Click On Account Profile
    Then User should able to see the Account Profile

  @Electrical
  Scenario: User would like to see all the Electrical Items

    When User Mouse hover on All Departments
    And Click on Electrical
    Then User should open the Electrical Page


  @Husky
  Scenario: User would like to see Husky Items

    And Click on Husky
    Then User should able to see the Huskey page

  @Item_Details
  Scenario: User would like to see an Item Details

    And Click on the Search Bar
    When User would like to Search "Door Bell"
    And Click on Search Button
    And User Click on Wireless DoorBell Buttons
    And Click to Open a Hampton Bay
    Then User should able to see Item Details

  @LocalAdAndCatalog
  Scenario: User would like to see Local Ad & Catalog Page

    Given User on the Home Page
    And Click on Local Ad & Catalog
    Then User should see the Local Ad & Catalog Page

  @Help
  Scenario: User would like to see the Help Page

    Given User on the Home Page
    And Click on Help from HomePage
    Then User should able to see the Help


  @Paint
  Scenario: User would like to see Paint Page

    When User Mouse hover on All Departments
    And Click on Paint
    Then User should open the Paint Page

  @PrivacyAndSecurityCenter
  Scenario: User would like to see all Privacy and Security Center Options

    Given User on the Home Page
    And Click on Privacy and Security Center
    Then User should able to see Privacy and Security Page

  @Search
  @Positive_Test
  Scenario: User would like to Search An Item

    And Click on the Search Bar
    When User would like to Search "Door Bell"
    And Click on Search Button
    Then User should able to see the Search Item

  @DataDriven_Test
  Scenario Outline: Check Search Funtionality with valid Credential


    And Click on the Search Bar
    When User would like to Search "Door Bell"
    And Click on Search Button
    Then User should able to see the Search Item

    Examples:
      |search         |
      |Door Bell      |



#    ------------------------------------------ Note -------------------------------------------------

#  [ I finished Log In part as well , but at the very end when i am going run everything it wasn't working.
#    It's showing that "There have some technical error". so that i copy this sign in codes and put it to the
#    "Account Profile" class . ]

#    ----------------------------------------- Note --------------------------------------------------

#  @SignIn_Page
#  @positive_test
#  Scenario: Sign in to the HomeDepot Account
#
#    And Click on My Account
#    And Click on Sign in button
#    When user enters email "akashsarker6@gmail.com" and password "Idontknow0420@"
#    And Click on Sign In
#    Then user is navigated to home page

#
#  @dataDriven_test
#  Scenario Outline: Check login is successful with valid credentials
#
#    And Click on My Account
#    And Click on Sign in button
#    When user enters email "<email>" and password "<password>"
#    And Click on Sign In
#    Then user is navigated to home page
#
#    Examples:
#      |email                    |password         |
#      |asarker0420@gmail.com    |Idontknow0420@   |



  @Store_Location
  Scenario: User would like to see Store Location

    And Click on Store Location Arrow
    And Click on Find Location Button
    Then User should see the Store location
