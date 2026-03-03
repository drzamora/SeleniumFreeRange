package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage {

    private String searchField = "//body/from/[1]/input[1]";
    private String searchResults = "name";

    public ListPage() {
        super(driver);
    }

    // Navigate to the list page
    public void navigateToListPage() {
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");//buscar una pagina con una lista con busqueda para escribir
    }

    // Enter search criteria in the search field
    public void enterSearchCriteria(String state) throws InterruptedException {
        try {
            Thread.sleep(600);
            write(searchField, state);
        } catch (NoSuchElementException e) {
            System.out.println("The WebElement Search Field couldn't be found");
            e.printStackTrace();
        }
    }

    // Get all search results as a list of strings
    public List<String> getAllSearchResults() {
        List<WebElement> list = bringMeAllElements(searchResults);
        List<String> stringFromList = new ArrayList<String>();
        
        for (WebElement e : list) {
            stringFromList.add(e.getText());
        }
        return stringFromList;
    }

    


}
