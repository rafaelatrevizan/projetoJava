package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Pages.Home_Page;
import Pages.Hotel_Acomodacao_Page;
import Pages.Hotel_Page;
import Suporte.Frame;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Produto_Hotel_Acomodacao extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page homeHotel = new Home_Page(nav);
	Hotel_Page hotel = new Hotel_Page(nav);
	Hotel_Acomodacao_Page acomodacao = new Hotel_Acomodacao_Page(nav);
	Frame frame = new Frame(nav);

	// FEATURE: PRODUTO - HOTEL - ACOMODAÇÃO

	@Quando("^selencionar o hotel desejado$")
	public void selencionarOHotelDesejado() throws Throwable {
		homeHotel.clickHotel();
		frame.swithFrame(0);
		acomodacao.pesquisarHotel("HOTEL TREVIZAN LINDO");
		hotel.buttonPesquisar();
		acomodacao.selectHotel();
	}

	@Quando("^preencher as informação da acomodação$")
	public void preencherAsInformaçãoDaAcomodação() throws Throwable {
		acomodacao.editAcomodacao();
		acomodacao.editAcomodacao_Categoria();
		acomodacao.editAcomodacao_Capacidade();
		acomodacao.editAcomodacao_Combinacoes();
	}

	@Então("^a acomodação deverá ser cadastrada com sucesso$")
	public void aAcomodaçãoDeveráSerCadastradaComSucesso() throws Throwable {
		acomodacao.editAcomodacao_Salvar();
	}

}
