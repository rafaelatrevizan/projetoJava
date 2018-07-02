package br.com.RafaelaTrevizan.steps;

import org.openqa.selenium.WebDriver;

import Pages.Aereo_Tarifario_Page;
import Pages.Home_Page;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Produto_Aereo_Tarifarios extends AbstractPage{
	
	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Aereo_Tarifario_Page tarifa = new Aereo_Tarifario_Page(nav);
	Frame frame = new Frame(nav);
	
	@Quando("^clicar para adicionar um novo tarifário de aéreo$")
	public void clicarParaDicionarUmNovoTarifárioDeAéreo() throws Throwable {
	    home.clickAereoTarifario();
	    frame.swithFrame(0);
	    tarifa.addTarifario();
	}

	@Quando("^preencher todas as informações de tarifário$")
	public void preencherTodasAsInformaçõesDeTarifário() throws Throwable {
	    tarifa.fillName("Automação Tarifa Voo Rafa VOLTA");
	    tarifa.fillCiaAerea();
	    tarifa.fillFornecedor();
	    tarifa.fillMoeda();
	    // Esses métodos precisam ser executados juntos, pois sem preencher a tarifa não é possível preencher o voo
	    tarifa.abaTarifa("Automação test tarifa rafa VOLTA", "500,00", "100,00", "50,00", "");
	    try {Thread.sleep(1000);} catch (InterruptedException ex) {}
	    tarifa.abaVoos();
	    tarifa.abaVoos_Data("10072018");
	    tarifa.abaVoos_Aeronave();
	    tarifa.abaVoos_CiaAerea();
	    tarifa.abaVoos_Tipo();
	    tarifa.abaVoos_Localizador("123456");
	    tarifa.abaVoos_QtdPassangers("30");
	    tarifa.abaVoos_Bagagem("2", "20");
	    tarifa.abaVoos_Deadline("100720180000");
	    tarifa.abaVoos_Obs("Automação teste voo rafa VOLTA");
	    tarifa.abaVoos_Trecho("Aut 123", "CLV", "GRU", "1000", "1200");  
	        
	}

	@Então("^a tarifa deverá ser cadastrada com sucesso$")
	public void aTarifaDeveráSerCadastradaComSucesso() throws Throwable {
		tarifa.salvarEativarVoo();	
	}

}
