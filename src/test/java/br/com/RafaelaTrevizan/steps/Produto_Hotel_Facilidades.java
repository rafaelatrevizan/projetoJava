package br.com.RafaelaTrevizan.steps;

import org.openqa.selenium.WebDriver;

import Pages.Hotel_Facilidades_Page;
import Suporte.Frame;
import Pages.Home_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Produto_Hotel_Facilidades extends AbstractPage{
	
	WebDriver nav = getDriver();
	Hotel_Facilidades_Page facil = new Hotel_Facilidades_Page(nav);
	Home_Page home = new Home_Page(nav);
	Frame frame = new Frame(nav);
	
	@Quando("^clicar para dicionar uma nova facilidade$")
	public void clicarParaDicionarUmaNovaFacilidade() throws Throwable {		
		home.clickFacilidades();
		facil.addFacility();		
		
	}
	
	@Quando("^preencher todas as informações da facilidade$")
	public void preencherTodasAsInformações() throws Throwable {
		facil.fillName("Piscina");
		facil.fillItens("Boias", "teste", "Para as crianças se divertirem");
		
		
	}

	@Então("^a facilidade deverá ser cadastrada com sucesso$")
	public void aFacilidadeDeveráSerCadastradaComSucesso() throws Throwable {
	    facil.salvaritem();
	    facil.salvarFacil();    
	    
	}


}
