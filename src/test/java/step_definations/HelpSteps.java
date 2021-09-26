package step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page_object.Help;


public class HelpSteps {

    WebDriver driver = Hooks.driver;

    @And("Click on Help from HomePage")
    public void clickOnNewLowerPriceSteps () {
        new Help(driver)
                .clickOnHelp();
    }

    @Then("User should able to see the Help")
    public void validateNewLowerPriceSteps () {
        new Help(driver)
                .validateHelp();
    }

}
