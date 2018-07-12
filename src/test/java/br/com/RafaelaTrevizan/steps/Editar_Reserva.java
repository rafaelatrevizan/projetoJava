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
		editar.addAcomodacao("Acomodação Automação", 
								"Teste", 
								"Café da manhã", 
								"20/07/2018", 
								"30/07/2018", 
								"Teste", 
								"Automação");
	    editar.selectDocument("62016766867");
	    editar.fillDataNasc("20/09/1992");
	    editar.saveAcomodacao();
	}

	@Então("^uma nova linha de valores deverá ser exibida$")
	public void umaNovaLinhaDeValoresDeveráSerExibida() throws Throwable {
	    editar.checkValores();
	}

}
