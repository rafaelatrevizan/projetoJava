package Pages;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Suporte.Frame;


public class Aereo_Tarifario_Page extends Base_Page {

	public Aereo_Tarifario_Page(WebDriver nav) {
		super(nav);		
	}
	
	public Aereo_Tarifario_Page addTarifario() {
		nav.findElement(By.xpath("//span[text() = \"Adicionar\"]")).click();
	return this;
	}

	public Aereo_Tarifario_Page Pesquisar() {
		nav.findElement(By.xpath("//span[text() = \"Pesquisar\"]/ancestor::button")).click();
	return this;
	}
	
	public Aereo_Tarifario_Page fillName(String nome) {
		nav.findElement(By.id("idNmTarifa")).sendKeys(nome);		
		return this;
	}
	
	public Aereo_Tarifario_Page fillCiaAerea() {
		//idCiaAerea_0 = selecione
		//idCiaAerea_1 = Avianca
		//idCiaAerea_2 = Azul
		//idCiaAerea_3 = EMIRATES
		//idCiaAerea_4 = GOL
		//idCiaAerea_5 = LATAM
		
		nav.findElement(By.xpath("//label[@id = \"idCiaAerea_label\"]/following-sibling::div")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("idCiaAerea_1")).click();
		
		return this;
	}
	
	public Aereo_Tarifario_Page fillFornecedor() {
		//Sempre o primeiro fornecedor pq só será possível seleciona-lo quando selecioner a Cia aerea
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.xpath("//label[@id = \"idFornecedor_label\"]/following-sibling::div")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("idFornecedor_1")).click();
		
		return this;
	}
}
