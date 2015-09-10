package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Juan on 09/09/2015.
 */

public class LandingPage {

    WebDriver driver;

    @FindBy(id = "SC_Level_1_586")
    private WebElement TopMenuMen;

    @FindBy(xpath = "//a[text()='Casual Shirts']")
    private WebElement CasualShirtsButton;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void mouseOverMen() {
        new Actions(driver).moveToElement(TopMenuMen).perform();
    }

    public void clickCasualShirts() {
        driver.findElement(By.xpath("//a[text()='Casual Shirts']")).click();
    }
}