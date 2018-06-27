package br.com.RafaelaTrevizan.steps;


import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Pages.Reserva_Cliente_Page;
import Pages.Comprovante_Page;
import Pages.Home_Page;
import Pages.Reservar_Page;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Reserva extends AbstractPage{
	
	WebDriver nav = getDriver();
	
		
	// FEATURE: RESERVAR

		@Quando("^clicar no menu Reserva e preencher o campo \"([^\"]*)\"$")
		public void clicarNoMenuReservaEPreencherOCampo(String arg1) throws Throwable {
			Home_Page home = new Home_Page(nav);
			Reservar_Page reservar = new Reservar_Page(nav);
			
			home.clickMenuReservar();		
			reservar.fillDestino(arg1);					
			   
		}

		@Quando("^preencher as datas \"([^\"]*)\" e \"([^\"]*)\"$")
		public void preencherAsDatasE(String arg1, String arg2) throws Throwable {
			Reservar_Page reservar = new Reservar_Page(nav);
			reservar.fillDates(arg1, arg2);	
		   
		}

		@Quando("^clicar no botão pesquisar$")
		public void clicarNoBotãoPesquisar() throws Throwable {
			Reservar_Page reservar = new Reservar_Page(nav);
			reservar.clickPesquisar();
			}

		@Quando("^selecionar o hotel$")
		public void selecionarOHotel() throws Throwable {
			Reservar_Page reservar = new Reservar_Page(nav);
			reservar.selectHotel();
		
		}

		@Então("^os campos para reserva devem ser preenchidos$")
		public void osCamposParaReservaDevemSerPreenchidos() throws Throwable {
		    Reserva_Cliente_Page clientes = new Reserva_Cliente_Page(nav);
		     		
		    clientes.fillNames1();	   
		    clientes.fillDocument("81627258736");    
		    clientes.fillSexo1();	    
		    clientes.fillDate1();
		    
		    clientes.fillNames2();
		    clientes.fillDocument1("32040476601");
		    clientes.fillSexo2();
		    clientes.fillDate2();
		    
		    clientes.textArea("teste rafa");
		    clientes.politica();
		    clientes.dadosDoCLiente("11123456789");
		    clientes.clickReservar();
		    
		}

		@Então("^a reserva deverá ser feita com sucesso$")
		public void aReservaDeveráSerFeitaComSucesso() throws Throwable {
			Comprovante_Page comp = new Comprovante_Page(nav);
			comp.idReserva();
		}
}
