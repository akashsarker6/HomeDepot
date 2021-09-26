//package page_object;
//
//import command_providers.ActOn;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class SignIn extends  NavigationBar{
//
//    private static final By MyAccountButton = By.xpath("//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold'][normalize-space()='My Account']");
//    private static final By SignInFromHomePAge = By.xpath("//span[@class='bttn__content'][contains(text(),'Sign in')]");
////    private static final By Email= By.id("email");
////    private static final By Password = By.id("password-input-field");
//    private static final By SignIn = By.xpath("//span[@class='bttn__content'][text()='Sign In']");
////    private static final By WelcomeMSG = By.xpath("//div[@class='welcomeMessage heavyText col__12-12 u--paddingNormal-top u__text-align--center']");
//
//    private static final Logger LOGGER = LogManager.getLogger(SignIn.class);
//
//    public SignIn(WebDriver driver) {
//        super(driver);
//    }
//
//    public SignIn clickOnMyAccount() {
//        LOGGER.debug("Click on My Account");
//        ActOn.element(driver, MyAccountButton).click();
//        return this;
//    }
//
//    public SignIn clickOnSigninButton() {
//        LOGGER.debug("Click on Account Profile");
//        ActOn.element(driver, SignInFromHomePAge).click();
//       return this;
//    }
//
//    public SignIn clickOnSignin() {
//        LOGGER.debug("User clicked on login button");
//        ActOn.element(driver,SignIn).click();
//        return this;
//    }
//
//    public SignIn validateUserLogInSuccessfully() throws InterruptedException {
//        LOGGER.debug("User is on the Home Page");
//        Thread.sleep(20000);
////        boolean welcomeMSG1 = driver.findElement(WelcomeMSG).isDisplayed();
////        Assert.assertTrue("Welcome note will be visible on the page",welcomeMSG1);
//        return this;
//    }
//
//}
