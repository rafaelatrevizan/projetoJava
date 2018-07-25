package br.com.RafaelaTrevizan.steps;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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
	Date data = new Date();
	
	static String horas() {
        DateFormat dateFormat = new SimpleDateFormat("d-MM-yy");
        Date date = new Date();
        return dateFormat.format(date);
    }

//    public static void main(String[] args){
//        System.out.println(horas());
//    }
//	
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

	@After(order = 1)
	public void screenShot(Scenario cenario) {				    
		File file = ((TakesScreenshot) nav).getScreenshotAs(OutputType.FILE);
		try {
			try {Thread.sleep(2000);} catch (InterruptedException ex) {}
			FileUtils.copyFile(file, new File("target/ScreenShot/"+ horas() +"/"+ cenario.getStatus().toUpperCase() + " - " + cenario.getName()
			+ "-" + data.getHours() + data.getMinutes() + data.getSeconds() +".jpg"));
//			FileUtils.copyFile(file, new File("target/ScreenShot/"+ cenario.getStatus()+ " - " + cenario.getId() + "-" + data.getDate() + "-" + data.getMonth() + "-" + data.getYear() + data.getTime()+ ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	@After(order = 0)
	public void tearDown() {
		System.out.println("Acabou");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
		nav.quit();
	}

}
