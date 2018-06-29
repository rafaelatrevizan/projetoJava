package Pages;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Suporte.Frame;
import junit.framework.Assert;

public class Hotel_Facilidades_Page extends Base_Page {
	private String nomefacil;

	public Hotel_Facilidades_Page(WebDriver nav) {
		super(nav);		
	}

	public Hotel_Facilidades_Page addFacility() {
		Frame frame  = new Frame(nav);		    
		frame.swithFrame(0);
		nav.findElement(By.xpath("//form[@id = \"frmFacilidade\"]/div/div/a")).click();
		
		return this;
	}
	
	public Hotel_Facilidades_Page fillName(String nome) {
		nav.findElement(By.id("idNome")).sendKeys(nome);
		nomefacil = nome;
		return this;
	}
	
	public Hotel_Facilidades_Page fillItens(String nomeItem, String nomeIcone, String descricao) {
		nav.findElement(By.xpath("//a[contains(@id, \"pnlFacilidadeItemList\")]")).click();
		nav.findElement(By.id("frmFacilidadeItemEdit:idNmItem")).sendKeys(nomeItem);
		nav.findElement(By.id("frmFacilidadeItemEdit:idIcone")).sendKeys(nomeIcone);
		nav.findElement(By.id("frmFacilidadeItemEdit:idDsItem")).sendKeys(descricao);
		return this;
	}
	
	public Hotel_Facilidades_Page salvaritem() {
		java.util.List<WebElement> save = nav.findElements(By.xpath("//span[text() = \"Salvar\"]"));
		save.get(1).click();
		return this;
	}
	
	
	public Hotel_Facilidades_Page salvarFacil() {
//			String bla;
//			int cont = 0;
		
		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//span[text() = \"Salvar\"]")).click();
		
//		try {Thread.sleep(2000);} catch (InterruptedException ex) {}
//		java.util.List<WebElement> list = nav.findElements(By.xpath("//li[@role = \"tab\"]"));
//		String bla = list.get(1).getText();
//		System.out.println(bla);
//		
//		for (WebElement element: list) {
//		      System.out.println(element.getText());
//		      String lista = element.getText();
//			if (lista.contains(nomefacil)) {
//				System.out.println("Existe");
//			} else {
//				System.out.println("Não Existe");
//				throw new RuntimeException();
//				} 
//			}
	
		return this;
	}
}
