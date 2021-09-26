package page_object;


import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Electrical extends NavigationBar {

    private static final By Electrical = By.xpath("//a[@title='Electrical' and @class='MainFlyout__link']");
    private static final By ElectricalPageConfirmation = By.xpath("//h1[normalize-space()='Electrical'][@class='results-header__keyword']");

    private static final Logger LOGGER = LogManager.getLogger(Electrical.class);

    public Electrical(WebDriver driver) {
        super(driver);
    }

//    public Electrical navigateToHomePageForElectrical() {
//        LOGGER.debug("User is on the Home Page");
//        String url = ReadConfigFiles.getPropertyValues("HomeDepotUrl");
//        ActOn.browser(driver).openBrowser(url);
//        return this;
//    }
    public Electrical clickOnElectrical (){
        LOGGER.debug("User Click on on Electrical");
        ActOn.element(driver, Electrical).click();
        return this;
    }
    public Electrical validationforElectricalPage () {
        LOGGER.debug("Validate Electric Page");
        boolean checkElectronicValidation = driver.findElement(ElectricalPageConfirmation).isDisplayed();
        Assert.assertTrue("Electrical name is Displayed on the Page", checkElectronicValidation);
        return this;
    }

}
