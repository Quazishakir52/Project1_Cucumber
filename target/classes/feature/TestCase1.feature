Feature: Automation Practice Website

  @TestCase1
  Scenario Outline: Update Address city and state
    Given Opening the browser 
    And Enter username
    And Enter password
    Then Click login	
    When Clicking My Address
    Then Click Update
    Then Enter City "<City>"
    Then Select State "<State>"
    And  Click Save
	  And Verify City
	  And Verify State
    And Click Logout
    
   
    Examples: 
    | City  | State |
    | Toronto |Washington |


  @TestCase2
  Scenario Outline: Add to cart - tshirt for women and validate
   Given Opening the browser 
    And Enter username
    And Enter password
    Then Click Womens Tshirts
    Then Scroll to product
    Then Verify Message
		And Click Proceed to Chekcout
		Then Validate product
		And Click proceed to checkout1
		And Click terms of service
		And Click proceed to checkout2
		And Click proceed to checkout3
		Then Click Signout

    Examples: 
      | text	| text1 |
			| Product successfully added to your shopping cart | Faded Short Sleeve T-shirts |
 
      
    
