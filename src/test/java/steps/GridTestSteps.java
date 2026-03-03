package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GridPage;

public class GridTestSteps {

    GridPage grid = new GridPage();

    @Given("I navigate to the static table")
    public void navigateToGridPage() throws InterruptedException { //no manjar este tipo de espera implícita, pero es para que funcione bien el ejemplo
        Thread.sleep(2000);
        grid.navigateToGrid();
        grid.clicToAccessGrid();
    }

    @Then("I can return the value I wanted")
    public void returnValue() {
        String value = grid.getValueFromGrid(3, 2);
        Assert.assertEquals("r: 2, c: 1", value);
    }

    @Then("I can validate the table is displayed")
    public void iCanValidateTheTableIsDisplayed() {
        Assert.assertFalse("El elemento está siendo mostrado", grid.cellStatus());//test negativo no debe estar mostrado la tabla
    }
}
