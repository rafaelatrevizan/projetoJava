package Suporte;

import org.openqa.selenium.WebDriver;

import Pages.BasePage;
import Pages.HotelPage;

public class Frame extends BasePage {
	
	
	public Frame(WebDriver nav) {
		super(nav);
		// TODO Auto-generated constructor stub
	}

	public Frame swithFrame(int valor){
		nav.switchTo().frame(valor);
		
		return this;
	}

}
