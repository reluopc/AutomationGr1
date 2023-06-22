package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SignInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);


    @Test
    public void signIn() {

        String email = " grupa1@automation.com";
        String password = "parola";
        String email2 = " grupa1@automation.com";
        String password2 = "parola";

        //tip .. type " sleep 3000" si asteapta 3 secunde pana la urmatorul pas!

        LOG.info("Check 'SignIn' button ");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed");

        LOG.info("Click button ");
        signInPage.clickSignInButton();
        sleep(3000);

        LOG.info("Check Logo");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        sleep(3000);


        LOG.info("Click Enter and check message");
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error message  is not displayed");

        LOG.info("Complete the fields");
        signInPage.typeInSignInField(email);
        signInPage.typeInPasswordField(password);


        LOG.info("Click Enter and check message ");
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error msg is not displayed");


        LOG.info("Complete the fields");
        signInPage.typeInSignInField(email2);
        signInPage.typeInPasswordField(password2);


    }


}
