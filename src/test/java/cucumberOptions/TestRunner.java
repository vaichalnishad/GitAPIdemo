package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/java/features",//here u need to give pakage name or full path till feature file
			glue="stepDefinations")//here u need to give pakage name
	public class TestRunner {

}
