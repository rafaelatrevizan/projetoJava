package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Pages.Cadastro_Fornecedor_Page;
import Pages.Home_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Cadastro_Fornecedor extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Cadastro_Fornecedor_Page fornecedor = new Cadastro_Fornecedor_Page(nav);


	// FEATURE: PRODUTO

	@Quando("^clicar para adicionar um novo fornecedor$")
	public void clicarParaAdicionarUmNovoFornecedor() throws Throwable {
	   home.clickCadastroFornecedor();
	   fornecedor.addFonecedor();	   
	}

	@Quando("^preencher todas as informações do fornecedor$")
	public void preencherTodasAsInformaçõesDoFornecedor() throws Throwable {
	   fornecedor.fillNames("Automação teste Rafa", "Automação teste Rafa");
	   fornecedor.fillDocumento("41.521.155/0001-50");
	   fornecedor.fillContato("Jose Maria");
	   fornecedor.fillEmail("rafaela@infotera.com.br");
	   fornecedor.fillCep("77006078");
	}

	@Então("^o fornecedor deverá ser cadastrado com sucesso$")
	public void oFornecedorDeveráSerCadastradoComSucesso() throws Throwable {
	   fornecedor.clickSalvar();
	}
	
	//VALIDAR CAMPOS OBRIGATÓRIOS
	
	@Quando("^não preencher os campos obrigatórios do fornecedor$")
	public void nãoPreencherOsCamposObrigatóriosDoFornecedor() throws Throwable {
		fornecedor.clickSalvar();
	}

	@Então("^ao salvar os campos do fornecedor deverão ser exibidos em um popup$")
	public void aoSalvarOsCamposDoFornecedorDeverãoSerExibidosEmUmPopup() throws Throwable {
	    fornecedor.popUpErro();
	}

	// CADASTRAR PROFISSIONAL
	
	@Quando("^selecionar o fornecedor$")
	public void selecionarOFornecedor() throws Throwable {
		home.clickCadastroFornecedor();
	    fornecedor.pesqNome("Automação teste Rafa");
	    fornecedor.clickPesquisar();
	    fornecedor.selectFornecedor();
	}

	@Quando("^preencher as informações do profissional$")
	public void preencherAsInformaçõesDoProfissional() throws Throwable {
	   fornecedor.abaProf();
	   fornecedor.fillNamesProf("Automação Rafa", "Automação Rafa");
	   fornecedor.fillUserProf("automatico");
	   fornecedor.credenciaisAcesso();
	   fornecedor.fillEmail("rafaela@infotera.com.br");
	   fornecedor.fillCep("079033030");
	}

	@Então("^o profissional deve ser cadastrado com sucesso$")
	public void oProfissionalDeveSerCadastradoComSucesso() throws Throwable {
	    fornecedor.clickSalvar();
	}


}
