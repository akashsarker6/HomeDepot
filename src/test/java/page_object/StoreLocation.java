package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoreLocation extends NavigationBar{

    public static final By StoreLocationArrow = By.xpath("//div[@class='MyStoreWrapper']//*[name()='svg']");
    public static final By FindStoreButton = By.xpath("//span[normalize-space()='Find Other Stores']");
    public static final By FindStorePage = By.xpath("//h3[normalize-space()='Find Your Store']");

    private static final Logger LOGGER = LogManager.getLogger(StoreLocation.class);

    public StoreLocation(WebDriver driver) {
        super(driver);
    }
    public StoreLocation clickOnStoreLocationArrow() {
        LOGGER.debug("Click On the Store Location Arrow");
        ActOn.element(driver, StoreLocationArrow).click();
        return this;
    }

    public StoreLocation clickOnFindLocation() {
        LOGGER.debug("Click On the Find Location Button");
        ActOn.element(driver, FindStoreButton).click();
        return this;
    }

    public StoreLocation valodateStoreLocation() {
        LOGGER.debug("Landed on Find Location Page");
        boolean landedOnFindLocation = driver.findElement(FindStorePage).isDisplayed();
        Assert.assertTrue("Landed on Local Ad & Catalog Page", landedOnFindLocation);
        return this;
    }

}
