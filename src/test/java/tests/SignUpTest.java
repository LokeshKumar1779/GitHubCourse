package tests;

import pages.SignUpPage;

public class SignUpTest extends BaseTest{

    public void verifyUserSignUp(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterPersonalDetails("FirstName","LastName");
        signUpPage.enterAddressDetails("AddLine1","AddLine2","City","State","Country","zipcode");
    }
}
