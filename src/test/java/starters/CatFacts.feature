Feature: Cat Facts Positive Cases

  I'm adding a mock description for this feature file.
  The description is free text and it's ignored at run time.
  It's just for us, to document what we are going to do in the Feature file.

  Background:
    Given the user has the "CatFacts" response
    And status code is 200

  Scenario: Response Structure Check
    Then the response <structure> contains
    |fact     |
    |length   |

  Scenario: Response Length
    Then the response length is equal to expected length
