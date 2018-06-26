package Runners;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

import cucumber.api.java.Before;
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
		tags = {"@facilidades"}
		)

public class RunnerTest {
	
	

}