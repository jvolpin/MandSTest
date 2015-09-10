package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Juan on 09/09/2015.
 */
public class ShirtDetailsPage {

    WebDriver driver;

    public ShirtDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSize() {
        driver.findElement(By.cssSelector("[for='XLDUMMY']")).click();
    }

    public void clickAddToBag() {
        driver.findElement(By.id("basket_P22409324")).click();
    }

    public void clickGoToBag() {
        driver.findElement(By.xpath("//a[@title='View basket']")).click();
    }
}