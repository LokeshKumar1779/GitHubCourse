package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.DriverFactory.getDriver;


public class ReusableMethods {

    static WebDriverWait wait;

    public static void waitForElementVisibility(WebElement element, long seconds){
        wait = new WebDriverWait(getDriver(),Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
