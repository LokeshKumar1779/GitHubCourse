package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utility.DriverFactory;

public class BaseTest {

    WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void setUpBrowser(String browser){

        driver = DriverFactory.getInstance(browser);
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");

    }


    @AfterTest
    public void quitBrowser(){
        driver.quit();
    }
}
