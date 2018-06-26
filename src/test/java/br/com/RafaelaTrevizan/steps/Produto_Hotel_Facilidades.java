package br.com.RafaelaTrevizan.steps;

import org.openqa.selenium.WebDriver;

import Pages.FacilidadesPage;
import Pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Produto_Hotel_Facilidades extends AbstractPage{
	
	WebDriver nav = getDriver();

	
	@Quando("^clicar para dicionar uma nova facilidade$")
	public void clicarParaDicionarUmaNovaFacilidade() throws Throwable {
		HomePage home = new HomePage(nav);
		FacilidadesPage facil = new FacilidadesPage(nav);
		
		home.clickFacilidades();
		facil.addFacility();		
		
	}
	
	@Quando("^preencher todas as informações da facilidade$")
	public void preencherTodasAsInformações() throws Throwable {
						
		
	}

	@Então("^a facilidade deverá ser cadastrada com sucesso$")
	public void aFacilidadeDeveráSerCadastradaComSucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
