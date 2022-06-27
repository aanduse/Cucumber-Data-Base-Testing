@blue_rental_car_user_story_08
Feature: User should be able to reserve a car
  Scenario Outline: user_should_be_able_to_reserve_a_car_as_customer_service_profile
    Given user is on the blue rental car home page
    And click Login Link
    Then enter "<e_mail>" address
    And enter "<password>"
    Then click Login button
    And select a car "<car>"
    And enter pick up place "<pick_up>"
    And enter drop off place "<drop_off>"
    And enter pick up date "<pick_up_date>"
    And enter pick up time "<pick_up_time>"
    And enter drop off date "<drop_off_date>"
    And enter drop off time "<drop_off_time>"
    And click Continue Reservation Button
Examples: customer credentials
    |e_mail|password|car|pick_up|drop_off|pick_up_date|pick_up_time|drop_off_date|drop_off_time|
    |customer@bluerentalcars.com|12345|Kia Rio|London|London|06/30/2022|12:25PM|07/30/2022|12:25PM|

