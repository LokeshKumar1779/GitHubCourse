package pages;

import org.openqa.selenium.WebDriver;

public class SignUpPage extends Page{

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public SignUpPage enterPersonalDetails(String firstName, String lastName) {
        return this;
    }

    public SignUpPage enterAddressDetails(String addLine1, String addLine2, String city, String state, String country, String zipcode) {
        return this;
    }
}
