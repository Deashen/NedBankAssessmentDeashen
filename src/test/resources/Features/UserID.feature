Feature: Validate that the following mails exist

  Scenario: Validate a Users First Name
    Given We have a valid Endpoint "https://reqres.in/api/users?page=2"
    When We hit that endpoint and receive a response
    Then User with id <id> has the name of <firstname> and email of <email>
    |id|firstname   |email                          |
    |11|"George"    |"george.edwards@reqres.in"   |
    |8 |"Lindsay"   |"lindsay.ferguson@reqres.in" |
