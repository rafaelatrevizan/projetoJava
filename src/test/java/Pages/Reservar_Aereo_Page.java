package Pages;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



@RunWith(DataDrivenTestRunner.class)

public class Reservar_Aereo_Page extends Base_Page {
	WebDriverWait wda = new WebDriverWait(nav, 10);
	private String valorBusca;
	private String valorReserva;
	private String valorComprovante;

	public Reservar_Aereo_Page(WebDriver nav) {
		super(nav);		
	}
	
	public Reservar_Aereo_Page fillOrigem(String origem) {			
		WebElement webelement = nav.findElement(By.xpath("//input[contains(@id, \"rptTrajeto:0:idAeroOrigem_input\")]"));
		webelement.click();
		webelement.sendKeys(origem);
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}		
		webelement.sendKeys(Keys.ENTER);			
		return this;
	}
	
	public Reservar_Aereo_Page fillDestino(String destino) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}	
		WebElement bla = nav.findElement(By.xpath("//input[contains(@id, \"rptTrajeto:0:idAeroDestino_input\")]"));
		bla.click();
		bla.sendKeys(destino);
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}		
		bla.sendKeys(Keys.TAB);				
		return this;
	}
	
	
	public Reservar_Aereo_Page fillDates (String ida, String volta) {	
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		WebElement partida = nav.findElement(By.id("rptTrajeto:0:dtPartida_input"));
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
		nav.findElement(By.xpath("//div[@id = \"pnlMotorAereo\"]/div/div/div/button/span[2]")).click();
		return this;
	}
	
	public Reserva_Aereo_Cliente_Page selectAereo() {
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}	
		nav.findElement(By.xpath("//span[@id = \"pnlResultadoAereo\"]/div/div[2]/div/div/button")).click();
		return new Reserva_Aereo_Cliente_Page(nav);
	}
	
	public Reservar_Aereo_Page getValorBusca() {
		String valorBusca = nav.findElement(By.xpath("//span[@id = \"rptAereo:0:pnlPrecoAereo\"]/div/following-sibling::span[3]")).getText();
		System.out.println(valorBusca);
		return this;
	}
	
	public Reservar_Aereo_Page getValorReserva() {
		String valorReserva = nav.findElement(By.xpath("//div[@class = \"Fs12 TexAlRight\"]")).getText();
		System.out.println(valorReserva);
		return this;
	}
	
	public Reservar_Aereo_Page getValorComprovante() {
		List<WebElement>  valorComprovante = nav.findElements(By.xpath("//div[contains(text(), \"Total da compra\")]/span"));
		valorComprovante.get(2).getText();
		System.out.println(valorComprovante);
		return this;
	}
	
	public Reservar_Aereo_Page compararValores() {
		if (valorBusca.contains(valorReserva)) {
			System.out.println("O Valor da tela de busca" + valorBusca+ "contém o valor da reserva"+ valorReserva);
		}
		
		if (valorBusca.contains(valorComprovante)) {
			System.out.println("O Valor da tela de busca" + valorBusca+ "contém o valor do comprovante"+ valorComprovante);
		}
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
