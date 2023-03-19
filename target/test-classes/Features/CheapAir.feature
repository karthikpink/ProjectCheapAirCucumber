#This is new featue file
Feature: This feature is the cheapair booking Scenarios

  Scenario: This scenario is to load cheap air website
    Given Launch browser and Load Url
    When Enter the travel details
    And Select air and passenger details
    Then Validate the passenger details