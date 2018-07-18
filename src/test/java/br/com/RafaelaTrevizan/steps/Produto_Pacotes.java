package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Pages.Home_Page;
import Pages.Pacote_Page;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Produto_Pacotes extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Pacote_Page pacote = new Pacote_Page(nav);
	Frame frame = new Frame(nav);

	// FEATURE: CADASTRO DE PACOTE
	@Quando("^clicar para adicionar um novo pacote$")
	public void clicarParaAdicionarUmNovoPacote() throws Throwable {
	   home.clickMenuPacotes();
	   frame.swithFrame(0);
	   pacote.addPacote();
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
