package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Pages.Home_Page;
import Pages.Profissionais_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Profissionais extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Profissionais_Page prof = new Profissionais_Page(nav);
	

	// FEATURE: UNIDADES

	@Quando("^clicar para adicionar um Profissional$")
	public void clicarParaAdicionarUmProfissional() throws Throwable {
	    home.clickProfissionais();
	    prof.addProf();
	}

	@Quando("^preencher todas as informações do Profissional$")
	public void preencherTodasAsInformaçõesDoProfissional() throws Throwable {
	    prof.fillInformation("Automação teste Rafa", "Aut teste Rafa");
	    prof.fillUser("aut");
	    prof.fillEmail("rafaela@infotera.com.br");
	    prof.fillCep("09973290");
	}

	@Então("^o Profissional deverá ser cadastrado com sucesso$")
	public void oProfissionalDeveráSerCadastradoComSucesso() throws Throwable {
	    prof.clickSalvar();
//	    prof.checkProf();
	}

	
	//VALIDAR CAMPOS OBRIGATÓRIOS
	@Quando("^não preencher os campos obrigatórios do profissional$")
	public void nãoPreencherOsCamposObrigatóriosDoProfissional() throws Throwable {
	    prof.clickSalvar();
	}

	@Então("^ao salvar os campos do profissional eles deverão ser exibidos em um popup$")
	public void aoSalvarOsCamposDoProfissionalElesDeverãoSerExibidosEmUmPopup() throws Throwable {
	    prof.popUpErro();
	}

}
