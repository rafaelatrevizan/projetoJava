package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Suporte.Frame;
import junit.framework.Assert;

@RunWith(DataDrivenTestRunner.class)

public class Buscar_Page extends Base_Page {
	
	Frame frame = new Frame(nav);
	private String idNumber;

	public Buscar_Page(WebDriver nav) {
		super(nav);
	}

	public Buscar_Page fillId(String id) {
		frame.swithFrame(0);
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		WebElement bla = nav.findElement(By.id("idPesquisa"));
		bla.sendKeys(id);
		idNumber = id;
		nav.findElement(By.xpath("//span[text() = \"Pesquisar\"]/parent::button")).click();
		
		return this;
	}
	
	public Buscar_Page checkReserva() {
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		WebElement number = nav.findElement(By.xpath("//tbody[@id = \"pnlReservaList_data\"]/tr/td[1]"));
		String bla = number.getText();
		System.out.println(bla);	
		
		Assert.assertEquals(idNumber, bla);
		
		return this;
	}

	

}
