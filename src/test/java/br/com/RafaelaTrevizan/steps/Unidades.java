package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.Cadastro_Cliente_Page;
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
	Cadastro_Cliente_Page cliente = new Cadastro_Cliente_Page(nav);

	// FEATURE: UNIDADES
	
	//ACESSAR O MENU UNIDADE
	@Quando("^clicar no menu Unidade$")
	public void clicarNoMenuUnidade() throws Throwable {
		home.clickUnidades();
	}

	//CADASTRAR NOVA UNIDADE
	@Quando("^clicar para adicionar uma nova Unidade$")
	public void clicarParaDicionarUmaNovaUnidade() throws Throwable {	
		nav.switchTo().frame(0);
		unidade.addUnidade();
	}

	@Quando("^preencher todas as informaçõesda unidade$")
	public void preencherTodasAsInformaçõesdaUnidade() throws Throwable {
		unidade.fillNames("Automação teste rafa Unidade", "Automação");
		unidade.fillCNPJ("40.548.330/0001-30");
		unidade.Telefones("1111111111");
		unidade.fillEmail();
		unidade.fillCep("85870180");
	}

	@Então("^a unidade deverá ser cadastrado com sucesso$")
	public void aUnidadeDeveráSerCadastradoComSucesso() throws Throwable {
		unidade.clickSalvar();
//		unidade.checkUnidadeName();
	}

	// VALIDAR CAMPOS OBRIGATÓRIOS
	@Quando("^não preencher os campos obrigatórios$")
	public void nãoPreencherOsCamposObrigatórios() throws Throwable {
		unidade.clickSalvar();
	}

	@Então("^ao salvar os campos deverão ser exibidos em um popup$")
	public void aoSalvarOsCamposDeverãoSerExibidosEmUmPopup() throws Throwable {		
		unidade.popUpErro();
	}
	
	//PESQUISAR UNIDADE
	
	@Quando("^pesquisar uma unidade$")
	public void pesquisarUmaUnidade() throws Throwable {
		nav.switchTo().frame(0);
	    unidade.searchUnidade("Automação");
	    unidade.pesqUnidade();
	    unidade.selectUnidade();
	}
	
	//VALIDAR UNIDADE DESATIVADA
	@Quando("^desativar a unidade selecionada$")
	public void desativarAUnidadeSelecionada() throws Throwable {
		unidade.desativarUnidade("teste desativar unidade");
		nav.findElement(By.xpath("//span[text() = \"Voltar\"]")).click();
		
	}
	@Então("^na coluna Ativo de unidade deverá ser exibido Não$")
	public void naColunaAtivoDeUnidadeDeveráSerExibidoNão() throws Throwable {
		unidade.checkDesativado();
	}
	
	//VALIDAR UNIDADE ATIVADA
	@Quando("^ativar a unidade selecionada$")
	public void ativarAUnidadeSelecionada() throws Throwable {
		unidade.ativarUnidade("teste ativar unidade");
		nav.findElement(By.xpath("//span[text() = \"Voltar\"]")).click();		
	}

	@Então("^na coluna Ativo de unidade deverá ser exibido Sim$")
	public void naColunaAtivoDeUnidadeDeveráSerExibidoSim() throws Throwable {
		unidade.checkAtivado();
	}


}
