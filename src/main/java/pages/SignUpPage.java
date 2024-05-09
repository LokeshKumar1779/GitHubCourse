package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends Page{

    @FindBy(css = "input[data-qa='signup-name']")
    private WebElement signup_name;

    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement signup_email;

    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signup_button;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public SignUpPage fillSignupDetails(String username, String email_address){
        signup_name.sendKeys(username);
        signup_email.sendKeys(email_address);
        signup_button.click();
        return this;
    }

    public SignUpPage enterAccountInfo(String firstName, String lastName) {
        return this;
    }

    public SignUpPage enterAddressInfo(String addLine1, String addLine2, String city, String state, String country, String zipcode) {
        return this;
    }
}
