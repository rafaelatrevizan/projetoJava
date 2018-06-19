package Pages;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



@RunWith(DataDrivenTestRunner.class)

public class ReservarPage extends BasePage {

	public ReservarPage(WebDriver nav) {
		super(nav);		
	}
	
	public ReservarPage fillDestino(String destino) {
		nav.switchTo().frame(0);
		nav.findElement(By.xpath("//input[@placeholder = \"Cidade ou hotel de destino\"]")).sendKeys(destino);
		return new ReservarPage(nav);
	}
	
	public ReservarPage fillDates (String entrada, String saida) {
		nav.findElement(By.id("frmMotorHotel:dtPartida_input")).sendKeys(entrada);
		nav.findElement(By.id("frmMotorHotel:dtRetorno_input")).sendKeys(saida);		
		return new ReservarPage(nav);
	}
	
	public ReservarPage clickRes () {
//		nav.findElement(By.id("frmMotorHotel:dtPartida_input")).sendKeys(entrada);
		List<WebElement> pesquisar = nav.findElements(By.xpath("//span[contains(text(), \"Pesquisar\")]"));
		pesquisar.indexOf(4);
		
		//pesquisar = all(:xpath, '//span[contains(text(), "Pesquisar")]')    
	     //  pesquisar[1].click	
		return new ReservarPage(nav);
	}
	

}
