package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Grid.feature", //Directorio de nuestros archivos .feature
        glue = "steps", //Paquete donde tenemos nuestras clases definiendo los steps
        plugin = {"tech.grasshopper.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"},
        tags = "@Test"
)

public class TestGridRunner {
    @BeforeClass
    public static void maximizeScreen() {
        BasePage.maximizeWindow();
    }
    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }

}
