package AllSelenium_YT;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	@Test
	public void dropDown() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement createAccount=driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
		createAccount.click();
		WebElement day=driver.findElement(By.id("day"));
		Select dropday=new Select(day);
		//dropday.selectByValue("15");//every option will have the value i.e in string format
		//s.selectByVisibleText("15");//we can directly enter the text also
		//s.selectByIndex(14);//we can pass the index also
		//selecting the option from dropdown without the select methods
		List<WebElement> allOptions = dropday.getOptions();
		//from day dropdown we will get all the options 
		for(WebElement option:allOptions) {
			if(option.getText().equals("12")) {
				option.click();
				break;
				//if the option found immediately came out from the loop otherwise it will check other options also
			}			
		}		
	}
}
