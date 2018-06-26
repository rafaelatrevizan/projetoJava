package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(DataDrivenTestRunner.class)

public class HomePage extends BasePage {

	public HomePage(WebDriver nav) {
		super(nav);		
	}	
	
	public ReservarPage clickMenu() {
		nav.findElement(By.xpath("//a[contains(text(), \"Reservar\")]")).click();			
		return new ReservarPage(nav);
	}
	
	public HotelPage clickHotel() {
		nav.findElement(By.id("menuform:sm_leftmenu_5")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5_0")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5_0_0")).click();		
		return new HotelPage(nav);
	}
	
	public HotelPage clickFacilidades() {
		nav.findElement(By.id("menuform:sm_leftmenu_5")).click();
		nav.findElement(By.id("menuform:sm_leftmenu_5_0")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
		
		nav.findElement(By.id("menuform:sm_leftmenu_5_0_1")).click();		
		return new HotelPage(nav);
	}
	
}
