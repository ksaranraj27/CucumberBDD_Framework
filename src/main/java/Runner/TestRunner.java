package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


/**
 * @author Saran
 *
 * *Types of cucumber options
 * 1.dryRun
 * 			When dryrun = true then it will check for the steps in feature file has their implementation in stepsdefinition , 
 *          execution will not be triggered unless dryrun = false
 * 2.Features
 * 		    path of the feature file
 * 3.Glue
 * 		     path of step definition file
 * 4.Tags
              
 * 5.MonoChrome
 * 			Display the console output in proper format
 * 6.Format
 * 	        Reporting with different format
 * 7.Strict
 *        When strict=true it will check the steps in feature file and its implemention in stepsDefinition , it will execute and ask us to implement the missing step
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features="S:\\Personal\\MyWorkspace\\CucumberBDD_Framework\\src\\main\\java\\Features\\tagging.feature",
		glue= {"stepDefinition"},
		format= {"pretty","html:test-output"},
		dryRun=true,
		monochrome=true,
		strict=true,
		tags= {"~@smoke","@Regression"}
		
		)

public class TestRunner {
	
	

}
