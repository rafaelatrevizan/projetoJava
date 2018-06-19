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
	
}
