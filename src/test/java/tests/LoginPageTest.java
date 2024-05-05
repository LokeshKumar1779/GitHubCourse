package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class LoginPageTest extends BaseTest{

    HomePage homePage;
    private LoginPage loginPage;

    @Test(description = "verify user login")
    public void verifyUserIsSuccessfullyLoggedIn(){
        homePage = new HomePage(driver);

        // Home page loaded
        Assert.assertTrue(homePage.homePageLoaded());
        loginPage = homePage.clickSignUpLoginLink();
        loginPage.enterLoginCredentials("kumarl01@gmail.com","password").clickLoginButton();

        // Verify user is successfully logged in
        Assert.assertTrue(loginPage.isUserSuccessfullyLoggedIn());
    }


}
