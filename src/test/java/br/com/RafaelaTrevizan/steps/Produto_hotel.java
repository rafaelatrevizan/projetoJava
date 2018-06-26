package br.com.RafaelaTrevizan.steps;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Pages.BasePage;
import Pages.HomePage;
import Pages.HotelPage;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)

public class Produto_hotel extends AbstractPage{
	
	WebDriver nav = getDriver();
	
	//FEATURE: PRODUTO
	
		@Quando("^clicar para dicionar um novo hotel$")
		public void clicarParaDicionarUmNovoHotel() throws Throwable {
		  HomePage homeHotel = new HomePage(nav);
		  HotelPage hotel = new HotelPage(nav);
		  Frame frame  = new Frame(nav);
		  
		  homeHotel.clickHotel();   
		  frame.swithFrame(0);
		  hotel.buttonAdicionar();
		}

		@Quando("^preencher todas as informações$")
		public void preencherTodasAsInformações() throws Throwable {
			HotelPage hotel = new HotelPage(nav);
					hotel.fillInformations("Automação teste");
					hotel.fillStar();
//					hotel.fillActive();
//					hotel.fillCoin();
//					hotel.fillAdmin();
//					hotel.fillMsgDisponivel();
//					hotel.fillMinDeNoites("");
					hotel.fillPhones();
					hotel.fillEmail();
					hotel.fillEndereco("03335010", "Rua teste", "Caldas Novas");
					hotel.localizacoes("Caldas Novas");			
						
	    	Frame frame  = new Frame(nav);    	
			frame.swithFrame(0); 
			hotel.fillDescription("Teste hotel automação rafa");					
			
		}

		@Então("^o hotel deverá ser cadastrado com sucesso$")
		public void oHotelDeveráSerCadastradoComSucesso() throws Throwable {
			// PARA VOLTAR PARA O IFRAME ANTERIOR
			nav.switchTo().parentFrame();
			HotelPage hotel = new HotelPage(nav);
			hotel.Salvar();
//			hotel.checkHotel();
			
		}
}
