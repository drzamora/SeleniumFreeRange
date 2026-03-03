package pages;

public class GridPage extends BasePage {

    private String cell = "//*[@id='root']/div/";
    private String accessGrid = "//*[@id='btn-answer-yes']";
    private String mainTable = "//*[@id='root']/div/table";

    public GridPage() {
        super(driver);
    }

    public void navigateToGrid() {
        driver.get("https://1v2njkypo4.csb.app/");
    }

    public void clicToAccessGrid() {
        clickElement(accessGrid);
    }

    public String getValueFromGrid(int row, int col) {
        return getValueFromTable(cell, row, col);
    }

    public boolean cellStatus() {
        return elementIsDisplayed(mainTable);
    }
}
