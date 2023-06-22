package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;


    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }


    // Acest cod  este pentru   buttonul de SignIn
    // Locator
    private By signInButton = By.id("btn1");
    private By skipSignInButton = By.id("btn2");
    private By logo = By.id("logo");
    private By signInEmailField = By.xpath("//input[@placeholder='E mail']");
    private By signInPasswordField = By.xpath("//input[@placeholder='Password']");
    private By enterButton = By.id("enterbtn");
    private By errorMsg = By.id("errormsg");
    private By signUpEmailField= By.id("email");
    private By enterSignUpButton= By.id("enterimg");
    private By verifyLogoIndex = By.id("logo");



    //Metoda sa verifica daca este afisat
    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'SignIn' button is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }


    public void clickSignInButton() {
        LOG.info("Click 'SignIn' button ");
        driver.findElement(signInButton).click();
    }


    public boolean isLogoDisplayed() {
        LOG.info("Verify if  Logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }


    public void typeInSignInField(String email) {
        LOG.info("Typing email address in 'E mail field' ");
        driver.findElement(signInEmailField).sendKeys(email);
    }


    public void typeInPasswordField(String password) {
        LOG.info("Typing password in 'Password field' ");
        driver.findElement(signInPasswordField).sendKeys(password);
    }

    public void clickEnterButton() {
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }


    public boolean isErrorMessageDisplayed() {
        LOG.info("Verify  if error message is displayed");
        return driver.findElement(errorMsg).isDisplayed();
    }

    public void ClickSkipSignInButton() {
        LOG.info("Click 'SkipSignIn' button ");
        driver.findElement(skipSignInButton).click();
    }

    public void typeInSignUpEmailField(String email ) {
        LOG.info("Typing email address in 'SignUp' field ");
        driver.findElement(signUpEmailField).sendKeys(email);
    }



    //This metod we use for " click back" on browser.
    public void clickBack()
    {
        LOG.info("Click back in browser");
        driver.navigate().back();
    }

    public void clickEnterSignUpButton() {
        LOG.info("Click 'SkipSignIn' button ");
        driver.findElement(enterSignUpButton).click();
    }

    public boolean tryVerifyLogoIndex()
    {
        LOG.info("Verify Logo on Index page");
        return driver.findElement(verifyLogoIndex).isDisplayed();

    }






}


