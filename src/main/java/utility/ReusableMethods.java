package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.DriverFactory.getDriver;


public class ReusableMethods {

    static WebDriverWait wait;

    public static void waitForElementVisibility(WebElement element, long seconds){
        wait = new WebDriverWait(getDriver(),Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void selectByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }


}
