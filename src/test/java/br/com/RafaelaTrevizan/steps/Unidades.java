package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Pages.Home_Page;
import Pages.Unidades_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Unidades extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Unidades_Page unidade = new Unidades_Page(nav);

	// FEATURE: UNIDADES

	@Quando("^clicar para adicionar uma nova Unidade$")
	public void clicarParaDicionarUmaNovaUnidade() throws Throwable {
		home.clickUnidades();
		unidade.addUnidade();
	}

	@Quando("^preencher todas as informaçõesda unidade$")
	public void preencherTodasAsInformaçõesdaUnidade() throws Throwable {
		unidade.fillNames("Automação teste rafa Unidade", "Automação");
		unidade.fillCNPJ("66.270.588/0001-01");
		unidade.Telefones("1111111111");
		unidade.fillEmail();
		unidade.fillCep("85870-180");
	}

	@Então("^a unidade deverá ser cadastrado com sucesso$")
	public void aUnidadeDeveráSerCadastradoComSucesso() throws Throwable {
		unidade.clickSalvar();
	}

	// VALIDAR CAMPOS OBRIGATÓRIOS
	@Quando("^não preencher os campos obrigatórios$")
	public void nãoPreencherOsCamposObrigatórios() throws Throwable {
		unidade.fillNames("", "");
		unidade.fillCNPJ("");
		unidade.Telefones("");
		unidade.fillEmailNull("");
		unidade.fillCep("");
	}

	@Então("^ao salvar os campos deverão ser exibidos em um popup$")
	public void aoSalvarOsCamposDeverãoSerExibidosEmUmPopup() throws Throwable {
		unidade.clickSalvar();
		unidade.popUpErro();
	}

}
