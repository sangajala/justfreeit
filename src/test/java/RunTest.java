import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import utils.Hooks;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:output"},
        tags = {"@SRIRAM"},
        features = "src/test/resources"
)
public class RunTest extends Hooks {
}
