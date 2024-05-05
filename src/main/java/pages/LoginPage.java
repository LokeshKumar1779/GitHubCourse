package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.ReusableMethods;


import java.time.Duration;

import static utility.ReusableMethods.waitForElementVisibility;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css = "input[data-qa='login-email']")
    private WebElement emailAddressField;

    @FindBy(css = "input[data-qa='login-password']")
    private WebElement passwordField;
    @FindBy(css = "button[data-qa='login-button']")
    private WebElement loginBtn;

    @FindBy(css = "a[href='/logout']")
    private WebElement logoutBtn;
    @FindBy(css = "li:nth-child(10) a ")
    private WebElement loggedInAsText;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public LoginPage enterLoginCredentials(String emailAddress, String password) {
/*        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(emailAddressField));*/
        waitForElementVisibility(emailAddressField,5);
        emailAddressField.sendKeys(emailAddress);
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        loginBtn.click();
        return this;
    }

    public boolean isUserSuccessfullyLoggedIn() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(logoutBtn));
        System.out.println(loggedInAsText.getText());
        return loggedInAsText.getText().contains("Logged in as");
    }
}
