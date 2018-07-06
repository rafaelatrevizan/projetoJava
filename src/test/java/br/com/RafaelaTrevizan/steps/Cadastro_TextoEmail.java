package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Pages.Cadastro_TextoEmail_Page;
import Pages.Home_Page;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Cadastro_TextoEmail extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Cadastro_TextoEmail_Page textoEmail = new Cadastro_TextoEmail_Page(nav);
	Frame frame = new Frame(nav);
	
	// FEATURE: CADASTRO TEXTO PARA EMAIL

	@Quando("^clicar para adicionar um texto para email$")
	public void clicarParaAdicionarUmTextoParaEmail() throws Throwable {
	    home.clickCadastroTextoEmail();
	    textoEmail.addTexto();
	}

	@Quando("^preencher todas as informaçõesda do texto para email$")
	public void preencherTodasAsInformaçõesdaDoTextoParaEmail() throws Throwable {
	    textoEmail.fillAssunto("Automação teste Rafa");
	    textoEmail.fillRemetente("rafaela@infotera.com.br");
	    textoEmail.selectTipo();
	    textoEmail.fillCorpoEmail("Automação teste Rafa email cancelamento de reserva");
	}

	@Então("^o texto para email deverá ser cadastrado com sucesso$")
	public void oTextoParaEmailDeveráSerCadastradoComSucesso() throws Throwable {
		nav.switchTo().parentFrame();
		textoEmail.clickSalvar();
	}

	//VALIDAR CAMPOS OBRIGATÓRIOS
	
	@Quando("^não preencher os campos obrigatórios do texto para email$")
	public void nãoPreencherOsCamposObrigatóriosDoTextoParaEmail() throws Throwable {
		textoEmail.clickSalvar();
	}

	@Então("^ao salvar os campos do texto para email deverão ser exibidos em um popup$")
	public void aoSalvarOsCamposDoTextoParaEmailDeverãoSerExibidosEmUmPopup() throws Throwable {
	    textoEmail.popUpErro();
	}


}
