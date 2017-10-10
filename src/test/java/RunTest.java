import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:output"},
        tags = {"@SRIRAM"},
        features = "src/test/resources"
)
public class RunTest extends Hooks {
}
