package br.com.RafaelaTrevizan.steps;

import java.util.concurrent.TimeUnit;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ReservarPage;
import cucumber.api.PendingException;
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
		nav.manage().window().maximize();
		nav.get("http://192.168.15.100:8080/infotravel/login.xhtml");
	}

	@Dado("^que desejo fazer uma reserva$")
	public void queEstejaNaHomeDoPortal() throws Throwable {
		LoginPage login = new LoginPage(nav);
		login.doLogin("homo", "homolog", "123456");

	}
	// FEATURE: RESERVAR

	@Quando("^clicar no menu Reserva e preencher o campo \"([^\"]*)\"$")
	public void clicarNoMenuReservaEPreencherOCampo(String arg1) throws Throwable {
		HomePage home = new HomePage(nav);
		home.clickMenu();
		
		ReservarPage res = new ReservarPage(nav);
		res.fillDestino(arg1);
	    
	}

	@Quando("^preencher as datas \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preencherAsDatasE(String arg1, String arg2) throws Throwable {
		ReservarPage res = new ReservarPage(nav);
		res.fillDates(arg1, arg2);
	   
	}

	@Quando("^clicar no botão pesquisar$")
	public void clicarNoBotãoPesquisar() throws Throwable {
	    
	}

	@Quando("^selecionar o hotel$")
	public void selecionarOHotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^os campos para reserva devem ser preenchidos$")
	public void osCamposParaReservaDevemSerPreenchidos() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^a reserva deverá ser feita com sucesso$")
	public void aReservaDeveráSerFeitaComSucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



	
//
//	@After
//	public void tearDown() {
//
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException ex) {
//		}
//
//		nav.quit();
//	}

}
