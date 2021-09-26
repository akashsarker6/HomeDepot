package step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.ItemDetails;

public class ItemDetailsSteps {

    private static final Logger LOGGER = LogManager.getLogger(ItemDetailsSteps.class);
    WebDriver driver = Hooks.driver;

    @And("User Click on Wireless DoorBell Buttons")
    public void clickOnSearchButtonSteps() {
        new ItemDetails(driver)
                .clickOnSearchButton();
    }
    @And("Click to Open a Hampton Bay")
    public void clickOnHamptonBaySteps() {
        new ItemDetails(driver)
                .clickOnHamptonBay();
    }

    @Then("User should able to see Item Details")
    public void validateItemPageSteps() {
        new ItemDetails(driver)
                .validateItemPage();

    }
}
