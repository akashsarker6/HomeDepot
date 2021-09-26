package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountProfile extends NavigationBar{
    private static final Logger LOGGER = LogManager.getLogger(AccountProfile.class);

    private static final By MyAccountButton = By.xpath("//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold'][normalize-space()='My Account']");
    private static final By SignInFromHomePAge = By.xpath("//span[@class='bttn__content'][contains(text(),'Sign in')]");
    private static final By SignIn = By.xpath("//span[@class='bttn__content'][text()='Sign In']");
    private static final By AccountProfile = By.id("headerMyAccountProfile");
    private static final By validateProfile = By.xpath("//h1[normalize-space()='Profile']");
    private static final By HelloMyAccount = By.xpath("//a[@id='headerMyAccount']//div[@class='MyAccount__userInfo SimpleFlyout__link--bold']");

    public AccountProfile(WebDriver driver) {
        super(driver);
    }

    public AccountProfile clickOnMyAccount() {
        LOGGER.debug("Click on My Account");
        ActOn.element(driver, MyAccountButton).click();
        return this;
    }

    public AccountProfile clickOnSigninButton() {
        LOGGER.debug("Click on Account Profile");
        ActOn.element(driver, SignInFromHomePAge).click();
        return this;
    }

    public AccountProfile clickOnSignin() {
        LOGGER.debug("User clicked on login button");
        ActOn.element(driver,SignIn).click();
        return this;
    }

    public AccountProfile clickOnHelloAccount () {
        ActOn.element(driver,HelloMyAccount).click();
        LOGGER.info("User is Click on the Hello My Account");
        return this;
    }

    public AccountProfile clickOnAccountProfile () {
        ActOn.element(driver,AccountProfile).click();
        LOGGER.info("User is Click on the Account Profile");
        return this;
    }

    public AccountProfile validateAccountProfile () {
        LOGGER.debug("Validate Account Profile Page");
//        Thread.sleep(20000);
        boolean accountProfileValidation = driver.findElement(validateProfile).isDisplayed();
        Assert.assertTrue("User should able to see the ", accountProfileValidation);
        return this;

    }

}
