package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.SignInTest.SignInTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SwitchToAlertTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    private String newUrl = getBaseUrl() + "Alerts.html";


    String cancelMessage = "You Pressed Cancel";

    @Test
    public void switchToAlertTest() {
        driver.get(newUrl);

        LOG.info("Click on'Alert with OK' button");

        switchToAlertPage.clickTriggerAlertWithOkButton();

        LOG.info("Click on 'Alert With Ok And Cancel' tab");
        switchToAlertPage.clickAlertWithOkAndCancel();

        LOG.info("Click on 'Cancel' button");
        switchToAlertPage.clickAlertConfirmCancel();
        String cancelMessageConfirmation = switchToAlertPage.getCancelConfirmationMesage(); // Comparatie intre valorile definite pe variabila de mai sus, valoarea fiind textul ce dorim sa il confirmam gasit in elementul paginii
        Assert.assertEquals(cancelMessage,cancelMessageConfirmation,"The values are not equal");

        LOG.info("Click on'Alert with TextBox'");
        switchToAlertPage.clickAlertWithTextBox();

        LOG.info("Click and write message");
        switchToAlertPage.clickAlertWithTextBox();
    }

}




