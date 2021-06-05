#Author: Angel
#Test coverage


@ECommerce
Feature: Filter by Computer Accessories & Peripherals

  User Story: As a user I want to search for Computer Accessories and Peripherals so that I can decide on number of movies I would want to watch

  @Regression @Smoke
  Scenario Outline: Scenario for filter by Computer Accessories and Peripherals
  Given I have signed in to Amazon
  And I have the following Computer Accessories and Peripherals on Amazon
    | Logitech USB Headset H390 with Noise Cancelling Mic                                                    | Logitech |
    | Logitech USB Headset H390 with Noise Cancelling Mic Pack of 2                                          | Logitech |
    | Logitech H390 USB Headset with Noise-Cancelling Computer Accessories & Peripheralslling Mic - 16 Pack        | Logitech |
  When I searched for by "<Brand">
  Then I find Number of "<Computer Accessories and Peripherals>"

    Examples:
      | Brand      | Title |
      | Logitech   | Logitech USB Headset H390 with Noise Cancelling Mic      |
      | Logitech   | Logitech USB Headset H390 with Noise Cancelling Mic Pack of 2      |
      | Logitech   | Logitech H390 USB Headset with Noise-Cancelling Computer Accessories & Peripheralslling Mic - 16 Pack      |
