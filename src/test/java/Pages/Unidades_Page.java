package Pages;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

import Suporte.GeraCpfCnpj;

@RunWith(DataDrivenTestRunner.class)

public class Unidades_Page extends Base_Page {
	
	private Faker faker = new Faker();
	private GeraCpfCnpj gerador = new GeraCpfCnpj(); 
	
	private String nameUnidade;
	private String teste;

	public Unidades_Page(WebDriver nav) {
		super(nav);
	}

	public Unidades_Page addUnidade() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		WebElement webElement = nav.findElement(By.xpath("//span[text() = \"Adicionar\"]"));
		webElement.click();
		return this;
	}
	
	public Unidades_Page pesqUnidade() {
		WebElement webElement = nav.findElement(By.xpath("//button[contains(@onclick, \"frmPesquisa\")]/span/following-sibling::span"));
		webElement.click();
		return this;
	}
		
	public Unidades_Page searchUnidade(String unidade) {
		WebElement webElement = nav.findElement(By.xpath("//input[contains(@id, \"idNomePesquisa\")]"));
		webElement.sendKeys(unidade);
		return this;
	}
	
	public Unidades_Page selectUnidade() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//a[contains(@id,  \"pnlUnidadeList\")]/i[contains(@class, \"icon-edit-1\")]")).click();
		return this;
	}

	public Unidades_Page fillNames(String nomeRazao, String nomeFantasia) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("idNmRazao")).sendKeys(nomeRazao);
		nav.findElement(By.id("idNmFantasia")).sendKeys(nomeFantasia);
		
		nameUnidade = nomeRazao;
		
		return this;
	}

	public Unidades_Page fillCNPJ() {		
		String cnpj = gerador.cnpj(true);
//		String numberCnpj = cnpj;
		
		WebElement webelement = nav.findElement(By.id("idNrCnpj"));
		webelement.sendKeys(cnpj);		
		
//		System.out.printf("CPF: %s, Valido: %s\n", cnpj, gerador.isCNPJ(cnpj));

		return this;
	}

	public Unidades_Page Telefones(String fixo) {
		nav.findElement(By.id("idTelefoneFixo")).sendKeys(fixo);
		return this;
	}

	public Unidades_Page fillEmail() {
		WebElement email = nav.findElement(By.id("idEmail"));
		String mail = faker.internet().emailAddress();

		email.sendKeys(mail);
		return this;
	}

//	public Unidades_Page fillEmailNull(String mail) {
//		WebElement email = nav.findElement(By.id("idEmail"));
//		email.sendKeys(mail);
//		return this;
//	}

	public Unidades_Page fillCep(String numCep) {
		WebElement cep = nav.findElement(By.id("idCep"));
		cep.sendKeys(numCep);
		cep.sendKeys(Keys.TAB);
		return this;
	}

	public Unidades_Page clickSalvar() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Salvar\"]")).click();
		return this;
	}
	
//	public Unidades_Page checkUnidadeName() {
//		WebElement nomeView = nav.findElement(By.id("idNmRazaoView"));
//		nomeView.
//		String nomeCadastro = nomeView.getText();
//		System.out.println(nameUnidade+"="+nomeCadastro);
//		Assert.assertEquals(nameUnidade, nomeCadastro);		
//		return this;
//	}

	public Unidades_Page popUpErro() {
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

//		System.out.println(nav.findElement(By.xpath("//div[@id = \"idMsgError\"]/div/ul/li/span[1]")).getText());
		
		List<WebElement> list = nav.findElements(By.xpath("//div[@id = \"idMsgError\"]/div/ul/li"));

		for (WebElement element : list) {			
			System.out.println(element.getText());				
		}			
	
		
		if (list.get(0).getText().equals("Razão social - Preenchimento obrigatório")) {
			System.out.println(list.get(0).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(1).getText().equals("Nome fantasia - Preenchimento obrigatório")) {
			System.out.println(list.get(1).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(2).getText().equals("CNPJ - Preenchimento obrigatório")) {
			System.out.println(list.get(2).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(3).getText().equals("Telefone principal - Preenchimento obrigatório")) {
			System.out.println(list.get(3).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(4).getText().equals("Email - Preenchimento obrigatório")) {
			System.out.println(list.get(4).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(5).getText().equals("Cep - Preenchimento obrigatório")) {
			System.out.println(list.get(5).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(6).getText().equals("Endereco - Preenchimento obrigatório")) {
			System.out.println(list.get(6).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(7).getText().equals("Estado - Preenchimento obrigatório")) {
			System.out.println(list.get(7).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(8).getText().equals("Municipio - Preenchimento obrigatório")) {
			System.out.println(list.get(8).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}

		return this;
	}
	
	public Unidades_Page campoMotivoDesativar() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

//		WebElement botaoDesativar = nav.findElement(By.xpath("//span[text() = \"Desativar\"]"));
//		WebElement botaoAtivar = nav.findElement(By.xpath("//span[text() = \"Ativar\"]"));
		
		nav.findElement(By.xpath("//span[text() = \"Desativar\"]")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Sim\"]")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		if (nav.findElement(By.xpath("//label[@class = \"dsMotivo-label ui-state-error\"]")).isDisplayed()){
			System.out.println("Está como obrigatório");
		}else {
			System.out.println("Não está como obrigatório, portanto está errado");
			throw new RuntimeException();
		}
		
		return this;
	}
	
	public Unidades_Page campoMotivoAtivar() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.xpath("//span[text() = \"Ativar\"]")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Sim\"]")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		if (nav.findElement(By.xpath("//label[@class = \"dsMotivo-label ui-state-error\"]")).isDisplayed()){
			System.out.println("Está como obrigatório");
		}else {
			System.out.println("Não está como obrigatório, portanto está errado");
			throw new RuntimeException();
		}
		
		return this;
	}
	
	public Unidades_Page desativarUnidade(String motivo) {
//		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
//		nav.findElement(By.xpath("//span[text() = \"Desativar\"]")).click();
		nav.findElement(By.id("frmLog:dsMotivo")).sendKeys(motivo);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Sim\"]")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		return this;
	}

	public Unidades_Page checkDesativado() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		WebElement desativado = nav.findElement(By.xpath("//tbody[@id = \"frmPesquisa:pnlUnidadeList_data\"]/tr/td[8]"));
		String desativar = desativado.getText();
		Assert.assertEquals("Não", desativar);		
		return this;
	}

	public Unidades_Page ativarUnidade(String motivo) {
//		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
//		nav.findElement(By.xpath("//span[text() = \"Ativar\"]")).click();
		nav.findElement(By.id("frmLog:dsMotivo")).sendKeys(motivo);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Sim\"]")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		return this;
	}

	public Unidades_Page checkAtivado() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		WebElement ativado = nav.findElement(By.xpath("//tbody[@id = \"frmPesquisa:pnlUnidadeList_data\"]/tr/td[8]"));
		String ativar = ativado.getText();
		System.out.println(ativar);
//		Assert.assertEquals("Sim", ativar);		
		return this;
	}

	
	public Unidades_Page chooseProfissional() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//a[text() = \"Profissionais\"]")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.className("icon-plus")).click();
		
		return this;
	}
}
