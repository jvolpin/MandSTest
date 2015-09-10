# mandstest
M&S SET Written Test
Exercise 1
See the following BDD style feature for the website www.marksandspencer.com:

Feature: As a customer, I wish to view the contents of my bag prior to checkout

    Scenario: Add shirt to bag and view bag
        Given I have added a shirt to my bag
        When I view the contents of my bag
        Then I can see the contents of the bag include a shirt

In order to run, clone and import as a maven project, and make sure to have all the dependencies stated in the POM file
