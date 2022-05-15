package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class _02_ValidateAppleUrl {
    public static void main(String[] args) throws InterruptedException {
        //1.Set the driver
        /*
        System.setProperty("wendriver.chrome.driver","/Users/atillafirat/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
        WebDriver driver = Driver.getDriver();

        //2.validation
        driver.get("https://www.apple.com/");
       if (driver.getCurrentUrl().equals("https://www.apple.com/")) System.out.println("Url validation PASSED");
       else System.out.println("Url validation FAILED\"");

       //3.Quit driver
        /*
          Thread.sleep(3000);
          driver.quit();
         */
        Driver.quitDriver();


    }
}
