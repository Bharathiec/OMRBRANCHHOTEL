@CancelBooking
Feature: Verifying OMR Branch Hotel Page and Cancelled Booking Details

  Scenario Outline: Cancel the Generated Order Id
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>",
    Then User should verify after search hotel with success message "Select Hotel"
    When User select the first hotel name and save the hotel name and price
    Then User should verify after accept the alert with success message  "BookHotel"
    When User enter the guest details "<SelectSalutation>","<FirstName>","<LastName>","<MobileNo>" and "<Email>"
    And User add the gst details "<EnterRegistrationNo>","<EnterCompanyName>" and "<EnterCompanyAddress>"
    And User add the special request "<RequestMessage>"
    And User proceed the payment option "<CardType>"
      | CardType          | CardNumber       | CardHolderName | Month     | Year | Cvv |
      | Debit Visa        | 5555555555552222 | Bharathi V     | May       | 2024 | 444 |
      | Debit Amex        | 5555555555552222 | Bharathi V     | June      | 2025 | 534 |
      | Debit Mastercard  | 5555555555552222 | Bharathi V     | May       | 2025 | 235 |
      | Debit Discover    | 5555555555552222 | Bharathi V     | August    | 2024 | 786 |
      | Credit Visa       | 5555555555552223 | Bharathi V     | September | 2024 | 444 |
      | Credit Amex       | 5555555555552223 | Bharathi V     | December  | 2025 | 423 |
      | Credit Mastercard | 5555555555552223 | Bharathi V     | August    | 2025 | 235 |
      | Credit Discover   | 5555555555552223 | Bharathi V     | May       | 2025 | 786 |
    Then User should verify the booking confirmation after payment with success message "Booking is Confirmed" and save the Order Id
    And User should verify selected hotel is booked
    When User navigating to my booking page
    Then User should verify after navigating to my booking page with success message "Bookings"
    When User enter the generated order id
    Then User should verify the same hotel name is present
    And User should verify the same order id is present
    Then User should verify the same price is present
    And User cancel the generated order id
    Then User should verify after cancel ordered id with success message "Your Booking Cancelled Sucessfully"

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom | SelectSalutation | FirstName | LastName | MobileNo   | Email                  | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | CardType  | CheckInDate | RequestMessage       |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 | Mr.              | Bharathi  | Velusamy | 9500777950 | bharathiec04@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | DebitCard | 2025-06-05  | Room should be clean |

  Scenario Outline: Cancel the  Existing Order Id
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User navigating to my booking page
    Then User should verify after navigating to my booking page with success message "Bookings"
    When User enter the existing order id "<OrderId>"
    And User should verify the same order id is present
    And User cancel the existing order id
    Then User should verify after cancel order id  with success message "Your Booking Cancelled Scuccessfully"

    Examples: 
      | UserName               | Password      | OrderId    |
      | bharathiec04@gmail.com | 9500777950Vb$ | SYOGU08533 |

  Scenario Outline: Cancel the  First  Order Id
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User navigating to my booking page
    Then User should verify after navigating to my booking page with success message "Bookings"
    And User cancel the first available order id
    Then User should verify after cancel first order id with success message "Your Booking Cancelled Scuccessfully"

    Examples: 
      | UserName               | Password      |
      | bharathiec04@gmail.com | 9500777950Vb$ |

  Scenario Outline: Cancel the  Generated Order Id after modify the date
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>",
    Then User should verify after search hotel with success message "Select Hotel"
    When User select the first hotel name and save the hotel name and price
    Then User should verify after accept the alert with success message  "Book Hotel"
    When User enter the guest details "<SelectSalutation>","<FirstName>","<LastName>","<MobileNo>" and "<Email>"
    And User add the gst details "<EnterRegistrationNo>","<EnterCompanyName>" and "<EnterCompanyAddress>"
    And User add the special request "<RequestMessage>"
    And User proceed the payment option "<CardType>"
      | CardType          | CardNumber       | CardHolderName | Month     | Year | Cvv |
      | Debit Visa        | 5555555555552222 | Bharathi V     | May       | 2024 | 444 |
      | Debit Amex        | 5555555555552222 | Bharathi V     | June      | 2025 | 534 |
      | Debit Mastercard  | 5555555555552222 | Bharathi V     | May       | 2025 | 235 |
      | Debit Discover    | 5555555555552222 | Bharathi V     | August    | 2024 | 786 |
      | Credit Visa       | 5555555555552223 | Bharathi V     | September | 2024 | 444 |
      | Credit Amex       | 5555555555552223 | Bharathi V     | December  | 2025 | 423 |
      | Credit Mastercard | 5555555555552223 | Bharathi V     | August    | 2025 | 235 |
      | Credit Discover   | 5555555555552223 | Bharathi V     | May       | 2025 | 786 |
    Then User should verify the booking confirmation after payment with success message "Booking is Confirmed" and save the "Order Id"
    And User should verify selected hotel is booked
    When User navigating to my booking page
    Then User should verify after navigating to my booking page with success message "Bookings"
    When User enter the generated order id
    Then User should verify the same hotel name is present
    And User should verify the same order id is present
    Then User should verify the same price is present
    When User edit the particular booking details and change the "<CheckInDate>"
    Then User should verify after change the checkindate with success message "Booking updated Scuccessfully"
    And User cancel the generated order id
    Then User should verify after cancel  generated order id  with success message "Your Booking Cancelled Scuccessfully"

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom | SelectSalutation | FirstName | LastName | MobileNo   | Email                  | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | CardType  | CheckInDate | RequestMessage       |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 | Mr.              | Bharathi  | Velusamy | 9500777950 | bharathiec04@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | DebitCard | 2025-06-05  | Room should be clean |
