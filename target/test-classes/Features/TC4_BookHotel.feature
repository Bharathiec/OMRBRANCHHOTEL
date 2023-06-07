Feature: Verifying OMR Branch Hotel Page and Book Hotel Automation

  @bha
  Scenario Outline: Book Hotel including GST with DebitCard or CreditCard  and Special request
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
      | Visa       | 5555555555552222 | Bharathi V     | September | 2024 | 444 |
      | Amex       | 5555555555552222 | Bharathi V     | September | 2025 | 534 |
      | Mastercard | 5555555555552222 | Bharathi V     | September | 2025 | 235 |
      | Discover   | 5555555555552222 | Bharathi V     | September | 2024 | 786 |
      | Visa       | 5555555555552223 | Bharathi V     | September | 2024 | 444 |
      | Amex       | 5555555555552223 | Bharathi V     | September | 2025 | 423 |
      | Mastercard | 5555555555552223 | Bharathi V     | September | 2025 | 235 |
      | Discover   | 5555555555552223 | Bharathi V     | September | 2025 | 786 |
    Then User should verify the booking confirmation after payment with success message "Booking is Confirmed" and save the Order Id
    And User should verify selected hotel is booked

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom | SelectSalutation | FirstName | LastName | MobileNo   | Email                  | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | cardType    | RequestMessage       |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 | Mr.              | Bharathi  | Velusamy | 9500777950 | bharathiec04@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Debit Card  | Room should be clean |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 | Mr.              | Bharathi  | Velusamy | 9500777950 | bharathiec04@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Credit Card | Room should be clean |

  @bha1
  Scenario Outline: Book Hotel including GST with DebitCard or CreditCard Without Special request
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User select first hotel name and click continue and  save the hotel,price
    Then User should verify after accept the alert with success message  "Book Hotel"
    When User enter the guest details "<SelectSalutation>","<FirstName>","<LastName>","<MobileNo>" and "<Email>"
    And User add the gst details "<EnterRegistrationNo>","<EnterCompanyName>" and "<EnterCompanyAddress>" and User click the next special request button
    And User proceed the payment option "<cardType>"
      | CardType   | CardNumber       | CardHolderName | Month     | Year | Cvv |
      | Visa       | 5555555555552222 | Bharathi V     | September | 2024 | 444 |
      | Amex       | 5555555555552222 | Bharathi V     | September | 2025 | 534 |
      | Mastercard | 5555555555552222 | Bharathi V     | September | 2025 | 235 |
      | Discover   | 5555555555552222 | Bharathi V     | September | 2024 | 786 |
      | Visa       | 5555555555552223 | Bharathi V     | September | 2024 | 444 |
      | Amex       | 5555555555552223 | Bharathi V     | September | 2025 | 423 |
      | Mastercard | 5555555555552223 | Bharathi V     | September | 2025 | 235 |
      | Discover   | 5555555555552223 | Bharathi V     | September | 2025 | 786 |
    Then User should verify the booking confirmation after payment with success message "Booking is Confirmed" and save the Order Id
    And User should verify selected hotel is booked

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom | SelectSalutation | FirstName | LastName | MobileNo   | Email                  | EnterRegistrationNo | EnterCompanyName       | EnterCompanyAddress | cardType    |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 | Mr.              | Bharathi  | Velusamy | 9500777950 | bharathiec04@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Debit Card  |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 | Mr.              | Bharathi  | Velusamy | 9500777950 | bharathiec04@gmail.com |          9043592058 | Greens Tech OMR Branch | Thoraipakkam        | Credit Card |

  @bha2
  Scenario Outline: Book Hotel Without GST with DebitCard and Special request
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User select first hotel name and click continue and  save the hotel,price
    Then User should verify after accept the alert with success message  "Book Hotel"
    When User enter the guest details "<SelectSalutation>","<FirstName>","<LastName>","<MobileNo>" and "<Email>" and User click the next button
    And User add the special request "<RequestMessage>"
    And User proceed the payment option "<cardType>"
      | CardType   | CardNumber       | CardHolderName | Month     | Year | Cvv |
      | Visa       | 5555555555552222 | Bharathi V     | September | 2024 | 444 |
      | Amex       | 5555555555552222 | Bharathi V     | September | 2025 | 534 |
      | Mastercard | 5555555555552222 | Bharathi V     | September | 2025 | 235 |
      | Discover   | 5555555555552222 | Bharathi V     | September | 2024 | 786 |
      | Visa       | 5555555555552223 | Bharathi V     | September | 2024 | 444 |
      | Amex       | 5555555555552223 | Bharathi V     | September | 2025 | 423 |
      | Mastercard | 5555555555552223 | Bharathi V     | September | 2025 | 235 |
      | Discover   | 5555555555552223 | Bharathi V     | September | 2025 | 786 |
    Then User should verify the booking confirmation after payment with success message "Booking is Confirmed" and save the Order Id
    And User should verify selected hotel is booked

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom | SelectSalutation | FirstName | LastName | MobileNo   | Email                  | cardType   | RequestMessage       |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 | Mr.              | Bharathi  | Velusamy | 9500777950 | bharathiec04@gmail.com | Debit Card | Room should be clean |

  @bha3
  Scenario Outline: Book Hotel with CreditCard  Without GST  and Special request
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message "Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User select first hotel name and click continue and  save the hotel,price
    Then User should verify after accept the alert with success message  "Book Hotel"
    When User enter the guest details "<SelectSalutation>","<FirstName>","<LastName>","<MobileNo>" and "<Email>" and User click next button and next special request button
    And User proceed the payment option "<cardType>"
      | CardType   | CardNumber       | CardHolderName | Month     | Year | Cvv |
      | Visa       | 5555555555552222 | Bharathi V     | September | 2024 | 444 |
      | Amex       | 5555555555552222 | Bharathi V     | September | 2025 | 534 |
      | Mastercard | 5555555555552222 | Bharathi V     | September | 2025 | 235 |
      | Discover   | 5555555555552222 | Bharathi V     | September | 2024 | 786 |
      | Visa       | 5555555555552223 | Bharathi V     | September | 2024 | 444 |
      | Amex       | 5555555555552223 | Bharathi V     | September | 2025 | 423 |
      | Mastercard | 5555555555552223 | Bharathi V     | September | 2025 | 235 |
      | Discover   | 5555555555552223 | Bharathi V     | September | 2025 | 786 |
    Then User should verify the booking confirmation after payment with success message "Booking is Confirmed" and save the Order Id
    And User should verify selected hotel is booked

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom | SelectSalutation | FirstName | LastName | MobileNo   | Email                  | cardType    |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 | Mr.              | Bharathi  | Velusamy | 9500777950 | bharathiec04@gmail.com | Credit Card |

  Scenario Outline: WithOut adding any guest details and verify error message
    Given User is on the omrbranch hotel page
    When User login "<UserName>" and "<Password>"
    Then User should verify after login success message"Welcome Bharathi"
    When User search hotel "<SelectState>","<SelectCity>","<RoomType>","<DateofCheckIn>","<DateofCheckOut>","<NoOfRoom>","<NoOfAdultsPerRoom>" and "<NoOfChildrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User select first hotel name and click continue and  save the hotel,price
    Then User should verify after accept the alert with success message  "Book Hotel"
    And User Should verify error message after clicking next button "<Let us know for whom you are booking the hotel>","<Please select Salutation of the user>","<Please provide First Name of the user>","<Please provide Last Name of the user>","<Please provide Contact Number of the user to ease the communication (if required)>", and "<Please provide Email ID of the user to ease the communication (if required)>"

    Examples: 
      | UserName               | Password      | SelectState | SelectCity | RoomType | DateofCheckIn | DateofCheckOut | NoOfRoom | NoOfAdultsPerRoom | NoOfChildrenPerRoom |
      | bharathiec04@gmail.com | 9500777950Vb$ | Tamil Nadu  | Chennai    | Standard | 2023-05-25    | 2023-05-30     | 1-One    | 3-Three           |                   1 |
