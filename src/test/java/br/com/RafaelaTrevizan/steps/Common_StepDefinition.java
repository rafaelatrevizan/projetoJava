package br.com.RafaelaTrevizan.steps;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import Pages.Common_Page;
import Suporte.geradorNumero;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;

@RunWith(DataDrivenTestRunner.class)

public class Common_StepDefinition extends AbstractPage {
	WebDriver nav = getDriver();
	Common_Page login = new Common_Page(nav);
	geradorNumero gerador = new geradorNumero();
	

	// @Rule
	// public TestRule listen = new TestWatcher() {
	//
	// @Override
	// public void failed(Throwable t, Description description) {
	// System.out.println("test failed");
	// System.out.println(description.getClassName() + "," +
	// description.getMethodName());
	// }
	// };

	@Before
	public void setUp() {
		nav = getDriver();
		nav.manage().window().maximize();
		nav.get("http://192.168.15.100:8080/infotravel/login.xhtml");
		System.out.println("Começando");
	}

	@Dado("^que esteja na home$")
	public void queEstejaNaHomeDoPortal() throws Throwable {
		login.doLogin("homo", "homolog", "123456");
	}

	
//	@AfterMethod
//	public void scrennShotMethod(ITestResult result) throws IOException {
//		if (result.getStatus() == ITestResult.FAILURE ){
//			   TakesScreenshot ts = (TakesScreenshot)nav;
//			   File srcFile = ts.getScreenshotAs(OutputType.FILE);
//			   FileUtils.copyFile(srcFile, new File("target/ScreenShot/" + result.getName()+".jpg"));		
//														}
//	}

	@After(order = 1)
	public void screenShot(Scenario cenario) {		
		    
		File file = ((TakesScreenshot) nav).getScreenshotAs(OutputType.FILE);
		Date data = new Date();
		try {
			FileUtils.copyFile(file, new File("target/ScreenShot/"+ cenario.getStatus()+ " - " + cenario.getId() + "-" + data.getDate() + "-" + data.getMonth() + "-" + data.getYear() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	@After(order = 0)
	public void tearDown() {
		System.out.println("Acabou");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {
		}
		nav.quit();
	}

}
