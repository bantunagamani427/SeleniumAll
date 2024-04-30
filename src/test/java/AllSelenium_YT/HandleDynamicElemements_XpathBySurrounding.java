package AllSelenium_YT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDynamicElemements_XpathBySurrounding {
	@Test
	public void DynamicWebElement() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search	=driver.findElement(By.name("q"));
		search.sendKeys("iphone",Keys.ENTER);
		//1st identify the static element
		String phoneName=driver.findElement(By.xpath("//div[text()=\"Apple iPhone 15 (Blue, 128 GB)\"]")).getText();
		System.out.println("Static Element is phone Name: "+phoneName);
		//2nd perform parent child relation till reach to dynamic element using following traversing(for beside tag)
		String price=driver.findElement(By.xpath("//div[text()=\"Apple iPhone 15 (Blue, 128 GB)\"]/../following-sibling::div/div/div/div[@class=\"_30jeq3 _1_WHN1\"]")).getText();
		System.out.println("Dynamic element is price: "+price);	

	}
}
