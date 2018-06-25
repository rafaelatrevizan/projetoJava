package br.com.RafaelaTrevizan.steps;

import java.util.concurrent.TimeUnit;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.ClientePage;
import Pages.ComprovantePage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ReservarPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Login {
	private WebDriver nav;

	@Before
	public void setUp() {
		nav = new ChromeDriver();
		nav.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(nav,10);
		nav.manage().window().maximize();
		nav.get("http://192.168.15.100:8080/infotravel/login.xhtml");
		System.out.println("Começando");
	}

	@Dado("^que esteja na home$")
	public void queEstejaNaHomeDoPortal() throws Throwable {
		LoginPage login = new LoginPage(nav);
		login.doLogin("homo", "homolog", "123456");

	}
	// FEATURE: RESERVAR

	@Quando("^clicar no menu Reserva e preencher o campo \"([^\"]*)\"$")
	public void clicarNoMenuReservaEPreencherOCampo(String arg1) throws Throwable {
		HomePage home = new HomePage(nav);
		ReservarPage reservar = new ReservarPage(nav);
		
		home.clickMenu();		
		reservar.fillDestino(arg1);					
		   
	}

	@Quando("^preencher as datas \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preencherAsDatasE(String arg1, String arg2) throws Throwable {
		ReservarPage reservar = new ReservarPage(nav);
		reservar.fillDates(arg1, arg2);	
	   
	}

	@Quando("^clicar no botão pesquisar$")
	public void clicarNoBotãoPesquisar() throws Throwable {
		ReservarPage reservar = new ReservarPage(nav);
		reservar.clickPesquisar();
		}

	@Quando("^selecionar o hotel$")
	public void selecionarOHotel() throws Throwable {
		ReservarPage reservar = new ReservarPage(nav);
		reservar.selectHotel();
	
	}

	@Então("^os campos para reserva devem ser preenchidos$")
	public void osCamposParaReservaDevemSerPreenchidos() throws Throwable {
	    ClientePage clientes = new ClientePage(nav);
	     		
	    clientes.fillNames1();	   
	    clientes.fillDocument("81627258736");    
	    clientes.fillSexo1();	    
	    clientes.fillDate1();
	    
	    clientes.fillNames2();
	    clientes.fillDocument1("32040476601");
	    clientes.fillSexo2();
	    clientes.fillDate2();
	    
	    clientes.textArea("teste rafa");
	    clientes.politica();
	    clientes.dadosDoCLiente("11123456789");
	    clientes.clickReservar();
	    
	}

	@Então("^a reserva deverá ser feita com sucesso$")
	public void aReservaDeveráSerFeitaComSucesso() throws Throwable {
		ComprovantePage comp = new ComprovantePage(nav);
		comp.idReserva();
	}
	
	//FEATURE: PRODUTO
	
	@Quando("^clicar para dicionar um novo hotel$")
	public void clicarParaDicionarUmNovoHotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^preencher todas as informações$")
	public void preencherTodasAsInformações() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^o hotel deverá ser cadastrado com sucesso$")
	public void oHotelDeveráSerCadastradoComSucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}




	@After
	public void tearDown() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ex) {
		}

		nav.quit();
	}

}
