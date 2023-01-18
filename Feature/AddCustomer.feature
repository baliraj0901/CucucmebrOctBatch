Feature: Customer

Scenario Outline: Add New Customer
   Given User Launch Chrome Browser
   When User open url "https://admin-demo.nopcommerce.com/login"
   And User enter Email as "<email>" and password as "<password>"
   And Click on Login
   Then User can view Dashboard
   When user click on customers menu
   And  User click on customers menu item
   And User click on new add button
   Then User can view add new customer page
   When user enter customer info as "<newEmail>" and "<newPass>" and "<fname>" and "<lname>" and "<gender>" and "<comName>" and "<adminCommenet>"
   And user click on save button
   Then User can view confirmation msg "The new customer has been added successfully."
   And close browser
   
   Examples:
   |email|password|newEmail|newPass|fname|lname|gender|comName|adminCommenet|
   |admin@yourstore.com|admin|braj78@gmail.com|1234|Bali1|Raj|Male|ABC|Test1|
   |admin@yourstore.com|admin|mayuriP89@gmail.com|5678|Mayuri2|Bali|Female|XYZ|Test2|
   |admin@yourstore.com|admin|RajB34@gmail.com|59878|Raj|Bali2|Male|PQR|Test3|

