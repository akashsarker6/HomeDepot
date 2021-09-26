//package step_definations;
//
//import command_providers.ActOn;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import page_object.SignIn;
//
//
//public class SignInSteps {
////    private static final By Email= By.id("email");
////    private static final By Password = By.id("password-input-field");
//
//    private static final Logger LOGGER = LogManager.getLogger(SignInSteps.class);
//    WebDriver driver = Hooks.driver;
//
//
////    @Given("User on the Home Page")
////    public void navigateToHomePage() {
////        ActOn.browser(driver).openBrowser("https://www.homedepot.com/");
////        LOGGER.info("user is in the Home Page");
////    }
//
////    @And("Click on My Account")
////    public void clickOnMyAccountSteps() {
////        new SignIn(driver)
////                .clickOnMyAccount();
////    }
//
////    @And("Click on Sign in button")
////    public void clickOnSigninButtonSteps() {
////        new SignIn(driver)
////                .clickOnSigninButton();
////    }
////
////    @When("^user enters email \"(.+?)\" and password \"(.+?)\"$")
////    public void enterUserCredentials(String email, String password) {
////        ActOn.element(driver, Email).setValue(email);
////        ActOn.element(driver, Password).setValue(password);
////        LOGGER.info("user has entered Credentials");
////    }
////
////    @And("Click on Sign In")
////    public void clickOnSigninSteps() {
////        new SignIn(driver)
////                .clickOnSignin();
////    }
//
//
//    @Then("user is navigated to home page")
//    public void validateUserLogInSuccessfully() throws InterruptedException {
//        new SignIn(driver)
//                .validateUserLogInSuccessfully();
//    }
//
//}
