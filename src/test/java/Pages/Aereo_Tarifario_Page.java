package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Aereo_Tarifario_Page extends Base_Page {

	public Aereo_Tarifario_Page(WebDriver nav) {
		super(nav);
	}

	public Aereo_Tarifario_Page addTarifario() {
		nav.findElement(By.xpath("//span[text() = \"Adicionar\"]")).click();
		return this;
	}

	public Aereo_Tarifario_Page Pesquisar() {
		nav.findElement(By.xpath("//span[text() = \"Pesquisar\"]/ancestor::button")).click();
		return this;
	}

	public Aereo_Tarifario_Page fillName(String nome) {
		nav.findElement(By.id("idNmTarifa")).sendKeys(nome);
		return this;
	}

	public Aereo_Tarifario_Page fillCiaAerea() {
		// idCiaAerea_0 = selecione
		// idCiaAerea_1 = Avianca
		// idCiaAerea_2 = Azul
		// idCiaAerea_3 = EMIRATES
		// idCiaAerea_4 = GOL
		// idCiaAerea_5 = LATAM

		nav.findElement(By.xpath("//label[@id = \"idCiaAerea_label\"]/following-sibling::div")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

		nav.findElement(By.id("idCiaAerea_1")).click();

		return this;
	}

	public Aereo_Tarifario_Page fillFornecedor() {
		// Sempre o primeiro fornecedor pq só será possível seleciona-lo quando
		// selecioner a Cia aerea
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

		nav.findElement(By.xpath("//label[@id = \"idFornecedor_label\"]/following-sibling::div")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}

		nav.findElement(By.id("idFornecedor_1")).click();

		return this;
	}

	public Aereo_Tarifario_Page fillMoeda() {
		// idMoeda_0 = selecione
		// idMoeda_1 = Real
		// idMoeda_2 = Dolar
		// idMoeda_3 = Euro
		// idMoeda_4 = Libra Esterlina
		// idMoeda_5 = Peso Chileno

		nav.findElement(By.xpath("//label[@id = \"idMoeda_label\"]/following-sibling::div")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idMoeda_1")).click();
		return this;
	}

	public Aereo_Tarifario_Page abaTarifa(String nomeTarifa, String valorAdulto, String valorCrianca,
			String valorInfantil, String valorSenior) {
		nav.findElement(By.linkText("Tarifa")).click();
		nav.findElement(By.xpath("//div[@class = \"ContainerIndent\"]/span[text() = \"Tarifas\"]/following-sibling::a"))
				.click();
		WebElement nomeTarifa1 = nav.findElement(By.id("idNmPreco"));
		nomeTarifa1.sendKeys(nomeTarifa);
		nav.findElement(By.id("idVlAdt")).sendKeys(valorAdulto);
		nav.findElement(By.id("idVlChd")).sendKeys(valorCrianca);
		nav.findElement(By.id("idVlInf")).sendKeys(valorInfantil);
		nav.findElement(By.id("idVlSnr")).sendKeys(valorSenior);
		nav.findElement(By.xpath(
				"//div[@class =\"ui-g\"]/div/div/following-sibling::div/div/following-sibling::div/form/div/following-sibling::div/button/span/following-sibling::span[text() = \"Salvar\"]"))
				.click();

		return this;
	}

	public Aereo_Tarifario_Page abaVoos() {
		// O método abaTarifa precisa ser executado primeiro para ser possível cadastrar
		// um voo

		nav.findElement(By.linkText("Voos")).click();
		nav.findElement(By.xpath("//span[@id = \"pnlVoo\"]/div/span/following-sibling::a ")).click();
		return this;
	}

	public Aereo_Tarifario_Page abaVoos_Data(String data1) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
//		nav.findElement(By.id("dtData_input")).click();
		nav.findElement(By.id("dtData_input")).sendKeys(data1);
		return this;
	}

	public Aereo_Tarifario_Page abaVoos_Aeronave() {
		// idAeronavePesquisa_0 = selecione
		// idAeronavePesquisa_1 = A320-AirBus A320
		// idAeronavePesquisa_2 = A321-AirBus A321
		// idAeronavePesquisa_3 = B737-Boeing 737
		// idAeronavePesquisa_4 = B777-Boeing 777
		// idAeronavePesquisa_5 = A320-Air Bus A320

		nav.findElement(By.xpath("//label[@id = \"idAeronavePesquisa_label\"]/following-sibling::div/span")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//li[@id = \"idAeronavePesquisa_1\"]")).click();
		return this;
	}

	public Aereo_Tarifario_Page abaVoos_CiaAerea() {
		// idCiaPesquisa_0 = selecione
		// idCiaPesquisa_1 = A320-AirBus A320
		// idCiaPesquisa_2 = A321-AirBus A321
		// idCiaPesquisa_3 = B737-Boeing 737
		// idCiaPesquisa_4 = B777-Boeing 777
		// idCiaPesquisa_5 = A320-Air Bus A320

		nav.findElement(By.xpath("//label[@id = \"idCiaPesquisa_label\"]/following-sibling::div/span")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//li[@id = \"idCiaPesquisa_1\"]")).click();
		return this;
	}

	public Aereo_Tarifario_Page abaVoos_Tipo() {
		// idTipoVoo_0 = selecione
		// idTipoVoo_1 = FRETAMENTO
		// idTipoVoo_2 = REGULAR
		// idTipoVoo_3 = BLOQUEIO

		nav.findElement(By.xpath("//label[@id = \"idTipoVoo_label\"]/following-sibling::div/span")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//li[@id = \"idTipoVoo_1\"]")).click();
		return this;
	}

	public Aereo_Tarifario_Page abaVoos_Localizador(String localizador) {
		nav.findElement(By.id("idNumeroBloqueio")).sendKeys(localizador);
		return this;
	}

	public Aereo_Tarifario_Page abaVoos_QtdPassangers(String qtddPassageiros) {
		nav.findElement(By.id("idQuantidade")).sendKeys(qtddPassageiros);		
		return this;
	}
	
	public Aereo_Tarifario_Page abaVoos_Bagagem(String qtdd, String peso) {
		nav.findElement(By.id("idBagagem")).sendKeys(qtdd);				
		nav.findElement(By.id("idPeso")).sendKeys(peso);			
		return this;
	}
	
	public Aereo_Tarifario_Page abaVoos_Deadline(String data2) {
		nav.findElement(By.id("idDtDeadline_input")).click();
		nav.findElement(By.id("idDtDeadline_input")).sendKeys(data2);
		return this;
	}
	
	public Aereo_Tarifario_Page abaVoos_Obs(String obs) {
		nav.findElement(By.id("idDsObservacao")).sendKeys(obs);
		return this;
	}

	
	public Aereo_Tarifario_Page abaVoos_Trecho(String numVoo, String iataOrigem, String iataDestino, String horapart, String horachegada ) {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Número do Voo\"]/following-sibling::input")).sendKeys(numVoo);
		//É necessário clicar no campo para que o valor seja inserido corretamente
		nav.findElement(By.xpath("//span[text() = \"Iata Origem\"]/following-sibling::input")).click();
		nav.findElement(By.xpath("//span[text() = \"Iata Origem\"]/following-sibling::input")).sendKeys(iataOrigem);
		nav.findElement(By.xpath("//span[text() = \"Iata Destino\"]/following-sibling::input")).click();
		nav.findElement(By.xpath("//span[text() = \"Iata Destino\"]/following-sibling::input")).sendKeys(iataDestino);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		//É necessário clicar no campo para que o valor seja inserido
		nav.findElement(By.xpath("//span[text() = \"Hora Partida\"]/following-sibling::input")).click();
		nav.findElement(By.xpath("//span[text() = \"Hora Partida\"]/following-sibling::input")).sendKeys(horapart);
		nav.findElement(By.xpath("//span[text() = \"Hora Chegada\"]/following-sibling::input")).click();
		nav.findElement(By.xpath("//span[text() = \"Hora Chegada\"]/following-sibling::input")).sendKeys(horachegada);
		
		nav.findElement(By.xpath("//form[@id = \"frmVooEdit\"]/div/button/span[text() = \"Salvar\"]")).click();
		return this;
	}
	
	public Aereo_Tarifario_Page salvarEativarVoo() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Salvar Ativar\"]")).click();
		nav.findElement(By.xpath("//span[text() = \"Sim\"]")).click();
		return this;
	}
	
	// 
		
	
}
