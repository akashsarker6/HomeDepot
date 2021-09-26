package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"step_definations"},
//        tags = "@Help",
        plugin = {"pretty","summary","json:target/cucumber.json"}

)
public class TestRunner {
}
