package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/features",
					glue={"StepDefination"},
					plugin = {"pretty","html:target/HTML/htmlreport2.html",
										"json:target/JSON/jsonreport2",
										"junit:target/JUNIT/junitreport2"})
public class TestRunner {

}
