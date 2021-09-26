package step_definations;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.Search;

public class SearchSteps {

    private static final By SearchBar = By.id("headerSearch");

    private static final Logger LOGGER = LogManager.getLogger(SearchSteps.class);
    WebDriver driver = Hooks.driver;

    @And("Click on the Search Bar")
    public void clickOnSearchBarStep() {
        new Search(driver)
                .clickOnSearchBar();
    }

    @When("^User would like to Search \"(.+?)\"$")
    public void enterSearchItem(String search){
        ActOn.element(driver, SearchBar).setValue(search);
        LOGGER.info("User entered the item in the search bar");
    }

    @And("Click on Search Button")
    public void clickOnSearchButtonSteps() {
        new Search(driver)
                .clickOnSearchButton();
    }

    @Then("User should able to see the Search Item")
    public void valodateSearchBarStep() {
        new Search(driver)
                .valodateSearchBar();
    }


}
