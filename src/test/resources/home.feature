#Author: Angel
#Test coverage


@ECommerce
Feature: Filter by Computer Accessories & Peripherals

  User Story: As a user I want to search for Computer Accessories and Peripherals so that I can decide on number of movies I would want to watch

  @Regression @Smoke
  Scenario Outline: Scenario for filter by Computer Accessories and Peripherals
  Given I have signed in to Amazon
  And I have the following Computer Accessories and Peripherals on Amazon
    | Logitech USB Headset H390 with Noise Cancelling Mic                                                    | Logitech1 |
    | Logitech USB Headset H390 with Noise Cancelling Mic Pack of 2                                          | Logitech2 |
    | Logitech H390 USB Headset with Noise-Cancelling Computer Accessories & Peripheralslling Mic - 16 Pack  | Logitech3 |
  When I searched for title by "<Brand>"
  Then I find Number of <Title>

    Examples:
      | Brand      | Title |
      | Logitech1  | 2      |
      | Logitech2  | 1      |
      | Logitech3  | 0      |
      | Logic      | 0      |
      | XYZ        | 0      |
      | 123        | 0      |
      | $%&        | 0      |


