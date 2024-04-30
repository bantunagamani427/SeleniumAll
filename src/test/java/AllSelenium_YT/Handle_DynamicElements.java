package AllSelenium_YT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Handle_DynamicElements {
	@Test
	public void dynamicElements() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement search	=driver.findElement(By.name("q"));
		search.sendKeys("Samsung Mobile",Keys.ENTER);
     String mobileName= driver.findElement(By.xpath("//div[text()=\"SAMSUNG Galaxy F14 5G (B.A.E. Purple, 128 GB)\"]")).getText();
     System.out.println("Static Element is Mobile name"+mobileName);
     String price=driver.findElement(By.xpath("//div[text()=\"SAMSUNG Galaxy F14 5G (B.A.E. Purple, 128 GB)\"]/../following-sibling::div/div/div/div[text()=\"₹11,990\"]")).getText();
     System.out.println("Dynamic Element is price: "+price);

	}
}
