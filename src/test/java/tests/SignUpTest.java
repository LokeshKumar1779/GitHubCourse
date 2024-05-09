package tests;

import pages.SignUpPage;

public class SignUpTest extends BaseTest{

    public void verifyUserSignUp(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterAccountInfo("Mr.","01","01","2000");
        signUpPage.enterAddressInfo("AddLine1","AddLine2","City","State","Country","zipcode");
    }
}
