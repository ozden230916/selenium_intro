package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locatir_LinkTaxt_partialLinkTest {
    public static void main(String[] args) {

        /*
        Go to https://www.google.com
        Validate the Gmail, Images, About and Store links are displayed and enabled
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        WebElement gmailLink = driver.findElement(By.partialLinkText("mail"));
        WebElement imagesLink = driver.findElement(By.partialLinkText("Ima"));
        WebElement storeLink = driver.findElement(By.linkText("Store"));

        System.out.println(aboutLink.getText());
        System.out.println(storeLink.getText());
        System.out.println(imagesLink.getText());
        System.out.println(gmailLink.getText());

        System.out.println(aboutLink.isDisplayed() && aboutLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(storeLink.isDisplayed() && storeLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(imagesLink.isDisplayed() && imagesLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(gmailLink.isDisplayed() && gmailLink.isEnabled() ? "PASSED" : "FAILED");

        Driver.quitDriver();
    }
}
