package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

@RunWith(DataDrivenTestRunner.class)

public class Unidades_Page extends Base_Page {
	private Faker faker = new Faker();

	public Unidades_Page(WebDriver nav) {
		super(nav);
	}

	public Unidades_Page addUnidade() {
		nav.switchTo().frame(0);
		WebElement webElement = nav.findElement(By.xpath("//span[text() = \"Adicionar\"]"));
		webElement.click();
		return this;
	}

	public Unidades_Page fillNames(String nomeRazao, String nomeFantasia) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("idNmRazao")).sendKeys(nomeRazao);
		nav.findElement(By.id("idNmFantasia")).sendKeys(nomeFantasia);
		return this;
	}

	public Unidades_Page fillCNPJ(String numberCnpj) {
		WebElement webelement = nav.findElement(By.id("idNrCnpj"));
		webelement.sendKeys(numberCnpj);
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

	public Unidades_Page fillEmailNull(String mail) {
		WebElement email = nav.findElement(By.id("idEmail"));
		email.sendKeys(mail);
		return this;
	}

	public Unidades_Page fillCep(String numCep) {
		WebElement cep = nav.findElement(By.id("idCep"));
		cep.sendKeys(numCep);
		cep.sendKeys(Keys.TAB);
		return this;
	}

	public Unidades_Page clickSalvar() {
		nav.findElement(By.xpath("//span[text() = \"Salvar\"]")).click();
		return this;
	}

	public Unidades_Page popUpErro() {
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
		if (list.get(2).getText().equals("CNPJ - Preenchimento obrigatório")) {
			System.out.println(list.get(2).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(3).getText().equals("Telefone fixo - Preenchimento obrigatório")) {
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

}
