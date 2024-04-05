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

public class HandleMultipleDropdowns {
	static WebDriver driver;
	//make the driver as static(bcos used in main method,access in other method also)and global
	@Test
	public void multidropdown() {
		WebDriverManager.firefoxdriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();

		WebElement day=driver.findElement(By.id("day"));
		//Select daydrp=new Select(day);
		//daydrp.selectByVisibleText("15");
		selectOptionFromDropdown(day, "10");

		WebElement month=driver.findElement(By.id("month"));
		//Select monthdrp=new Select(month);
		//monthdrp.selectByVisibleText("May");
		selectOptionFromDropdown(month, "June");

		WebElement year=driver.findElement(By.id("year"));
		//Select yeardrp=new Select(year);
		//yeardrp.selectByVisibleText("2023");
		selectOptionFromDropdown(year, "2020");
		/*
		 * Instead of writing the select class every time we need to create one generic method and 
		 * pass the values to the select class from generic method which is having 2 arguments
		 * such as one is for passing the drop down element and another one is for
		 * passing the value(visible text,value,index)
		 */
	}
	public static void selectOptionFromDropdown(WebElement ele, String value) {
		Select drop=new Select(ele);
		List<WebElement> options = drop.getOptions();
		for(WebElement option:options) {
			if(option.getText().equals(value)) {//pass the value bcos that text from web element
				option.click();
				break;
			}}}}	



