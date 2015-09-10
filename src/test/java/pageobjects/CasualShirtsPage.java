package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Juan on 09/09/2015.
 */
public class CasualShirtsPage {

    WebDriver driver;

    @FindBy(xpath = "//a[text()='Tailored Fit Long Sleeve Mini Geometric Print Shirt']")
    private WebElement shirt;

    public CasualShirtsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickShirt() {
        shirt.click();
    }
}