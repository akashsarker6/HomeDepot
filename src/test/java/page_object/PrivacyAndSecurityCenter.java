package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrivacyAndSecurityCenter extends NavigationBar{

    public static final By PrivacyHomePage = By.xpath("//a[normalize-space()='Privacy & Security Center']");
    public static final By validatePrivacyAndSecurity = By.xpath("(//h2[normalize-space()='Privacy & Security Center'])[1]");

    private static final Logger LOGGER = LogManager.getLogger(PrivacyAndSecurityCenter.class);

    public PrivacyAndSecurityCenter(WebDriver driver) {
        super(driver);
    }

    public PrivacyAndSecurityCenter clickOnPrivacyAndPolicy () {
        LOGGER.debug("Click On the Privacy and Security Center");
        ActOn.element(driver, PrivacyHomePage).click();
        return this;
    }

    public PrivacyAndSecurityCenter setValidatePrivacyAndSecurity () {
        LOGGER.debug("User should able to see Privacy and Security Page");
        boolean checkPrivacyValidation = driver.findElement(validatePrivacyAndSecurity).isDisplayed();
        Assert.assertTrue("Privacy page is validated",checkPrivacyValidation);
        return this;
    }
}
