package br.com.RafaelaTrevizan.steps;


import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.Editar_Reserva_Page;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Editar_Reserva extends AbstractPage{
	
	WebDriver nav = getDriver();
	Editar_Reserva_Page editar = new Editar_Reserva_Page(nav);
		
	// FEATURE: EDITAR RESERVA

	@Quando("^editar a reserva$")
	public void editarAReserva() throws Throwable {
		editar.selectReserva();
		editar.clickEdit();
	}

	@Quando("^adicionar uma nova acomodação$")
	public void adicionarUmaNovaAcomodação() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Então("^uma nova linha de valores deverá ser exibida$")
	public void umaNovaLinhaDeValoresDeveráSerExibida() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
