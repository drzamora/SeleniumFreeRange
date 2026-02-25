package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.SauceDemoLoginPage;

public class SauceDemoLoginSteps {

    SauceDemoLoginPage loginPage = new SauceDemoLoginPage();

    @Given("I am on the SauceDemo login page")
    public void iAmOnTheSauceDemoLoginPage() {
        loginPage.navigateToSauceDemo();
    }

    @When("I enter the username {string} and the password {string}")
    public void iEnterTheUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLogin();
    }

    @Then("I should see the products page")
    public void iShouldSeeTheProductsPage() {
        Assert.assertTrue(loginPage.isOnProductsPage());
    }
}