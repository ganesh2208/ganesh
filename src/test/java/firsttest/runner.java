package firsttest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"json:src/test/java/firsttest/github/report.json"}
		
		)


public class runner 
{

	
}
