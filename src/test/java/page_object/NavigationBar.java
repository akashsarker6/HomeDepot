package page_object;

import command_providers.ActOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {

    private static final By HomeDepotLogo = By.xpath("//a[@title='The Home Depot']//*[name()='svg']");
//    private static final By MyAccountButton = By.xpath("//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold'][normalize-space()='My Account']");
    private static final By AllDepartment = By.xpath("//a[contains(text(),'All Departments') and @data-id='departmentsFlyout']");
//    private static final By Electrical = By.xpath("//a[@title='Electrical' and @class='MainFlyout__link']");

    public WebDriver driver;
    public NavigationBar(WebDriver driver) {
        this.driver=driver;
    }

    //HomeDepot Home Page
    public Home navigateToHome () {
        ActOn.element(driver, HomeDepotLogo).click();
        return new Home();
    }

    //Mouse Hover On All Department
    public NavigationBar mouseHoverToAllDepartment () {
        ActOn.element(driver, AllDepartment).mouseOver();
        return this;
    }

//    //Click On the Electrical
//    public Electrical clickOnElectrical () {
//        ActOn.element(driver, Electrical).click();
//        return new Electrical();
//    }




}
