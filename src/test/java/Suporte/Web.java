package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laercio\\Documents\\Automação\\Chrome Driver\\chromedriver.exe");
		WebDriver nav = new ChromeDriver();
		nav.get("http://192.168.15.100:8080/infotravel/login.xhtml");
		
	}

}
