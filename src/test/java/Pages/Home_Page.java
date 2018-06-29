package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(DataDrivenTestRunner.class)

public class Home_Page extends Base_Page {

	public Home_Page(WebDriver nav) {
		super(nav);		
	}	
	
	public Reservar_Page clickMenuReservar() {
		nav.findElement(By.xpath("//a[contains(text(), \"Reservar\")]")).click();			
		return new Reservar_Page(nav);
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
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		nav.findElement(By.id("menuform:sm_leftmenu_5_0_1")).click();		
		return new Hotel_Page(nav);
	}
	
	public Hotel_Page clickHotelTarifario() {
		nav.findElement(By.id("menuform:sm_leftmenu_5")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5_0")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		nav.findElement(By.id("menuform:sm_leftmenu_5_0_5")).click();		
		return new Hotel_Page(nav);
	}
	
	public Hotel_Page clickAereoTarifario() {
		nav.findElement(By.id("menuform:sm_leftmenu_5")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5_1")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		nav.findElement(By.id("menuform:sm_leftmenu_5_1_2")).click();		
		return new Hotel_Page(nav);
	}
	
	public Hotel_Page clickBloqueioHotel() {
		nav.findElement(By.id("menuform:sm_leftmenu_4")).click();
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}		
		nav.findElement(By.id("menuform:sm_leftmenu_4_0")).click();		
		return new Hotel_Page(nav);
	}
	
}
