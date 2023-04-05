package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\modin\\IdeaProjects\\BDDFramework\\src\\test\\resources\\Features\\Register.feature",
glue = {"StepDefination"})
public class TestRunner {
}
