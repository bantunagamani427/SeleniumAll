package AllSelenium_YT;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDdpractice {
	@Test 
	public void jqueryDropdown() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("justAnInputBox")).click();
		selectChoiceFromOption(driver,"Choice 1");
		//selectChoiceFromOption(driver,"Choice 1","Choice 2","Company 1 2");
		//selectChoiceFromOption(driver,"all");
	}
	public static void selectChoiceFromOption(WebDriver driver, String... value){
		List<WebElement> checkListOption = driver.findElements(By.xpath("//span[@class=\"comboTreeItemTitle\"]"));
		if(!value[0].equalsIgnoreCase("all")) {
			for(WebElement item:checkListOption) {
				String text=item.getText();
				for(String val:value) {
					if(text.equals(val)) {
						item.click();
						break;
					}
				}
			}
		}
	}
}
