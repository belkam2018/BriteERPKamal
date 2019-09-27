Feature: Job and Domain information functionality

  @Test03
 Scenario: User should login as a user


  Scenario Outline: my information data driven test with excel
    Given I am on the home page
    When User is on the login page as a user
    Then user should click on Note button
    And user should see "<tags>" and "<write>"


    Examples:
      | tags                        | write         |
      | Geologist I                 | epa.gov       |
      | Associate Professor         | 360.cn        |
      | Information Systems Manager | bbb.org       |
      | Sales Representative        | cdc.gov       |
      | Media Manager III           | bloglovin.com |
      | Social Worker               | go.com        |
      | Operator                    | dyndns.org    |


#    Structural Analysis Engineer
#    Information Systems Manager
#    Research Associate
#    Assistant Professor
#    Community Outreach Specialist
#    Safety Technician I
#    Paralegal
#    Human Resources Assistant II
#    Paralegal
#    Sales Associate
#    Automation Specialist IV
#    Teacher
#    Financial Analyst
#    Assistant Professor
#    Marketing Assistant
#    Staff Accountant IV
#    Database Administrator I
#    Analog Circuit Design manager
#    Nurse
#    Structural Engineer
#    Software Test Engineer III
#    Design Engineer
#    VP Product Management