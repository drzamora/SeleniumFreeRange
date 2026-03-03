package pages;

import java.util.List;

public class PaginaSandbox extends BasePage {

    private String dropdownSandbox = "//label[@for='formBasicSelect']/following::select[1]";

    public PaginaSandbox() {
        super(driver);
    }

    public List<String> returnDropdownValues() {
        return getDropdownValues(dropdownSandbox);
    }

}
