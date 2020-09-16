Feature: Register user through api

  Scenario Outline: Registration user
    Given Candidate create a user with the post method in "https://gorest.co.in/"
    When Candidate provide information the post method with "public-api/users"
    Then Candidate verify the creation of this user with the get method

    Examples: 
      | first_name | last_name | gender    | dob       | email                   | status    |
      | Candidate  | Candidate | Candidate | Candidate | CandidateEmail@mail.com | Candidate |
