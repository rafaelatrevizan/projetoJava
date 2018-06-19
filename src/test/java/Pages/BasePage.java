package Pages;

import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(DataDrivenTestRunner.class)

public class BasePage {

    protected WebDriver nav;
   
    public BasePage(WebDriver nav){
        this.nav = nav;
    }
     
}
