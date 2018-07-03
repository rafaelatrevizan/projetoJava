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

public class Produto_Hotel extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page homeHotel = new Home_Page(nav);
	Hotel_Page hotel = new Hotel_Page(nav);
	Frame frame = new Frame(nav);

	// FEATURE: PRODUTO

	@Quando("^clicar para adicionar um novo hotel$")
	public void clicarParaDicionarUmNovoHotel() throws Throwable {

		homeHotel.clickHotel();
		frame.swithFrame(0);
		hotel.buttonAdicionar();
	}

	@Quando("^preencher todas as informações$")
	public void preencherTodasAsInformações() throws Throwable {
		Hotel_Page hotel = new Hotel_Page(nav);
		hotel.fillInformations("Automação teste");
		hotel.fillStar();
		// hotel.fillActive();
		// hotel.fillCoin();
		// hotel.fillAdmin();
		// hotel.fillMsgDisponivel();
		// hotel.fillMinDeNoites("");
		hotel.fillPhones();
		hotel.fillEmail();
		hotel.fillEndereco("03335010", "Rua teste", "Caldas Novas");
		hotel.localizacoes("Caldas Novas");

		Frame frame = new Frame(nav);
		frame.swithFrame(0);
		hotel.fillDescription("Teste hotel automação rafa");

	}

	@Então("^o hotel deverá ser cadastrado com sucesso$")
	public void oHotelDeveráSerCadastradoComSucesso() throws Throwable {
		// PARA VOLTAR PARA O IFRAME ANTERIOR
		nav.switchTo().parentFrame();
		Hotel_Page hotel = new Hotel_Page(nav);
		hotel.Salvar();
		// hotel.checkHotel();

	}
	
	//VALIDAR CAMPOS OBRIGATÓRIOS
	@Quando("^não preencher os campos obrigatórios do hotel$")
	public void nãoPreencherOsCamposObrigatóriosDoHotel() throws Throwable {
	    hotel.Salvar();
	}

	@Então("^ao salvar os campos do hotel deverão ser exibidos em um popup$")
	public void aoSalvarOsCamposDoHotelDeverãoSerExibidosEmUmPopup() throws Throwable {
	    hotel.popUpErro();
	}


}
