package step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page_object.StoreLocation;

public class StoreLocationSteps {

//    private static final Logger LOGGER = LogManager.getLogger(StoreLocationSteps.class);
    WebDriver driver = Hooks.driver;

    @And("Click on Store Location Arrow")
    public void clickOnStoreLocationArrowSteps() {
        new StoreLocation(driver)
                .clickOnStoreLocationArrow();
    }

    @And("Click on Find Location Button")
    public void clickOnFindLocationSteps() {
        new StoreLocation(driver)
                .clickOnFindLocation();
    }

    @Then("User should see the Store location")
    public void valodateStoreLocationSteps() {
        new StoreLocation(driver)
                .valodateStoreLocation();
    }
}
