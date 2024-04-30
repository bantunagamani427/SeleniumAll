package AllSelenium_YT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Properety_Fetching {
	@Test
	public void propertyFetched() throws IOException, InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
//		File path=new File("/Selenium_M/src/test/java/AllSelenium_YT/Orangehrm.property");
		FileInputStream fis=new FileInputStream("C:\\Users\\Nagamani\\git\\SeleniumAll\\SeleniumAll\\src\\test\\java\\AllSelenium_YT\\Orangehrm.property");
		Properties prop=new Properties();
		prop.load(fis);
		
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		WebElement un=driver.findElement(By.name("username"));
		act.moveToElement(un).perform();
		un.sendKeys(username);
		Thread.sleep(2000);

		WebElement pwd=driver.findElement(By.name("password"));
		act.moveToElement(pwd).perform();
		pwd.sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
		Thread.sleep(3000);
		driver.close();
		///C://Users//Nagamani//Downloads//Orangehrm.property/
	}
}



