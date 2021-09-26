package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search extends NavigationBar{

    private static final By SearchBar = By.id("headerSearch");
    private static final By SearchBarButton = By.xpath("//button[@id='headerSearchButton']//*[name()='svg']");
    private static final By LandingPageAfterSearch = By.xpath("//h1[normalize-space()='Doorbells']");

    private static final Logger LOGGER = LogManager.getLogger(Search.class);

    public Search(WebDriver driver) {
        super(driver);
    }

    public Search clickOnSearchBar() {
        LOGGER.debug("Click On the Search BAr");
        ActOn.element(driver, SearchBar).click();
        return this;
    }

//    public Search enterSearchItem(String search){
//        LOGGER.debug("User entered the item in the search bar");
//        ActOn.element(driver, SearchBar).setValue(search);
//        return this;
//    }

    public Search clickOnSearchButton() {
        LOGGER.debug("Click On the Search Button");
        ActOn.element(driver, SearchBarButton).click();
        return this;
    }

    public Search valodateSearchBar() {
        LOGGER.debug("Validate the Search Item");
        boolean validationSearch = driver.findElement(LandingPageAfterSearch).isDisplayed();
        Assert.assertTrue("Landed on Local Ad & Catalog Page", validationSearch);
        return this;
    }
}
