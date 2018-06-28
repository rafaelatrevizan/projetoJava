package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Pages.Base_Page;
import Pages.Home_Page;
import Pages.Hotel_Page;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Produto_Hotel_Acomodacao extends AbstractPage{
	
	WebDriver nav = getDriver();
	Home_Page homeHotel = new Home_Page(nav);
	Hotel_Page hotel = new Hotel_Page(nav);
	Frame frame = new Frame(nav);
	
	//FEATURE: PRODUTO - HOTEL - ACOMODAÇÃO
	
	@Quando("^selencionar o hotel desejado$")
	public void selencionarOHotelDesejado() throws Throwable {
	    homeHotel.clickHotel();
	    frame.swithFrame(0);
	    hotel.pesquisarHotel("Automação teste");
	    hotel.buttonPesquisar();
	    
	}

	@Quando("^preencher as informação da acomodação$")
	public void preencherAsInformaçãoDaAcomodação() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^a acomodação deverá ser cadastrada com sucesso$")
	public void aAcomodaçãoDeveráSerCadastradaComSucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

		
		
}
