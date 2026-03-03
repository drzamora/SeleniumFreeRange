package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryPage extends BasePage {


    @FindBy(id = "botton")
    WebElement botton;

    public PageFactoryPage() {
        super(driver);
        driver.get("www.google.com");
    }
}
