package EbayTestCases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",   // Path of feature files
        glue = {"stepdefinitions"},                 // Package of step defs
        plugin = {
                "pretty",                                      // Console output
                "html:target/cucumber_reports/htmlReport.html", // HTML Report
                "json:target/cucumber_reports/report.json",     // JSON Report
                "junit:target/cucumber_reports/report.xml"      // JUnit Report
        },
        monochrome = true
)
public class testRunner {
}
