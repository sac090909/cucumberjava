package testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/featurefiles", glue="stepdefinations", dryRun=false, monochrome=true, plugin= {"pretty","html:target/cucumber-html-report", "json:target/cucumber-json-report.json"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object [][] scenarios() {
		
		return super.scenarios();
		
		
	}

}
