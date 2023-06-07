
Feature: Verifying OMR Branch Hotel Page and Select Hotel Details
@Select
  Scenario Outline: Select hotel and verify navigate to book hotel upon accepting the alert
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User select first hotel name and click continue and  save the hotel,price
    Then User should verify after accept the alert with success message  "Book Hotel"

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 |
@Select1
  Scenario Outline: Select hotel and verify navigating in the samepage upon dismiss the alert
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User select first hotel name and click continue and  save the hotel,price
    Then User should verify after dismiss the alert with success message  "Book Hotel"

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 |
@Select2
  Scenario Outline: Verify sorting functionality hotel price from low to high
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    And User Click radio button after search hotel
    Then User should verify the sorting hotel price list from low to high after click radio button

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 |
@Select3
  Scenario Outline: Verify sorting functionality hotel price from high to low
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    And User Click radio button after search hotel
    Then User should verify the sorting hotel price list from high to low after click radio button

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 |
@Select4
  Scenario Outline: Passing room type and verify same filter is listed
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    And User should verify all hotel name ends with same selected filtered "<RoomType>"

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 |
