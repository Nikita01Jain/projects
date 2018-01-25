package cucumberTest;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"},
        features = {"C:\\Users\\Nikita\\eclipse-workspace\\testing\\Features"},
        glue = {"C:\\Users\\Nikita\\eclipse-workspace\\testing\\src\\test\\java\\stepdefinitions\\stepdefinition.java"}
        )
public class CucumberRunner {
	

}
