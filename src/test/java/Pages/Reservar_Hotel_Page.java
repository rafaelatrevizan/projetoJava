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

public class Reservar_Hotel_Page extends Base_Page {

	public Reservar_Hotel_Page(WebDriver nav) {
		super(nav);		
	}
	
	public Reservar_Hotel_Page fillDestino(String destino) {
		nav.switchTo().frame(0);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		WebElement webElement = nav.findElement(By.xpath("//input[contains(@id, \"frmMotorHotel:idDestinoHotel_input\")]"));
		webElement.click();
		webElement.sendKeys(destino);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
		
		webElement.sendKeys(Keys.TAB);		
		
		return this;
	}
	
	public Reservar_Hotel_Page fillDates (String entrada, String saida) {
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		WebElement ent = nav.findElement(By.id("frmMotorHotel:dtPartida_input"));
		ent.sendKeys(entrada);
		
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		
		WebElement sai = nav.findElement(By.id("frmMotorHotel:dtRetorno_input"));
		sai.click();
		sai.sendKeys(saida);
		sai.sendKeys(Keys.TAB);
		
		
		return this;
	}
	
	public Reservar_Hotel_Page clickPesquisar () {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.xpath("//form[@id = \"frmMotorHotel\"]/div/following-sibling::div/div/div/div/following-sibling::div/button")).click();
		return this;
	}
	
	public Reservar_Hotel_Page comboQtClientes () {
		WebElement lala = nav.findElement(By.xpath("//i[@class =\"icon-edit-1 Fs18\"]"));
		lala.click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		WebElement lolo = nav.findElement(By.xpath("//div[@class =\"ui-overlaypanel-content\"]/following-sibling::a"));
		lolo.click();				
		
		return this;
	}
	
	public Reserva_Hotel_Cliente_Page selectHotel() {
			
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}		
		nav.findElement(By.xpath("//button[contains (@id, \"pnlHotelPesquisa\")]")).click();
		
		// //span[@id = \"pnlResultadoHotel\"]/div/div/div/div/following-sibling::div/div/div/div/div/following-sibling::div/button
			
		return new Reserva_Hotel_Cliente_Page(nav);
	}

	

}
