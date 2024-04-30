package AllSelenium_YT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_Fetching {
	@Test
	public void excelFetching() throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Nagamani\\git\\SeleniumAll\\SeleniumAll\\src\\test\\java\\AllSelenium_YT\\Book(Sheet1).csv");
		//
		//Workbook book=XSSFWorkbookFactory.create(fis);
	
	}
	
	

}
