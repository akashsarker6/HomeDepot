package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocalAdAndCatalog extends NavigationBar {
    private static final By LocalAdHomePage = By.xpath("//a[contains(text(),'Local Ad & Catalog')]");
    private static final By LandingLocalAdPage = By.xpath("//h2[normalize-space()='Local Ad']");

    private static final Logger LOGGER = LogManager.getLogger(LocalAdAndCatalog.class);

    public LocalAdAndCatalog(WebDriver driver) {
        super(driver);
    }

    public LocalAdAndCatalog clickOnLocalADAndCatalog() {
        LOGGER.debug("Click On the Local Ad & Catalog");
        ActOn.element(driver, LocalAdHomePage).click();
        return this;
    }

    public LocalAdAndCatalog valodateLocalAdPage() {
        LOGGER.debug("Landed on Local Ad & Catalog Page");
        boolean landedOnLocalAdPage = driver.findElement(LandingLocalAdPage).isDisplayed();
        Assert.assertTrue("Landed on Local Ad & Catalog Page", landedOnLocalAdPage);
        return this;
    }

}
