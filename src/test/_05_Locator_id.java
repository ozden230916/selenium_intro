package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    public static void main(String[] args) {
        /*
        Go to https://www.techglobalschool.com

        Validate the company signature
        Logo must be displayed in the header section
        Company name must be displayed in the header section
        Company quote must be displayed in the header section

         */
        //1. Set driver
        WebDriver driver = Driver.getDriver();

        //2. validation
        driver.get("https://www.techglobalschool.com\n");

        //Make sure that image us displayed
        WebElement logo = driver.findElement(By.id("img_comp-kuiqjide2"));
        if (logo.isDisplayed()) System.out.println("The logo validation PASSED");
        else System.out.println("Logo validation is FAILED!!!");

        WebElement companyName = driver.findElement(By.id("comp-kuiqjidf"));
        if (companyName.isDisplayed() && companyName.getText().equals("TechGlobal")) System.out.println("The company name validation PASSED");
        else System.out.println("The company name validation is FAILED!!!");

        WebElement companyQuote = driver.findElement(By.id("comp-kuiqjidf1"));
        if (companyQuote.isDisplayed() && companyQuote.getText().equals("OUR GOAL IS YOUR SUCCESS")) System.out.println("The company quote validation PASSED");
        else System.out.println("The company quote validation is FAILED!!!");

        //3.Teardown
        Driver.quitDriver();
    }
}
