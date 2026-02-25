package pages;

public class SauceDemoProductsPage extends BasePage {

    public SauceDemoProductsPage() {
        super(driver);
    }

    private String addToCartButton(String productName) {
        return "//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button[contains(@id,'add-to-cart')]";
    }

    private String cartBadge = "//span[@class='shopping_cart_badge']";

    public void addProductToCart(String productName) {
        clickElement(addToCartButton(productName));
    }

    public int getCartItemCount() {
        if (isElementDisplayed(cartBadge)) {
            return Integer.parseInt(getText(cartBadge));
        }
        return 0;
    }

    public void navigateToProductsPage() {
        navigateTo("https://www.saucedemo.com/inventory.html");
    }
}