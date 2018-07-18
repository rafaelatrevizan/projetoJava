package Pages;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

import Suporte.GeraCpfCnpj;
import junit.framework.Assert;

public class Reserva_Aereo_Cliente_Page extends Base_Page {
	private Faker faker = new Faker();
	private GeraCpfCnpj gerador = new GeraCpfCnpj();


	public Reserva_Aereo_Cliente_Page(WebDriver nav) {
		super(nav);
	}
	

	public Reserva_Aereo_Cliente_Page fillNames1() {
//		int numero = 0;
//		do {
//		WebElement teste1 = nav
//				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:"+numero+":idNome\"]"));
//				String firstName = faker.name().firstName();
//				teste1.sendKeys(firstName);		
//				numero ++;
//		} while (numero >= 0) ;
		
	
		WebElement nomePessoa1 = nav
				.findElement(By.xpath("//input[contains(@id, \"idNome\")]"));
		WebElement sobrenomePessoa1 = nav
				.findElement(By.xpath("//input[contains(@id, \"idSobrenome\")]"));

		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();

		nomePessoa1.sendKeys(firstName);
		sobrenomePessoa1.sendKeys(lastName);

		return this;
	}
//	public Reserva_Aereo_Cliente_Page fillNames2() {
//		
//		WebElement nomePessoa2 = nav
//				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idNome\"]"));
//		WebElement sobrenomePessoa2 = nav
//				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idSobrenome\"]"));
//
//		String firstName = faker.name().firstName();
//		String lastName = faker.name().lastName();
//
//		nomePessoa2.sendKeys(firstName);
//		sobrenomePessoa2.sendKeys(lastName);
//
//		return this;
//	}

	public Reserva_Aereo_Cliente_Page fillDocument(String documento) {

		nav.findElement(By.xpath("//label[contains(@id, \"idDocumentoTipo_label\")]/following-sibling::div")).click();
		nav.findElement(By.xpath("//li[contains(@id, \"idDocumentoTipo_2\")]")).click();
		
		// WebElement tipoDoc = nav.findElement(By.xpath("//select[@id =
		// \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0:idDocumentoTipo_input\"]"));
		// new Select(tipoDoc).selectByVisibleText(tipo);
		String cpf = gerador.cpf(true);

		WebElement docPessoa1 = nav.findElement(By.xpath("//input[contains(@id, \"idNrDocumento\")]"));
		docPessoa1.sendKeys(cpf);
		
		return this;
	}

	
//	public Reserva_Aereo_Cliente_Page fillDocument1(String documento1) {
//	
//		nav.findElement(By.xpath(
//				"//label[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idDocumentoTipo_label\"]/following-sibling::div"))
//				.click();
//		nav.findElement(By.xpath("//li[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idDocumentoTipo_2\"]"))
//				.click();
//		
//		WebElement docPessoa2 = nav
//				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idNrDocumento\"]"));
//		docPessoa2.sendKeys(documento1);
//		return this;
//	}
	
	public Reserva_Aereo_Cliente_Page fillSexo1() {
		nav.findElement(By.xpath(
				"//label[contains(@id, \"idSexo_label\")]/following-sibling::div"))
				.click();
		nav.findElement(By.xpath("//li[contains(@id, \"idSexo_1\")]")).click();
		return this;
	}
	
//	public Reserva_Aereo_Cliente_Page fillSexo2() {
//		
//		nav.findElement(By.xpath(
//				"//label[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idSexo_label\"]/following-sibling::div"))
//				.click();
//		nav.findElement(By.xpath("//li[@id=\"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idSexo_1\"]")).click();
//		return this;
//	}

	public Reserva_Aereo_Cliente_Page fillDate1() {

		WebElement datePessoa1 = nav
				.findElement(By.xpath("//input[contains(@id, \"idDtNascimento\")]"));

		datePessoa1.click();
		datePessoa1.sendKeys("18091992");
				return this;
	}
	
//	public Reserva_Aereo_Cliente_Page fillDate2() {
//		
//		WebElement datePessoa2 = nav
//				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idDtNascimento\"]"));
//
//		datePessoa2.click();
//		datePessoa2.sendKeys("27101993");
//
//		return this;
//	}
	
//	public Reserva_Aereo_Cliente_Page textArea(String texto) {
//		
//		nav.findElement(By.id("frmNomeEdit:hotel:0:quarto:0:idDsObservacao")).sendKeys(texto);
//		
//		return this;
//	}
	
	public Reserva_Aereo_Cliente_Page politica() {
		String str = nav.findElement(By.xpath("//span[text() = \"Politicas\"]")).getText();		
		
		if(str.contains("Politicas")) {
			nav.findElement(By.xpath("//input[@type = \"checkbox\"]")).click();			
		} 
		return this;
		
	}

	public Reserva_Aereo_Cliente_Page dadosDoCliente() {
		nav.findElement(By.xpath("//i[@class = \"icon-edit Fs18\"]")).click();
		return this;
	}
	
	public Comprovante_Page clickReservar () {
		nav.findElement(By.xpath("//span[text() = \"Reservar\"]")).click();
		return new Comprovante_Page(nav);
	}

}
