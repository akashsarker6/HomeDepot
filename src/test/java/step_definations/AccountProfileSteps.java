package step_definations;


import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.AccountProfile;

public class AccountProfileSteps {

    private static final By Email= By.id("email");
    private static final By Password = By.id("password-input-field");

    private static final Logger LOGGER = LogManager.getLogger(AccountProfileSteps.class);
    WebDriver driver = Hooks.driver;

    @And("Click on My Account")
    public void clickOnMyAccountSteps() {
        new AccountProfile(driver)
                .clickOnMyAccount();
    }

    @And("Click on Sign in button")
    public void clickOnSigninButtonSteps() {
        new AccountProfile(driver)
                .clickOnSigninButton();
    }

    @When("^user enters email \"(.+?)\" and password \"(.+?)\"$")
    public void enterUserCredentials(String email, String password) {
        ActOn.element(driver, Email).setValue(email);
        ActOn.element(driver, Password).setValue(password);
        LOGGER.info("user has entered Credentials");
    }

    @And("Click on Sign In")
    public void clickOnSigninSteps() {
        new AccountProfile(driver)
                .clickOnSignin();
    }


    @And("Click on Hello My Account")
    public void clickOnHelloAccountSteps () {
        new AccountProfile(driver)
                .clickOnHelloAccount();
    }

    @And("Click On Account Profile")
    public void clickOnAccountProfileSteps () {
        new AccountProfile(driver)
                .clickOnAccountProfile();
    }

    @Then("User should able to see the Account Profile")
    public void validateAccountProfileSteps () {
        new AccountProfile(driver)
                .validateAccountProfile();
    }

}
