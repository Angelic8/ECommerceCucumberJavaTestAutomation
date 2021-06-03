#Author: Angel
#Test coverage

  #Keywords Summary:
  #Feature: List of scenarios
  #Scenarios: Business rule through list of steps with arguments.
  #Given: Some precondition step
  #When: Some key actions
  #Then: To observe outcomes or validation
  #And,But: To enumerate more Given, When, Then steps
  #Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
  #Examples: Container for a table
  #Bakground: List of steps run before each of the scenarios
  #""" (Doc Strings)
  #| (Tags/Labels): To group Scenarios
  #<> (placeholder)
  #""
  ## (Comments)
  #Sample Feature Definition Template

@ClothingLine
Feature: Filter movies by actor

  User Story: As a user I want to search for movies based on Actor so that I can decide on number of movies I would want to watch

  @Regression @Smoke
  Scenario Outline: Scenario for filter movies by actor
    Given I have signed in to Netflix
    And I have the following movies on Netflix
      | Bad Boys                 | Will Smith |
      | Cast Away                | Tom Hanks  |
      | The Pursuit of Happyness | Will Smith |
    When I searched for movies by "<Actor">
    Then I find Number of "<Movies>"

    Examples:
      | Actor      | Movies |
      | Will Smith | 2      |
      | Tom Hanks  | 1      |
      | Tom Cruise | 0      |
      | Mr Bean    | 0      |
      | XYZ        | 0      |
      | 123        | 0      |
      | &%#        | 0      |
      |            | 0      |
