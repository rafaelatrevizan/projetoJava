package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.github.javafaker.Faker;

public class HotelPage extends BasePage {
	private Faker faker = new Faker();
//	private String hotelllllll;
	

	public HotelPage(WebDriver nav) {
		super(nav);
		// TODO Auto-generated constructor stub
	}
		
	public HotelPage buttonAdicionar() {
		
		nav.findElement(By.xpath("//button[@type = \"submit\"]/span/following-sibling::span[text() = \"Adicionar\"]")).click();	
		return this;
	}
	
	public HotelPage buttonPesquisar() {	
		
		nav.findElement(By.xpath("//button[@type = \"submit\"]/span/following-sibling::span[text() = \"Pesquisar\"]")).click();		
		return this;
	}
	
	public HotelPage fillInformations(String nomeHotel) {
		
		WebElement add = nav.findElement(By.id("idQtEstrela_input"));	
		
		nav.findElement(By.id("idNome")).sendKeys(nomeHotel);	
//		hotelllllll = nomeHotel;	
		return this;
	}
	
	public HotelPage fillStar() {
		//idQtEstrela_0  = Não definido
		//idQtEstrela_1  = 1 Estrela
		//idQtEstrela_2  = 1,5 Estrela
		//idQtEstrela_3  = 2 Estrela
		//idQtEstrela_4  = 2,5 Estrela
		//idQtEstrela_5  = 3 Estrela
		//idQtEstrela_6  = 3,5 Estrela
		//idQtEstrela_7  = 4 Estrela
		//idQtEstrela_8  = 4,5 Estrela
		//idQtEstrela_9  = 5 Estrela
	
		nav.findElement(By.xpath("//label[@id = \"idQtEstrela_label\"]/following-sibling::div/span")).click();	
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("idQtEstrela_5")).click();
		
		return this;
	}
	
	public HotelPage fillActive() {
		//idAtivo_0  = Sim
		//idAtivo_1  = Não		
	
		nav.findElement(By.xpath("//label[@id = \"idAtivo_label\"]/following-sibling::div")).click();	
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("idAtivo_0")).click();
		
		return this;
	}
	
	public HotelPage fillDescription(String descricao) {	
		
		nav.findElement(By.id("pasteConteudo")).sendKeys(descricao);
		
		return this;
	}
	
	public HotelPage fillCoin() {	
		//idMoeda_0  = Selecione
		//idMoeda_1  = Real
		//idMoeda_2  = Dolar	
		//idMoeda_3  = Euro
		//idMoeda_4  = Libra esterlina
		//idMoeda_5  = Peso Chileno		
		
		nav.findElement(By.xpath("//label[@id = \"idMoeda_label\"]/following-sibling::div")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("idMoeda_1")).click();
		
		return this;
	}
	
	public HotelPage fillAdmin() {	
		//idAdminLocal_0  = Sim
		//idAdminLocal_1  = Não			
		
		nav.findElement(By.xpath("//label[@id = \"idAdminLocal_label\"]/following-sibling::div")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("idAdminLocal_0")).click();
		
		return this;
	}
	
	public HotelPage fillMsgDisponivel() {	
		//idInfoFaltaDisponibilidade_0  = Sim
		//idInfoFaltaDisponibilidade_1 = Não
		
		nav.findElement(By.xpath("//label[@id = \"idInfoFaltaDisponibilidade_label\"]/following-sibling::div")).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("idInfoFaltaDisponibilidade_0")).click();
		
		return this;
	}
	
	public HotelPage fillMinDeNoites(String noites) {
		nav.findElement(By.id("idMinDiaria")).sendKeys(noites);		
		return this;
	}
	
	public HotelPage fillPhones() {	
		//TELEFONE FIXO
		String telFixo = faker.phoneNumber().phoneNumber();
		WebElement fixo = nav.findElement(By.id("idTelefoneFixo"));
		fixo.sendKeys(telFixo);
		
		//TELEFONE CELULAR
		String telCel = faker.phoneNumber().phoneNumber();
		WebElement Cel = nav.findElement(By.id("idTelefoneCelular"));
		Cel.sendKeys(telCel);
		
		//TELEFONE ADICIONAL
		String telAdd = faker.phoneNumber().phoneNumber();
		WebElement Addic = nav.findElement(By.id("idTelefoneAdicional"));
		Addic.sendKeys(telAdd);
		
		return this;
	}
		
	public HotelPage fillEmail() {
		String email = faker.internet().emailAddress();
		nav.findElement(By.id("idEmail")).sendKeys(email);		
		return this;
	}
	
	public HotelPage fillEndereco(String cep, String rua, String local) {
		//PREENCHER O CEP
//		String cepp = faker.address().zipCode();
		nav.findElement(By.id("idCep")).sendKeys(cep);	
		
		//PREENCHER A RUA
//		String rua = faker.address().streetAddress();
		nav.findElement(By.id("idNMEndereco")).sendKeys(rua);
		
		//PREENCHER LOCAL 		
		nav.findElement(By.id("idNmLocal")).sendKeys(local);

		return this;
	}
	
	public HotelPage localizacoes(String lugar) {
		WebElement inputPlace = nav.findElement(By.id("idOrigem_input"));
		inputPlace.sendKeys(lugar);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		inputPlace.sendKeys(Keys.ENTER);
		return this;
	}
	
	public HotelPage Salvar() {
		nav.findElement(By.xpath("//span[text() = \"Salvar\"]")).click();		
		return this;
	}
	
	public HotelPage Cancelar() {
		nav.findElement(By.xpath("//span[text() = \"Cancelar\"]")).click();		
		return this;
	}
	
//	public HotelPage checkHotel() {
//		WebElement hotelCadastrado = nav.findElement(By.id("idNome"));
//		String HC = hotelCadastrado.getText();
//		if(HC.contains(hotelllllll)) {
//			System.out.println("Hotel cadastrado com sucesso");
//		} 
//		
//		
//		return this;
//	}



}
