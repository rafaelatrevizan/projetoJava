package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Pages.Cambio_Page;
import Pages.Home_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Cambio extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Cambio_Page cambio = new Cambio_Page(nav);

	// FEATURE: CAMBIO

	@Quando("^clicar para adicionar um Cambio$")
	public void clicarParaAdicionarUmCambio() throws Throwable {
		home.clickCambio();
		cambio.addCambio();
	}

	@Quando("^preencher todas as informações do Cambio$")
	public void preencherTodasAsInformaçõesDoCambio() throws Throwable {
		cambio.chooseMoeda();
		cambio.chooseCambio();
		cambio.fillValor("300");
		cambio.fillTaxa("300");
	}

	@Então("^o Cambio deverá ser cadastrado com sucesso$")
	public void oCambioDeveráSerCadastradoComSucesso() throws Throwable {
		cambio.clickSalvar();
	}

	//VALIDAR CAMPOS OBRIGATÓRIOS

	@Quando("^não preencher os campos obrigatórios do cambio$")
	public void nãoPreencherOsCamposObrigatóriosDoCambio() throws Throwable {
		cambio.clickSalvar();
	}

	@Então("^ao salvar os campos do cambio deverão ser exibidos em um popup$")
	public void aoSalvarOsCamposDoCambioDeverãoSerExibidosEmUmPopup() throws Throwable {
		cambio.popUpErro();
	}

}
