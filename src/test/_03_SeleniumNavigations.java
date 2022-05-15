package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class _03_SeleniumNavigations {
    public static void main(String[] args) throws InterruptedException {
        /*
        Go to https://www.techglobalschool.com
        Refresh the page
        Navigate to https://www.amazon.com/
        Navigate back to TechGlobal web site
        Navigate forward Amazon web site
        Validate the URL of the page
        Validate the title of the page


        EXPECTED RESULT:
        URL  = https://www.amazon.com/
        Title = Amazon.com. Spend less. Smile more.
         */

        //1.Set the driver
        /*
        System.setProperty("webdriver.chrome.driver","/Users/atillafirat/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
        WebDriver driver = Driver.getDriver();

        //2.validation
        driver.get("https://www.techglobalschool.com");
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();

        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String expectedUrl = "https://www.amazon.com/";

        String actualTitle = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();

        if (actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        if (actualUrl.equals(expectedUrl)) System.out.println("URL validation PASSED");
        else System.out.println("URl validation FAILED");

        //3.Quit driver
        /*
        Thread.sleep(3000);
        driver.quit();*/
        Driver.quitDriver();

    }
}
