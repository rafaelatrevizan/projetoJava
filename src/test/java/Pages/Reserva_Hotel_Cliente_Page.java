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

public class Reserva_Hotel_Cliente_Page extends Base_Page {
	private Faker faker = new Faker();
	private GeraCpfCnpj gerador = new GeraCpfCnpj();
	
	public Reserva_Hotel_Cliente_Page(WebDriver nav) {
		super(nav);
	}

	public Reserva_Hotel_Cliente_Page fillNames1() {
//		int numero = 0;
//		do {
//		WebElement teste1 = nav
//				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:"+numero+":idNome\"]"));
//				String firstName = faker.name().firstName();
//				teste1.sendKeys(firstName);		
//				numero ++;
//		} while (numero >= 0) ;
		
	
		WebElement nomePessoa1 = nav
				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0:idNome\"]"));
		WebElement sobrenomePessoa1 = nav
				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0:idSobrenome\"]"));

		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();

		nomePessoa1.sendKeys(firstName);
		sobrenomePessoa1.sendKeys(lastName);

		return this;
	}
	public Reserva_Hotel_Cliente_Page fillNames2() {
		
		WebElement nomePessoa2 = nav
				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idNome\"]"));
		WebElement sobrenomePessoa2 = nav
				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idSobrenome\"]"));

		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();

		nomePessoa2.sendKeys(firstName);
		sobrenomePessoa2.sendKeys(lastName);

		return this;
	}

	public Reserva_Hotel_Cliente_Page fillDocument() {

		nav.findElement(By.xpath(
				"//label[contains (@id, \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0\") and text() = \"Documento\"]/following-sibling::div/div[@class = \"ui-selectonemenu-trigger ui-state-default ui-corner-right\"]"))
				.click();
		// //label[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0:idDocumentoTipo_label\"]/following-sibling::div
		// 
		nav.findElement(By.xpath("//li[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0:idDocumentoTipo_1\"]"))
				.click();
		
		// WebElement tipoDoc = nav.findElement(By.xpath("//select[@id =
		// \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0:idDocumentoTipo_input\"]"));
		// new Select(tipoDoc).selectByVisibleText(tipo);
		
		String cpf = gerador.cpf(true);
//		System.out.printf("CPF: %s, Valido: %s\n", cpf, gerador.isCPF(cpf));

		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		WebElement docPessoa1 = nav
				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0:idNrDocumento\"]"));
		docPessoa1.sendKeys(cpf);
		
		return this;
	}

	
	public Reserva_Hotel_Cliente_Page fillDocument1() {
	
		nav.findElement(By.xpath("//label[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idDocumentoTipo_label\"]/following-sibling::div")).click();
		nav.findElement(By.xpath("//li[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idDocumentoTipo_1\"]")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		String cpf2 = gerador.cpf(true);
		
		WebElement docPessoa2 = nav.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idNrDocumento\"]"));
		docPessoa2.sendKeys(cpf2);
		return this;
	}
	public Reserva_Hotel_Cliente_Page fillSexo1() {
		nav.findElement(By.xpath(
				"//label[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0:idSexo_label\"]/following-sibling::div"))
				.click();
		nav.findElement(By.xpath("//li[@id=\"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0:idSexo_1\"]")).click();
		return this;
	}
	
	public Reserva_Hotel_Cliente_Page fillSexo2() {
		
		nav.findElement(By.xpath(
				"//label[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idSexo_label\"]/following-sibling::div"))
				.click();
		nav.findElement(By.xpath("//li[@id=\"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idSexo_1\"]")).click();
		return this;
	}

	public Reserva_Hotel_Cliente_Page fillDate1() {

		WebElement datePessoa1 = nav
				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:0:idDtNascimento\"]"));

		datePessoa1.click();
		datePessoa1.sendKeys("18091992");
				return this;
	}
	
	public Reserva_Hotel_Cliente_Page fillDate2() {
		
		WebElement datePessoa2 = nav
				.findElement(By.xpath("//input[@id = \"frmNomeEdit:hotel:0:quarto:0:pnlNome:nome:1:idDtNascimento\"]"));

		datePessoa2.click();
		datePessoa2.sendKeys("27101993");

		return this;
	}
	
	public Reserva_Hotel_Cliente_Page textArea(String texto) {
		
		nav.findElement(By.id("frmNomeEdit:hotel:0:quarto:0:idDsObservacao")).sendKeys(texto);
		
		return this;
	}
	
	public Reserva_Hotel_Cliente_Page politica() {
		String str = nav.findElement(By.xpath("//span[text() = \"Politicas\"]")).getText();		
		
		if(str.contains("Politicas")) {
			nav.findElement(By.xpath("//input[@type = \"checkbox\"]")).click();			
		} else return this;
		return null;
		
	}

	public Reserva_Hotel_Cliente_Page dadosDoCLiente(String numero) {
		nav.findElement(By.xpath("//i[@class = \"icon-edit Fs18\"]")).click();
		return this;
	}
	
	public Comprovante_Page clickReservar () {
		nav.findElement(By.xpath("//span[text() = \"Reservar\"]")).click();
		return new Comprovante_Page(nav);
	}

}
