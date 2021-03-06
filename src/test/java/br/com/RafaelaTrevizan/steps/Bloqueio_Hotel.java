package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Pages.Base_Page;
import Pages.Home_Page;
import Pages.Hotel_Bloqueio_Page;
import Pages.Hotel_Page;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Bloqueio_Hotel extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Hotel_Page hotel = new Hotel_Page(nav);
	Hotel_Bloqueio_Page bloq = new Hotel_Bloqueio_Page(nav);
	Frame frame = new Frame(nav);

	// FEATURE: BLOQUEIO - HOTEL
	
	@Quando("^clicar para fazer um bloqueio de hotel$")
	public void clicarParaFazerUmBloqueioDeHotel() throws Throwable {
	    home.clickBloqueioHotel();
	}

	@Quando("^preencher todas as informações do bloqueio$")
	public void preencherTodasAsInformaçõesDoBloqueio() throws Throwable {
	    frame.swithFrame(0);
	    bloq.periodo("25072018", "30122018");
	    bloq.hotel("HOTEL TREVIZAN LINDO");
	    bloq.buttonPesquisar();
	    bloq.buttonEditar();
	    bloq.selectQuantidade();
	    bloq.chooseQuantidade();
	    bloq.Quantidade("30");
	    bloq.select_Hotel();
	    }

	@Então("^o bloqueio deverá ser cadastrado com sucesso$")
	public void oBloqueioDeveráSerCadastradoComSucesso() throws Throwable {
	    bloq.bloq_salvar();
	}


	
}
