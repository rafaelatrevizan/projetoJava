package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



@RunWith(DataDrivenTestRunner.class)

public class Editar_Reserva_Page extends Base_Page {

	public Editar_Reserva_Page(WebDriver nav) {
		super(nav);		
	}
	
	public Editar_Reserva_Page selectReserva() {
		nav.findElement(By.xpath("//tbody[@id = \"pnlReservaList_data\"]/tr/td[9]/span/following-sibling::a")).click();		
		return this;
	}
	
	public Editar_Reserva_Page clickEdit () {
	    nav.findElement(By.xpath("//div[@id= \"tab-hotel\"]/div/div/div/a/i[@class = \"icon-edit\"]")).click();	
		return this;
	}

}
