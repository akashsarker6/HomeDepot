package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Help extends NavigationBar {

    public static final By HelpFromHomePage = By.xpath("//a[text()='Help'][@class='TaskLinks__link']");
    public static final By ValidateHelpPage = By.xpath("//h2[normalize-space()='Help and Customer Service Center']");

    private static final Logger LOGGER = LogManager.getLogger(Help.class);

        public Help (WebDriver driver) {
            super(driver);
        }

        public Help clickOnHelp () {
            LOGGER.debug("Click on Help from HomePage");
            ActOn.element(driver, HelpFromHomePage).click();
            return this;
        }

        public Help validateHelp () {
            LOGGER.debug("User should able to see the Help");
            boolean checkValidationForHelp = driver.findElement(ValidateHelpPage).isDisplayed();
            Assert.assertTrue("Help is validated", checkValidationForHelp);
            return this;
        }

    }


