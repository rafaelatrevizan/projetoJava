package Pages;

import java.util.List;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

@RunWith(DataDrivenTestRunner.class)

public class Cambio_Page extends Base_Page {
	private Faker faker = new Faker();
//	private List<WebElement> moedas = nav.findElements(By.xpath("//li[text() = \"Peso chileno(CLP)\"]"));

	public Cambio_Page(WebDriver nav) {
		super(nav);
	}

	public Cambio_Page addCambio() {
		nav.switchTo().frame(0);
		WebElement webElement = nav.findElement(By.xpath("//div[@class = \"ContainerIndent\"]/div/a"));
		webElement.click();
		return this;
	}

	public Cambio_Page chooseMoeda() {
		// YOSHI VAI MUDAR O ID DO UL

		// //li[text() = "selecione..."]
		// //li[text() = "REAL(BRL)"]
		// //li[text() = "DOLAR(USD)"]
		// //li[text() = "EURO(EUR)"]
		// //li[text() = "LIBRA ESTERLINA(GBP)"]
		// //li[text() = "Peso chileno(CLP)"]

		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//label[text() = \"Moeda\"]/following-sibling::div/div[3]/span")).click();
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}

		List<WebElement> moedas = nav.findElements(By.xpath("//li[text() = \"Peso chileno(CLP)\"]"));
		moedas.get(0).click();
		
		return this;
	}

	public Cambio_Page chooseCambio() {
		// YOSHI VAI MUDAR O ID DO UL

		// //li[text() = "selecione..."]
		// //li[text() = "REAL(BRL)"]
		// //li[text() = "DOLAR(USD)"]
		// //li[text() = "EURO(EUR)"]
		// //li[text() = "LIBRA ESTERLINA(GBP)"]
		// //li[text() = "Peso chileno(CLP)"]

		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//label[text() = \"Cambio\"]/following-sibling::div/div[3]/span")).click();		
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		
		List<WebElement> moedas = nav.findElements(By.xpath("//li[text() = \"REAL(BRL)\"]"));
		moedas.get(1).click();
		return this;
	}

	public Cambio_Page fillValor(String valor) {
		nav.findElement(By.id("frmCambioEdit:idVlCambio")).sendKeys(valor);
		return this;
	}

	public Cambio_Page fillTaxa(String taxa) {
		nav.findElement(By.id("frmCambioEdit:idVlTaxa")).sendKeys(taxa);
		return this;
	}

	public Cambio_Page clickSalvar() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//span[text() = \"Salvar\"]")).click();
		return this;
	}

	public Cambio_Page popUpErro() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		java.util.List<WebElement> list = nav.findElements(By.xpath("//div[@id = \"idMsgError\"]/div/ul/li"));

		for (WebElement element : list) {
			System.out.println(element.getText());
		}

		if (list.get(0).getText().equals("Moeda - Preenchimento obrigatório")) {
			System.out.println(list.get(0).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(1).getText().equals("Cambio - Preenchimento obrigatório")) {
			System.out.println(list.get(1).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(2).getText().equals("Valor - Preenchimento obrigatório")) {
			System.out.println(list.get(2).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(3).getText().equals("Taxa - Preenchimento obrigatório")) {
			System.out.println(list.get(3).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}

		return this;
	}

}
