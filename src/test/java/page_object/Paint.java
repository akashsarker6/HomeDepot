package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Paint extends NavigationBar{

    private static final By PaintPage = By.xpath("//a[@class='MainFlyout__link'][normalize-space()='Paint']");
    private static final By PaintValidate = By.xpath("//h1[normalize-space()='Paint']");

    private static final Logger LOGGER = LogManager.getLogger(Paint.class);

    public Paint(WebDriver driver) {
        super(driver);
    }

    public Paint clickOnPaint() {
        LOGGER.debug("Click On the Paint");
        ActOn.element(driver, PaintPage).click();
        return this;
    }

    public Paint validatePaint() {
        LOGGER.debug("User should able to see the Paint Page");
        boolean validatePaintPage = driver.findElement(PaintValidate).isDisplayed();
        Assert.assertTrue("Paint Page is Validated", validatePaintPage);
        return this;

    }
}
