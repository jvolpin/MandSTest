package util;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageobjects.BagPage;
import pageobjects.CasualShirtsPage;
import pageobjects.LandingPage;
import pageobjects.ShirtDetailsPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Juan on 09/09/2015.
 */

public class DriverFactory {

    protected static WebDriver driver;


    public DriverFactory() {
        initialize();
    }

    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    private void createNewDriverInstance() {
        String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } else {
            System.out.println("can't read browser type");
        }
        String baseurl = new PropertyReader().readProperty("baseurl");
        if ((baseurl.contains("http://"))||(baseurl.contains("https://"))){
            driver.get(baseurl);
        } else {
            System.out.println("url not valid");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}