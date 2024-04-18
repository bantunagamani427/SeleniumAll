package AllSelenium_YT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDownUsingGenericMethod {
	//if we have multiple bootstrap elements then we create one generic method and select the option from that method.
	private WebDriver driver;
	@Test
	public void multipleBootstrapDropdown() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		Thread.sleep(2000);
		List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println("Number of Product Types: "+productTypes.size());
		selectOptionFromDropdown(productTypes, "Accounts");

		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		Thread.sleep(2000);
		List<WebElement>products=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
		System.out.println("Number of Products: "+products.size()); 
		selectOptionFromDropdown(products, "Savings Accounts");
	}
	public static void selectOptionFromDropdown(List<WebElement> options, String value) throws InterruptedException  {
		for(WebElement option:options) {
			if(option.getText().equals(value)) {
				option.click();
				Thread.sleep(2000);
				break;
			}}}}




