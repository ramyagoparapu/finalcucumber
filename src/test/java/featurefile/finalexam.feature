Feature: Validate background color change functionality
@blueBackground
Scenario: Sky Blue Background
Given "Set SkyBlue Background" button exists
When I click on the "Set SkyBlue Background" button
Then the background color will change to sky blue

@whiteBackground
Scenario: White Background Change
Given  "Set White Background" button exists
When I click on the "Set White Background" button
Then the background color will change to white