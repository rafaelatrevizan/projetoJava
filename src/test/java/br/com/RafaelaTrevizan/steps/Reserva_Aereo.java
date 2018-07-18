package br.com.RafaelaTrevizan.steps;

import java.util.concurrent.TimeUnit;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.Comprovante_Page;
import Pages.Home_Page;
import Pages.Reserva_Aereo_Cliente_Page;
import Pages.Reservar_Aereo_Page;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Reserva_Aereo extends AbstractPage {

	WebDriver nav = getDriver();
	Reservar_Aereo_Page aereo = new Reservar_Aereo_Page(nav);
	Frame frame = new Frame(nav);
	Home_Page home = new Home_Page(nav);
	Reserva_Aereo_Cliente_Page aereoCliente = new Reserva_Aereo_Cliente_Page(nav);
	Comprovante_Page comp = new Comprovante_Page(nav);
	

	// FEATURE: RESERVAR AEREO

	@Quando("^clicar no menu Reserva$")
	public void clicarNoMenuReserva() throws Throwable {
		home.clickMenuReservar();
	}

	@Quando("^escolher a aba Passagens$")
	public void escolherAAbaPassagens() throws Throwable {
		frame.swithFrame(0);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.xpath("//form[@id = \"frmPesquisaMenu\"]/div/div/ul/li[2]/a")).click();
	}

	@Quando("^preencher o campo \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preencherOCampoE(String arg1, String arg2) throws Throwable {
		aereo.fillOrigem(arg1);
		aereo.fillDestino(arg2);
	}

	@Quando("^preencher as datas de \"([^\"]*)\" e \"([^\"]*)\"$")
	public void preencherAsDatasDeE(String arg1, String arg2) throws Throwable {
		aereo.fillDates(arg1, arg2);
	}
	
	@Quando("^clicar no botão pesquisar passagem$")
	public void clicarNoBotãoPesquisarParaSelecionarUmaPassagem() throws Throwable {
	    aereo.clickPesquisar();
	}

	@Quando("^selecionar a passagem$")
	public void selecionarAPassagem() throws Throwable {
		nav.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		aereo.selectAereo();
	}


	@Então("^os campos para reserva de passagens devem ser preenchidos$")
	public void osCamposParaReservaDePassagensDevemSerPreenchidos() throws Throwable {
		aereoCliente.fillNames1();
		aereoCliente.fillDocument("33762977704");
		aereoCliente.fillSexo1();
		aereoCliente.fillDate1();
//		aereoCliente.politica();
		aereoCliente.dadosDoCliente();
	}

	@Então("^a reserva da passagem deverá ser feita com sucesso$")
	public void aReservaDaPassagemDeveráSerFeitaComSucesso() throws Throwable {
		aereoCliente.clickReservar();		
		comp.idReserva();
	}

}
