package br.com.RafaelaTrevizan.steps;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Pages.Common_Page;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;



@RunWith(DataDrivenTestRunner.class)

public class Common_StepDefinition extends AbstractPage {
	WebDriver nav = getDriver();

	@Before
	public void setUp() {
		
		nav.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(nav,10);
		nav.manage().window().maximize();
		nav.get("http://192.168.15.100:8082/infotravel/login.xhtml");
		System.out.println("Começando");
	}

	@Dado("^que esteja na home$")
	public void queEstejaNaHomeDoPortal() throws Throwable {
		Common_Page login = new Common_Page(nav);
		login.doLogin("homo", "homolog", "123456");
	}
	
	
	@After(order = 1)
    public void screenShot (Scenario cenario){
		File file = ((TakesScreenshot)nav).getScreenshotAs(OutputType.FILE);		
		Date data = new Date();		
		try {
			FileUtils.copyFile(file, new File("target/ScreenShot/"+cenario.getId()+data.getDate()+data.getMonth()+data.getYear()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}	
		 
    }


	@After(order = 0)
	public void tearDown() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ex) {
		}

		nav.quit();
	}

}
