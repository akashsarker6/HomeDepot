package step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import page_object.Paint;

public class PaintSteps {

    //private static final Logger LOGGER = LogManager.getLogger(PaintSteps.class);
    WebDriver driver = Hooks.driver;

    @And("Click on Paint")
    public void clickOnPaintStep() {
        new Paint(driver)
                .clickOnPaint();
    }

    @Then("User should open the Paint Page")
    public void validatePaintStep () {
        new Paint(driver)
                .validatePaint();
    }
}
