

Feature: loginto page


  
  Scenario Outline: user able to login with valid credentials
    Given open browser and enter valid <url>
    When enter valid <username> and <password>
    And hit on login button
    Then user navigated to homepage

    Examples: 
      | url  |     username   |   password  |
      |http://localhost:8888/index.php?action=index&module=Home|    admin      |admin |
