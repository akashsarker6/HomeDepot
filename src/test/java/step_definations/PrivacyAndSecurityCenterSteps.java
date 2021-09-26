package step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page_object.PrivacyAndSecurityCenter;

public class PrivacyAndSecurityCenterSteps {

//    private static Logger LOGGER = LogManager.getLogger(PrivacyAndSecurityCenterSteps.class);
    WebDriver driver = Hooks.driver;

    @And("Click on Privacy and Security Center")
    public void clickOnPrivacyAndPolicySteps () {
        new PrivacyAndSecurityCenter(driver)
                .clickOnPrivacyAndPolicy();
    }

    @Then("User should able to see Privacy and Security Page")
    public void setValidatePrivacyAndSecuritySteps () {
        new PrivacyAndSecurityCenter(driver)
                .setValidatePrivacyAndSecurity();
    }

}
