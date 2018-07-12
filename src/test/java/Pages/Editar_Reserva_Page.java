package Pages;

import java.util.List;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



@RunWith(DataDrivenTestRunner.class)

public class Editar_Reserva_Page extends Base_Page {

	public Editar_Reserva_Page(WebDriver nav) {
		super(nav);		
	}
	
	public Editar_Reserva_Page selectReserva() {
		nav.findElement(By.xpath("//tbody[@id = \"pnlReservaList_data\"]/tr/td[9]/span/following-sibling::a")).click();		
		return this;
	}
	
	public Editar_Reserva_Page clickEdit () {
	    nav.findElement(By.xpath("//div[@id= \"tab-hotel\"]/div/div/div/a/i[@class = \"icon-edit\"]")).click();	
		return this;
	}
	
	public Editar_Reserva_Page addAcomodacao (
			String descricao,
			String categoria, 
			String regime, 
			String utiInicial, 
			String utiFinal, 
			String nomeHospede,
			String sobrenomeHospede) {
	    try {Thread.sleep(1000);} catch (InterruptedException ex) {}
	    nav.findElement(By.xpath("//span[text() = \"Acomodações\"]/following-sibling::a/i")).click();
	    try {Thread.sleep(1000);} catch (InterruptedException ex) {}
	    nav.findElement(By.id("idUh")).sendKeys(descricao);
	    nav.findElement(By.id("idCategoria")).sendKeys(categoria);
	    nav.findElement(By.id("idRegime")).sendKeys(regime);
	    nav.findElement(By.id("dtUtilizacaoIni_input")).sendKeys(utiInicial);
        nav.findElement(By.id("dtUtilizacaoFim_input")).sendKeys(utiFinal);
	    nav.findElement(By.xpath("//span[text() = \"Hospedes\"]/following-sibling::a/following-sibling::table/tbody/tr[2]/td[3]/input")).sendKeys(nomeHospede);
	    nav.findElement(By.xpath("//span[text() = \"Hospedes\"]/following-sibling::a/following-sibling::table/tbody/tr[2]/td[4]/input")).sendKeys(sobrenomeHospede);	    
	    return this;
	}
	
	public Editar_Reserva_Page selectDocument (String cpf) {
	    nav.findElement(By.xpath("//label[text() = \"selecione...\"]/following-sibling::div/span")).click();	
	    try {Thread.sleep(1000);} catch (InterruptedException ex) {}
	    nav.findElement(By.xpath("//li[text() = \"CPF\"]")).click();
	    try {Thread.sleep(1000);} catch (InterruptedException ex) {}
	    nav.findElement(By.xpath("//span[contains(@id, \"pnlNomeDoc\")]/input")).sendKeys(cpf);
		return this;
	}
	
	public Editar_Reserva_Page fillDataNasc (String dataNasc) {
	    try {Thread.sleep(1000);} catch (InterruptedException ex) {}
	    nav.findElement(By.xpath("//span[text() = \"Hospedes\"]/following-sibling::a/following-sibling::table/tbody/tr[2]/td[7]/input")).sendKeys(dataNasc);	
	    return this;
	}
	
	public Editar_Reserva_Page saveAcomodacao () {
		List<WebElement> save = nav.findElements(By.xpath("//span[text() = \"Salvar\"]"));
	    save.get(1).click();
	    return this;
	}
	
	public Editar_Reserva_Page checkValores () {
		if (nav.findElement(By.xpath("//td[contains(text(), \"2 - TARIFA\")]")).isDisplayed() == true) {
			System.out.println("Nova linha de valores adicionada com sucesso");
		} else {
			System.out.println("Nada foi adicionado");
		}
		
	    return this;
	}


}
