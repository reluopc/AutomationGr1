package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.RegisterPage.RegisterPage;
import tests.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String fName = "Relu";
    String lName = "OPC";
    String adress1= "Str.Plantelor";
    String emailAddress=" relu.scropion14@yahoo.com";
    String nrPhone="07524234405";
    String language2="Romanian";
    String skill1 = "Ruby";
    String countrySr= "Japan";
    String year = "1992";
    String month = "February";
    String day = "21";
    String firstpassword1="Abcceea..";
    String secoundpassword1="Abcceea..";


    @Test
    public void register() {
        driver.get(newUrl);

        LOG.info("Complete the first name and last name");
        registerPage.typeFirstName(fName);
        registerPage.typelastName(lName);
        registerPage.adressField(adress1);
        registerPage.emailAdressfield(emailAddress);
        registerPage.enterNrPhone(nrPhone);
        registerPage.clickMaleGender();
        registerPage.clickFemaleGender();
        registerPage.clickOnCricket();
        registerPage.clickOnMovies();
        registerPage.clickOnHockey();
        registerPage.selectLanguage(language2);
        LOG.info("Click skill dropdown button");
        registerPage.selectSkill(skill1);
        LOG.info("Click select country field");
        registerPage.clickSelectCountry(countrySr);
        LOG.info("Select Birth Date");
        registerPage.birthDate(year,month,day);
        registerPage.firstPasswordKey(firstpassword1,secoundpassword1);



        LOG.info("Upload File");
        registerPage.uploadFile();


        LOG.info("Click on 'Submit' button ");
        registerPage.clickSubmitB();

    }
}
