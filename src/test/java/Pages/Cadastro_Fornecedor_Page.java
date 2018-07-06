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

public class Cadastro_Fornecedor_Page extends Base_Page {

	public Cadastro_Fornecedor_Page(WebDriver nav) {
		super(nav);
	}

	public Cadastro_Fornecedor_Page addFonecedor() {
		nav.switchTo().frame(0);
		WebElement webElement = nav.findElement(By.xpath("//span[text() = \"Adicionar\"]"));
		webElement.click();
		return this;
	}

	public Cadastro_Fornecedor_Page fillNames(String nomeRazao, String nomeFantasia) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("idNmRazao")).sendKeys(nomeRazao);
		nav.findElement(By.id("idNmFantasia")).sendKeys(nomeFantasia);
		return this;
	}

	public Cadastro_Fornecedor_Page fillDocumento(String doc) {
		nav.findElement(By.id("idNrCnpj")).sendKeys(doc);
		return this;
	}

	public Cadastro_Fornecedor_Page fillContato(String contato) {
		nav.findElement(By.id("idNmContato")).sendKeys(contato);
		return this;
	}

	public Cadastro_Fornecedor_Page fillEmail(String mail) {
		nav.findElement(By.id("idEmail")).sendKeys(mail);
		return this;
	}

	public Cadastro_Fornecedor_Page fillCep(String numCep) {
		WebElement cep = nav.findElement(By.id("idCep"));
		cep.sendKeys(numCep);
		cep.sendKeys(Keys.TAB);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		return this;
	}

	public Cadastro_Fornecedor_Page clickSalvar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//span[text() = \"Salvar\"]")).click();
		return this;
	}

	public Cadastro_Fornecedor_Page clickPesquisar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//span[text() = \"Pesquisar\"]/parent::button")).click();
		return this;
	}

	public Cadastro_Fornecedor_Page pesqNome(String nomeFornecedor) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.switchTo().frame(0);
		nav.findElement(By.id("idNomePesquisa")).sendKeys(nomeFornecedor);
		return this;
	}

	public Cadastro_Fornecedor_Page selectFornecedor() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//a[contains(@id, \"frmPesquisa:pnlFornecedorList\")]/i")).click();
		return this;
	}
	
	public Cadastro_Fornecedor_Page abaProf() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//li[@data-index = \"4\"]")).click();
		nav.findElement(By.xpath("//span[text() = \"Profissionais\"]/following-sibling::a")).click();
		return this;
	}
// idNmLogin
	
	
	
	public Cadastro_Fornecedor_Page fillNamesProf(String nomeProf, String apelidoProf) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("idNome")).sendKeys(nomeProf);
		nav.findElement(By.id("idApelido")).sendKeys(apelidoProf);
		return this;
	}
	
	public Cadastro_Fornecedor_Page fillUserProf(String user) {
		nav.findElement(By.id("idNmLogin")).sendKeys(user);
		return this;
	}
	
	public Cadastro_Fornecedor_Page credenciaisAcesso() {
		nav.findElement(By.xpath("//table[@id = \"idSelPerfilAgencia\"]/tbody/tr/td/div/following-sibling::label[text() = \"Agencia ADM\"]")).click();
		return this;
	}
	
	
	
	public Cadastro_Fornecedor_Page popUpErro() {
		java.util.List<WebElement> list = nav.findElements(By.xpath("//div[@id = \"idMsgError\"]/div/ul/li"));

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
		if (list.get(2).getText().equals("Documento - Preenchimento obrigatório")) {
			System.out.println(list.get(2).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(3).getText().equals("Contato - Preenchimento obrigatório")) {
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
		if (list.get(5).getText().equals("Código postal - Preenchimento obrigatório")) {
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

}
