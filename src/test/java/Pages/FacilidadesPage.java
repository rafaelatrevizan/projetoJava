package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Suporte.Frame;

public class FacilidadesPage extends BasePage {

	public FacilidadesPage(WebDriver nav) {
		super(nav);		
	}

	public FacilidadesPage addFacility() {
		Frame frame  = new Frame(nav);		    
		frame.swithFrame(0);
		nav.findElement(By.xpath("//form[@id = \"frmFacilidade\"]/div/div/a")).click();
		
		return this;
	}
	
}
