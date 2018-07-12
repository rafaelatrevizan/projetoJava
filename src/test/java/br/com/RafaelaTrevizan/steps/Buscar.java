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
	}

	@Quando("^buscar uma reserva$")
	public void buscarUmaReserva() throws Throwable {
		buscar.fillId("2573");
	}

	@Então("^a reserva buscada deverá ser exibida$")
	public void aReservaBuscadaDeveráSerExibida() throws Throwable {
		buscar.checkReserva();

	}

}
