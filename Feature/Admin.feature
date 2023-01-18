Feature:Login
@sanity
Scenario: Suceessfully Login with valid credential

   Given User Launch Chrome Browser
   When User open url "https://admin-demo.nopcommerce.com/login"
   And User enter Email as "admin@yourstore.com" and password as "admin"
   And Click on Login
   Then page title should be "Dashboard / nopCommerce administration" 
   And close browser
   
@smoke   
Scenario Outline: Login Data Driven
   Given User Launch Chrome Browser
   When User open url "https://admin-demo.nopcommerce.com/login"
   And User enter Email as "<email>" and password as "<password>"
   And Click on Login 
   Then page title should be "Dashboard / nopCommerce administration" 
   And close browser
   
   Examples:
   |email               |password  |
   |admin@yourstore.com |admin     |
   |admin@yourstore.com |admin1234 |
  
   
   