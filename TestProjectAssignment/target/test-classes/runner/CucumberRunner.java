package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue = {"step"},
plugin = {"io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"})
public class CucumberRunner {

}
