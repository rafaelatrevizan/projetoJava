package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class Comprovante_Page extends Base_Page {
	
	private static final String FILE_NAME = "C:\\Users\\Laercio\\Documents\\Automação\\Infotera\\target\\Teste.xlsx";

	public Comprovante_Page(WebDriver nav) {
		super(nav);
		// TODO Auto-generated constructor stub
	}

	
	
	public Comprovante_Page idReserva() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ex) {}

		WebElement idRes = nav.findElement(By.xpath("//div[@class = \"ui-g-8 ui-md-2 ui-lg-2 fontBold\"][1]"));
		
		String res = idRes.getText();
		
		System.out.println(res);	
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
        Object[][] datatypes = {
        		{"ID"},
                {res}                           
              
        };

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
//            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    	
		return this;
		
	}
	
	
}
