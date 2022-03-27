package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
                 glue = {"hooks", "steps"},
                 stepNotifications = true,
                 monochrome = true,
                 tags = "@login or @search or @cart",
                 plugin = {
                        "pretty",
                        "html:target/cucumber-report.html"})

public class TestRunner {
}
