package Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/Features",
		glue = "br.com.RafaelaTrevizan.steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report-json"},
		monochrome = false,		
		dryRun = false,
		strict = false,
		snippets = SnippetType.CAMELCASE,
		tags = {"@editarReserva"}
		)

public class RunnerTest {}

