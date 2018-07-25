package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.Cadastro_Cliente_Page;
import Pages.Cadastro_Fornecedor_Page;
import Pages.Home_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Cadastro_Cliente extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Cadastro_Cliente_Page cliente = new Cadastro_Cliente_Page(nav);

	// FEATURE: CADASTRO CLIENTE

	@Quando("^clicar para adicionar um novo cliente$")
	public void clicarParaAdicionarUmNovoCliente() throws Throwable {
		home.clickCadastroCliente();
		cliente.addCliente();
	}

	@Quando("^preencher todas as informações do cliente$")
	public void preencherTodasAsInformaçõesDoCliente() throws Throwable {
		cliente.fillName("Automação teste Rafa");
		cliente.fillTelefone("11123456789");
		cliente.fillEmail();
		cliente.fillEstado();
		cliente.fillMunicipio();

	}

	@Então("^o cliente deverá ser cadastrado com sucesso$")
	public void oClienteDeveráSerCadastradoComSucesso() throws Throwable {
		cliente.clickSalvar();
	}

	// VALIDAR CAMPOS OBRIGATÓRIOS

	@Quando("^não preencher os campos obrigatórios do cliente$")
	public void nãoPreencherOsCamposObrigatóriosDoCliente() throws Throwable {
		cliente.clickSalvar();
	}

	@Então("^ao salvar os campos do cliente deverão ser exibidos em um popup$")
	public void aoSalvarOsCamposDoClienteDeverãoSerExibidosEmUmPopup() throws Throwable {
		cliente.popUpErro();
	}

	// VALIDAR CLIENTE DESATIVADO

	@Quando("^pesquisar um cliente$")
	public void pesquisarUmCliente() throws Throwable {
		home.clickCadastroCliente();
		cliente.pesqNome("Automação teste Rafa");
		cliente.clickPesquisar();
		cliente.selectCliente();
	}

	@Quando("^desativar o cliente selecionado$")
	public void desativarOMesmo() throws Throwable {
		cliente.campoMotivoDesativar();
		
		cliente.desativarCliente("Teste Automação desativar");
		nav.findElement(By.xpath("//span[text() = \"Voltar\"]")).click();
	}

	@Então("^na coluna Ativo deverá ser exibido Não$")
	public void naColunaAtivoDeveráSerExibidoNão() throws Throwable {
		cliente.checkDesativado();
	}

	// VALIDAR CLIENTE ATIVADO

	@Quando("^ativar o cliente selecionado$")
	public void ativarOMesmo() throws Throwable {
		cliente.campoMotivoAtivar();
		cliente.ativarCliente("Teste Automação Ativar");
		nav.findElement(By.xpath("//span[text() = \"Voltar\"]")).click();
	}

	@Então("^na coluna Ativo deverá ser exibido Sim$")
	public void naColunaAtivoDeveráSerExibidoSim() throws Throwable {
		cliente.checkAtivado();
	}

}
