package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;

import com.github.javafaker.Faker;

@RunWith(DataDrivenTestRunner.class)

public class Profissionais_Page extends Base_Page {
	private Faker faker = new Faker();
	private String testeNome;

	public Profissionais_Page(WebDriver nav) {
		super(nav);
	}

	public Profissionais_Page addProf() {
		nav.switchTo().frame(0);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		WebElement webElement = nav.findElement(By.xpath("//span[text() = \"Adicionar\"]"));
		webElement.click();
		return this;
	}

	public Profissionais_Page fillInformation(String nome, String apelido) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		WebElement nomeProf = nav.findElement(By.id("idNome"));
		nomeProf.sendKeys(nome);
		nav.findElement(By.id("idApelido")).sendKeys(apelido);
		testeNome = nome;
		
		return this;
	}

	public Profissionais_Page fillUser() {
		WebElement webelement = nav.findElement(By.id("idNmLogin"));
		String usuario = faker.name().name(); 
		webelement.sendKeys(usuario);
		return this;
	}

	public Profissionais_Page fillEmail(String email) {
		nav.findElement(By.id("idEmail")).sendKeys(email);
		return this;
	}

	public Profissionais_Page fillCep(String numCep) {
		WebElement cep = nav.findElement(By.id("idCep"));
		cep.click();
		cep.sendKeys(numCep);
		cep.sendKeys(Keys.TAB);
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		return this;
	}

	public Profissionais_Page clickSalvar() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		nav.findElement(By.xpath("//span[text() = \"Salvar\"]")).click();
		return this;
	}
	
//	public Profissionais_Page checkProf() {
//		WebElement profCadastrado = nav.findElement(By.id("idNomeView"));
//		if(profCadastrado.getText().equals(testeNome)) {
//			System.out.println("Profissional cadastrado com sucesso");
//		}else {
//			System.out.println("Não Cadastrou");
//			throw new RuntimeException();
//		}			
//		return this;
//	}


	//
	public Profissionais_Page popUpErro() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

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
		if (list.get(1).getText().equals("Apelido - Preenchimento obrigatório")) {
			System.out.println(list.get(1).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(2).getText().equals("Usuário - Preenchimento obrigatório")) {
			System.out.println(list.get(2).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(3).getText().equals("Email - Preenchimento obrigatório")) {
			System.out.println(list.get(3).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(4).getText().equals("Cep - Preenchimento obrigatório")) {
			System.out.println(list.get(4).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(5).getText().equals("Endereco - Preenchimento obrigatório")) {
			System.out.println(list.get(5).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(6).getText().equals("Bairro - Preenchimento obrigatório")) {
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
