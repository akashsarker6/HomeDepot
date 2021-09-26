package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemDetails extends NavigationBar {

    private static final By clickWirelessDoorBellButton = By.xpath("//div[@id='sectionColumn8_thd_7c6e']//img[contains(@class,'stretchy')]");
    private static final By HamptonBay = By.xpath("//img[@title='Wireless Door Bell Push Button, White']");
    private static final By ConfirmationItemDetails = By.xpath("//h1[normalize-space()='Wireless Door Bell Push Button, White']");

    private static final Logger LOGGER = LogManager.getLogger(ItemDetails.class);

    public ItemDetails(WebDriver driver) {
        super(driver);
    }

    public ItemDetails clickOnSearchButton() {
        LOGGER.debug("Click On the Wireless DoorBell");
        ActOn.element(driver, clickWirelessDoorBellButton).click();
        return this;
    }

    public ItemDetails clickOnHamptonBay() {
        LOGGER.debug("Click On the Wireless DoorBell");
        ActOn.element(driver, HamptonBay).click();
        return this;
    }

    public ItemDetails validateItemPage() {
        LOGGER.debug("Validate the Item Details");
        boolean validateAddToCart = driver.findElement(ConfirmationItemDetails).isDisplayed();
        Assert.assertTrue("Landed on Item Details page", validateAddToCart);
        return this;
    }

}
