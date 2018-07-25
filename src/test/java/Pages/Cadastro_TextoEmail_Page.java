package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

@RunWith(DataDrivenTestRunner.class)

public class Cadastro_TextoEmail_Page extends Base_Page {
	private Faker faker = new Faker();

	public Cadastro_TextoEmail_Page(WebDriver nav) {
		super(nav);
	}

	public Cadastro_TextoEmail_Page addTexto() {
	    nav.switchTo().frame(0);
	    try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		WebElement webElement = nav.findElement(By.xpath("//span[text() = \"Adicionar\"]"));
		webElement.click();
		return this;
	}

	public Cadastro_TextoEmail_Page fillAssunto(String assunto) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idNmAssunto")).sendKeys(assunto);
		return this;
	}

	public Cadastro_TextoEmail_Page fillRemetente(String remetente) {
		WebElement webelement = nav.findElement(By.id("idNmRemetente"));
		webelement.sendKeys(remetente);
		return this;
	}

	public Cadastro_TextoEmail_Page selectTipo() {
		//idEmailTipo_2 = CANCELAMENTO DE RESERVA
		
		nav.findElement(By.xpath("//label[@id = \"idEmailTipo_label\"]/following-sibling::div/span")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		nav.findElement(By.id("idEmailTipo_2")).click();
		return this;
	}

	public Cadastro_TextoEmail_Page fillCorpoEmail(String textoCorpo) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
	    nav.switchTo().frame(0);
		nav.findElement(By.id("pasteConteudo")).sendKeys(textoCorpo);
		return this;
	}
	

	public Cadastro_TextoEmail_Page clickSalvar() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		nav.findElement(By.xpath("//span[text() = \"Salvar\"]")).click();
		return this;
	}

	public Cadastro_TextoEmail_Page popUpErro() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		java.util.List<WebElement> list = nav.findElements(By.xpath("//div[@id = \"idMsgError\"]/div/ul/li"));

		for (WebElement element : list) {
			System.out.println(element.getText());
		}

		if (list.get(0).getText().equals("Assunto - Preenchimento obrigatório")) {
			System.out.println(list.get(0).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(1).getText().equals("Remetente - Preenchimento obrigatório")) {
			System.out.println(list.get(1).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(2).getText().equals("Tipo - Preenchimento obrigatório")) {
			System.out.println(list.get(2).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(3).getText().equals("Texto - Preenchimento obrigatório")) {
			System.out.println(list.get(3).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		
		return this;
	}

}
