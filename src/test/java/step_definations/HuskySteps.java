package step_definations;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page_object.Husky;

public class HuskySteps {

//    private static Logger LOGGER = LogManager.getLogger(HuskySteps.class);

    WebDriver driver = Hooks.driver;

    @And("Click on Husky")
    public void clickOnHuskeyStep() {
        new Husky(driver)
                .clickOnHuskey();
    }

    @Then("User should able to see the Huskey page")
    public void validateHuskyStep () {
        new Husky(driver)
                .validateHuskyPage();
    }


}
