package Pages;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Suporte.Frame;
import junit.framework.Assert;

public class Hotel_Bloqueio_Page extends Base_Page {
	

	public Hotel_Bloqueio_Page(WebDriver nav) {
		super(nav);		
	}

	public Hotel_Bloqueio_Page periodo(String dataInicial, String dataFim) {
		nav.findElement(By.id("dtInicial_input")).click();
		nav.findElement(By.id("dtInicial_input")).sendKeys(dataInicial);
		
		nav.findElement(By.id("dtFinal_input")).click();
		nav.findElement(By.id("dtFinal_input")).sendKeys(dataFim);
		return this;
	}
	
	public Hotel_Bloqueio_Page hotel(String nomeHotel) {
		nav.findElement(By.id("idNomePesquisa")).sendKeys(nomeHotel);
		return this;
	}
	
	public Hotel_Bloqueio_Page buttonPesquisar() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//form[@id = \"frmUhBloqueio\"]/div/div/div/div/div/button/span[text() = \"Pesquisar\"]")).click();
		return this;
	}
	
	public Hotel_Bloqueio_Page buttonEditar() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//form[@id = \"frmUhBloqueio\"]/div/div/div/div/div/button/span[text() = \"Editar\"]")).click();
		return this;
	}
	
	public Hotel_Bloqueio_Page selectQuantidade() {
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//form[@id = \"frmUhBloqueioEdit\"]/div/div/div/div/following-sibling::div")).click();
		return this;
	}
	
	
	public Hotel_Bloqueio_Page chooseQuantidade() {
		// //li[text() = "selecione..."]
		// //li[text() = "Aumentar"]
		// //li[text() = "Diminuir"]
		// //li[text() = "Fixar"]
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[@id = \"pnlAltQtBloqueio\"]/div/div/span")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//li[text() = \"Fixar\"]")).click();
		return this;
	}
	
	public Hotel_Bloqueio_Page Quantidade(String qtdd) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[@id = \"pnlAltQtBloqueio\"]/div/following-sibling::input")).sendKeys(qtdd);
		return this;
	}
	
	public Hotel_Bloqueio_Page select_Hotel() {
		nav.findElement(By.xpath(" //div[@class = \"ContainerIndent\"]/following-sibling::div/div[2]")).click();
		return this;
	}

	
	public Hotel_Bloqueio_Page bloq_salvar() {
		nav.findElement(By.xpath(" //span[text() = \"Salvar\"]")).click();
		return this;
	}
	 
}
