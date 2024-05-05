package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    private DriverFactory() {
        System.out.println("This is singleton class");
    }


    public static WebDriver getInstance(String browser){
        if (driver.get() == null) {
            switch (browser){
                case "CHROME" :
                    driver.set(new ChromeDriver());
                    break;
                case "FIREFOX" :
                    driver.set(new FirefoxDriver());
                    break;
                case "SAFARI" :
                    driver.set(new SafariDriver());
                    break;
                default:
                    System.out.println("Invalid browser supplied : " +browser);
            }
        }
        return driver.get();
    }

//    To get driver
    public static WebDriver getDriver(){
        return driver.get();
    }
}
