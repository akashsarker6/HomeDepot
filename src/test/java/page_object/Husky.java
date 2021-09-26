package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Husky extends NavigationBar{

    private static final By HuskyHomePage = By.xpath("(//img[@alt='Husky'])[1]");
    private static final By validateHuskey = By.xpath("//h1[normalize-space()='Husky'][@class='results-header__keyword']");

    private static final Logger LOGGER = LogManager.getLogger(Husky.class);

    public Husky(WebDriver driver) {
        super(driver);
    }

    public Husky clickOnHuskey() {
        LOGGER.debug("Click on the Husky Page");
        ActOn.element(driver, HuskyHomePage).click();
        return this;
    }

    public Husky validateHuskyPage () {
        LOGGER.debug("User should able to see the Husky Page");
        boolean validateHuskeyPage = driver.findElement(validateHuskey).isDisplayed();
        Assert.assertTrue("Husky page is validating",validateHuskeyPage);
        return this;
    }

}
