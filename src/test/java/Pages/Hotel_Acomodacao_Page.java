package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;

public class Hotel_Acomodacao_Page extends Base_Page {
	private Faker faker = new Faker();
	// private String hotelllllll;

	public Hotel_Acomodacao_Page(WebDriver nav) {
		super(nav);
		// TODO Auto-generated constructor stub
	}

	public Hotel_Acomodacao_Page pesquisarHotel(String nomeHotel) {
		nav.findElement(By.id("idNomePesquisa")).sendKeys(nomeHotel);
		return this;
	}

	public Hotel_Acomodacao_Page selectHotel() {
		nav.findElement(By.xpath("//a[contains(@id, \"frmPesquisa:pnlHotelList\")]")).click();
		return this;
	}

	public Hotel_Acomodacao_Page editHotel() {
		nav.findElement(By.xpath("//span[text() = \"Editar\"]")).click();
		return this;
	}

	public Hotel_Acomodacao_Page editAcomodacao() {
		nav.findElement(By.linkText("Acomodações")).click();
		nav.findElement(By.xpath("//span[text() = \"Acomodações\"]/following-sibling::a")).click();
		return this;
	}

	public Hotel_Acomodacao_Page editAcomodacao_Categoria() {
		// idUhCategoria_0 = selecione...
		// idUhCategoria_1 = Acomodação Rafa
		// idUhCategoria_2 = Apartamento Familia
		// idUhCategoria_3 = APARTAMENTO STANDARD CASAL
		// idUhCategoria_4 = APARTAMENTO STANDARD TWIN
		// idUhCategoria_5 = Apartamento Standart
		// idUhCategoria_6 = Bangalô
		// idUhCategoria_7 = Bangalô Especial
		// idUhCategoria_8 = Standart
		// idUhCategoria_9 = Suite Luxo
		// idUhCategoria_10 = Suite Maria Bonita
		// idUhCategoria_11 = Suite Master
		// idUhCategoria_12 = suite presidencial
		// idUhCategoria_13 = Suite Superior
		// idUhCategoria_14 = SUITE ULTRA MEGA	
		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.xpath("//label[@id = \"idUhCategoria_label\"]/following-sibling::div")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idUhCategoria_1")).click();
		return this;
	}
	
	public Hotel_Acomodacao_Page editAcomodacao_Capacidade() {
		// idUhCapacidade_0 = selecione...
		// idUhCapacidade_1 = INDIVIDUAL
		// idUhCapacidade_2 = DUPLO
		// idUhCapacidade_3 = TRIPLO
		// idUhCapacidade_4 = QUADRUPLO
		// idUhCapacidade_5 = QUINTUPLO
		// idUhCapacidade_6 = SEXTUPLO
		// idUhCapacidade_7 = SETUPLO
		// idUhCapacidade_8 = ADICIONAL
		
		nav.findElement(By.xpath("//label[@id = \"idUhCapacidade_label\"]/following-sibling::div")).click();		
		try {Thread.sleep(1000);} catch (InterruptedException ex) {}
		nav.findElement(By.id("idUhCapacidade_4")).click();
		return this;
	}
	
	public Hotel_Acomodacao_Page editAcomodacao_Combinacoes() {
		//Seleciona todas as combinações para acomodação
		nav.findElement(By.xpath("//div[@class = \"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"]/following-sibling::span")).click();		
		return this;
	}

	public Hotel_Acomodacao_Page editAcomodacao_Salvar() {
		nav.findElement(By.xpath("//form[@id = \"frmUhEdit\"]/div/button/span/following-sibling::span[text() = \"Salvar\"]")).click();
		return this;
	}

}
