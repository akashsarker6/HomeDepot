package step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page_object.LocalAdAndCatalog;

public class LocalAdAndCatalogSteps {

//    private static final Logger LOGGER = LogManager.getLogger(LocalAdAndCatalogSteps.class);
    WebDriver driver = Hooks.driver;

    @And("Click on Local Ad & Catalog")
    public void clickOnLocalADAndCatalogSteps() {
        new LocalAdAndCatalog(driver)
                .clickOnLocalADAndCatalog();
    }

    @Then("User should see the Local Ad & Catalog Page")
    public void valodateLocalAdPageSteps() {
        new LocalAdAndCatalog(driver)
                .valodateLocalAdPage();
    }

}
