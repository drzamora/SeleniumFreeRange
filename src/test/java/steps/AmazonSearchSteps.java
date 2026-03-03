package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AmazonSearchPage;

public class AmazonSearchSteps {

    AmazonSearchPage amazon = new AmazonSearchPage();

    @Given("The user navigates to www.amazon.com")
    public void the_user_navigates_to_www_amazon_com() {
        amazon.navigateToAmazon();
    }

    @And("searches for {word}")
    public void searches_for_criteria(String criteria) {
        amazon.enterSearchCriteria(criteria);
        amazon.clickSearch();
    }

    @And("navigates to the page number {string}")
    public void navigates_to_the_page_number(String pageNumber) {
        amazon.goToPage(pageNumber);
    }

    @And("selects the third item")
    public void selects_the_third_item() {
        amazon.pick3rdItem();
    }

    @Then("the user is able to add it to the cart")
    public void the_user_is_able_to_add_it_to_the_cart() {
        amazon.addToCart();
        Assert.assertEquals("Agregado al carrito", amazon.addedToCartMessage());
    }


}
