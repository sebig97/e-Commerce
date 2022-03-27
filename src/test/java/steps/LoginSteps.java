package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import testbase.BaseClass;
import utils.CommonMethods;
import utils.ConfigsReader;
import utils.Constants;


public class LoginSteps extends CommonMethods {

    @Given("user wants to sign in")
    public void userWantsToSignIn() {
        click(loginPage.signinButton);
    }

    @When("user enters valid username")
    public void userEntersValidUsername() {
        sendText(loginPage.username, ConfigsReader.getProperty("username"));
    }

    @And("user enters valid password")
    public void userEntersValidPassword() {
        sendText(loginPage.password, ConfigsReader.getProperty("password"));
    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        click(loginPage.loginButton);
        wait(2);
    }

    @Then("I validate that user is logged in")
    public void iValidateThatUserIsLoggedIn() {
        Assert.assertTrue(mainPage.signout.isDisplayed());
    }

}
