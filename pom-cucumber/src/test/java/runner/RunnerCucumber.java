package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;

@CucumberOptions(features="src/test/java/feature/SalesforceAcnt.feature",
				glue={"stepDefinition"},
				publish=true,
				monochrome=true)
public class RunnerCucumber extends BaseClass{

}
