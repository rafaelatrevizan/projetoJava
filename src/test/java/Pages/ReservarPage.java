package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



@RunWith(DataDrivenTestRunner.class)

public class ReservarPage extends BasePage {

	public ReservarPage(WebDriver nav) {
		super(nav);		
	}
	
	public ReservarPage fillDestino(String destino) {
		nav.switchTo().frame(0);
		nav.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webElement = nav.findElement(By.xpath("//input[contains(@id, \"frmMotorHotel:idDestinoHotel_input\")]"));
		webElement.sendKeys(destino);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
		
		webElement.sendKeys(Keys.ENTER);		
		
		return new ReservarPage(nav);
	}
	
	public ReservarPage fillDates (String entrada, String saida) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("frmMotorHotel:dtPartida_input")).sendKeys(entrada);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("frmMotorHotel:dtRetorno_input")).sendKeys(saida);		
		return new ReservarPage(nav);
	}
	
	public ReservarPage clickRes () {
		List<WebElement> lala = nav.findElements(By.className("//span[@class = \"ui-button-text ui-c\"]"));
		 System.out.println("AQUIIIIII " + lala.size());
		 
		 
//		lala.get(6).click();
		
		return new ReservarPage(nav);
	}
	

}
