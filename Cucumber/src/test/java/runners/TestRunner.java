package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//glue é o package que contém os passos
@CucumberOptions(features = "src/test/resources/FunctionalTest",glue = {"stepsDefinition"})
public class TestRunner {

	public TestRunner() {
		
	}

}
