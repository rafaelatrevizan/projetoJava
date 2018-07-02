package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



@RunWith(DataDrivenTestRunner.class)

public class Reservar_Aereo_Page extends Base_Page {

	public Reservar_Aereo_Page(WebDriver nav) {
		super(nav);		
	}
	
	public Reservar_Aereo_Page fillOrigem(String origem) {			
		WebElement webelement = nav.findElement(By.xpath("//input[contains(@id, \"rptTrajeto:0:idAeroOrigem_input\")]"));
		webelement.click();
		webelement.sendKeys(origem);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		webelement.sendKeys(Keys.ENTER);			
		return this;
	}
	
	public Reservar_Aereo_Page fillDestino(String destino) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}	
		WebElement bla = nav.findElement(By.xpath("//input[contains(@id, \"rptTrajeto:0:idAeroDestino_input\")]"));
		bla.click();
		bla.sendKeys(destino);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		bla.sendKeys(Keys.TAB);				
		return this;
	}
	
	
	public Reservar_Aereo_Page fillDates (String ida, String volta) {		
		WebElement partida = nav.findElement(By.id("rptTrajeto:0:dtPartida_input"));
//		partida.click();
		partida.sendKeys(ida);	
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		WebElement retorno = nav.findElement(By.id("rptTrajeto:0:dtRetorno_input"));
		retorno.click();
		retorno.sendKeys(volta);
		
		retorno.sendKeys(Keys.TAB);	
		
		return this;
	}
	
	public Reservar_Aereo_Page clickPesquisar () {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		nav.findElement(By.xpath("//form[@id = \"frmMotorAereo\"]/div/div/div/div[3]/button")).click();
		return this;
	}
	
//	public Reservar_Aereo_Page comboQtClientes () {
//		WebElement lala = nav.findElement(By.xpath("//i[@class =\"icon-edit-1 Fs18\"]"));
//		lala.click();
//		
//		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
//		
//		WebElement lolo = nav.findElement(By.xpath("//div[@class =\"ui-overlaypanel-content\"]/following-sibling::a"));
//		lolo.click();				
//		
//		return this;
//	}

	

}
