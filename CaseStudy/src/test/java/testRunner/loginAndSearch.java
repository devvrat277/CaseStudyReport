package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="feature\\SearchEngine.feature",
		glue= {"stepdefination"},
		plugin= {"pretty","json:target/case1.json"}
		)
		
public class loginAndSearch {
	

	
}
