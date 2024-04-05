package AllSelenium_YT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropdown {
@Test
public void bootStrap() throws InterruptedException {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hdfcbank.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebElement selectType=driver.findElement(By.xpath(""));
	driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
	Thread.sleep(2000);
	List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
	for(WebElement pType:productTypes) {
     		if(pType.getText().equals("Accounts")) {
     			pType.click();
     			Thread.sleep(2000);
     			break;
     		}}	
	driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
    List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
	for(WebElement product:products) {
		if(product.getText().equals("Savings Accounts")) {
			product.click();
			Thread.sleep(2000);
			break;
		  }}}}
	    		
      
   
                                     