package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class Hotel_Tarifario_Page extends Base_Page {
	private Faker faker = new Faker();
	// private String hotelllllll;

	public Hotel_Tarifario_Page(WebDriver nav) {
		super(nav);
		// TODO Auto-generated constructor stub
	}

	public Hotel_Tarifario_Page pesquisarHotel(String nomeHotel) {
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idNomePesquisa")).sendKeys(nomeHotel);
		return this;
	}
	
	public Hotel_Tarifario_Page addTarifario() {
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//a[@title = \"Adicionar tarifa\"]")).click();
		return this;
	}
	
	public Hotel_Tarifario_Page descricao(String descricao) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idDsTarifa")).sendKeys(descricao);
		return this;
	}
	
	public Hotel_Tarifario_Page selectFornecedor() {
		//idFornecedor2_0 = Selecione...
		//idFornecedor2_1 = Primeira opção
		
		nav.findElement(By.xpath("//label[@id = \"idFornecedor2_label\"]/following-sibling::div")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idFornecedor2_1")).click();
		return this;
	}

	public Hotel_Tarifario_Page selectTipo() {
		//idTarifaTipo_0 = Selecione...
		//idTarifaTipo_1 = DIÁRIA
		//idTarifaTipo_2 = PACOTE
		
		nav.findElement(By.xpath("//label[@id = \"idTarifaTipo_label\"]/following-sibling::div")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idTarifaTipo_1")).click();
		return this;
	}
	
	public Hotel_Tarifario_Page selectDataVenda(String dataVendaInicio, String dataVendaFim) {
		nav.findElement(By.id("dtValidadeIni_input")).click();
		nav.findElement(By.id("dtValidadeIni_input")).sendKeys(dataVendaInicio);
		nav.findElement(By.id("dtValidadeFim_input")).click();
		nav.findElement(By.id("dtValidadeFim_input")).sendKeys(dataVendaFim);	
		return this;
	}
	
	public Hotel_Tarifario_Page abaTarifario() {
		nav.findElement(By.linkText("Tarifários")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//thead[@id = \"pnlTarifarios_head\"]/tr/th[10]")).click();
		return this;
	}
	
	
	public Hotel_Tarifario_Page infoTarifario(String nometarifario) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idNmTarifa")).sendKeys(nometarifario);
		return this;
	}

	public Hotel_Tarifario_Page tabela() {
		//idTabelaSel_0 = Selecione
		//idTabelaSel_1 = Alta temporada
		
		nav.findElement(By.xpath("//label[@id = \"idTabelaSel_label\"]/following-sibling::div")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idTabelaSel_1")).click();		return this;
	}
	
	public Hotel_Tarifario_Page margem() {
		//idMargem_0 = Selecione
		//idMargem_1 = Padrão
		//idMargem_2 = Markup
		//idMargem_3 = Comissão
		
		
		nav.findElement(By.xpath("//label[@id = \"idMargem_label\"]/following-sibling::div")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idMargem_1")).click();		return this;
	}
	
	public Hotel_Tarifario_Page pagamento() {
		//idPagtoTipo_0 = Selecione
		//idPagtoTipo_1 = FATURADO
		//idPagtoTipo_2 = PRE PAGAMENTO		
		
		nav.findElement(By.xpath("//label[@id = \"idPagtoTipo_label\"]/following-sibling::div")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idPagtoTipo_1")).click();		
		return this;
	}
	
	public Hotel_Tarifario_Page cobranca() {
		//idTarifaCobranca_0 = Selecione
		//idTarifaCobranca_1 = POR APTO
		//idTarifaCobranca_2 = POR PESSOA
		//idTarifaCobranca_3 = POR DIARIA
		
		nav.findElement(By.xpath("//label[@id = \"idTarifaCobranca_label\"]/following-sibling::div")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idTarifaCobranca_1")).click();		
		return this;
	}
	
	public Hotel_Tarifario_Page periodo() {
		//idPeriodoSel_0 = Selecione
		//idPeriodoSel_1 = DIARIO
		//idPeriodoSel_2 = MINIMO
		//idPeriodoSel_3 = EXATO
		//idPeriodoSel_4 = ESPECIAL
		//idPeriodoSel_5 = PACOTE	
		
		nav.findElement(By.xpath("//label[@id = \"idPeriodoSel_label\"]/following-sibling::div")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idPeriodoSel_1")).click();		
		return this;
	}

	
	public Hotel_Tarifario_Page tarifario_publicacao(String dataInicioPub, String dataFimPub) {
		nav.findElement(By.linkText("Publicação")).click();
		nav.findElement(By.xpath("//table[@class = \"tblPadrao\"]/tbody/tr/th/a")).click();	
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("repeatTSP:0:dtInicio_input")).click();
		nav.findElement(By.id("repeatTSP:0:dtInicio_input")).sendKeys(dataInicioPub);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("repeatTSP:0:dtFim_input")).click();
		nav.findElement(By.id("repeatTSP:0:dtFim_input")).sendKeys(dataFimPub);		
		return this;
	}
	
	public Hotel_Tarifario_Page tarifario_tarifa() {
		nav.findElement(By.linkText("Tarifas")).click();
		nav.findElement(By.xpath("//span[@id = \"pnlTarifario:0:pnlTarifa\"]/div/span/following-sibling::a")).click();		
		return this;
	}
	
	public Hotel_Tarifario_Page tarifario_tarifa_regime() {
		//li[@data-label = "All Inclusive"]
		//li[@data-label = "Café da manhã"]
		//li[@data-label = "Café da manhã e jantar"]
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//label[contains(@id, \"pnlTarifario:0:rptTarifaUh\")]/following-sibling::div")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//li[@data-label = \"All Inclusive\"]")).click();		
		return this;
	}
	
	public Hotel_Tarifario_Page tarifario_tarifa_valores(String valorInd, String valorAdc) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[@class = \"ui-chkbox-icon ui-icon ui-icon-blank ui-c\"]")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//input[contains(@id, \"pnlTarifario:0:rptTarifaUh:0:repeatTarifa:0\") and @type = \"text\"]")).sendKeys(valorInd);	
		nav.findElement(By.xpath("//input[contains(@id, \"pnlTarifario:0:rptTarifaUh:0:repeatTarifa:1:\") and @type = \"text\"]")).sendKeys(valorAdc);	
		return this;
	}
	
	public Hotel_Tarifario_Page tarifario_tarifario_salvar() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//form[@id = \"frmTarifaUhEdit\"]/div/div/button")).click();		
		return this;
	}
	
	public Hotel_Tarifario_Page tarifario_publicar() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Publicar\"]")).click();		
		nav.findElement(By.xpath("//span[text() = \"Sim\"]")).click();		
		return this;
	}
	
	public Hotel_Tarifario_Page popUpErro() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}

		java.util.List<WebElement> list = nav.findElements(By.xpath("//div[@id = \"idMsgError\"]/div/ul/li"));

		for (WebElement element : list) {
			System.out.println(element.getText());
		}

		if (list.get(0).getText().equals("Descrição - Preenchimento obrigatório")) {
			System.out.println(list.get(0).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(1).getText().equals("Fornecedor - Preenchimento obrigatório")) {
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
		if (list.get(3).getText().equals("Validade inicial - Preenchimento obrigatório")) {
			System.out.println(list.get(3).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		if (list.get(4).getText().equals("Validade final - Preenchimento obrigatório")) {
			System.out.println(list.get(4).getText());
			System.out.println("Existe");
		} else {
			System.out.println("Não Existe");
			throw new RuntimeException();
		}
		

		return this;
	}
	
}
