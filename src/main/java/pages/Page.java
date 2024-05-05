package pages;

import org.openqa.selenium.WebDriver;
import utility.ReusableMethods;

public class Page extends ReusableMethods {

    WebDriver driver;
    public Page(WebDriver driver) {
        this.driver = driver;
    }
}
