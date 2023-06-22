package pages.RegisterPage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class); //Mostenirea
    public static  RegisterPage instance; //Singletonul

    private  RegisterPage()
    {

    }

    public  static RegisterPage getInstance() // Metoda pentru accest la RegisterPage
    {
        if(instance==null)
        {
            instance= new RegisterPage();
        }
        return instance;
    }

    private By firstName = By.xpath("//input[@placeholder='First Name']");
    private By lastName = By.xpath("//input[@placeholder='Last Name']");
    private By addressR =By.xpath("//textarea[@ng-model='Adress']");
    private By emailAddress= By.xpath("//input[@type='email']");
    private By phonefield = By.xpath("//input[@type='tel']");
    private By genederMale =By.xpath("//input[@value='Male']");
    private By genederFemale =By.xpath("//input[@value='FeMale']");
    private By checkboxCricket= By.id("checkbox1");
    private By checkboxMovies = By.id("checkbox2");
    private By checkboxHockey = By.id("checkbox3");
    private By choseeFieldLanguage=By.id("msdd");
    String  selectLanguage2= "//a[contains(text(), '%s')]"; // un locator sa nu creem multi locatori ,doar scriem tara la "%s"
    String selectSkill = "Skills";
    private By selectCountry = By.xpath("//span[@role='combobox']");
    private By searchFieldSC = By.xpath("//input[@type='search']");
    private By birthYear = By.id("yearbox");
    private By birthMonth = By.xpath("//select[@placeholder='Month']");
    private By birthDay = By.id("daybox");
    private By firstPassword = By.id("firstpassword");
    private By secondPassword = By.id("secondpassword");














    public void typeFirstName(String fName) {
        LOG.info("Typing name in 'First name field' ");
        driver.findElement(firstName).sendKeys(fName);
    }

    public void typelastName(String lName) {
        LOG.info("Typing name in 'Last name field' ");
        driver.findElement(lastName).sendKeys(lName);
    }

    public void adressField(String adress1) {
        LOG.info("Typing adress in 'Address' ");
        driver.findElement(addressR).sendKeys(adress1);
    }

    public void emailAdressfield(String emailaddress1) {
        LOG.info("Typing adress in 'Email Address field' ");
        driver.findElement(emailAddress).sendKeys(emailaddress1);
    }

    public void enterNrPhone(String nrphone) {
        LOG.info("Typing adress in 'Address' ");
        driver.findElement(phonefield).sendKeys(nrphone);
    }

    public void clickMaleGender() {
        LOG.info("Click gender radio-button 'Male' ");
        driver.findElement(genederMale).click();
    }

    public void clickFemaleGender() {
        LOG.info("Click gender radio-button 'FeMale' ");
        driver.findElement(genederFemale).click();
    }

    public void clickOnCricket() {
        LOG.info("Click on  checkbox  'Cricket' ");
        driver.findElement(checkboxCricket).click();
    }

    public void clickOnMovies() {
        LOG.info("Click on  checkbox  'Movies' ");
        driver.findElement(checkboxMovies).click();
    }

    public void clickOnHockey() {
        LOG.info("Click on  checkbox  'Hockey' ");
        driver.findElement(checkboxHockey).click();
    }


    public void selectLanguage(String language) {
        LOG.info("Click on  language field 'Language' ");
        driver.findElement(choseeFieldLanguage).click();
        driver.findElement(By.xpath(String.format(selectLanguage2,language))).click();
    }

    public void selectSkill(String skill) {
        LOG.info("Click on skill box 'Skills'");
        Select newskill = new Select(driver.findElement(By.id(selectSkill)));
        newskill.selectByValue(skill);
    }

    public void clickSelectCountry(String country3) {
        LOG.info("Select Country  field ");
        driver.findElement(selectCountry).click();
        driver.findElement(searchFieldSC).sendKeys(country3);
        driver.findElement(searchFieldSC).sendKeys(Keys.ENTER);// Aceasta metda este pentru a da ENTER
    }


    public void birthDate(String year, String month, String day) {
        LOG.info("Select Brithdate");
        Select birthYearDate = new Select(driver.findElement(birthYear));
        birthYearDate.selectByValue(year);
        Select birthMonthDate = new Select(driver.findElement(birthMonth));
        birthMonthDate.selectByValue(month);
        Select birthDayDate = new Select(driver.findElement(birthDay));
        birthDayDate.selectByValue(day);
    }

    public void firstPasswordKey (String password,String confrimPassowrd) {

        LOG.info("Enter First password");
        driver.findElement(firstPassword).sendKeys(password);
        driver.findElement(secondPassword).sendKeys(confrimPassowrd);

    }

























}
