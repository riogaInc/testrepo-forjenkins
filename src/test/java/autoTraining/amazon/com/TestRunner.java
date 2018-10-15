package autoTraining.amazon.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature"
		,glue={"StepDefinition"}
//		,tags= {"@RegisterAPI"}
		,plugin = { "pretty", "html:target/Report","json:target/Report/test-report.json"}
		,monochrome = true
		)

public class TestRunner {
	
}
