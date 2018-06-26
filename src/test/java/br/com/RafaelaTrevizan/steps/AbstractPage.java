package br.com.RafaelaTrevizan.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPage {
	
	protected static WebDriver nav;
	
	protected WebDriver getDriver() {
		
		if(nav == null) {
			nav = new ChromeDriver();
		}
		return nav;
	}

}
