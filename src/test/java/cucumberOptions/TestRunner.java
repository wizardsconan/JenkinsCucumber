/**
 * 
 */
package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author nttua
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue = {"stepDefinations"}
		//,dryRun = true		//dryRun option can either set as true or false. If it is set as true, it means that Cucumber will only checks that every Step mentioned in the Feature File have corresponding code written in Step Definition file or not.
		,monochrome = true //This option can either set as true or false. If it is set as true, it means that the console output for the Cucumber test are much more readable.
		)
public class TestRunner {

}
