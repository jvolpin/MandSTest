package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Juan on 09/09/2015.
 */
public class BagPage {

    WebDriver driver;


    @FindBy(partialLinkText = "Tailored Fit Long Sleeve Mini Geometric Print Shirt")
    private WebElement addedShirt;


    public BagPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean checkShirt() {
        return addedShirt.isDisplayed();
    }

}