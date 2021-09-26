package step_definations;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Electrical;
import page_object.NavigationBar;
import utilities.ReadConfigFiles;

public class ElectricalSteps {

    private static final Logger LOGGER = LogManager.getLogger(ElectricalSteps.class);
    WebDriver driver = Hooks.driver;

    @Given("User on the Home Page")
    public void navigateToHomePageForElectrical() {
        String url = ReadConfigFiles.getPropertyValues("HomeDepotUrl");
        ActOn.browser(driver).openBrowser(url);
        LOGGER.info("User is on the Home Page");
    }

    @When("User Mouse hover on All Departments")
    public void mouseHoverToAllDepartments() {
        new NavigationBar(driver)
                .mouseHoverToAllDepartment();
    }

    @And("Click on Electrical")
    public void clickOnElectrical() {
        new Electrical(driver)
                .clickOnElectrical();
    }

    @Then("User should open the Electrical Page")
    public void valodateElectricalPage() {
        new Electrical(driver)
                .validationforElectricalPage();
    }

}
