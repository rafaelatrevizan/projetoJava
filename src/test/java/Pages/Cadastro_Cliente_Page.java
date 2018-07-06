package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(DataDrivenTestRunner.class)

public class Cadastro_Cliente_Page extends Base_Page {

	public Cadastro_Cliente_Page(WebDriver nav) {
		super(nav);
	}

	public Cadastro_Cliente_Page addCliente() {
		nav.switchTo().frame(0);
		WebElement webElement = nav.findElement(By.xpath("//span[text() = \"Adicionar\"]"));
		webElement.click();
		return this;
	}

	public Cadastro_Cliente_Page fillName(String nomeCliente) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("idNome")).sendKeys(nomeCliente);
		return this;
	}

	public Cadastro_Cliente_Page fillTelefone(String fixo) {
		nav.findElement(By.id("idTelefoneFixo")).sendKeys(fixo);
		return this;
	}

	public Cadastro_Cliente_Page fillEmail(String mail) {
		nav.findElement(By.id("idEmail")).sendKeys(mail);
		return this;
	}

//	public Cadastro_Cliente_Page fillCep(String numCep) {
//		WebElement cep = nav.findElement(By.id("idCep"));
//		cep.sendKeys(numCep);
//		cep.sendKeys(Keys.TAB);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException ex) {
//		}
//		return this;
//	}
	
	public Cadastro_Cliente_Page fillEstado() {
		//idNmEstado_25 = São Paulo
		
		nav.findElement(By.xpath("//label[@id = \"idNmEstado_label\"]/following-sibling::div/span")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		
		nav.findElement(By.id("idNmEstado_25")).click();
		return this;
	}
	
	public Cadastro_Cliente_Page fillMunicipio() {
		//idNmMunicipio_568 = São Paulo
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//label[@id = \"idNmMunicipio_label\"]/following-sibling::div/span")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		nav.findElement(By.id("idNmMunicipio_568")).click();
		return this;
	}
	

	public Cadastro_Cliente_Page clickSalvar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//span[text() = \"Salvar\"]")).click();
		return this;
	}
	
	public Cadastro_Cliente_Page clickPesquisar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//span[text() = \"Pesquisar\"]/parent::button")).click();
		return this;
	}


	public Cadastro_Cliente_Page pesqNome(String nomeCliente) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.switchTo().frame(0);
		nav.findElement(By.id("idNomePesquisa")).sendKeys(nomeCliente);
		return this;
	}
	
	public Cadastro_Cliente_Page selectCliente() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//a[contains(@id,  \"pnlClienteList\")]/i[contains(@class, \"icon-edit-1\")]")).click();
		return this;
	}

	public Cadastro_Cliente_Page popUpErro() {
		java.util.List<WebElement> list = nav.findElements(By.xpath("//div[@id = \"idMsgError\"]/div/ul/li"));

		for (WebElement element : list) {
			System.out.println(element.getText());
		}

		if (list.get(0).getText().equals("Nome - Preenchimento obrigatório")) {
			System.out.println(list.get(0).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(1).getText().equals("Telefone principal - Preenchimento obrigatório")) {
			System.out.println(list.get(1).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(2).getText().equals("Email - Preenchimento obrigatório")) {
			System.out.println(list.get(2).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(3).getText().equals("Estado - Preenchimento obrigatório")) {
			System.out.println(list.get(3).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(4).getText().equals("Municipio - Preenchimento obrigatório")) {
			System.out.println(list.get(4).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		
		return this;
	}
	
	public Cadastro_Cliente_Page desativarCliente(String motivo) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Desativar\"]")).click();
		nav.findElement(By.id("frmLog:dsMotivo")).sendKeys(motivo);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Sim\"]")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		return this;
	}

	public Cadastro_Cliente_Page checkDesativado() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		WebElement desativado = nav.findElement(By.xpath("//span[text() = \"Ativo?\"]/parent::td"));
		String bla = desativado.getText();
		Assert.assertEquals("Não", bla);		
		return this;
	}

	public Cadastro_Cliente_Page ativarCliente(String motivo) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Ativar\"]")).click();
		nav.findElement(By.id("frmLog:dsMotivo")).sendKeys(motivo);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Sim\"]")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		return this;
	}

	public Cadastro_Cliente_Page checkAtivado() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		WebElement desativado = nav.findElement(By.xpath("//span[text() = \"Ativo?\"]/parent::td"));
		String bla = desativado.getText();
		Assert.assertEquals("Sim", bla);		
		return this;
	}

	

}
