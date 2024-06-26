package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(css = "a[href='/login']")
    WebElement SignupLoginLink;

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean homePageLoaded(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://automationexercise.com/");
    }

    public LoginPage clickSignUpLoginLink(){
        SignupLoginLink.click();
        return new LoginPage(driver);
    }
}
