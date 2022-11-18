@properties
Feature: TestsWithProperties
  Background:
    Given I'm on "Html5 Page" page

  Scenario: click element
    When I click on "Red Button"
    Then the Alert text equals to "Red button"

  Scenario: jsClick element
    When click with JS on "Red Button"
    Then the Alert text equals to "Red button"

  Scenario: value element
    Then the "Red Button" text equals to "Big Red Button-Input"

  Scenario: labelText
    Then the "Your Name" label text equals to "Your name:"

  Scenario: input element
    When I input "simple 1234" in "Name"
    Then the "Name" text matches to "\w{6} \d{4}"

  Scenario: check element
    When check "Accept Conditions"
    Then the "Accept Conditions" is selected

  Scenario: uncheck element
    When uncheck "Accept Conditions"
    Then the "Accept Conditions" is deselected

  Scenario: clear element
    When I input "simple text" in "Your Name"
    Then the "Your Name" text equals to "simple text"
    When I clear "Your Name"
    Then the "Your Name" text equals to ""

  Scenario: css element
    Then the "Your Name" css "font-size" equals to "14px"

  Scenario: placeholder element
    Then the "Your Name" placeholder equals to "Input name"

  Scenario: getValue element
    When input "simple text" in "Name"
    Then the "Input name" text equals to "simple text"

  Scenario: getText element
    Then the "Blue Button" text equals to "BIG BLUE BUTTON"

  Scenario: getAttribute element
    Then the "Disabled Name" attribute "id" equals to "disabled-name"

  Scenario: isEnabled element
    Then the "Input name" is enabled

  Scenario: isDisabled element
    Then the "Disabled Name" is disabled

  Scenario: isHidden element
    Then the "Logout" is hidden

  Scenario: element does not appear
    Then the "Logout" does not appear

  Scenario: isDisplayed element
    Then the "Input name" is displayed

  Scenario: setText element
    When input "simple text" in "Input name"
    Then the "Input name" text equals to "simple text"
    When set text "Input text" in "Input name"
    Then the "Input name" text equals to "Input text"