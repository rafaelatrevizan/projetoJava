package br.com.RafaelaTrevizan.steps;

import java.util.concurrent.TimeUnit;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ClientePage;
import Pages.ComprovantePage;
import Pages.HomePage;
import Pages.HotelPage;
import Pages.LoginPage;
import Pages.ReservarPage;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Common_StepDefinition extends AbstractPage {
	WebDriver nav = getDriver();

	@Before
	public void setUp() {
		
		nav.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(nav,10);
		nav.manage().window().maximize();
		nav.get("http://192.168.15.100:8080/infotravel/login.xhtml");
		System.out.println("Começando");
	}

	@Dado("^que esteja na home$")
	public void queEstejaNaHomeDoPortal() throws Throwable {
		LoginPage login = new LoginPage(nav);
		login.doLogin("homo", "homolog", "123456");
	}

	@After
	public void tearDown() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ex) {
		}

		nav.quit();
	}

}
