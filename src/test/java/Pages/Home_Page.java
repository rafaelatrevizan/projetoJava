package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Suporte.Frame;

@RunWith(DataDrivenTestRunner.class)

public class Home_Page extends Base_Page {
	
	Frame frame = new Frame(nav);
	public Home_Page(WebDriver nav) {
		super(nav);
	}

	public Hotel_Page clickUnidades() {
		nav.findElement(By.id("menuform:sm_leftmenu_0")).click();
		return new Hotel_Page(nav);
	}

	public Hotel_Page clickProfissionais() {
		nav.findElement(By.id("menuform:sm_leftmenu_1")).click();
		return new Hotel_Page(nav);
	}

	public Hotel_Page clickCambio() {
		nav.findElement(By.id("menuform:sm_leftmenu_2")).click();
		return new Hotel_Page(nav);
	}

	public Hotel_Page clickCadastroFornecedor() {
		nav.findElement(By.id("menuform:sm_leftmenu_3")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_3_0")).click();
		return new Hotel_Page(nav);
	}

	public Hotel_Page clickCadastroCliente() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("menuform:sm_leftmenu_3")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_3_1")).click();
		return new Hotel_Page(nav);
	}

	public Cadastro_TextoEmail_Page clickCadastroTextoEmail() {
		nav.findElement(By.id("menuform:sm_leftmenu_3")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("menuform:sm_leftmenu_3_8")).click();
		return new Cadastro_TextoEmail_Page(nav);
	}
	
	public Pacote_Page clickMenuPacotes() {
		nav.findElement(By.id("menuform:sm_leftmenu_5")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("menuform:sm_leftmenu_5_5")).click();
		return new Pacote_Page(nav);
	}
	
	public Buscar_Page clickMenuBuscar() {
		nav.findElement(By.id("layout-menubar-resize")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("menuform:sm_leftmenu_6")).click();
		return new Buscar_Page(nav);
	}

	public Reservar_Hotel_Page clickMenuReservar() {
		nav.findElement(By.xpath("//a[contains(text(), \"Reservar\")]")).click();
		return new Reservar_Hotel_Page(nav);
	}

	public Hotel_Page clickHotel() {
		nav.findElement(By.id("menuform:sm_leftmenu_5")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5_0")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5_0_0")).click();
		return new Hotel_Page(nav);
	}

	public Hotel_Page clickFacilidades() {
		nav.findElement(By.id("menuform:sm_leftmenu_5")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5_0")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("menuform:sm_leftmenu_5_0_1")).click();
		return new Hotel_Page(nav);
	}

	public Hotel_Page clickHotelTarifario() {		
//		nav.findElement(By.xpath("//div[@id = \"buttonArea\"]/a")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5_0")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("menuform:sm_leftmenu_5_0_5")).click();
		return new Hotel_Page(nav);
	}

	public Hotel_Page clickAereoTarifario() {
		nav.findElement(By.id("menuform:sm_leftmenu_5")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5_1")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("menuform:sm_leftmenu_5_1_2")).click();
		return new Hotel_Page(nav);
	}

	public Hotel_Page clickBloqueioHotel() {
		nav.findElement(By.id("menuform:sm_leftmenu_4")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
		nav.findElement(By.id("menuform:sm_leftmenu_4_0")).click();
		return new Hotel_Page(nav);
	}

}
