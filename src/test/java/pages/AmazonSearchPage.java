package pages;

public class AmazonSearchPage extends BasePage {

    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String thirdResult = "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]";
    private String addToCartButton = "//a[@title='Agregar a la Lista']";
    private String addedMessageText = "";

    public AmazonSearchPage() {
        super(driver);
    }

    public void navigateToAmazon() {
        navigateTo("https://www.amazon.com");
    }

    public void enterSearchCriteria(String criteria) {
        write(searchBox, criteria);
    }

    public void clickSearch() {
        clickElement(searchButton);
    }

    public void goToPage(String pageNumber) {
        goToLinkText(pageNumber);
    }

    public void pick3rdItem() {
        clickElement(thirdResult);
    }

    public void addToCart() {
        clickElement(addToCartButton);
    }

    public String addedToCartMessage() {
        return textFromElement(addedMessageText);
    }

}