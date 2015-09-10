package steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageobjects.BagPage;
import pageobjects.CasualShirtsPage;
import pageobjects.LandingPage;
import pageobjects.ShirtDetailsPage;
import util.DriverFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Juan on 09/09/2015.
 */


public class Exercise1Steps extends DriverFactory {

    LandingPage landing = new LandingPage(driver);
    CasualShirtsPage shirts = new CasualShirtsPage(driver);
    ShirtDetailsPage details = new ShirtDetailsPage(driver);
    BagPage bagpage = new BagPage(driver);

    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
    }

    @Given("^I have added a shirt to my bag$")
    public void i_have_added_a_shirt_to_my_bag(){
        landing.mouseOverMen();
        landing.clickCasualShirts();
        shirts.clickShirt();
        details.clickSize();
        details.clickAddToBag();
    }

    @When("^I view the contents of my bag$")
    public void i_view_the_contents_of_my_bag(){
        details.clickGoToBag();
    }

    @Then("^I can see the contents of the bag include a shirt$")
    public void i_can_see_the_contents_of_the_bag_include_a_shirt(){
        Assert.assertTrue(bagpage.checkShirt());
    }

    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
    }

}
