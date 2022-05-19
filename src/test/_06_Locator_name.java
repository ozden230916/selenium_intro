package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _06_Locator_name {
    public static void main(String[] args) {
        /*
        TEST CASE:
        1. Go to https://www.google.com
        2. Validate the search input element is displayed in the middle of the page
         */
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        if (driver.findElement(By.name("q")).isDisplayed()) System.out.println("The inputBox validation is PASSED");
        else System.out.println("The inputBox validation is FAILED!");

        driver.quit();
    }
}
