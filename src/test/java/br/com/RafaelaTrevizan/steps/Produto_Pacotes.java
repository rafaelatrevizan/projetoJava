package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Pages.Base_Page;
import Pages.Home_Page;
import Pages.Hotel_Page;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Produto_Pacotes extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page homeHotel = new Home_Page(nav);
	Frame frame = new Frame(nav);

	// FEATURE: CADASTRO DE PACOTE
	@Quando("^clicar para adicionar um novo pacote$")
	public void clicarParaAdicionarUmNovoPacote() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^preencher todas as informações do pacote$")
	public void preencherTodasAsInformaçõesDoPacote() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^o pacote deverá ser cadastrado com sucesso$")
	public void oPacoteDeveráSerCadastradoComSucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	

}
