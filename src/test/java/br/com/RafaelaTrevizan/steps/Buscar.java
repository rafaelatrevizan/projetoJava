package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Pages.Buscar_Page;
import Pages.Home_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Buscar extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Buscar_Page buscar = new Buscar_Page(nav);


	// FEATURE: CAMBIO

	@Quando("^clicar no menu Buscar$")
	public void clicarNoMenuBuscar() throws Throwable {
	    home.clickMenuBuscar();
	    buscar.fillId("2575");
	    buscar.checkReserva();
	}

	@Quando("^buscar uma reserva$")
	public void buscarUmaReserva() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^a reserva buscada deverá ser exibida$")
	public void aReservaBuscadaDeveráSerExibida() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
