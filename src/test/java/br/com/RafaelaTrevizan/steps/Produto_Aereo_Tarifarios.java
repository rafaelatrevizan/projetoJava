package br.com.RafaelaTrevizan.steps;

import org.openqa.selenium.WebDriver;

import Pages.Aereo_Tarifario_Page;
import Pages.Home_Page;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Produto_Aereo_Tarifarios extends AbstractPage{
	
	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Aereo_Tarifario_Page tarifa = new Aereo_Tarifario_Page(nav);
	Frame frame = new Frame(nav);
	
	@Quando("^clicar para adicionar um novo tarifário de aéreo$")
	public void clicarParaDicionarUmNovoTarifárioDeAéreo() throws Throwable {
	    home.clickAereoTarifario();
	    frame.swithFrame(0);
	    tarifa.addTarifario();
	}

	@Quando("^preencher todas as informações de tarifário$")
	public void preencherTodasAsInformaçõesDeTarifário() throws Throwable {
	    tarifa.fillName("Automação Tarifa Voo Rafa");
	    tarifa.fillCiaAerea();
	    
	}

	@Então("^a tarifa deverá ser cadastrada com sucesso$")
	public void aTarifaDeveráSerCadastradaComSucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
