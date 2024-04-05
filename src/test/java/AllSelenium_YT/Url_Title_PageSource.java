package AllSelenium_YT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Url_Title_PageSource {
@Test
public void UrlTitlePageSource() {
	WebDriverManager.firefoxdriver().setup();//it will setup the driver  
	                                
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nopcommerce.com/en");
	System.out.println("Title of the page: "+driver.getTitle());
	//If we wants to know the current title or not
	System.out.println("Get the current Url: "+driver.getCurrentUrl());
	//if we wants to validate on the page source html code of the page
	System.out.println("Source code of the page: "+driver.getPageSource());
    }	
 }
