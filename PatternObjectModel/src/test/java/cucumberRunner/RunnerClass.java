package cucumberRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/java/features"}
,glue= {"steps","pages"}
,tags= {"@Sanity"})
public class RunnerClass {
	
	

}
