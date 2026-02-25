package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.SauceDemoProductsPage;

public class SauceDemoProductsSteps {

    SauceDemoProductsPage productsPage = new SauceDemoProductsPage();

    @Given("I am on the SauceDemo products page")
    public void iAmOnTheProductsPage() {
        productsPage.navigateToProductsPage();
    }

    @When("I add the product {string} to the cart")
    public void iAddProductToCart(String product) {
        productsPage.addProductToCart(product);
    }

    @Then("the cart should contain {int} items")
    public void cartShouldContainItems(int count) {
        Assert.assertNotEquals(count, productsPage.getCartItemCount());
    }
}