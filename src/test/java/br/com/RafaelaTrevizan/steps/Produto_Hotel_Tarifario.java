package br.com.RafaelaTrevizan.steps;

import java.util.List;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.Home_Page;
import Pages.Hotel_Page;
import Pages.Hotel_Tarifario_Page;
import Suporte.Frame;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

@RunWith(DataDrivenTestRunner.class)
public class Produto_Hotel_Tarifario extends AbstractPage {

	WebDriver nav = getDriver();
	Home_Page home = new Home_Page(nav);
	Hotel_Page hotel = new Hotel_Page(nav);	
	Hotel_Tarifario_Page tarifario = new Hotel_Tarifario_Page(nav);
	Frame frame = new Frame(nav);
	
	@Quando("^clicar para adicionar um novo tarifário de hotel$")
	public void clicarParaAdicionarUmNovoTarifárioDeHotel() throws Throwable {
//		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
//		nav.switchTo().parentFrame();
		home.clickHotelTarifario();
		frame.swithFrame(0);
		tarifario.pesquisarHotel("HOTEL TREVIZAN LINDO");
		hotel.buttonPesquisar();
		tarifario.addTarifario();
		
	}

	@Quando("^preencher todas as informações de tarifário de hotel$")
	public void preencherTodasAsInformaçõesDeTarifárioDeHotel() throws Throwable {
		tarifario.descricao("Automação Tarifa TREVIZAN LINDO");
		tarifario.selectFornecedor();
		tarifario.selectTipo();
		tarifario.selectDataVenda("25072018", "31122018");
		tarifario.abaTarifario();
		tarifario.infoTarifario("Automação tarifa Julho TREVIZAN LINDO"); 
		tarifario.tabela();
		tarifario.margem();
		tarifario.pagamento();
		tarifario.cobranca();
		tarifario.periodo();
		tarifario.tarifario_publicacao("25072018", "31122018");
		tarifario.tarifario_tarifa();
		tarifario.tarifario_tarifa_regime();
		tarifario.tarifario_tarifa_valores("10000", "10000");
		
		}
	
	@Então("^a tarifa do hotel deverá ser cadastrada com sucesso$")
	public void aTarifaDoHotelDeveráSerCadastradaComSucesso() throws Throwable {
		tarifario.tarifario_tarifario_salvar();
		tarifario.tarifario_publicar();
	}
	
	//VALIDAR CAMPOS OBRIGATORIOS
	@Quando("^não preencher os campos obrigatórios do tarifario$")
	public void nãoPreencherOsCamposObrigatóriosDoTarifario() throws Throwable {
	    tarifario.tarifario_publicar();
	}

	@Então("^ao salvar os campos do tarifario deverão ser exibidos em um popup$")
	public void aoSalvarOsCamposDoTarifarioDeverãoSerExibidosEmUmPopup() throws Throwable {
	    tarifario.popUpErro();
	}


}
