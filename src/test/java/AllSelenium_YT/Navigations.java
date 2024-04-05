package AllSelenium_YT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {
@Test
public void navigationMethods() {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://hosting-static-website-c4a5a.web.app/");
	driver.get("https://www.metalok.io/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
// driver.navigate().to("https://www.metalok.io/");	
   }
}
