@Explore
Feature: Verifying OMR Branch Hotel Page and Explore Hotel Details
@bha
  Scenario Outline: Enter all Field and Verify Select Hotel
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 |
@raj
  Scenario Outline: Enter only Mandatory Fields and Verify Select Hotel
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User  enter only mandatory field to search hotel "<SelectState>","<SelectCity>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>" and "<NoOfAdultsPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |
@raj1
  Scenario Outline: WithOut Enter Any Field Click Search and Verify Error Message
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    Then User should verify error mesaage after user select search hotel "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | UserName               | Password      |
      | bharathiec04@gmail.com | 9500777950Vb$ |
@raj2
  Scenario Outline: Enter all Field and Verify Room Type and Select Hotel
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    And User should verify selected "<RoomType>" filter is present

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType                            | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard/Deluxe/Suite/Luxury/Studio | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 |
