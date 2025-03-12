
Feature: Search Book and Add to Cart Successfull

Scenario: Search Book
Given User is on HomePage
When click on the Search Bar 
And search the book 
And verify the book 

Scenario: Add to Cart book
Given user on the search section
When click on the add to cart icon
And verify succesfull add product
Then Remove the product from add to cart
And Close the browser
