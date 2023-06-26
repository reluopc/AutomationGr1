package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.RegisterPage.RegisterPage;
import pages.SignInPage.SignInPage;
import pages.SwitchToPage.SwitchToAlertPage;
import tests.SignInTest.SignInTest;


public class BaseTest {
    public SignInPage signInPage =SignInPage.getInstance();
    public RegisterPage registerPage= RegisterPage.getInstance();
    public SwitchToAlertPage switchToAlertPage=SwitchToAlertPage.getInstance();


    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }


}
