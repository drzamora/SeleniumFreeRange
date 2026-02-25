package pages;

public class SauceDemoLoginPage extends BasePage {

    private String usernameInput = "//input[@data-test='username']";
    private String passwordInput = "//input[@data-test='password']";
    private String loginButton = "//input[@data-test='login-button']";
    private String productsTitle = "//span[text()='Products']";

    public SauceDemoLoginPage() {
        super(driver);
    }

    public void navigateToSauceDemo() {
        navigateTo("https://www.saucedemo.com/");
    }

    public void enterUsername(String username) {
        write(usernameInput, username);
    }

    public void enterPassword(String password) {
        write(passwordInput, password);
    }

    public void clickLogin() {
        clickElement(loginButton);
    }

    public boolean isOnProductsPage() {
        return isElementDisplayed(productsTitle);
    }
}