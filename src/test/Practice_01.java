package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class Practice_01 {
    public static void main(String[] args) {
        /*
        Go to https://www.facebook.com/
        Validate the title of the page is “Facebook - Log In or Sign Up”
        Validate the URL of the page is “https://www.facebook.com/”
        Validate “facebook” logo is displayed
        Validate heading2 “Connect with friends and the world around you on Facebook.” is displayed
        Validate “Email or Phone Number” input box is displayed
        Validate “Password” input box is displayed
        Validate “Log In” button is displayed and enabled
        Validate “Forgot Password?” link is displayed
        Validate “Create New Account” button is displayed

         */
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");

        if (driver.getTitle().equals("Facebook - Log In or Sign Up")) System.out.println("The title validation is PASSED");
        else System.out.println("The title validation is FAILED");

        if (driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("The url validation is PASSED");
        else System.out.println("The url validation is FAILED");

        WebElement logo = driver.findElement(By.cssSelector("._8ice"));
        System.out.println("“facebook” logo is displayed is = " + logo.isDisplayed());

        WebElement heading2 = driver.findElement(By.xpath("//h2"));
        System.out.println("Connect with friends and the world around you on Facebook heading is displayed = " + heading2.isDisplayed());

        WebElement emailOrPhoneNumberInputBox = driver.findElement(By.cssSelector("#email"));
        System.out.println("Email or Phone Number input box is displayed = " + emailOrPhoneNumberInputBox.isDisplayed());

        WebElement password = driver.findElement(By.cssSelector("#pass"));
        System.out.println("Password input box is displayed = " + password.isDisplayed());


        WebElement logInButton = driver.findElement(By.cssSelector("button[data-testid='royal_login_button']"));
        System.out.println("Log In button is displayed = " + logInButton.isDisplayed());
        System.out.println("Log In button is enabled = " + logInButton.isEnabled() );


        WebElement forgotPassword = driver.findElement(By.className("_6ltj"));
        System.out.println("Forgot Password? link is displayed = " + forgotPassword.isDisplayed());

        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        System.out.println("Create New Account button is displayed = " + createNewAccount.isDisplayed());

        Driver.quitDriver();
    }
}
