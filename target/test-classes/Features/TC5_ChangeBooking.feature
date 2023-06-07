Feature: Verifying OMR Branch Hotel Page and Change Booking Details

  @ChangeBooking
  Scenario Outline: Change the Date using Generated Order Id
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User select first hotel name and click continue and  save the hotel,price
    Then User should verify after accept the alert with success message  "Book Hotel"
    When User enter the guest details "<SelectSalutation>","<FirstName>","<LastName>","<MobileNo>" and "<Email>"
    And User add the gst details "<EnterRegistrationNo>","<EnterCompanyName>" and "<EnterCompanyAddress>"
    And User add the special request "<RequestMessage>"
    And User proceed the payment option "<cardType>"
      | CardType   | CardNumber       | CardHolderName | Month     | Year | Cvv |
      | Visa       | 5555555555552222 | Bharathi V     | May       | 2024 | 444 |
      | Amex       | 5555555555552222 | Bharathi V     | June      | 2025 | 534 |
      | Mastercard | 5555555555552222 | Bharathi V     | May       | 2025 | 235 |
      | Discover   | 5555555555552222 | Bharathi V     | August    | 2024 | 786 |
      | Visa       | 5555555555552223 | Bharathi V     | September | 2024 | 444 |
      | Amex       | 5555555555552223 | Bharathi V     | December  | 2025 | 423 |
      | Mastercard | 5555555555552223 | Bharathi V     | August    | 2025 | 235 |
      | Discover   | 5555555555552223 | Bharathi V     | May       | 2025 | 786 |
    Then User should verify the booking confirmation after payment with success message "Booking is Confirmed" and save the Order Id
    And User should verify selected hotel is booked
    When User navigating to my booking page
    Then User should verify after navigating to my booking message with success message "Bookings"
    When User enter the generated order id
    Then User should verify the same hotel name is present
    And User should verify the same order id is present
    Then User should verify the same price is present
    When User edit the particular booking details and change the "<CheckInDate>"
    Then User should verify after change the checkindate with success message "Booking updated successfully"

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom | SelectSalutation | FirstName | LastName | MobileNo   | Email                  | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | cardType   | CheckInDate | RequestMessage       |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 | Mr.              | Bharathi  | Velusamy | 9500777950 | bharathiec04@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Debit Card | 2025-06-05  | Room should be clean |

  @ChangeBooking1
  Scenario Outline: Change the Date using Existing Order Id
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User navigating to my booking page from explore hotel page
    Then User should verify after navigating to my booking message with success message "Bookings"
    When User enter the existing order id "<OrderId>"
    And User should verify the same order id is present
    And User Change the checkindate "<CheckInDate>"
    Then User should verify after change the checkindate with success message "Booking updated successfully"

    Examples: 
      | UserName               | Password      | OrderId    | CheckInDate |
      | bharathiec04@gmail.com | 9500777950Vb$ | POARC40097 | 2025-06-05  |

  @ChangeBooking2
  Scenario Outline: Change the Date For First Available Order Id
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User navigating to my booking page from explore hotel page
    Then User should verify after navigating to my booking message with success message "Bookings"
    When User edit  the first available order id and User Change the checkindate "<CheckInDate>"
    Then User should verify after change the checkindate with success message "Booking updated successfully"

    Examples: 
      | UserName               | Password      | CheckInDate |
      | bharathiec04@gmail.com | 9500777950Vb$ | 2025-06-05  |
