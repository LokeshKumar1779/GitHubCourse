package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLInputElement;

public class SignUpPage extends Page {

    @FindBy(css = "input[data-qa='signup-name']")
    private WebElement signup_name;

    @FindBy(css = "input[data-qa='signup-email']")
    private WebElement signup_email;

    @FindBy(css = "button[data-qa='signup-button']")
    private WebElement signup_button;

    @FindBy(id = "id_gender1")
    private WebElement genderRadioBtn1;
    @FindBy(id = "password")
    private WebElement passwordTextField;
    @FindBy(id = "days")
    private WebElement daysElement;
    @FindBy(id = "months")
    private WebElement months;
    @FindBy(css = "#years")
    private WebElement years;
    @FindBy(css = "#newsletter")
    private WebElement newsletter;
    @FindBy(css = "#optin")
    private WebElement optin;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public SignUpPage fillSignupDetails(String username, String email_address) {
        signup_name.sendKeys(username);
        signup_email.sendKeys(email_address);
        signup_button.click();
        return this;
    }

    public SignUpPage enterAccountInfo(String title, String day, String month, String year) {
//        Select Male gender
        driver.findElement(By.cssSelector("input[value='" + title + "']")).click();
        genderRadioBtn1.click();
        passwordTextField.sendKeys("password");


//        Select day for dob
        selectByValue(daysElement, day);
//        Select month for dob
        selectByValue(months, month);
//        Select year for dob
        selectByValue(years, year);
//        Newsletter checkbox
        newsletter.click();
//        Special offer checkbox
        optin.click();
        return this;
    }

    public SignUpPage enterAddressInfo(String addLine1, String addLine2, String city, String state, String country, String zipcode) {
        return this;
    }
}
