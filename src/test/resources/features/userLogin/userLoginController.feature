Feature: POST: Perform User Login

  @createUserSignIn
  Scenario Outline: POST: Create User SignIn
    Given User needs to signIn
    When User has to enter the userName "<userLoginEmailId>"
    Then user has to enter the password "<password>"
    Then Verify the status code is "<StatusCode>"

    Examples:
      | userLoginEmailId     | password          | StatusCode |  |
      | numpyninja@gmail.com | lmsHackathon@2024 | 200        |  |

#  @tag3
#  Scenario Outline: POST: Create new Patient duplicate values with file attached
#    Given User needs to create a Patient using "<endpoint>"
#    When User has the patientInfo from <rowNum> of "<sheet>"
#    Then user hit the post method and attach file
#    Then Verify the status code is "<StatusCode>"
#
#    Examples:
#      | endpoint | rowNum | sheet       | StatusCode |
#      | patient  | 0      | PatientInfo | 400        |
