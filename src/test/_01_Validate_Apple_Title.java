package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {

        /*
        TEST CASE
        1. Go to "https://www.apple.com/"
        2. Validate the title of the page is displayed as "Apple"
         */
        //1.Set uo driver
        System.setProperty("webdriver.chrome.driver","/Users/atillafirat/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //2.Validation
        driver.get("https://www.apple.com/");

        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED!!!");

        System.out.println("Title of Apple page is = " + driver.getTitle());
        driver.quit();
    }
}
