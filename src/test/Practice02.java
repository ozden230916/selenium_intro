package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Practice02 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");
        WebElement googleSearch = driver.findElement(By.cssSelector("//input[@value='Google Search']"));
        if (googleSearch.isDisplayed()) System.out.println("Goggle search button validation is PASSED");
        else System.out.println("Goggle search button validation is FAILED");
        Driver.quitDriver();
    }
}
