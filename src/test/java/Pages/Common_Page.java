package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(DataDrivenTestRunner.class)

public class Common_Page extends Base_Page {

	public Common_Page(WebDriver nav) {
		super(nav);
	}
	
	public Home_Page doLogin (String usuario, String senha, String senha2) {
		nav.findElement(By.xpath("//input[@id=\"j_idt15:j_idt17\"]")).sendKeys(usuario);
		nav.findElement(By.xpath("//input[@placeholder = \"Senha\"]")).sendKeys(senha);	
		nav.findElement(By.xpath("//button[@id=\"j_idt15:j_idt21\"]")).click();
		nav.findElement(By.xpath("//input[@id=\"frmAuth:j_idt42\"]")).sendKeys(senha2);
		nav.findElement(By.xpath("//span[contains(@class, \"ui-button-text ui-c\")]")).click();
		nav.findElement(By.xpath("//div[contains(@style, \"text-align:\")]"));
		return new Home_Page(nav);
	}

	
}
