package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\QA\\Selenium_Workspace\\MailBDDFramework\\src\\main\\java\\Feature\\OrganizerMaps.feature",
		//the path of the feature files
		glue={"stepdefinitions"},
		plugin= {"pretty","html:test-output","junit:junit_xml/cucumber.xml"},
		monochrome= true,
		stepNotifications= true,
		dryRun= false
		//tags= "~@SmokeTest or ~@RegressionTest or ~@End2EndTest"
		
		)

public class TestRunner {

}

//This is for api.cucumber
//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest